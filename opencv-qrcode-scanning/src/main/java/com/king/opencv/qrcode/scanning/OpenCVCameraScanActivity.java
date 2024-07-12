package com.king.opencv.qrcode.scanning;

import android.view.View;

import com.king.camera.scan.BaseCameraScanActivity;
import com.king.camera.scan.analyze.Analyzer;
import com.king.opencv.qrcode.scanning.analyze.OpenCVScanningAnalyzer;
import com.king.view.viewfinderview.ViewfinderView;

import java.util.List;

import androidx.annotation.Nullable;

/**
 * OpenCV二维码扫描 - 相机扫描基类
 * <p>
 * 通过继承 {@link OpenCVCameraScanActivity}或{@link OpenCVCameraScanFragment}可快速实现二维码扫描
 *
 * @author <a href="mailto:jenly1314@gmail.com">Jenly</a>
 * <p>
 * <a href="https://github.com/jenly1314">Follow me</a>
 */
public abstract class OpenCVCameraScanActivity extends BaseCameraScanActivity<List<String>> {

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
        return new OpenCVScanningAnalyzer();
    }

    /**
     * 布局ID；通过覆写此方法可以自定义布局
     *
     * @return 布局ID
     */
    @Override
    public int getLayoutId() {
        return R.layout.opencv_camera_scan;
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
