# wechat-qrcode

[![Download](https://img.shields.io/badge/download-App-blue.svg)](https://raw.githubusercontent.com/jenly1314/wechat-qrcode/master/app/release/app-release.apk)
[![MavenCentral](https://img.shields.io/maven-central/v/com.github.jenly1314.wechat-qrcode/wechat-qrcode)](https://repo1.maven.org/maven2/com/github/jenly1314/wechat-qrcode)
[![JitPack](https://jitpack.io/v/jenly1314/wechat-qrcode.svg)](https://jitpack.io/#jenly1314/wechat-qrcode)
[![CI](https://travis-ci.org/jenly1314/wechat-qrcode.svg?branch=master)](https://travis-ci.org/jenly1314/wechat-qrcode)
[![CircleCI](https://circleci.com/gh/jenly1314/wechat-qrcode.svg?style=svg)](https://circleci.com/gh/jenly1314/wechat-qrcode)
[![API](https://img.shields.io/badge/API-21%2B-blue.svg?style=flat)](https://android-arsenal.com/api?level=21)
[![License](https://img.shields.io/badge/license-Apche%202.0-blue.svg)](http://www.apache.org/licenses/LICENSE-2.0)
[![Blog](https://img.shields.io/badge/blog-Jenly-9933CC.svg)](https://jenly1314.github.io/)
[![QQGroup](https://img.shields.io/badge/QQGroup-20867961-blue.svg)](http://shang.qq.com/wpa/qunwpa?idkey=8fcc6a2f88552ea44b1.1.982c94fd124f7bb3ec227e2a400dbbfaad3dc2f5ad)

基于OpenCV开源的微信二维码引擎移植的封装库。又一个扫码相关的轮子，之所以说又，是因为这样的轮子已经开源三个了；几个轮子之间的优缺点，各有千秋，请自寻选择（小孩子才做选择，我全都要）。

> 基于ZXing的扫码轮子  [ZXingLite](https://github.com/jenly1314/ZXingLite)
 
> 基于MLKit的扫码轮子  [MLKit](https://github.com/jenly1314/MLKit)
 
> 基于OpenCV的扫码轮子 [wechat-qrcode](https://github.com/jenly1314/wechat-qrcode)

## GIF 展示

暂时没有录制GIF，请直接下载[Demo App](https://raw.githubusercontent.com/jenly1314/wechat-qrcode/master/app/release/app-release.apk)查看并体验吧。


## 各Module相关说明

### [app](app)

示例App：主要用于提供wechat-qrcode的演示效果

### [opencv](opencv)

OpenCV：编译好的OpenCV（armeabi-v7a/libopencv_java4.so | 11.3MB）

### [wechat-qrcode](wechat-qrcode)

微信二维码识别：封装好的API，通过 **WeChatQRCodeDetector** 你可以很轻松的拥有OpenCV中开源的微信二维码识别功能

### [wechat-qrcode-scanning](wechat-qrcode-scanning)

微信二维码扫码：有了上面的微信二维码识别功能，基本的扫码相关界面还是需要有个的，扫码加识别完美搭配，依赖[MLKit](https://github.com/jenly1314/MLKit)中的 **mlkit-camera-core**；

**wechat-qrcode-scanning** 相当于[MLKit](https://github.com/jenly1314/MLKit)中的 **mlkit-camera-core**的衍生库。


## 引入

### Gradle:

1. 在Project的 **build.gradle** 里面添加远程仓库  
          
```gradle
allprojects {
    repositories {
        //...
        mavenCentral()
    }
}
```

2. 在Module的 **build.gradle** 里面添加引入依赖项

```gradle
// OpenCV基础库（*必须）
implementation 'com.github.jenly1314.wechat-qrcode:opencv:1.0.0'

// 微信二维码识别功能（可选）
implementation 'com.github.jenly1314.wechat-qrcode:wechat-qrcode:1.0.0'

// 微信二维码扫码功能（可选）
implementation 'com.github.jenly1314.wechat-qrcode:wechat-qrcode-scanning:1.0.0'
//MLKit的Camera核心库（可选），如果您使用了wechat-qrcode-scanning，则必须依赖mlkit-camera-core库
implementation 'com.github.jenly1314.MLKit:mlkit-camera-core:1.0.1'

```

## 示例

初始化 **OpenCV** 和 **WeChatQRCodeDetector** (建议在 **Application** 中的 **onCreate** 方法中初始化)
```kotlin
        //初始化OpenCV
        OpenCV.initAsync(context)

        //初始化WeChatQRCodeDetector
        WeChatQRCodeDetector.init(context)
```   

识别二维码 （**wechat-qrcode**中的WeChatQRCodeDetector）
```kotlin
    //识别二维码；results是一个List<String>集合，可能会有多个结果，如果只识别一个码，可以取List中第0个就可以
    val results = WeChatQRCodeDetector.detectAndDecode(bitmap)

``` 

通过继承 **wechat-qrcode-scanning** 中的 WeChatCameraScanActivity或者WeChatCameraScanFragment可以很轻松的实现扫码功能
```kotlin
class WeChatQRCodeActivity : WeChatCameraScanActivity() {

    companion object{
        const val TAG = "WeChatQRCodeActivity"
    }

    override fun onScanResultCallback(result: AnalyzeResult<List<String>>) {
        if(result.result.isNotEmpty()){
            //停止分析
            cameraScan.setAnalyzeImage(false)
            Log.d(TAG,result.result.toString())
            //一般需求都是识别一个码，所以这里取第0个就可以；有识别多个码的需求，可以取全部
            val text = result.result[0]
            val intent = Intent()
            intent.putExtra(MainActivity.SCAN_RESULT,text)
            setResult(RESULT_OK,intent)
            finish()
        }
    }

}
```
   
### 特别说明

因为 **wechat-qrcode-scanning** 依赖了 [MLKit](https://github.com/jenly1314/MLKit) 中的 **mlkit-camera-core**，所以布局在使用上完全遵循 **mlkit-camera-core** 的使用方式。    
        
#### 布局示例 （这里贴出部分 **[MLKit](https://github.com/jenly1314/MLKit)** 中的部分示例）
>  可自定义布局（覆写getLayoutId方法），布局内至少要保证有PreviewView，然后自己可根据需要添加的控件。

> PreviewView 用来预览，布局内至少要保证有PreviewView，如果是继承BaseCameraScanActivity或BaseCameraScanFragment，控件id可覆写getPreviewViewId方法自定义

```Xml
<FrameLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent">
    <androidx.camera.view.PreviewView
        android:id="@+id/previewView"
        android:layout_width="match_parent"
        android:layout_height="match_parent"/>
    <!-- 只需保证有布局内有PreviewView即可，然后自己可根据需要添加的控件 -->
</FrameLayout>
```
更多使用详情，请查看[app](app)中的源码使用示例或直接查看 [API帮助文档](https://jitpack.io/com/github/jenly1314/wechat-qrcode/latest/javadoc/)

## 相关推荐

 [MLKit](https://github.com/jenly1314/MLKit) 一个强大易用的工具包。通过ML Kit您可以很轻松的实现文字识别、条码识别、图像标记、人脸检测、对象检测等功能。
 
 [ZXingLite](https://github.com/jenly1314/ZXingLite) 基于ZXing库优化扫码和生成二维码/条形码功能，扫码界面完全支持自定义。


## 版本记录

#### v1.0.0：2021-7-24
* wechat-qrcode初始版本

## 赞赏
如果您喜欢wechat-qrcode，或感觉wechat-qrcode帮助到了您，可以点右上角“Star”支持一下，您的支持就是我的动力，谢谢 :smiley:<p>
您也可以扫描下面的二维码，请作者喝杯咖啡 :coffee:
    <div>
        <img src="https://jenly1314.github.io/image/pay/wxpay.png" width="280" heght="350">
        <img src="https://jenly1314.github.io/image/pay/alipay.png" width="280" heght="350">
        <img src="https://jenly1314.github.io/image/pay/qqpay.png" width="280" heght="350">
        <img src="https://jenly1314.github.io/image/alipay_red_envelopes.jpg" width="233" heght="350">
    </div>

## 关于我
   Name: <a title="关于作者" href="https://about.me/jenly1314" target="_blank">Jenly</a>

   Email: <a title="欢迎邮件与我交流" href="mailto:jenly1314@gmail.com" target="_blank">jenly1314#gmail.com</a> / <a title="给我发邮件" href="mailto:jenly1314@vip.qq.com" target="_blank">jenly1314#vip.qq.com</a>

   CSDN: <a title="CSDN博客" href="http://blog.csdn.net/jenly121" target="_blank">jenly121</a>

   CNBlogs: <a title="博客园" href="https://www.cnblogs.com/jenly" target="_blank">jenly</a>

   GitHub: <a title="GitHub开源项目" href="https://github.com/jenly1314" target="_blank">jenly1314</a>

   Gitee: <a title="Gitee开源项目" href="https://gitee.com/jenly1314" target="_blank">jenly1314</a>

   加入QQ群: <a title="点击加入QQ群" href="http://shang.qq.com/wpa/qunwpa?idkey=8fcc6a2f88552ea44b1411582c94fd124f7bb3ec227e2a400dbbfaad3dc2f5ad" target="_blank">20867961</a>
   <div>
       <img src="https://jenly1314.github.io/image/jenly666.png">
       <img src="https://jenly1314.github.io/image/qqgourp.png">
   </div>

