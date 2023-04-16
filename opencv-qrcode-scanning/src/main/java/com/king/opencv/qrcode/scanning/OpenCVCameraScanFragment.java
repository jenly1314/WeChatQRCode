package com.king.opencv.qrcode.scanning;

import com.king.mlkit.vision.camera.BaseCameraScanFragment;
import com.king.mlkit.vision.camera.analyze.Analyzer;
import com.king.opencv.qrcode.scanning.analyze.OpenCVScanningAnalyzer;

import java.util.List;

import androidx.annotation.Nullable;

/**
 * OpenCV二维码扫描 - 相机扫描基类
 * <p>
 * 通过继承 {@link OpenCVCameraScanActivity}或{@link OpenCVCameraScanFragment}可快速实现二维码扫描
 *
 * @author <a href="mailto:jenly1314@gmail.com">Jenly</a>
 */
public abstract class OpenCVCameraScanFragment extends BaseCameraScanFragment<List<String>> {
    @Nullable
    @Override
    public Analyzer<List<String>> createAnalyzer() {
        return new OpenCVScanningAnalyzer();
    }
}
