# WeChatQRCode

[![MavenCentral](https://img.shields.io/maven-central/v/com.github.jenly1314.WeChatQRCode/wechat-qrcode?branch=java&logo=sonatype)](https://repo1.maven.org/maven2/com/github/jenly1314/WeChatQRCode/wechat-qrcode-java/)
[![test](https://img.shields.io/github/actions/workflow/status/jenly1314/WeChatQrCode/test.yml?branch=java&logo=github&label=test)](https://github.com/jenly1314/WeChatQRCode/actions/workflows/test.yml)
[![License](https://img.shields.io/github/license/jenly1314/WeChatQRCode?logo=open-source-initiative)](https://opensource.org/licenses/apache-2-0)

基于OpenCV开源的微信二维码引擎移植的封装库。（此分支为 **Java** 版本；支持 **Windows** 和 **Linux** ）

## 引入 (v3.0.0新增)

### Gradle:

1. 在Project的 **build.gradle** 或 **setting.gradle** 中添加远程仓库

    ```gradle
    repositories {
        //...
        mavenCentral()
    }
    ```

2. 在Module的 **build.gradle** 中添加依赖项

    ```gradle
    implementation 'com.github.jenly1314.WeChatQRCode:wechat-qrcode-java:3.0.0'

    ```

### 温馨提示
此分支仅适用于 **Java** 项目，当前支持以下平台与架构：
- **Windows** ：`x86_64`
- **Linux** ：`x86_64`、`aarch64`(ARM64)

## 使用

### 代码示例

```java
    //初始化 OpenCV；也可以指定路径；windows加载dll，linux加载so库文件
    OpenCV.init();
    //初始化 WeChatQRCode
    WeChatQRCodeDetector.init();

    //检测并识别二维码 （同一张图片可能有多个二维码）
    List<String> results = WeChatQRCodeDetector.detectAndDecode("image/WeChatQRCode.png");
    System.out.println("results:" + results);
```

> Java版与Android版的API基本一致，更多使用说明和示例请查阅master分支。

## 历史版本

`v3.0.0`之前的版本未发布到`MavenCentral`，需要手动下载库文件进行集成。

[WeChatQRCode-for-Java-2.1.0.zip](https://raw.githubusercontent.com/jenly1314/WeChatQRCode/java/release/WeChatQRCode-for-Java-2.1.0.zip)

> 通过上面的链接下载Java版本的WeChatQRCode，然后内部的使用说明进行集成即可。

## 版本日志

#### v3.0.0：2026-9-13 （从3.x开始发布到 `MavenCentral`）
- 更新OpenCV至v5.0.0
- 简化集成步骤

#### [查看更多版本日志](CHANGELOG.md)

---

![footer](https://jenly1314.github.io/page/footer.svg)
