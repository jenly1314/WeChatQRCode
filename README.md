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

OpenCV二维码扫码：有了上面的OpenCV二维码识别功能，基本的扫码相关界面还是需要有个的，扫码加识别完美搭配；

**opencv-qrcode-scanning** 相当于[CameraScan](https://github.com/jenly1314/CameraScan)的衍生库。

### [wechat-qrcode](wechat-qrcode)

微信二维码识别：封装好的API，通过 **WeChatQRCodeDetector** 你可以很轻松的拥有OpenCV中开源的微信二维码识别功能

### [wechat-qrcode-scanning](wechat-qrcode-scanning)

微信二维码扫码：有了上面的微信二维码识别功能，基本的扫码相关界面还是需要有个的，扫码加识别完美搭配；

**wechat-qrcode-scanning** 相当于[CameraScan](https://github.com/jenly1314/CameraScan)的衍生库。

### [Java版本（点击查看java分支）](https://github.com/jenly1314/WeChatQrCode/tree/java)

## 引入

### Gradle:

1. 在Project的 **build.gradle** 或 **setting.gradle** 中添加远程仓库

    ```gradle
    repositories {
        //...
        mavenCentral()
    }
    ```

2. 在Module的 **build.gradle** 里面添加引入依赖项

    ```gradle
    // OpenCV基础库（*必须）
    implementation 'com.github.jenly1314.WeChatQRCode:opencv:2.1.0'
    implementation 'com.github.jenly1314.WeChatQRCode:opencv-armv7a:2.1.0'
    
    // OpenCV的其他ABI（可选），根据你的需要选择想要支持的SO库架构
    implementation 'com.github.jenly1314.WeChatQRCode:opencv-armv64:2.1.0'
    implementation 'com.github.jenly1314.WeChatQRCode:opencv-x86:2.1.0'
    implementation 'com.github.jenly1314.WeChatQRCode:opencv-x86_64:2.1.0'
    
    // OpenCV二维码识别功能（可选）
    implementation 'com.github.jenly1314.WeChatQRCode:opencv-qrcode:2.1.0'
    // OpenCV二维码扫码功能（可选）
    implementation 'com.github.jenly1314.WeChatQRCode:opencv-qrcode-scanning:2.1.0'
    
    // 微信二维码识别功能（可选）
    implementation 'com.github.jenly1314.WeChatQRCode:wechat-qrcode:2.1.0'
    // 微信二维码扫码功能（可选）
    implementation 'com.github.jenly1314.WeChatQRCode:wechat-qrcode-scanning:2.1.0'
    
    ```

### 温馨提示

#### 关于WeChatQRCode版本与编译的SDK版本要求

> 使用 v2.1.x 以上版本时，要求 compileSdkVersion >= 34

> 使用 v2.0.x 以上版本时，要求 compileSdkVersion >= 33

> 如果 **compileSdkVersion < 33** 请使用 [**v1.x版本**](https://github.com/jenly1314/WeChatQRCode/tree/1.x/)


#### ABI过滤

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

## 使用

### 初始化

初始化 **OpenCV** 和 **WeChatQRCodeDetector** （建议在 **MainActivity** 的 **onCreate** 方法中初始化）

#### 初始化OpenCV

使用版本 >= v2.1.0时，初始化OpenCV方式
```kotlin
     //初始化OpenCV
     OpenCV.initOpenCV()
```

使用版本 < v2.1.0时，初始化OpenCV方式
```kotlin
     //初始化OpenCV
     OpenCV.initAsync(context)
```

#### 初始化WeChatQRCodeDetector

在初始化OpenCV后，就可以初始化WeChatQRCodeDetector了。
```kotlin
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
                val bitmap = result.bitmap?.drawRect { canvas, paint ->
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

从2.0.0版本开始 **wechat-qrcode-scanning** 和 **opencv-qrcode-scanning** 都是以[CameraScan](https://github.com/jenly1314/CameraScan)作为基础库去实现具体的分析检测功能，所以关于 **CameraScan** 的使用和自定义扫码界面布局都完全遵循[CameraScan](https://github.com/jenly1314/CameraScan) 的使用方式。

> 关于**CameraScan**的使用，你可以直接去看[CameraScan](https://github.com/jenly1314/CameraScan)的使用说明；

> 关于扫描框动画，你可以查看[ViewfinderView](https://github.com/jenly1314/ViewfinderView)的使用说明；

### 2.x版本的变化

从 **1.x** 到 **2.x** 主要变化如下：
* 1.x版本中 **wechat-qrcode-scanning** 和 **opencv-qrcode-scanning** 默认依赖的 **mlkit-camera-core** 被移除了；
> 从2.0.0版本开始 **wechat-qrcode-scanning** 和 **opencv-qrcode-scanning** 都改为依赖[CameraScan](https://github.com/jenly1314/CameraScan)；（[CameraScan](https://github.com/jenly1314/CameraScan)是一个独立的库，单独进行维护）

> 从2.0.0版本开始 **wechat-qrcode-scanning** 和 **opencv-qrcode-scanning** 都已默认依赖 **ViewfinderView**[ViewfinderView](https://github.com/jenly1314/ViewfinderView)

> 从2.0.0版本开始 **OpenCVCameraScanActivity** 和 **WeChatCameraScanActivity** 默认布局包含了扫描动画 **ViewfinderView** 和手电筒按钮，集成步骤更简单。

基于以上两点主要差异：2.x的主要使用方式和1.x基本类似，部分细节有所变更。

> 如果你是从 **1.x** 版本升级至 **2.x** 版本，那么你需要知道上面所说的差异；特别是独立出去单独维护的库，其包名都有所变化，这一点需要注意一下，大部分变动只需变更导入的包名即可完成升级。

> 如果你使用的是1.x版本的话请直接[查看v1.x分支版本](https://github.com/jenly1314/WeChatQRCode/tree/1.x/)

### 2.x版本的使用

2.x版本的实现主要是以[CameraScan](https://github.com/jenly1314/CameraScan)作为基础库去实现具体的分析检测功能，所以你可以直接去看[CameraScan](https://github.com/jenly1314/CameraScan)的使用说明，只要知道了[CameraScan](https://github.com/jenly1314/CameraScan)的基本使用方式，自然就会使用 **wechat-qrcode-scanning** 和 **opencv-qrcode-scanning**了。

### 二维码扫码识别

下面就列一下 **opencv-qrcode-scanning** 和 **wechat-qrcode-scanning** 实现扫二维码功能的核心类；主要包括实现扫描二维码的**Analyzer** 和便于快速实现扫描检测的 **BaseCameraScanActivity** 或 **BaseCameraScanFragment** 的子类。

| 功能      | 所属子模块                  | 对应的Analyzer实现          | 对应的BaseCameraScanActivity子类                       |
|:--------|:-----------------------|:-----------------------|:--------------------------------------------------|
| 二维码扫码识别 | opencv-qrcode-scanning | OpenCVScanningAnalyzer | OpenCVCameraScanActivity/OpenCVCameraScanFragment  |
| 二维码扫码识别  | wechat-qrcode-scanning | WeChatScanningAnalyzer | WeChatCameraScanActivity/WeChatCameraScanFragment |

更多使用详情，请查看[app](app)中的源码使用示例或直接查看 [API帮助文档](https://jitpack.io/com/github/jenly1314/WeChatQRCode/latest/javadoc/)

## 其他

### opencv-qrcode与wechat-qrcode检测识别二维码对比

**opencv-qrcode**

* 一次识别单个二维码速度一般；（一次识别多个二维码时有点小问题）
* 二维码检测的位置信息是一个四边形。

**wechat-qrcode**

* 一次能识别多个二维码，识别速度更快；
* 二维码检测的位置信息是一个矩形。

总结成一句话来说就是：**wechat-qrcode** 识别速度更快，**opencv-qrcode** 二维码定位更准。

> 就目前而言：**wechat-qrcode** 的优势基本秒杀 **opencv-qrcode**。

> 以上观点纯属个人测试总结得出；随着版本的迭代，不保证观点与事实的一致性。你也可以直接下载 [演示App](https://raw.githubusercontent.com/jenly1314/WeChatQRCode/master/app/release/app-release.apk)进行测试比对。

## 相关推荐

#### [MLKit](https://github.com/jenly1314/MLKit) 一个强大易用的工具包。通过ML Kit您可以很轻松的实现文字识别、条码识别、图像标记、人脸检测、对象检测等功能。    
#### [ZXingLite](https://github.com/jenly1314/ZXingLite) 基于zxing实现的扫码库，优化扫码和生成二维码/条形码功能。
#### [CameraScan](https://github.com/jenly1314/CameraScan) 一个简化扫描识别流程的通用基础库。
#### [ViewfinderView](https://github.com/jenly1314/ViewfinderView) ViewfinderView一个取景视图：主要用于渲染扫描相关的动画效果。

## 版本记录

#### v2.1.0：2024-1-13
* 更新OpenCV至v4.9.0
* 更新CameraScan至v1.1.0
* 更新compileSdkVersion至34
* 更新Gradle至v8.0

#### v2.0.1：2023-9-13
* 更新CameraScan至v1.0.1
* 更新ViewfinderView至v1.1.0

#### v2.0.0：2023-8-14
* **wechat-qrcode-scanning** 和 **opencv-qrcode-scanning** 中移除原依赖（**mlkit-camera-core**），现改为依赖[CameraScan](https://github.com/jenly1314/CameraScan)
* **wechat-qrcode-scanning** 和 **opencv-qrcode-scanning** 添加默认依赖[ViewfinderView](https://github.com/jenly1314/ViewfinderView)
* 优化扫描分析过程的性能体验（优化帧数据分析过程）

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
