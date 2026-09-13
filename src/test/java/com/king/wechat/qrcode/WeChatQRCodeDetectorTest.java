package com.king.wechat.qrcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WeChatQRCodeDetectorTest {

    private final Logger logger = Logger.getLogger(WeChatQRCodeDetectorTest.class.getName());

    /**
     * 测试检测并识别二维码
     */
    @Test
    public void testQrCodeDetectAndDecode() {
        try {
            //初始化 OpenCV
            OpenCV.init();
            //初始化 WeChatQRCode
            WeChatQRCodeDetector.init();

            //检测并识别二维码 （同一张图片可能有多个二维码）
            List<String> results = WeChatQRCodeDetector.detectAndDecode("image/WeChatQRCode.png");
            logger.log(Level.INFO, "results: {0}", results);
            Assert.assertFalse(results.isEmpty());
        } catch (Exception e) {
            Assert.fail("Exception occurred: " + e.getMessage());
        }
    }
}
