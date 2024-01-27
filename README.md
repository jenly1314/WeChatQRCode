# WeChatQRCode

[![Download](https://img.shields.io/badge/download-App-blue.svg)](https://raw.githubusercontent.com/jenly1314/WeChatQRCode/master/app/release/app-release.apk)
[![MavenCentral](https://img.shields.io/maven-central/v/com.github.jenly1314.WeChatQRCode/wechat-qrcode)](https://repo1.maven.org/maven2/com/github/jenly1314/WeChatQRCode)
[![JitPack](https://jitpack.io/v/jenly1314/WeChatQRCode.svg)](https://jitpack.io/#jenly1314/WeChatQRCode)
[![CI](https://travis-ci.com/jenly1314/WeChatQRCode.svg?branch=master)](https://travis-ci.com/jenly1314/WeChatQRCode)
[![CircleCI](https://circleci.com/gh/jenly1314/WeChatQRCode.svg?style=svg)](https://circleci.com/gh/jenly1314/WeChatQRCode)
[![License](https://img.shields.io/badge/license-Apche%202.0-blue.svg)](http://www.apache.org/licenses/LICENSE-2.0)

基于OpenCV开源的微信二维码引擎移植的封装库。（此分支为 **Java** 版本；支持 **Windows** 和 **Linux** ）

## Java版本

[WeChatQRCode-for-Java-2.1.0.zip](https://raw.githubusercontent.com/jenly1314/WeChatQRCode/java/release/WeChatQRCode-for-Java-2.1.0.zip)

> 通过上面的链接下载Java版本的WeChatQRCode，然后按照下面的 [使用说明](#使用说明) 进行集成即可。

## 使用说明

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

## 版本记录

#### v2.1.0：2024-1-14
* 更新OpenCV至v4.9.0

#### v2.0.0：2022-1-24
* 更新OpenCV至v4.5.5

#### v1.0.0：2021-9-26
* 初始版本：使用OpenCV-4.5.2

## 赞赏
如果您喜欢WeChatQRCode，或感觉WeChatQRCode帮助到了您，可以点右上角“Star”支持一下，您的支持就是我的动力，谢谢 :smiley:
<p>您也可以扫描下面的二维码，请作者喝杯咖啡 :coffee:

<div>
   <img src="https://jenly1314.github.io/image/page/rewardcode.png">
</div>

## 关于我

| 我的博客                                                                                | GitHub                                                                                  | Gitee                                                                                  | CSDN                                                                                 | 博客园                                                                            |
|:------------------------------------------------------------------------------------|:----------------------------------------------------------------------------------------|:---------------------------------------------------------------------------------------|:-------------------------------------------------------------------------------------|:-------------------------------------------------------------------------------|
| <a title="我的博客" href="https://jenly1314.github.io" target="_blank">Jenly's Blog</a> | <a title="GitHub开源项目" href="https://github.com/jenly1314" target="_blank">jenly1314</a> | <a title="Gitee开源项目" href="https://gitee.com/jenly1314" target="_blank">jenly1314</a>  | <a title="CSDN博客" href="http://blog.csdn.net/jenly121" target="_blank">jenly121</a>  | <a title="博客园" href="https://www.cnblogs.com/jenly" target="_blank">jenly</a>  |

## 联系我

| 微信公众号        | Gmail邮箱                                                                          | QQ邮箱                                                                              | QQ群                                                                                                                       | QQ群                                                                                                                       |
|:-------------|:---------------------------------------------------------------------------------|:----------------------------------------------------------------------------------|:--------------------------------------------------------------------------------------------------------------------------|:--------------------------------------------------------------------------------------------------------------------------|
| [Jenly666](http://weixin.qq.com/r/wzpWTuPEQL4-ract92-R) | <a title="给我发邮件" href="mailto:jenly1314@gmail.com" target="_blank">jenly1314</a> | <a title="给我发邮件" href="mailto:jenly1314@vip.qq.com" target="_blank">jenly1314</a> | <a title="点击加入QQ群" href="https://qm.qq.com/cgi-bin/qm/qr?k=6_RukjAhwjAdDHEk2G7nph-o8fBFFzZz" target="_blank">20867961</a> | <a title="点击加入QQ群" href="https://qm.qq.com/cgi-bin/qm/qr?k=Z9pobM8bzAW7tM_8xC31W8IcbIl0A-zT" target="_blank">64020761</a> |

<div>
   <img src="https://jenly1314.github.io/image/page/footer.png">
</div>
