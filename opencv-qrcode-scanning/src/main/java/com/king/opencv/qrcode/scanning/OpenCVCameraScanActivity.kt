package com.king.opencv.qrcode.scanning

import android.view.View
import com.king.camera.scan.BaseCameraScanActivity
import com.king.camera.scan.analyze.Analyzer
import com.king.opencv.qrcode.scanning.analyze.OpenCVScanningAnalyzer
import com.king.view.viewfinderview.ViewfinderView

/**
 * OpenCV二维码扫描 - 相机扫描基类
 * <p>
 * 通过继承 [OpenCVCameraScanActivity]或[OpenCVCameraScanFragment]可快速实现二维码扫描
 *
 * @author <a href="mailto:jenly1314@gmail.com">Jenly</a>
 * <p>
 * <a href="https://github.com/jenly1314">Follow me</a>
 */
abstract class OpenCVCameraScanActivity : BaseCameraScanActivity<List<String>>() {

    protected var viewfinderView: ViewfinderView? = null

    override fun initUI() {
        val viewfinderViewId = getViewfinderViewId()
        if (viewfinderViewId != View.NO_ID && viewfinderViewId != 0) {
            viewfinderView = findViewById(viewfinderViewId)
        }
        super.initUI()
    }

    override fun createAnalyzer(): Analyzer<List<String>>? {
        return OpenCVScanningAnalyzer()
    }

    /**
     * 布局ID；通过覆写此方法可以自定义布局
     *
     * @return 布局ID
     */
    override fun getLayoutId(): Int {
        return R.layout.opencv_camera_scan
    }

    /**
     * [viewfinderView] 的 ID
     *
     * @return 默认返回[R.id.viewfinderView], 如果不需要扫码框可以返回[View.NO_ID]
     */
    open fun getViewfinderViewId(): Int {
        return R.id.viewfinderView
    }
}
