package com.king.wechat.qrcode.scanning;

import com.king.mlkit.vision.camera.BaseCameraScanActivity;
import com.king.mlkit.vision.camera.analyze.Analyzer;
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
    @Nullable
    @Override
    public Analyzer<List<String>> createAnalyzer() {
        return new WeChatScanningAnalyzer();
    }
}