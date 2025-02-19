package me.ash.reader.data.repository

import android.content.Context
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.flow.Flow
import me.ash.reader.R
import me.ash.reader.data.dao.AccountDao
import me.ash.reader.data.dao.ArticleDao
import me.ash.reader.data.dao.FeedDao
import me.ash.reader.data.dao.GroupDao
import me.ash.reader.data.model.account.Account
import me.ash.reader.data.model.account.AccountType
import me.ash.reader.data.model.group.Group
import me.ash.reader.ui.ext.currentAccountId
import me.ash.reader.ui.ext.getDefaultGroupId
import me.ash.reader.ui.ext.showToast
import me.ash.reader.ui.ext.showToastLong
import javax.inject.Inject

class AccountRepository @Inject constructor(
    @ApplicationContext
    private val context: Context,
    private val accountDao: AccountDao,
    private val groupDao: GroupDao,
    private val feedDao: FeedDao,
    private val articleDao: ArticleDao,
) {
    fun getAccounts(): Flow<List<Account>> = accountDao.queryAllAsFlow()

    fun getAccountById(accountId: Int): Flow<Account?> = accountDao.queryAccount(accountId)

    suspend fun getCurrentAccount(): Account = accountDao.queryById(context.currentAccountId)!!

    suspend fun isNoAccount(): Boolean = accountDao.queryAll().isEmpty()

    suspend fun addDefaultAccount(): Account {
        val readYouString = context.getString(R.string.read_you)
        val defaultString = context.getString(R.string.defaults)
        return Account(
            name = readYouString,
            type = AccountType.Local,
        ).apply {
            id = accountDao.insert(this).toInt()
        }.also {
            if (groupDao.queryAll(it.id!!).isEmpty()) {
                groupDao.insert(
                    Group(
                        id = it.id!!.getDefaultGroupId(),
                        name = defaultString,
                        accountId = it.id!!,
                    )
                )
            }
        }
    }

    suspend fun update(accountId: Int, block: Account.() -> Unit) {
        accountDao.queryById(accountId)?.let {
            accountDao.update(it.apply(block))
        }
    }

    suspend fun delete(accountId: Int) {
        if (accountDao.queryAll().size == 1) {
            context.showToast(context.getString(R.string.must_have_an_account))
            return
        }
        accountDao.queryById(accountId)?.let {
            articleDao.deleteByAccountId(accountId)
            feedDao.deleteByAccountId(accountId)
            groupDao.deleteByAccountId(accountId)
            accountDao.delete(it)
            context.showToastLong(context.getString(R.string.delete_account_toast))
        }
    }
}
