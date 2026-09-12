# WeChatQRCode

[![MavenCentral](https://img.shields.io/maven-central/v/com.github.jenly1314.WeChatQRCode/wechat-qrcode?logo=sonatype)](https://repo1.maven.org/maven2/com/github/jenly1314/WeChatQRCode)
[![JitPack](https://img.shields.io/jitpack/v/github/jenly1314/WeChatQRCode?logo=jitpack)](https://jitpack.io/#jenly1314/WeChatQRCode)
[![CI](https://img.shields.io/github/actions/workflow/status/jenly1314/WeChatQRCode/build.yml?logo=github)](https://github.com/jenly1314/WeChatQRCode/actions/workflows/build.yml)
[![Download](https://img.shields.io/badge/download-APK-brightgreen?logo=github)](https://raw.githubusercontent.com/jenly1314/WeChatQRCode/master/app/release/app-release.apk)
[![API](https://img.shields.io/badge/API-23%2B-brightgreen?logo=android)](https://developer.android.com/guide/topics/manifest/uses-sdk-element#ApiLevels)
[![License](https://img.shields.io/github/license/jenly1314/WeChatQRCode?logo=open-source-initiative)](https://opensource.org/licenses/apache-2-0)

WeChatQRCode 一个基于OpenCV开源的微信二维码引擎移植封装的二维码识别库。
<html>
    <table style="margin-left: auto; margin-right: auto;">
        <tr>
            <td>
             又一个扫码相关的轮子，之所以说又，是因为这样的轮子已经开源三个了；几个轮子之间的优缺点，各有千秋，请自寻选择（小孩子才做选择）。
             <p>
             <p><strong> 基于ZXing的扫码轮子 <a href="https://github.com/jenly1314/ZXingLite" target="_blank">ZXingLite</a> </strong>
             <p><strong> 基于MLKit的扫码轮子 <a href="https://github.com/jenly1314/MLKit" target="_blank">MLKit</a> </strong>
             <p><strong> 基于OpenCV的扫码轮子  <a href="https://github.com/jenly1314/WeChatQRCode" target="_blank">WeChatQRCode</a> </strong>
            </td>
            <td>
             <img src="https://img.picgo.net/2024/01/28/056c87392d980a097b470b5cd48a6660919a84a17cd9a353bd775456.md.jpeg" class="none">
            </td>
        </tr>
    </table>
</html>

## 效果展示

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

**opencv-qrcode-scanning** 相当于 [CameraScan](https://github.com/jenly1314/CameraScan) 的衍生库。

### [wechat-qrcode](wechat-qrcode)

微信二维码识别：封装好的API，通过 **WeChatQRCodeDetector** 你可以很轻松的拥有OpenCV中开源的微信二维码识别功能

### [wechat-qrcode-scanning](wechat-qrcode-scanning)

微信二维码扫码：有了上面的微信二维码识别功能，基本的扫码相关界面还是需要有个的，扫码加识别完美搭配；

**wechat-qrcode-scanning** 相当于 [CameraScan](https://github.com/jenly1314/CameraScan) 的衍生库。

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

2. 在Module的 **build.gradle** 中添加依赖项

    ```gradle
    // OpenCV基础库（*必须）
    implementation 'com.github.jenly1314.WeChatQRCode:opencv:2.6.0'

    // OpenCV的ABI（可选），根据你的需要选择想要支持的SO库架构（至少选一个）
    implementation 'com.github.jenly1314.WeChatQRCode:opencv-armv7a:2.6.0'
    implementation 'com.github.jenly1314.WeChatQRCode:opencv-armv64:2.6.0'
    implementation 'com.github.jenly1314.WeChatQRCode:opencv-x86:2.6.0'
    implementation 'com.github.jenly1314.WeChatQRCode:opencv-x86_64:2.6.0'

    // OpenCV二维码识别功能（可选）
    implementation 'com.github.jenly1314.WeChatQRCode:opencv-qrcode:2.6.0'
    // OpenCV二维码扫码功能（可选）
    implementation 'com.github.jenly1314.WeChatQRCode:opencv-qrcode-scanning:2.6.0'

    // 微信二维码识别功能（可选）
    implementation 'com.github.jenly1314.WeChatQRCode:wechat-qrcode:2.6.0'
    // 微信二维码扫码功能（可选）
    implementation 'com.github.jenly1314.WeChatQRCode:wechat-qrcode-scanning:2.6.0'

    ```

### 温馨提示

#### 关于WeChatQRCode版本与编译的SDK版本要求

> 使用 **v2.5.0** 及以上版本时，要求 compileSdk ≥ 35

> 使用 **v2.1.0** 及以上版本时，要求 compileSdk ≥ 34

> 使用 **v2.0.0** 及以上版本时，要求 compileSdk ≥ 33

> 如果 **compileSdk < 33** 请使用 [**v1.x版本**](https://github.com/jenly1314/WeChatQRCode/tree/1.x/)


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

初始化 **OpenCV** 和 **WeChatQRCodeDetector** （建议在 **MainActivity** 或 **Application** 的 **onCreate** 方法中进行初始化）

#### 初始化OpenCV

使用版本 >= `v2.1.0`时，初始化OpenCV方式
```kotlin
//初始化OpenCV
OpenCV.initOpenCV()
```

使用版本 < `v2.1.0`时，初始化OpenCV方式
```kotlin
//初始化OpenCV
OpenCV.initAsync(context)
```

#### 初始化WeChatQRCodeDetector

在初始化OpenCV后，就可以立即初始化WeChatQRCodeDetector了。
```kotlin
//初始化WeChatQRCodeDetector
WeChatQRCodeDetector.init(context)
```

### 识别二维码

#### WeChat QRCode

识别二维码 （ **wechat-qrcode** 中的WeChatQRCodeDetector）
```kotlin
//识别二维码；results是一个List<String>集合，可能会有多个结果，如果只识别一个码，可以取List中第0个就可以
val results = WeChatQRCodeDetector.detectAndDecode(bitmap)

```

识别二维码并返回二维码位置信息 （ **wechat-qrcode** 中的WeChatQRCodeDetector）

示例1：识别二维码并返回二维码位置（v2.6.0 新增）
```kotlin
// 通过WeChatQRCodeDetector识别图片中的二维码并返回二维码的位置信息
val decodeResult = WeChatQRCodeDetector.detectAndDecodeResult(bitmap)
// 检测识别结果中的文本内容
Log.d(TAG, "texts: ${decodeResult.texts}")
val points = decodeResult.getVertexPoints()
// 检测识别结果中的二维码的四个点（一个矩形）
Log.d(TAG, "point0: ${points[0].x}, ${points[0].y}")
Log.d(TAG, "point1: ${points[1].x}, ${points[1].y}")
Log.d(TAG, "point2: ${points[2].x}, ${points[2].y}")
Log.d(TAG, "point3: ${points[3].x}, ${points[3].y}")

```

示例2：识别二维码并返回二维码位置
```kotlin
// 二维码的位置信息
val points = ArrayList<Mat>()
// 通过WeChatQRCodeDetector识别图片中的二维码并返回二维码的位置信息
val result = WeChatQRCodeDetector.detectAndDecode(bitmap, points)
points.forEach { mat ->
  // 检测识别结果中的二维码的四个点（一个矩形）
  Log.d(TAG, "point0: ${mat[0, 0][0]}, ${mat[0, 1][0]}")
  Log.d(TAG, "point1: ${mat[1, 0][0]}, ${mat[1, 1][0]}")
  Log.d(TAG, "point2: ${mat[2, 0][0]}, ${mat[2, 1][0]}")
  Log.d(TAG, "point3: ${mat[3, 0][0]}, ${mat[3, 1][0]}")
}

```

#### OpenCV QRCode

识别二维码 （ **opencv-qrcode** 中的OpenCVQRCodeDetector）
```kotlin
val openCVQRCodeDetector = OpenCVQRCodeDetector()
// 检测识别二维码
val results = openCVQRCodeDetector.detectAndDecode(bitmap)

```

识别二维码并返回二维码位置信息 （ **opencv-qrcode** 中的OpenCVQRCodeDetector）

示例1：识别二维码并返回二维码位置（v2.6.0 新增）
```kotlin
// 通过WeChatQRCodeDetector识别图片中的二维码并返回二维码的位置信息
val decodeResult = openCVQRCodeDetector.detectAndDecodeResult(bitmap, true)
// 检测识别结果中的文本内容
Log.d(TAG, "texts: ${decodeResult.texts}")
val points = decodeResult.getVertexPoints()
// 检测识别结果中的二维码的四个点（一个四边形）
Log.d(TAG, "point0: ${points[0].x}, ${points[0].y}")
Log.d(TAG, "point1: ${points[1].x}, ${points[1].y}")
Log.d(TAG, "point2: ${points[2].x}, ${points[2].y}")
Log.d(TAG, "point3: ${points[3].x}, ${points[3].y}")
```

示例2：识别二维码并返回二维码位置
```kotlin
// 检测识别结果：二维码的位置信息
val points = Mat()
// 通过WeChatQRCodeDetector识别图片中的二维码并返回二维码的位置信息
val result = openCVQRCodeDetector.detectAndDecode(bitmap, points)
// 检测识别结果中的二维码的四个点（一个四边形）；需要注意的是：OpenCVQRCode识别的二维码和WeChatQRCode的识别的二维码记录在Mat中的点位方式是不一样的
Log.d(TAG, "point0: ${points[0, 0][0]}, ${points[0, 0][1]}")
Log.d(TAG, "point1: ${points[0, 1][0]}, ${points[0, 1][1]}")
Log.d(TAG, "point2: ${points[0, 2][0]}, ${points[0, 2][1]}")
Log.d(TAG, "point3: ${points[0, 3][0]}, ${points[0, 3][1]}")

```

### 完整示例

通过继承 **wechat-qrcode-scanning** 中的 WeChatCameraScanActivity或者WeChatCameraScanFragment可以很轻松的实现扫码功能

#### 完整示例（使用版本 ≥ `v2.6.0` 时的用法示例）
```kotlin
class WeChatQRCodeActivity : WeChatCameraScanActivity() {

    private lateinit var ivResult: ImageView

    override fun initUI() {
        super.initUI()
        ivResult = findViewById(R.id.ivResult)

        onBackPressedDispatcher.addCallback(this) {
            // 如果是结果点显示时，用户点击了返回键，则认为是取消选择当前结果，重新开始扫码
            if (viewfinderView!!.isShowPoints) {
                ivResult.setImageResource(0)
                viewfinderView!!.showScanner()
                cameraScan.setAnalyzeImage(true)
            } else {
                finish()
            }
        }
    }

    override fun onScanResultCallback(result: AnalyzeResult<DecodeResult>) {
        // 停止分析
        cameraScan.setAnalyzeImage(false)
        val decodeResult = result.result
        LogX.d(decodeResult.toString())
        val width = result.imageWidth
        val height = result.imageHeight
        val vertexPoints = decodeResult.getVertexPoints()

        if (vertexPoints.isNotEmpty()) { // 如果需要处理结果二维码的位置信息
            //取预览当前帧图片并显示，为结果点提供参照
            ivResult.setImageBitmap(previewView.bitmap)
            val points = ArrayList<Point>()
            vertexPoints.chunked(4).forEach { quad ->
                if (quad.size < 4) {
                    return@forEach
                }
                // 扫码结果二维码的四个点（一个矩形）
                LogX.format(LogFormat.PLAIN).d("point0: ${quad[0].x}, ${quad[0].y}")
                LogX.format(LogFormat.PLAIN).d("point1: ${quad[1].x}, ${quad[1].y}")
                LogX.format(LogFormat.PLAIN).d("point2: ${quad[2].x}, ${quad[2].y}")
                LogX.format(LogFormat.PLAIN).d("point3: ${quad[3].x}, ${quad[3].y}")

                val centerX = ((quad[0].x + quad[1].x + quad[2].x + quad[3].x) / 4).toInt()
                val centerY = ((quad[0].y + quad[1].y + quad[2].y + quad[3].y) / 4).toInt()

                //将实际的结果中心点坐标转换成界面预览的坐标
                val point = PointUtils.transform(
                    centerX,
                    centerY,
                    width,
                    height,
                    viewfinderView!!.width,
                    viewfinderView!!.height
                )
                points.add(point)
            }
            //设置Item点击监听
            viewfinderView!!.setOnItemClickListener {
                //显示点击Item将所在位置扫码识别的结果返回
                val intent = Intent()
                intent.putExtra(CameraScan.SCAN_RESULT, decodeResult.texts[it])
                setResult(RESULT_OK, intent)
                finish()
            }
            //显示结果点信息
            viewfinderView!!.showResultPoints(points)

            if (decodeResult.texts.size == 1) {
                val intent = Intent()
                intent.putExtra(CameraScan.SCAN_RESULT, decodeResult.texts[0])
                setResult(RESULT_OK, intent)
                finish()
            }
        } else {
            // 一般需求都是识别一个码，所以这里取第0个就可以；有识别多个码的需求，可以取全部
            val intent = Intent()
            intent.putExtra(CameraScan.SCAN_RESULT, decodeResult.texts[0])
            setResult(RESULT_OK, intent)
            finish()
        }
    }

    override fun createAnalyzer(): Analyzer<DecodeResult> {
        // 分析器默认不会返回结果二维码的位置信息
//        return WeChatScanningAnalyzer()
        // 如果需要返回结果二维码位置信息，则初始化分析器时，isOutputVertices参数传 true 即可
        return WeChatScanningAnalyzer(true)
    }

    override fun getLayoutId(): Int {
        return R.layout.activity_wechat_qrcode
    }

}
```

#### 完整示例（使用版本 ≤ `v2.5.0` 时的用法示例）
```kotlin
class WeChatQRCodeActivity : WeChatCameraScanActivity() {

    override fun onScanResultCallback(result: AnalyzeResult<List<String>>) {
        // 停止分析
        cameraScan.setAnalyzeImage(false)
        LogX.d(result.result.toString())
        // 当初始化 WeChatScanningAnalyzer 时，如果是需要二维码的位置信息，则可通过 WeChatScanningAnalyzer.QRCodeAnalyzeResult 获取
        if (result is WeChatScanningAnalyzer.QRCodeAnalyzeResult) { // 如果需要处理结果二维码的位置信息

            val buffer = StringBuilder()
            val bitmap = result.bitmap?.drawRect { canvas, paint ->
                // 扫码结果可能有多个
                result.result.forEachIndexed { index, data ->
                    buffer.append("[$index] ").append(data).append("\n")
                }

                result.points?.forEach { mat ->
                    // 扫码结果二维码的四个点（一个矩形）
                    LogX.format(LogFormat.PLAIN).d("point0: ${mat[0, 0][0]}, ${mat[0, 1][0]}")
                    LogX.format(LogFormat.PLAIN).d("point1: ${mat[1, 0][0]}, ${mat[1, 1][0]}")
                    LogX.format(LogFormat.PLAIN).d("point2: ${mat[2, 0][0]}, ${mat[2, 1][0]}")
                    LogX.format(LogFormat.PLAIN).d("point3: ${mat[3, 0][0]}, ${mat[3, 1][0]}")

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

            val config = AppDialogConfig(this, R.layout.qrcode_result_dialog).apply {
                content = buffer
                onClickConfirm = View.OnClickListener {
                    AppDialog.dismissDialog()
                    // 继续扫码分析
                    cameraScan.setAnalyzeImage(true)
                }
                onClickCancel = View.OnClickListener {
                    AppDialog.dismissDialog()
                    finish()
                }
                viewHolder.setImageBitmap(R.id.ivDialogContent, bitmap)
            }
            AppDialog.showDialog(config, false)

        } else {
            // 一般需求都是识别一个码，所以这里取第0个就可以；有识别多个码的需求，可以取全部
            val text = result.result[0]
            val intent = Intent()
            intent.putExtra(CameraScan.SCAN_RESULT, text)
            setResult(RESULT_OK, intent)
            finish()
        }
    }

    override fun createAnalyzer(): Analyzer<MutableList<String>> {
        // 分析器默认不会返回结果二维码的位置信息
//        return WeChatScanningAnalyzer()
        // 如果需要返回结果二维码位置信息，则初始化分析器时，参数传 true 即可
        return WeChatScanningAnalyzer(true)
    }

}
```

更多完整示例如下：

**wechat-qrcode-scanning**

扫描识别二维码实现示例：通过直接继承 WeChatCameraScanActivity 实现的示例 [WeChatQRCodeActivity](app/src/main/kotlin/com/king/wechat/qrcode/app/WeChatQRCodeActivity.kt)

扫描识别多个二维码实现示例：通过直接继承 WeChatCameraScanActivity 实现的示例 [WeChatMultiQRCodeActivity](app/src/main/kotlin/com/king/wechat/qrcode/app/WeChatMultiQRCodeActivity.kt)

**opencv-qrcode-scanning**

扫描识别二维码实现示例：通过直接继承 OpenCVCameraScanActivity 实现的示例 [OpenCVQRCodeActivity](app/src/main/kotlin/com/king/wechat/qrcode/app/OpenCVQRCodeActivity.kt)

### 版本变化说明

从2.0.0版本开始 **wechat-qrcode-scanning** 和 **opencv-qrcode-scanning** 都是以 [CameraScan](https://github.com/jenly1314/CameraScan) 作为基础库去实现具体的分析检测功能，所以关于 **CameraScan** 的使用和自定义扫码界面布局都完全遵循[CameraScan](https://github.com/jenly1314/CameraScan) 的使用方式。

> 关于 **CameraScan** 的使用，你可以直接去看 [CameraScan](https://github.com/jenly1314/CameraScan) 的使用说明；

> 关于扫描框动画，你可以查看 [ViewfinderView](https://github.com/jenly1314/ViewfinderView) 的使用说明；

#### 2.x版本的变化

从 **1.x** 到 **2.x** 主要变化如下：

* 1.x版本中 **wechat-qrcode-scanning** 和 **opencv-qrcode-scanning** 默认依赖的 **mlkit-camera-core** 被移除了；
> 从2.0.0版本开始 **wechat-qrcode-scanning** 和 **opencv-qrcode-scanning**  [CameraScan](https://github.com/jenly1314/CameraScan)；（ [CameraScan](https://github.com/jenly1314/CameraScan) 是一个独立的库，单独进行维护）

> 从2.0.0版本开始 **wechat-qrcode-scanning** 和 **opencv-qrcode-scanning** 都已默认依赖 [ViewfinderView](https://github.com/jenly1314/ViewfinderView)

> 从2.0.0版本开始 **OpenCVCameraScanActivity** 和 **WeChatCameraScanActivity** 默认布局包含了扫描动画 **ViewfinderView** 和手电筒按钮，集成步骤更简单。

基于以上两点主要差异：2.x的主要使用方式和1.x基本类似，部分细节有所变更。

> 如果你是从 **1.x** 版本升级至 **2.x** 版本，那么你需要知道上面所说的差异；特别是独立出去单独维护的库，其包名都有所变化，这一点需要注意一下，大部分变动只需变更导入的包名即可完成升级。

> 如果你使用的是1.x版本的话请直接 [查看v1.x分支版本](https://github.com/jenly1314/WeChatQRCode/tree/1.x/)

#### 2.x版本的使用

2.x版本的实现主要是以 [CameraScan](https://github.com/jenly1314/CameraScan) 作为基础库去实现具体的分析检测功能，所以你可以直接去看 [CameraScan](https://github.com/jenly1314/CameraScan) 的使用说明，只要知道了 [CameraScan](https://github.com/jenly1314/CameraScan) 的基本使用方式，自然就会使用 **wechat-qrcode-scanning** 和 **opencv-qrcode-scanning** 了。

### 二维码扫码识别

下面就列一下 **opencv-qrcode-scanning** 和 **wechat-qrcode-scanning** 实现扫二维码功能的核心类；主要包括实现扫描二维码的 **Analyzer** 和便于快速实现扫描检测的 **BaseCameraScanActivity** 或 **BaseCameraScanFragment** 的子类。

| 功能      | 所属子模块                  | 对应的Analyzer实现          | 对应的BaseCameraScanActivity子类                       |
|:--------|:-----------------------|:-----------------------|:--------------------------------------------------|
| 二维码扫码识别 | opencv-qrcode-scanning | OpenCVScanningAnalyzer | OpenCVCameraScanActivity/OpenCVCameraScanFragment  |
| 二维码扫码识别  | wechat-qrcode-scanning | WeChatScanningAnalyzer | WeChatCameraScanActivity/WeChatCameraScanFragment |

更多使用详情，请查看 [app](app) 中的源码使用示例或直接查看 [API帮助文档](https://jenly1314.github.io/WeChatQRCode/api/)

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

* [MLKit](https://github.com/jenly1314/MLKit) 一个强大易用的工具包。通过ML Kit您可以很轻松的实现文字识别、条码识别、图像标记、人脸检测、对象检测等功能。
* [ZXingLite](https://github.com/jenly1314/ZXingLite) 基于zxing实现的扫码库，优化扫码和生成二维码/条形码功能。
* [CameraScan](https://github.com/jenly1314/CameraScan) 一个简化扫描识别流程的通用基础库。
* [ViewfinderView](https://github.com/jenly1314/ViewfinderView) ViewfinderView一个取景视图：主要用于渲染扫描相关的动画效果。
* [LibYuv](https://github.com/jenly1314/libyuv) 基于Google的libyuv编译封装的YUV转换工具库，主要用途是在各种YUV与RGB之间进行相互转换、裁减、旋转、缩放、镜像等。
* [LogX](https://github.com/jenly1314/LogX) 一个小而美的日志记录框架；好用不解释。

<!-- end -->

## 版本日志

#### 特别版本
- 本分支基于`opencv-5.x`编译，因存编译生成的so库体积相比`opencv-4.x`版本明显增加，故暂未发布至`MavenCentral`。
- `opencv-5.x`相较`opencv-4.x`实际性能提升与兼容性收益仍需进一步评估，如使用请自取。

#### v2.6.0：2026-6-17
- 项目中的 Java 代码已全面转为 Kotlin 实现（`opencv`模块除外）
- 新增数据类：`DecodeResult` 并提供函数：`decodeResult.getVertexPoints()`来简化获取二维码位置点
- 新增函数：`WeChatQRCodeDetector.detectAndDecodeResult(...)` 返回：`DecodeResult`对象
- 新增函数：`openCVQRCodeDetector.detectAndDecodeResult(...)` 返回：`DecodeResult`对象
- 更新CameraScan至v1.5.0
- 更新LogX至v1.3.0

#### [查看更多版本日志](CHANGELOG.md)

---

![footer](https://jenly1314.github.io/page/footer.svg)

