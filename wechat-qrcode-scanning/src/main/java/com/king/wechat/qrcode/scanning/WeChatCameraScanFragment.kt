package com.king.wechat.qrcode.scanning

import android.view.View
import com.king.camera.scan.BaseCameraScanFragment
import com.king.camera.scan.analyze.Analyzer
import com.king.view.viewfinderview.ViewfinderView
import com.king.wechat.qrcode.scanning.analyze.WeChatScanningAnalyzer

/**
 * 微信二维码扫描 - 相机扫描基类
 * <p>
 * 通过继承 [WeChatCameraScanActivity]或[WeChatCameraScanFragment]可快速实现二维码扫描
 *
 * @author <a href="mailto:jenly1314@gmail.com">Jenly</a>
 * <p>
 * <a href="https://github.com/jenly1314">Follow me</a>
 */
abstract class WeChatCameraScanFragment : BaseCameraScanFragment<List<String>>() {

    protected var viewfinderView: ViewfinderView? = null

    override fun initUI() {
        val viewfinderViewId = getViewfinderViewId()
        if (viewfinderViewId != View.NO_ID && viewfinderViewId != 0) {
            viewfinderView = rootView.findViewById<ViewfinderView>(viewfinderViewId)
        }
        super.initUI()
    }

    override fun createAnalyzer(): Analyzer<List<String>>? {
        return WeChatScanningAnalyzer()
    }

    /**
     * 布局ID；通过覆写此方法可以自定义布局
     *
     * @return 布局ID
     */
    override fun getLayoutId(): Int {
        return R.layout.wechat_camera_scan
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
