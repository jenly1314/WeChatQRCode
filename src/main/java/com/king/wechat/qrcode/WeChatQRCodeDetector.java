package com.king.wechat.qrcode;

import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.wechat_qrcode.WeChatQRCode;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 微信二维码检测器
 *
 * @author <a href="mailto:jenly1314@gmail.com">Jenly</a>
 * <p>
 * <a href="https://github.com/jenly1314">Follow me</a>
 */
public final class WeChatQRCodeDetector {

    private static final Logger LOGGER = Logger.getLogger(WeChatQRCodeDetector.class.getName());
    private static final String MODEL_RESOURCE_DIRECTORY = "models";
    private static final String DETECT_MODEL_FILE_NAME = "detect_model.onnx";
    private static final String SR_MODEL_FILE_NAME = "sr_model.onnx";
    private static WeChatQRCode sWeChatQRCode;

    private WeChatQRCodeDetector() {
        throw new AssertionError();
    }

    /**
     * 初始化 WeChatQRCode
     */
    public static void init() throws Exception {
        initWeChatQRCodeFromResources();
    }

    /**
     * 初始化 WeChatQRCode
     *
     * @param modelDirPath WeChatQRCode 相关模型文件所在的文件夹
     * @throws Exception
     */
    public static void init(String modelDirPath) throws Exception {
        initWeChatQRCodeFromFileSystem(modelDirPath);
    }

    /**
     * 从 resources 目录初始化 WeChatQRCode。
     */
    private static void initWeChatQRCodeFromResources() throws Exception {
        File detectModel = getModelResourceFile(DETECT_MODEL_FILE_NAME);
        File srModel = getModelResourceFile(SR_MODEL_FILE_NAME);
        initWeChatQRCode(detectModel, srModel);
    }


    /**
     * 初始化 WeChatQRCode
     *
     * @throws Exception
     */
    private static void initWeChatQRCodeFromFileSystem(String modelDirPath) throws Exception {
        File detectModel = new File(modelDirPath, DETECT_MODEL_FILE_NAME);
        File srModel = new File(modelDirPath, SR_MODEL_FILE_NAME);
        initWeChatQRCode(detectModel, srModel);
    }

    /**
     * 使用指定模型文件完成 WeChatQRCode 初始化。
     */
    private static void initWeChatQRCode(File detectModel, File srModel) {
        sWeChatQRCode = new WeChatQRCode(detectModel.getAbsolutePath(), srModel.getAbsolutePath());
        LOGGER.log(Level.INFO, "Successfully initialized WeChatQRCode.");
    }

    /**
     * 获取模型资源文件，必要时复制到临时目录。
     */
    private static File getModelResourceFile(String fileName) throws IOException {
        return ResourceLoader.getResourceFileOrCopy(WeChatQRCodeDetector.class, MODEL_RESOURCE_DIRECTORY + "/" + fileName);
    }

    /**
     * Both detects and decodes QR code.
     * To simplify the usage, there is a only API: detectAndDecode
     *
     * @param filename
     * @return list of decoded string.
     */
    public static List<String> detectAndDecode(String filename) {
        return detectAndDecode(Imgcodecs.imread(filename));
    }

    /**
     * Both detects and decodes QR code.
     * To simplify the usage, there is a only API: detectAndDecode
     *
     * @param img supports grayscale or color (BGR) image.
     *            empty if not found.
     * @return list of decoded string.
     */
    public static List<String> detectAndDecode(Mat img) {
        return sWeChatQRCode.detectAndDecode(img);
    }

    /**
     * Both detects and decodes QR code.
     * To simplify the usage, there is a only API: detectAndDecode
     *
     * @param img    supports grayscale or color (BGR) image.
     * @param points optional output array of vertices of the found QR code quadrangle. Will be
     *               empty if not found.
     * @return list of decoded string.
     */
    public static List<String> detectAndDecode(Mat img, List<Mat> points) {
        return sWeChatQRCode.detectAndDecode(img, points);
    }
}
