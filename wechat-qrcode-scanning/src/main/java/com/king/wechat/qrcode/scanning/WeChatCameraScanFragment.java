package com.king.wechat.qrcode.scanning;

import com.king.mlkit.vision.camera.BaseCameraScanFragment;
import com.king.mlkit.vision.camera.analyze.Analyzer;
import com.king.wechat.qrcode.scanning.analyze.WeChatScanningAnalyzer;

import java.util.List;

import androidx.annotation.Nullable;

/**
 * @author <a href="mailto:jenly1314@gmail.com">Jenly</a>
 */
public abstract class WeChatCameraScanFragment extends BaseCameraScanFragment<List<String>> {
    @Nullable
    @Override
    public Analyzer<List<String>> createAnalyzer() {
        return new WeChatScanningAnalyzer();
    }
}
