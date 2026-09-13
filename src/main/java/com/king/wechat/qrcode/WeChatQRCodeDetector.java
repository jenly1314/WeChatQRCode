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
 * WeChat QR code detector.
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
     * Initialize WeChatQRCode.
     */
    public static void init() throws Exception {
        initWeChatQRCodeFromResources();
    }

    /**
     * Initialize WeChatQRCode from the specified directory.
     *
     * @param modelDirPath directory containing WeChatQRCode model files
     * @throws Exception thrown when initialization fails
     */
    public static void init(String modelDirPath) throws Exception {
        initWeChatQRCodeFromFileSystem(modelDirPath);
    }

    /**
     * Initialize WeChatQRCode from packaged resources.
     */
    private static void initWeChatQRCodeFromResources() throws Exception {
        File detectModel = getModelResourceFile(DETECT_MODEL_FILE_NAME);
        File srModel = getModelResourceFile(SR_MODEL_FILE_NAME);
        initWeChatQRCode(detectModel, srModel);
    }


    /**
     * Load WeChatQRCode model files from the file system.
     *
     * @throws Exception thrown when initialization fails
     */
    private static void initWeChatQRCodeFromFileSystem(String modelDirPath) throws Exception {
        File detectModel = new File(modelDirPath, DETECT_MODEL_FILE_NAME);
        File srModel = new File(modelDirPath, SR_MODEL_FILE_NAME);
        initWeChatQRCode(detectModel, srModel);
    }

    /**
     * Initialize WeChatQRCode with the specified model files.
     */
    private static void initWeChatQRCode(File detectModel, File srModel) {
        sWeChatQRCode = new WeChatQRCode(detectModel.getAbsolutePath(), srModel.getAbsolutePath());
        LOGGER.log(Level.INFO, "Successfully initialized WeChatQRCode.");
    }

    /**
     * Get the model resource file, copying it to a temporary location when needed.
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
