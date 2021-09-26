package com.king.wechat.qrcode;

import java.util.List;

public class Demo {

    public static void main(String[] args) {
        try {
            //初始化 OpenCV
            OpenCV.init();
            //初始化 WeChatQRCode
            WeChatQRCodeDetector.init();
            //检测并识别二维码 （同一张图片可能有多个二维码）
            List<String> results = WeChatQRCodeDetector.detectAndDecode("image/WeChatQRCode.png");
            System.out.println("results:" + results);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
