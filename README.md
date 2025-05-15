# WeChatQRCode

[![CI](https://img.shields.io/github/actions/workflow/status/jenly1314/WeChatQRCode/build.yml?logo=github)](https://github.com/jenly1314/WeChatQRCode/actions/workflows/build.yml)
[![Download](https://img.shields.io/badge/download-zip-brightgreen?logo=github)](https://raw.githubusercontent.com/jenly1314/WeChatQRCode/java/release/WeChatQRCode-for-Java-2.1.0.zip)
[![License](https://img.shields.io/github/license/jenly1314/WeChatQRCode?logo=open-source-initiative)](https://opensource.org/licenses/apache-2-0)

基于OpenCV开源的微信二维码引擎移植的封装库。（此分支为 **Java** 版本；支持 **Windows** 和 **Linux** ）

## Java版本

[WeChatQRCode-for-Java-2.1.0.zip](https://raw.githubusercontent.com/jenly1314/WeChatQRCode/java/release/WeChatQRCode-for-Java-2.1.0.zip)

> 通过上面的链接下载Java版本的WeChatQRCode，然后按照下面的 [使用说明](#使用说明) 进行集成即可。

## 使用

### 使用步骤

1. 将 **lib** 和 **models** 文件夹拷贝到项目的根目录；
2. 项目引入 **lib** 文件夹中相关的 **jar**；
3. 初始化 **OpenCV** 和 **WeChatQRCode**。

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

## 版本日志

#### v2.1.0：2024-1-14
* 更新OpenCV至v4.9.0

#### v2.0.0：2022-1-24
* 更新OpenCV至v4.5.5

#### v1.0.0：2021-9-26
* 初始版本：使用OpenCV-4.5.2

---

![footer](https://jenly1314.github.io/page/footer.svg)

