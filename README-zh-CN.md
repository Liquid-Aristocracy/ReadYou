<div align="center">
    <img width="200" height="200" style="display: block; border: 1px solid #f5f5f5; border-radius: 9999px;" src="./fastlane/metadata/android/en-US/images/icon.png">
</div>

<br>
<br>
<br>

<div align="center">
    <img alt="GitHub" src="https://img.shields.io/github/license/Ashinch/ReadYou?color=c3e7ff&style=flat-square">
    <a target="_blank" href="https://github.com/Ashinch/ReadYou/releases">
        <img alt="Version" src="https://img.shields.io/github/v/release/Ashinch/ReadYou?color=c3e7ff&label=version&style=flat-square">
    </a>
    <img alt="GitHub last commit" src="https://img.shields.io/github/last-commit/Ashinch/ReadYou?color=c3e7ff&style=flat-square">
    <br>
    <a target="_blank" href="https://t.me/ReadYouApp">
        <img alt="Telegram" src="https://img.shields.io/badge/Telegram-ReadYouApp-c3e7ff?logo=telegram&style=flat-square">
    </a>
    <a target="_blank" href="https://www.figma.com/file/ViBW8GbUgkTMmK6a80h8X1/Read-You?node-id=7028%3A23673">
        <img alt="Figma" src="https://img.shields.io/badge/Figma-ReadYou-c3e7ff?logo=figma&style=flat-square">
    </a>
</div>

<div align="center">
    <h1>Read You</h1>
    <p>这是一个在 Android 上的  <a href="https://reederapp.com/">Reeder</a> 仿制品，为了让 Android 拥有一个与 Reeder 相似的 RSS 阅读器。</p>
    <a target="_blank" href="https://github.com/Ashinch/ReadYou/blob/main/README-de.md">Deutsch</a>&nbsp;&nbsp;|&nbsp;&nbsp;
    <a target="_blank" href="https://github.com/Ashinch/ReadYou/blob/main/README-zh-TW.md">繁體中文</a>&nbsp;&nbsp;|&nbsp;&nbsp;
    <a target="_blank" href="https://github.com/Ashinch/ReadYou/blob/main/README-fa.md">فارسی</a></p>
    <br/>
    <br/>
    <img src="./fastlane/metadata/android/zh-rCN/images/startup.png" width="19.2%" alt="startup" />
    <img src="./fastlane/metadata/android/zh-rCN/images/feeds.png" width="19.2%" alt="startup" />
    <img src="./fastlane/metadata/android/zh-rCN/images/flow.png" width="19.2%" alt="startup" />
    <img src="./fastlane/metadata/android/zh-rCN/images/read.png" width="19.2%" alt="startup" />
    <img src="./fastlane/metadata/android/zh-rCN/images/settings.png" width="19.2%" alt="startup" />
    <br/>
    <br/>
</div>

## 特性

**Read You** 结合了 Reeder 的交互逻辑与 [Material Design 3 (You)](https://m3.material.io/) 的设计风格。

以下是目前取得的进展和近期将要努力的目标：

-   [x] 本地

    -   [x] 订阅 RSS 链接
    -   [x] 导入 OPML 文件
    -   [x] 文章同步
    -   [x] 文章更新通知
    -   [x] 全文解析
    -   [x] 过滤未读、星标
    -   [x] 订阅源分组
    -   [x] 本地化
    -   [x] 导出 OPML 文件
    -   [x] 文章搜索
    -   [ ] 偏好设置
    -   [ ] 发布 APK
    -   [ ] 小组件
    -   [ ] ...

-   [ ] Fever API 支持
-   [ ] Google Reader API 支持
-   [ ] Inoreader API 支持
-   [ ] ...

> 以上特性仅是初步实现，可能存在某些未知 BUG，仍需进行测试和优化。

## 下载

[<img src="https://fdroid.gitlab.io/artwork/badge/get-it-on.png"
     alt="Get it on F-Droid"
     height="80">](https://f-droid.org/packages/me.ash.reader/)

或者从 [GitHub release](https://github.com/Ashinch/ReadYou/releases) 获取 APK 文件。

## 翻译

<a target="_blank" href="https://hosted.weblate.org/engage/readyou/">
<img src="https://hosted.weblate.org/widgets/readyou/-/287x66-white.png" alt="" />
</a>

## 构建

> 如果你想要预览 Read You 应用，可以在 [Telegram 频道](https://t.me/ReadYouApp) 中获取 **预览版本** 的 APK 文件。

**Read You** 基于 Android 原生的 [Jetpack Compose](https://developer.android.com/jetpack/compose) 架构实现。

1. 首先需要获取 **Read You** 的源代码：

    ```shell
    git clone https://github.com/Ashinch/ReadYou.git
    ```

2. 然后通过 [Android Studio (最新版本)](https://developer.android.com/studio) 打开。

3. 点击 `▶ 运行（Run）` 按钮后将会自动构建并运行。

    > 如遇卡顿现象，请选择 Release 版本构建。

## 感谢开源

-   [MusicYou](https://github.com/Kyant0/MusicYou)
-   [ParseRSS](https://github.com/muhrifqii/ParseRSS): [MIT](https://github.com/muhrifqii/ParseRSS/blob/master/LICENSE)
-   [Readability4J](https://github.com/dankito/Readability4J): [Apache License 2.0](https://github.com/dankito/Readability4J/blob/master/LICENSE)
-   [opml-parser](https://github.com/mdewilde/opml-parser): [Apache License 2.0](https://github.com/mdewilde/opml-parser/blob/master/LICENSE)
-   [compose-html](https://github.com/ireward/compose-html): [Apache License 2.0](https://github.com/ireward/compose-html/blob/main/LICENSE.txt)
-   [Rome](https://github.com/rometools/rome): [Apache License 2.0](https://github.com/rometools/rome/blob/master/LICENSE)
-   [Feeder](https://gitlab.com/spacecowboy/Feeder): [GPL v3.0](https://gitlab.com/spacecowboy/Feeder/-/blob/master/LICENSE)

## 许可证

[GNU GPL v3.0](https://github.com/Ashinch/ReadYou/blob/main/LICENSE)
