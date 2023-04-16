# WeChatQRCode

[![Download](https://img.shields.io/badge/download-App-blue.svg)](https://raw.githubusercontent.com/jenly1314/WeChatQRCode/master/app/release/app-release.apk)
[![MavenCentral](https://img.shields.io/maven-central/v/com.github.jenly1314.WeChatQRCode/wechat-qrcode)](https://repo1.maven.org/maven2/com/github/jenly1314/WeChatQRCode)
[![JitPack](https://jitpack.io/v/jenly1314/WeChatQRCode.svg)](https://jitpack.io/#jenly1314/WeChatQRCode)
[![CI](https://travis-ci.com/jenly1314/WeChatQRCode.svg?branch=master)](https://travis-ci.com/jenly1314/WeChatQRCode)
[![CircleCI](https://circleci.com/gh/jenly1314/WeChatQRCode.svg?style=svg)](https://circleci.com/gh/jenly1314/WeChatQRCode)
[![API](https://img.shields.io/badge/API-21%2B-blue.svg?style=flat)](https://android-arsenal.com/api?level=21)
[![License](https://img.shields.io/badge/license-Apche%202.0-blue.svg)](http://www.apache.org/licenses/LICENSE-2.0)
[![Blog](https://img.shields.io/badge/blog-Jenly-9933CC.svg)](https://jenly1314.github.io/)
[![QQGroup](https://img.shields.io/badge/QQGroup-20867961-blue.svg)](http://shang.qq.com/wpa/qunwpa?idkey=8fcc6a2f88552ea44b1.1.982c94fd124f7bb3ec227e2a400dbbfaad3dc2f5ad)

基于OpenCV开源的微信二维码引擎移植的封装库。又一个扫码相关的轮子，之所以说又，是因为这样的轮子已经开源三个了；几个轮子之间的优缺点，各有千秋，请自寻选择（小孩子才做选择，我全都要）。

> 基于ZXing的扫码轮子  [ZXingLite](https://github.com/jenly1314/ZXingLite)
 
> 基于MLKit的扫码轮子  [MLKit](https://github.com/jenly1314/MLKit)
 
> 基于OpenCV的扫码轮子 [WeChatQRCode](https://github.com/jenly1314/WeChatQRCode)

## GIF 展示

![GIF](GIF.gif)

> 你可以直接下载 [演示App](https://raw.githubusercontent.com/jenly1314/WeChatQRCode/master/app/release/app-release.apk) 体验效果

## 各Module相关说明

### [app](app)

示例App：主要用于提供WeChatQRCode的演示效果

### [opencv](opencv)

OpenCV：编译好的OpenCV

### [opencv-armv7a](opencv-armv7a)

OpenCV：**armeabi-v7a** 的libopencv_java4.so

### [opencv-armv64](opencv-armv64)

OpenCV：**arm64-v8a** 的libopencv_java4.so

### [opencv-x86](opencv-x86)

OpenCV：**x86** 的libopencv_java4.so
### [opencv-x86_64](opencv-x86_64)

OpenCV：**x86_64** 的libopencv_java4.so

### [opencv-qrcode](opencv-qrcode)

OpenCV二维码识别：封装好的API，通过 **OpenCVQRCodeDetector** 你可以很轻松的拥有OpenCV中开源的二维码识别功能

### [opencv-qrcode-scanning](opencv-qrcode-scanning)

OpenCV二维码扫码：有了上面的OpenCV二维码识别功能，基本的扫码相关界面还是需要有个的，扫码加识别完美搭配，依赖[MLKit](https://github.com/jenly1314/MLKit)中的 **mlkit-camera-core**；

**opencv-qrcode-scanning** 相当于[MLKit](https://github.com/jenly1314/MLKit)中的 **mlkit-camera-core**的衍生库。

### [wechat-qrcode](wechat-qrcode)

微信二维码识别：封装好的API，通过 **WeChatQRCodeDetector** 你可以很轻松的拥有OpenCV中开源的微信二维码识别功能

### [wechat-qrcode-scanning](wechat-qrcode-scanning)

微信二维码扫码：有了上面的微信二维码识别功能，基本的扫码相关界面还是需要有个的，扫码加识别完美搭配，依赖[MLKit](https://github.com/jenly1314/MLKit)中的 **mlkit-camera-core**；

**wechat-qrcode-scanning** 相当于[MLKit](https://github.com/jenly1314/MLKit)中的 **mlkit-camera-core**的衍生库。

### [Java版本（点击查看java分支）](https://github.com/jenly1314/WeChatQrCode/tree/java) 


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
implementation 'com.github.jenly1314.WeChatQRCode:opencv:1.3.0'
implementation 'com.github.jenly1314.WeChatQRCode:opencv-armv7a:1.3.0'

// OpenCV二维码识别功能（可选）
implementation 'com.github.jenly1314.WeChatQRCode:opencv-qrcode:1.3.0'
// OpenCV二维码扫码功能（可选）
implementation 'com.github.jenly1314.WeChatQRCode:opencv-qrcode-scanning:1.3.0'

// 微信二维码识别功能（可选）
implementation 'com.github.jenly1314.WeChatQRCode:wechat-qrcode:1.3.0'
// 微信二维码扫码功能（可选）
implementation 'com.github.jenly1314.WeChatQRCode:wechat-qrcode-scanning:1.3.0'

```

根据需要选择支持的 SO 库架构
```gradle
// OpenCV基础库（*必须）
implementation 'com.github.jenly1314.WeChatQRCode:opencv:1.3.0'
implementation 'com.github.jenly1314.WeChatQRCode:opencv-armv7a:1.3.0'

// OpenCV的其他ABI（可选），根据你的需求选择想要的so支持
implementation 'com.github.jenly1314.WeChatQRCode:opencv-armv64:1.3.0'
implementation 'com.github.jenly1314.WeChatQRCode:opencv-x86:1.3.0'
implementation 'com.github.jenly1314.WeChatQRCode:opencv-x86_64:1.3.0'

// OpenCV二维码识别功能（可选）
implementation 'com.github.jenly1314.WeChatQRCode:opencv-qrcode:1.3.0'
// OpenCV二维码扫码功能（可选）
implementation 'com.github.jenly1314.WeChatQRCode:opencv-qrcode-scanning:1.3.0'

// 微信二维码识别功能（可选）
implementation 'com.github.jenly1314.WeChatQRCode:wechat-qrcode:1.3.0'
// 微信二维码扫码功能（可选）
implementation 'com.github.jenly1314.WeChatQRCode:wechat-qrcode-scanning:1.3.0'

```

### 温馨提示

**关于WeChatQRCode版本与编译的SDK版本要求**

> 使用 v1.3.x 以上版本时，要求 compileSdkVersion >= 33

> 如果 compileSdkVersion < 33 请使用 v1.3.x 以前的版本（如：v1.2.1）

**ABI过滤：**

在Module的 **build.gradle** 里面的 android{} 中设置支持的 SO 库架构（可选，支持多个平台的 so， 支持的平台越多，APK体积越大）

```gradle
    defaultConfig {
    
        //...
        
        ndk {
            //设置支持的 SO 库架构（开发者可以根据需要，选择一个或多个平台的 so）
            abiFilters 'armeabi-v7a' // , 'arm64-v8a', 'x86', 'x86_64'
        }
    }
```

**opencv-qrcode与wechat-qrcode检测识别二维码对比**

**opencv-qrcode**

* 一次识别单个二维码速度一般；（一次识别多个二维码好像有点问题）
* 二维码检测的位置信息是一个四边形。

**wechat-qrcode**

* 一次能识别多个二维码，识别速度更快；
* 二维码检测的位置信息是一个矩形。

总结成一句话来说就是：**wechat-qrcode** 识别速度更快，**opencv-qrcode** 二维码定位更准。

> 以上纯属个人测试观点总结。你也可以直接下载 [演示App](https://raw.githubusercontent.com/jenly1314/WeChatQRCode/master/app/release/app-release.apk)进行测试比对。

## 使用

### 初始化

初始化 **OpenCV** 和 **WeChatQRCodeDetector** （建议在 **MainActivity** 的 **onCreate** 方法中初始化）
```kotlin
        //初始化OpenCV
        OpenCV.initAsync(context)

        //初始化WeChatQRCodeDetector
        WeChatQRCodeDetector.init(context)
```   
### 识别二维码

#### WeChat QRCode

识别二维码 （**wechat-qrcode**中的WeChatQRCodeDetector）
```kotlin
    //识别二维码；results是一个List<String>集合，可能会有多个结果，如果只识别一个码，可以取List中第0个就可以
    val results = WeChatQRCodeDetector.detectAndDecode(bitmap)

``` 

识别二维码并返回二维码位置信息 （**wechat-qrcode**中的WeChatQRCodeDetector）
```kotlin
    // 检测结果：二维码的位置信息
    val points = ArrayList<Mat>()
    //通过WeChatQRCodeDetector识别图片中的二维码并返回二维码的位置信息
    val result = WeChatQRCodeDetector.detectAndDecode(bitmap, points)
    points.forEach { mat ->
        // 扫码结果二维码的四个点（一个矩形）
        Log.d(TAG, "point0: ${mat[0, 0][0]}, ${mat[0, 1][0]}")
        Log.d(TAG, "point1: ${mat[1, 0][0]}, ${mat[1, 1][0]}")
        Log.d(TAG, "point2: ${mat[2, 0][0]}, ${mat[2, 1][0]}")
        Log.d(TAG, "point3: ${mat[3, 0][0]}, ${mat[3, 1][0]}")
    }

```

#### OpenCV QRCode

识别二维码 （**opencv-qrcode**中的OpenCVQRCodeDetector）
```kotlin
    val openCVQRCodeDetector = OpenCVQRCodeDetector()
    //识别二维码
    val results = openCVQRCodeDetector.detectAndDecode(bitmap)

``` 

识别二维码并返回二维码位置信息 （**opencv-qrcode**中的OpenCVQRCodeDetector）
```kotlin
    // 检测结果：二维码的位置信息
    val points = Mat()
    //通过WeChatQRCodeDetector识别图片中的二维码并返回二维码的位置信息
    val result = openCVQRCodeDetector.detectAndDecode(bitmap, points)
    // 扫码结果二维码的四个点（一个四边形）；需要注意的是：OpenCVQRCode识别的二维码和WeChatQRCode的识别的二维码记录在Mat中的点位方式是不一样的
    Log.d(TAG, "point0: ${points[0, 0][0]}, ${points[0, 0][1]}")
    Log.d(TAG, "point1: ${points[0, 1][0]}, ${points[0, 1][1]}")
    Log.d(TAG, "point2: ${points[0, 2][0]}, ${points[0, 2][1]}")
    Log.d(TAG, "point3: ${points[0, 3][0]}, ${points[0, 3][1]}")

```

### 完整示例

通过继承 **wechat-qrcode-scanning** 中的 WeChatCameraScanActivity或者WeChatCameraScanFragment可以很轻松的实现扫码功能

```kotlin
class WeChatQRCodeActivity : WeChatCameraScanActivity() {

    override fun onScanResultCallback(result: AnalyzeResult<List<String>>) {
        if (result.result.isNotEmpty()) {
            // 停止分析
            cameraScan.setAnalyzeImage(false)
            Log.d(TAG, result.result.toString())
            // 当初始化 WeChatScanningAnalyzer 时，如果是需要二维码的位置信息，则会返回 WeChatScanningAnalyzer.QRCodeAnalyzeResult
            if (result is WeChatScanningAnalyzer.QRCodeAnalyzeResult) { // 如果需要处理结果二维码的位置信息

                val buffer = StringBuilder()
                val bitmap = result.bitmap.drawRect { canvas, paint ->
                    // 扫码结果可能有多个
                    for ((index, data) in result.result.withIndex()) {
                        buffer.append("[$index] ").append(data).append("\n")
                        result.points?.forEach { mat ->
                            // 扫码结果二维码的四个点
                            Log.d(TAG, "point0: ${mat[0, 0][0]}, ${mat[0, 1][0]}")
                            Log.d(TAG, "point1: ${mat[1, 0][0]}, ${mat[1, 1][0]}")
                            Log.d(TAG, "point2: ${mat[2, 0][0]}, ${mat[2, 1][0]}")
                            Log.d(TAG, "point3: ${mat[3, 0][0]}, ${mat[3, 1][0]}")

                            val path = Path()
                            path.moveTo(mat[0, 0][0].toFloat(), mat[0, 1][0].toFloat())
                            path.lineTo(mat[1, 0][0].toFloat(), mat[1, 1][0].toFloat())
                            path.lineTo(mat[2, 0][0].toFloat(), mat[2, 1][0].toFloat())
                            path.lineTo(mat[3, 0][0].toFloat(), mat[3, 1][0].toFloat())
                            path.lineTo(mat[0, 0][0].toFloat(), mat[0, 1][0].toFloat())
                            // 将二维码位置在图片上框出来
                            canvas.drawPath(path, paint)
                        }
                    }
                }

                val config = AppDialogConfig(this, R.layout.qrcode_result_dialog).apply {
                    content = buffer
                    onClickConfirm = View.OnClickListener {
                        AppDialog.INSTANCE.dismissDialog()
                        // 继续扫码分析
                        cameraScan.setAnalyzeImage(true)
                    }
                    onClickCancel = View.OnClickListener {
                        AppDialog.INSTANCE.dismissDialog()
                        finish()
                    }
                    val imageView = getView<ImageView>(R.id.ivDialogContent)
                    imageView.setImageBitmap(bitmap)
                }
                AppDialog.INSTANCE.showDialog(config, false)

            } else {
                // 一般需求都是识别一个码，所以这里取第0个就可以；有识别多个码的需求，可以取全部
                val text = result.result[0]
                val intent = Intent()
                intent.putExtra(CameraScan.SCAN_RESULT, text)
                setResult(RESULT_OK, intent)
                finish()
            }

        }
    }

    override fun createAnalyzer(): Analyzer<MutableList<String>>? {
        // 分析器默认不会返回结果二维码的位置信息
//        return WeChatScanningAnalyzer()
        // 如果需要返回结果二维码位置信息，则初始化分析器时，参数传 true 即可
        return WeChatScanningAnalyzer(true)
    }

    companion object {
        const val TAG = "WeChatQRCodeActivity"
    }

}
```

更多完整示例如下：

**opencv-qrcode-scanning**

扫描识别二维码实现示例：通过直接继承 WeChatCameraScanActivity 实现的示例 [WeChatQRCodeActivity](app/src/main/java/com/king/wechat/qrcode/app/WeChatQRCodeActivity.kt)

扫描识别多个二维码实现示例：通过直接继承 WeChatCameraScanActivity 实现的示例 [WeChatMultiQRCodeActivity](app/src/main/java/com/king/wechat/qrcode/app/WeChatMultiQRCodeActivity.kt)

**wechat-qrcode-scanning**

扫描识别二维码实现示例：通过直接继承 OpenCVCameraScanActivity 实现的示例 [OpenCVQRCodeActivity](app/src/main/java/com/king/wechat/qrcode/app/OpenCVQRCodeActivity.kt)

   
### 特别说明

因为 **wechat-qrcode-scanning** 依赖了 [MLKit](https://github.com/jenly1314/MLKit) 中的 **mlkit-camera-core**，
所以关于 **CameraScan** 的和界面布局在使用上完全遵循 **mlkit-camera-core** 的使用方式。

这里贴出一部分主要的使用示例：

#### CameraScan配置示例

**CameraScan** 里面包含部分支持链式调用的方法，即调用返回是 **CameraScan** 本身的一些配置建议在调用 **startCamera()** 方法之前调用。

> 如果是通过继承 **BaseCameraScanActivity** 或者 **BaseCameraScanFragment** 或其子类实现的相机扫描，可以在
**initCameraScan()** 方法中获取 **CameraScan** ，然后根据需要修改相关配置。

```java
// 获取CameraScan，根据需要修改相关配置
getCameraScan().setPlayBeep(true)//设置是否播放音效，默认为false
        .setVibrate(true)//设置是否震动，默认为false
        .setCameraConfig(new ResolutionCameraConfig(this))//设置相机配置信息，CameraConfig可覆写options方法自定义配置
        .setNeedTouchZoom(true)//支持多指触摸捏合缩放，默认为true
        .setDarkLightLux(45f)//设置光线足够暗的阈值（单位：lux），需要通过{@link #bindFlashlightView(View)}绑定手电筒才有效
        .setBrightLightLux(100f)//设置光线足够明亮的阈值（单位：lux），需要通过{@link #bindFlashlightView(View)}绑定手电筒才有效
        .bindFlashlightView(ivFlashlight)//绑定手电筒，绑定后可根据光线传感器，动态显示或隐藏手电筒按钮
        .setOnScanResultCallback(this)//设置扫码结果回调，需要自己处理或者需要连扫时，可设置回调，自己去处理相关逻辑
        .setAnalyzer(new BarcodeScanningAnalyzer())//设置分析器，如这里使用条码分析器，BarcodeScanningAnalyzer是mlkit-barcode-scanning中的
        .setAnalyzeImage(true)//设置是否分析图片，默认为true。如果设置为false，相当于关闭了扫码识别功能

        // 启动预览（如果是通过直接或间接继承BaseCameraScanActivity或BaseCameraScanFragment实现的则无需调用startCamera）
        getCameraScan().startCamera();


        // 设置闪光灯（手电筒）是否开启,需在startCamera之后调用才有效
        getCameraScan().enableTorch(torch);
```

#### 布局示例

**PreviewView** 用来预览，布局内至少要保证有 **PreviewView**；如果是继承 **BaseCameraScanActivity** 或
**BaseCameraScanFragment** 或其子类实现的相机扫描；快速实现扫描功能；

需自定义布局时，通过覆写getLayoutId方法即可；更多代码用法可直接查看 **BaseCameraScanActivity** 源码或参见下面的使用示例。

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

> 关于扫描框动画：你暂时可以参考[app](app)中的源码示例，直接使用[ViewfinderView](https://github.com/jenly1314/ViewfinderView)；（后续发布新版本时，计划自动依赖 **ViewfinderView**）

更多使用详情，请查看[app](app)中的源码使用示例或直接查看 [API帮助文档](https://jitpack.io/com/github/jenly1314/WeChatQRCode/latest/javadoc/)

## 相关推荐

#### [MLKit](https://github.com/jenly1314/MLKit) 一个强大易用的工具包。通过ML Kit您可以很轻松的实现文字识别、条码识别、图像标记、人脸检测、对象检测等功能。    
#### [ZXingLite](https://github.com/jenly1314/ZXingLite) 基于ZXing库优化扫码和生成二维码/条形码功能，扫码界面完全支持自定义。


## 版本记录

#### v1.3.0：2023-4-16
* 新增OpenCV二维码扫码识别库（opencv-qrcode和opencv-qrcode-scanning）
* 更新mlkit-camera-core至v1.4.0
* 更新compileSdkVersion至33
* 更新Gradle至v7.5

#### v1.2.1：2023-2-27
* 优化细节

#### v1.2.0：2022-8-4
* 更新OpenCV至v4.6.0

#### v1.1.1：2021-11-2
* 优化细节
* 更新mlkit-camera-core至v1.0.3

#### v1.1.0：2021-8-6
* 编译多种ABI支持
* 更新mlkit-camera-core至v1.0.2

#### v1.0.0：2021-7-24
* WeChatQRCode初始版本

## 赞赏
如果您喜欢WeChatQRCode，或感觉WeChatQRCode帮助到了您，可以点右上角“Star”支持一下，您的支持就是我的动力，谢谢 :smiley:<p>
您也可以扫描下面的二维码，请作者喝杯咖啡 :coffee:
<div>
<img src="https://jenly1314.github.io/image/pay/sponsor.png" width="98%">
</div>

## 关于我

Name: <a title="关于作者" href="https://jenly1314.github.io" target="_blank">Jenly</a>

Email: <a title="欢迎邮件与我交流" href="mailto:jenly1314@gmail.com" target="_blank">jenly1314#gmail.com</a>
/ <a title="给我发邮件" href="mailto:jenly1314@vip.qq.com" target="_blank">jenly1314#vip.qq.com</a>

CSDN: <a title="CSDN博客" href="http://blog.csdn.net/jenly121" target="_blank">jenly121</a>

CNBlogs: <a title="博客园" href="https://www.cnblogs.com/jenly" target="_blank">jenly</a>

GitHub: <a title="GitHub开源项目" href="https://github.com/jenly1314" target="_blank">jenly1314</a>

Gitee: <a title="Gitee开源项目" href="https://gitee.com/jenly1314" target="_blank">jenly1314</a>

加入QQ群: <a title="点击加入QQ群" href="http://shang.qq.com/wpa/qunwpa?idkey=8fcc6a2f88552ea44b1411582c94fd124f7bb3ec227e2a400dbbfaad3dc2f5ad" target="_blank">
20867961</a>
   <div>
       <img src="https://jenly1314.github.io/image/jenly666.png">
       <img src="https://jenly1314.github.io/image/qqgourp.png">
   </div>
