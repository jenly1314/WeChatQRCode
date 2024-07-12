## 版本记录

#### v2.2.0：2024-7-12
* 更新CameraScan至v1.2.0
* 更新ViewfinderView至v1.2.0
* 使用[LogX](https://github.com/jenly1314/LogX) 来统一管理日志
* 优化一些细节

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