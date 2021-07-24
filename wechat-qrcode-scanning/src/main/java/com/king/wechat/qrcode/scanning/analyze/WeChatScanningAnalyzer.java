package com.king.wechat.qrcode.scanning.analyze;

import android.graphics.Bitmap;

import com.king.mlkit.vision.camera.AnalyzeResult;
import com.king.mlkit.vision.camera.analyze.Analyzer;
import com.king.mlkit.vision.camera.util.ImageUtils;
import com.king.mlkit.vision.camera.util.LogUtils;
import com.king.wechat.qrcode.WeChatQRCodeDetector;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.camera.core.ImageProxy;

/**
 * @author <a href="mailto:jenly1314@gmail.com">Jenly</a>
 */
public class WeChatScanningAnalyzer implements Analyzer<List<String>> {
    @Override
    public void analyze(@NonNull ImageProxy imageProxy, @NonNull Analyzer.OnAnalyzeListener<AnalyzeResult<List<String>>> listener) {
        try {
            Bitmap bitmap = ImageUtils.imageProxyToBitmap(imageProxy,imageProxy.getImageInfo().getRotationDegrees());
            List<String> result = WeChatQRCodeDetector.detectAndDecode(bitmap);
            if(result != null && result.size() > 0){
                listener.onSuccess(new AnalyzeResult<>(bitmap,result));
            }else{
                listener.onFailure();
            }
        } catch (Exception e) {
            LogUtils.w(e);
        }
    }
}
