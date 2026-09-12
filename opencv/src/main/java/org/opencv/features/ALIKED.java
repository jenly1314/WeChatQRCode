//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.features;

import org.opencv.features.ALIKED;
import org.opencv.features.ALIKED_Params;
import org.opencv.features.Feature2D;

// C++: class ALIKED
/**
 * ALIKED feature detector and descriptor extractor.
 *
 * ALIKED (A Lightweight Image KEYpoint Detector) is a CNN-based feature detector and descriptor
 * extractor, as described in CITE: Zhao23 . It produces 128-dimensional float descriptors and
 * keypoints with sub-pixel accuracy.
 *
 * The model expects RGB input [1,3,H,W] and internally converts BGR images to RGB.
 */
public class ALIKED extends Feature2D {

    protected ALIKED(long addr) { super(addr); }

    // internal usage only
    public static ALIKED __fromPtr__(long addr) { return new ALIKED(addr); }

    //
    // C++: static Ptr_ALIKED cv::ALIKED::create(String modelPath, ALIKED_Params params = ALIKED::Params())
    //

    /**
     * Creates ALIKED from a model file path.
     *     @param modelPath Path to the ONNX model file.
     *     @param params ALIKED parameters.
     * @return automatically generated
     */
    public static ALIKED create(String modelPath, ALIKED_Params params) {
        return ALIKED.__fromPtr__(create_0(modelPath, params.getNativeObjAddr()));
    }

    /**
     * Creates ALIKED from a model file path.
     *     @param modelPath Path to the ONNX model file.
     * @return automatically generated
     */
    public static ALIKED create(String modelPath) {
        return ALIKED.__fromPtr__(create_1(modelPath));
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++: static Ptr_ALIKED cv::ALIKED::create(String modelPath, ALIKED_Params params = ALIKED::Params())
    private static native long create_0(String modelPath, long params_nativeObj);
    private static native long create_1(String modelPath);

    // native support for java finalize() or cleaner
    private static native void delete(long nativeObj);

}
