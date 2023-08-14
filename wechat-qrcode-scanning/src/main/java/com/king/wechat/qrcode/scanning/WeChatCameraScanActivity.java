package com.king.wechat.qrcode.scanning;

import android.view.View;

import com.king.camera.scan.BaseCameraScanActivity;
import com.king.camera.scan.analyze.Analyzer;
import com.king.view.viewfinderview.ViewfinderView;
import com.king.wechat.qrcode.scanning.analyze.WeChatScanningAnalyzer;

import java.util.List;

import androidx.annotation.Nullable;

/**
 * 微信二维码扫描 - 相机扫描基类
 * <p>
 * 通过继承 {@link WeChatCameraScanActivity}或{@link WeChatCameraScanFragment}可快速实现二维码扫描
 *
 * @author <a href="mailto:jenly1314@gmail.com">Jenly</a>
 */
public abstract class WeChatCameraScanActivity extends BaseCameraScanActivity<List<String>> {

    protected ViewfinderView viewfinderView;

    @Override
    public void initUI() {
        int viewfinderViewId = getViewfinderViewId();
        if (viewfinderViewId != View.NO_ID && viewfinderViewId != 0) {
            viewfinderView = findViewById(viewfinderViewId);
        }
        super.initUI();
    }

    @Nullable
    @Override
    public Analyzer<List<String>> createAnalyzer() {
        return new WeChatScanningAnalyzer();
    }

    /**
     * 布局ID；通过覆写此方法可以自定义布局
     *
     * @return 布局ID
     */
    @Override
    public int getLayoutId() {
        return R.layout.wechat_camera_scan;
    }

    /**
     * {@link #viewfinderView} 的 ID
     *
     * @return 默认返回{@code R.id.viewfinderView}, 如果不需要扫码框可以返回{@link View#NO_ID}
     */

    public int getViewfinderViewId() {
        return R.id.viewfinderView;
    }
}