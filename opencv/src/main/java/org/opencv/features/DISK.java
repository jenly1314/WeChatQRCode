//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.features;

import java.util.ArrayList;
import java.util.List;
import org.opencv.core.Mat;
import org.opencv.core.MatOfByte;
import org.opencv.core.Size;
import org.opencv.features.DISK;
import org.opencv.features.Feature2D;
import org.opencv.utils.Converters;

// C++: class DISK
/**
 * DISK feature detector and descriptor, based on a DNN model.
 *
 * DISK (Deep Image Structure and Keypoints) is a learned local-feature pipeline that produces
 * keypoints and 128-D L2-normalized descriptors via a single forward pass through a fully
 * convolutional network. This class wraps an ONNX export of the pre-trained DISK model through
 * cv::dnn::Net and exposes it under the standard cv::Feature2D interface so it can be used as
 * a drop-in alternative to SIFT/ORB.
 *
 * The class assumes the ONNX model has a single input named {@code image} taking an N×3×H×W float32
 * tensor in [0, 1] (RGB channel order) and three outputs named {@code keypoints} (N×2), {@code scores} (N)
 * and {@code descriptors} (N×128).
 */
public class DISK extends Feature2D {

    protected DISK(long addr) { super(addr); }

    // internal usage only
    public static DISK __fromPtr__(long addr) { return new DISK(addr); }

    //
    // C++: static Ptr_DISK cv::DISK::create(String modelPath, int maxKeypoints = -1, float scoreThreshold = 0.0f, Size imageSize = Size(), int backendId = 0, int targetId = 0)
    //

    /**
     * Creates a DISK detector.
     *     @param modelPath Path to the DISK ONNX model.
     *     @param maxKeypoints Maximum number of keypoints to return per image. The strongest
     *                         responses (by network score) are kept; -1 keeps all detections.
     *     @param scoreThreshold Discard keypoints with network score strictly below this value.
     *     @param imageSize Target input size (width, height) fed to the network. Use Size()
     *                      (the default) to fall back to the network's expected fixed input
     *                      shape of 1024x1024. When overriding, both dimensions must be
     *                      positive multiples of 16, since DISK downsamples by a factor of 16.
     *     @param backendId DNN backend identifier (see cv::dnn::Backend); 0 = DNN_BACKEND_DEFAULT.
     *     @param targetId  DNN target identifier (see cv::dnn::Target);  0 = DNN_TARGET_CPU.
     * @return automatically generated
     */
    public static DISK create(String modelPath, int maxKeypoints, float scoreThreshold, Size imageSize, int backendId, int targetId) {
        return DISK.__fromPtr__(create_0(modelPath, maxKeypoints, scoreThreshold, imageSize.width, imageSize.height, backendId, targetId));
    }

    /**
     * Creates a DISK detector.
     *     @param modelPath Path to the DISK ONNX model.
     *     @param maxKeypoints Maximum number of keypoints to return per image. The strongest
     *                         responses (by network score) are kept; -1 keeps all detections.
     *     @param scoreThreshold Discard keypoints with network score strictly below this value.
     *     @param imageSize Target input size (width, height) fed to the network. Use Size()
     *                      (the default) to fall back to the network's expected fixed input
     *                      shape of 1024x1024. When overriding, both dimensions must be
     *                      positive multiples of 16, since DISK downsamples by a factor of 16.
     *     @param backendId DNN backend identifier (see cv::dnn::Backend); 0 = DNN_BACKEND_DEFAULT.
     * @return automatically generated
     */
    public static DISK create(String modelPath, int maxKeypoints, float scoreThreshold, Size imageSize, int backendId) {
        return DISK.__fromPtr__(create_1(modelPath, maxKeypoints, scoreThreshold, imageSize.width, imageSize.height, backendId));
    }

    /**
     * Creates a DISK detector.
     *     @param modelPath Path to the DISK ONNX model.
     *     @param maxKeypoints Maximum number of keypoints to return per image. The strongest
     *                         responses (by network score) are kept; -1 keeps all detections.
     *     @param scoreThreshold Discard keypoints with network score strictly below this value.
     *     @param imageSize Target input size (width, height) fed to the network. Use Size()
     *                      (the default) to fall back to the network's expected fixed input
     *                      shape of 1024x1024. When overriding, both dimensions must be
     *                      positive multiples of 16, since DISK downsamples by a factor of 16.
     * @return automatically generated
     */
    public static DISK create(String modelPath, int maxKeypoints, float scoreThreshold, Size imageSize) {
        return DISK.__fromPtr__(create_2(modelPath, maxKeypoints, scoreThreshold, imageSize.width, imageSize.height));
    }

    /**
     * Creates a DISK detector.
     *     @param modelPath Path to the DISK ONNX model.
     *     @param maxKeypoints Maximum number of keypoints to return per image. The strongest
     *                         responses (by network score) are kept; -1 keeps all detections.
     *     @param scoreThreshold Discard keypoints with network score strictly below this value.
     *                      (the default) to fall back to the network's expected fixed input
     *                      shape of 1024x1024. When overriding, both dimensions must be
     *                      positive multiples of 16, since DISK downsamples by a factor of 16.
     * @return automatically generated
     */
    public static DISK create(String modelPath, int maxKeypoints, float scoreThreshold) {
        return DISK.__fromPtr__(create_3(modelPath, maxKeypoints, scoreThreshold));
    }

    /**
     * Creates a DISK detector.
     *     @param modelPath Path to the DISK ONNX model.
     *     @param maxKeypoints Maximum number of keypoints to return per image. The strongest
     *                         responses (by network score) are kept; -1 keeps all detections.
     *                      (the default) to fall back to the network's expected fixed input
     *                      shape of 1024x1024. When overriding, both dimensions must be
     *                      positive multiples of 16, since DISK downsamples by a factor of 16.
     * @return automatically generated
     */
    public static DISK create(String modelPath, int maxKeypoints) {
        return DISK.__fromPtr__(create_4(modelPath, maxKeypoints));
    }

    /**
     * Creates a DISK detector.
     *     @param modelPath Path to the DISK ONNX model.
     *                         responses (by network score) are kept; -1 keeps all detections.
     *                      (the default) to fall back to the network's expected fixed input
     *                      shape of 1024x1024. When overriding, both dimensions must be
     *                      positive multiples of 16, since DISK downsamples by a factor of 16.
     * @return automatically generated
     */
    public static DISK create(String modelPath) {
        return DISK.__fromPtr__(create_5(modelPath));
    }


    //
    // C++: static Ptr_DISK cv::DISK::create(vector_uchar bufferModel, int maxKeypoints = -1, float scoreThreshold = 0.0f, Size imageSize = Size(), int backendId = 0, int targetId = 0)
    //

    /**
     * Creates a DISK detector from an in-memory model buffer.
     *
     *     This overload loads the DISK ONNX model from a buffer instead of a file on disk. It is
     *     intended for cases where the model is read from application resources (for example Android
     *     assets) and is not available as a path on the filesystem.
     *
     *     @param bufferModel A buffer containing the contents of the DISK ONNX model.
     *     @param maxKeypoints Maximum number of keypoints to return per image. The strongest
     *                         responses (by network score) are kept; -1 keeps all detections.
     *     @param scoreThreshold Discard keypoints with network score strictly below this value.
     *     @param imageSize Target input size (width, height) fed to the network. Use Size()
     *                      (the default) to fall back to the network's expected fixed input
     *                      shape of 1024x1024. When overriding, both dimensions must be
     *                      positive multiples of 16, since DISK downsamples by a factor of 16.
     *     @param backendId DNN backend identifier (see cv::dnn::Backend); 0 = DNN_BACKEND_DEFAULT.
     *     @param targetId  DNN target identifier (see cv::dnn::Target);  0 = DNN_TARGET_CPU.
     *
     *     <b>Note:</b> In C++ this is an overload of REF: create. The Python/Java/Objective-C bindings expose
     *           it as {@code createFromMemory}, because Objective-C selectors are not disambiguated by argument
     *           type and would otherwise clash with the file-path REF: create.
     * @return automatically generated
     */
    public static DISK createFromMemory(MatOfByte bufferModel, int maxKeypoints, float scoreThreshold, Size imageSize, int backendId, int targetId) {
        Mat bufferModel_mat = bufferModel;
        return DISK.__fromPtr__(createFromMemory_0(bufferModel_mat.nativeObj, maxKeypoints, scoreThreshold, imageSize.width, imageSize.height, backendId, targetId));
    }

    /**
     * Creates a DISK detector from an in-memory model buffer.
     *
     *     This overload loads the DISK ONNX model from a buffer instead of a file on disk. It is
     *     intended for cases where the model is read from application resources (for example Android
     *     assets) and is not available as a path on the filesystem.
     *
     *     @param bufferModel A buffer containing the contents of the DISK ONNX model.
     *     @param maxKeypoints Maximum number of keypoints to return per image. The strongest
     *                         responses (by network score) are kept; -1 keeps all detections.
     *     @param scoreThreshold Discard keypoints with network score strictly below this value.
     *     @param imageSize Target input size (width, height) fed to the network. Use Size()
     *                      (the default) to fall back to the network's expected fixed input
     *                      shape of 1024x1024. When overriding, both dimensions must be
     *                      positive multiples of 16, since DISK downsamples by a factor of 16.
     *     @param backendId DNN backend identifier (see cv::dnn::Backend); 0 = DNN_BACKEND_DEFAULT.
     *
     *     <b>Note:</b> In C++ this is an overload of REF: create. The Python/Java/Objective-C bindings expose
     *           it as {@code createFromMemory}, because Objective-C selectors are not disambiguated by argument
     *           type and would otherwise clash with the file-path REF: create.
     * @return automatically generated
     */
    public static DISK createFromMemory(MatOfByte bufferModel, int maxKeypoints, float scoreThreshold, Size imageSize, int backendId) {
        Mat bufferModel_mat = bufferModel;
        return DISK.__fromPtr__(createFromMemory_1(bufferModel_mat.nativeObj, maxKeypoints, scoreThreshold, imageSize.width, imageSize.height, backendId));
    }

    /**
     * Creates a DISK detector from an in-memory model buffer.
     *
     *     This overload loads the DISK ONNX model from a buffer instead of a file on disk. It is
     *     intended for cases where the model is read from application resources (for example Android
     *     assets) and is not available as a path on the filesystem.
     *
     *     @param bufferModel A buffer containing the contents of the DISK ONNX model.
     *     @param maxKeypoints Maximum number of keypoints to return per image. The strongest
     *                         responses (by network score) are kept; -1 keeps all detections.
     *     @param scoreThreshold Discard keypoints with network score strictly below this value.
     *     @param imageSize Target input size (width, height) fed to the network. Use Size()
     *                      (the default) to fall back to the network's expected fixed input
     *                      shape of 1024x1024. When overriding, both dimensions must be
     *                      positive multiples of 16, since DISK downsamples by a factor of 16.
     *
     *     <b>Note:</b> In C++ this is an overload of REF: create. The Python/Java/Objective-C bindings expose
     *           it as {@code createFromMemory}, because Objective-C selectors are not disambiguated by argument
     *           type and would otherwise clash with the file-path REF: create.
     * @return automatically generated
     */
    public static DISK createFromMemory(MatOfByte bufferModel, int maxKeypoints, float scoreThreshold, Size imageSize) {
        Mat bufferModel_mat = bufferModel;
        return DISK.__fromPtr__(createFromMemory_2(bufferModel_mat.nativeObj, maxKeypoints, scoreThreshold, imageSize.width, imageSize.height));
    }

    /**
     * Creates a DISK detector from an in-memory model buffer.
     *
     *     This overload loads the DISK ONNX model from a buffer instead of a file on disk. It is
     *     intended for cases where the model is read from application resources (for example Android
     *     assets) and is not available as a path on the filesystem.
     *
     *     @param bufferModel A buffer containing the contents of the DISK ONNX model.
     *     @param maxKeypoints Maximum number of keypoints to return per image. The strongest
     *                         responses (by network score) are kept; -1 keeps all detections.
     *     @param scoreThreshold Discard keypoints with network score strictly below this value.
     *                      (the default) to fall back to the network's expected fixed input
     *                      shape of 1024x1024. When overriding, both dimensions must be
     *                      positive multiples of 16, since DISK downsamples by a factor of 16.
     *
     *     <b>Note:</b> In C++ this is an overload of REF: create. The Python/Java/Objective-C bindings expose
     *           it as {@code createFromMemory}, because Objective-C selectors are not disambiguated by argument
     *           type and would otherwise clash with the file-path REF: create.
     * @return automatically generated
     */
    public static DISK createFromMemory(MatOfByte bufferModel, int maxKeypoints, float scoreThreshold) {
        Mat bufferModel_mat = bufferModel;
        return DISK.__fromPtr__(createFromMemory_3(bufferModel_mat.nativeObj, maxKeypoints, scoreThreshold));
    }

    /**
     * Creates a DISK detector from an in-memory model buffer.
     *
     *     This overload loads the DISK ONNX model from a buffer instead of a file on disk. It is
     *     intended for cases where the model is read from application resources (for example Android
     *     assets) and is not available as a path on the filesystem.
     *
     *     @param bufferModel A buffer containing the contents of the DISK ONNX model.
     *     @param maxKeypoints Maximum number of keypoints to return per image. The strongest
     *                         responses (by network score) are kept; -1 keeps all detections.
     *                      (the default) to fall back to the network's expected fixed input
     *                      shape of 1024x1024. When overriding, both dimensions must be
     *                      positive multiples of 16, since DISK downsamples by a factor of 16.
     *
     *     <b>Note:</b> In C++ this is an overload of REF: create. The Python/Java/Objective-C bindings expose
     *           it as {@code createFromMemory}, because Objective-C selectors are not disambiguated by argument
     *           type and would otherwise clash with the file-path REF: create.
     * @return automatically generated
     */
    public static DISK createFromMemory(MatOfByte bufferModel, int maxKeypoints) {
        Mat bufferModel_mat = bufferModel;
        return DISK.__fromPtr__(createFromMemory_4(bufferModel_mat.nativeObj, maxKeypoints));
    }

    /**
     * Creates a DISK detector from an in-memory model buffer.
     *
     *     This overload loads the DISK ONNX model from a buffer instead of a file on disk. It is
     *     intended for cases where the model is read from application resources (for example Android
     *     assets) and is not available as a path on the filesystem.
     *
     *     @param bufferModel A buffer containing the contents of the DISK ONNX model.
     *                         responses (by network score) are kept; -1 keeps all detections.
     *                      (the default) to fall back to the network's expected fixed input
     *                      shape of 1024x1024. When overriding, both dimensions must be
     *                      positive multiples of 16, since DISK downsamples by a factor of 16.
     *
     *     <b>Note:</b> In C++ this is an overload of REF: create. The Python/Java/Objective-C bindings expose
     *           it as {@code createFromMemory}, because Objective-C selectors are not disambiguated by argument
     *           type and would otherwise clash with the file-path REF: create.
     * @return automatically generated
     */
    public static DISK createFromMemory(MatOfByte bufferModel) {
        Mat bufferModel_mat = bufferModel;
        return DISK.__fromPtr__(createFromMemory_5(bufferModel_mat.nativeObj));
    }


    //
    // C++:  void cv::DISK::setMaxKeypoints(int maxKeypoints)
    //

    public void setMaxKeypoints(int maxKeypoints) {
        setMaxKeypoints_0(nativeObj, maxKeypoints);
    }


    //
    // C++:  int cv::DISK::getMaxKeypoints()
    //

    public int getMaxKeypoints() {
        return getMaxKeypoints_0(nativeObj);
    }


    //
    // C++:  void cv::DISK::setScoreThreshold(float threshold)
    //

    public void setScoreThreshold(float threshold) {
        setScoreThreshold_0(nativeObj, threshold);
    }


    //
    // C++:  float cv::DISK::getScoreThreshold()
    //

    public float getScoreThreshold() {
        return getScoreThreshold_0(nativeObj);
    }


    //
    // C++:  void cv::DISK::setImageSize(Size size)
    //

    public void setImageSize(Size size) {
        setImageSize_0(nativeObj, size.width, size.height);
    }


    //
    // C++:  Size cv::DISK::getImageSize()
    //

    public Size getImageSize() {
        return new Size(getImageSize_0(nativeObj));
    }


    //
    // C++:  String cv::DISK::getDefaultName()
    //

    public String getDefaultName() {
        return getDefaultName_0(nativeObj);
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++: static Ptr_DISK cv::DISK::create(String modelPath, int maxKeypoints = -1, float scoreThreshold = 0.0f, Size imageSize = Size(), int backendId = 0, int targetId = 0)
    private static native long create_0(String modelPath, int maxKeypoints, float scoreThreshold, double imageSize_width, double imageSize_height, int backendId, int targetId);
    private static native long create_1(String modelPath, int maxKeypoints, float scoreThreshold, double imageSize_width, double imageSize_height, int backendId);
    private static native long create_2(String modelPath, int maxKeypoints, float scoreThreshold, double imageSize_width, double imageSize_height);
    private static native long create_3(String modelPath, int maxKeypoints, float scoreThreshold);
    private static native long create_4(String modelPath, int maxKeypoints);
    private static native long create_5(String modelPath);

    // C++: static Ptr_DISK cv::DISK::create(vector_uchar bufferModel, int maxKeypoints = -1, float scoreThreshold = 0.0f, Size imageSize = Size(), int backendId = 0, int targetId = 0)
    private static native long createFromMemory_0(long bufferModel_mat_nativeObj, int maxKeypoints, float scoreThreshold, double imageSize_width, double imageSize_height, int backendId, int targetId);
    private static native long createFromMemory_1(long bufferModel_mat_nativeObj, int maxKeypoints, float scoreThreshold, double imageSize_width, double imageSize_height, int backendId);
    private static native long createFromMemory_2(long bufferModel_mat_nativeObj, int maxKeypoints, float scoreThreshold, double imageSize_width, double imageSize_height);
    private static native long createFromMemory_3(long bufferModel_mat_nativeObj, int maxKeypoints, float scoreThreshold);
    private static native long createFromMemory_4(long bufferModel_mat_nativeObj, int maxKeypoints);
    private static native long createFromMemory_5(long bufferModel_mat_nativeObj);

    // C++:  void cv::DISK::setMaxKeypoints(int maxKeypoints)
    private static native void setMaxKeypoints_0(long nativeObj, int maxKeypoints);

    // C++:  int cv::DISK::getMaxKeypoints()
    private static native int getMaxKeypoints_0(long nativeObj);

    // C++:  void cv::DISK::setScoreThreshold(float threshold)
    private static native void setScoreThreshold_0(long nativeObj, float threshold);

    // C++:  float cv::DISK::getScoreThreshold()
    private static native float getScoreThreshold_0(long nativeObj);

    // C++:  void cv::DISK::setImageSize(Size size)
    private static native void setImageSize_0(long nativeObj, double size_width, double size_height);

    // C++:  Size cv::DISK::getImageSize()
    private static native double[] getImageSize_0(long nativeObj);

    // C++:  String cv::DISK::getDefaultName()
    private static native String getDefaultName_0(long nativeObj);

    // native support for java finalize() or cleaner
    private static native void delete(long nativeObj);

}
