//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.video;

import org.opencv.core.Scalar;
import org.opencv.dnn.Net;
import org.opencv.video.Tracker;
import org.opencv.video.TrackerVit;
import org.opencv.video.TrackerVit_Params;

// C++: class TrackerVit
/**
 * the VIT tracker is a super lightweight dnn-based general object tracking.
 *
 * VIT tracker is much faster and extremely lightweight due to special model structure, the model file is about 767KB.
 * Model download link: https://github.com/opencv/opencv_zoo/tree/main/models/object_tracking_vittrack
 * Author: PengyuLiu, 1872918507@qq.com
 */
public class TrackerVit extends Tracker {

    protected TrackerVit(long addr) { super(addr); }

    // internal usage only
    public static TrackerVit __fromPtr__(long addr) { return new TrackerVit(addr); }

    //
    // C++: static Ptr_TrackerVit cv::TrackerVit::create(TrackerVit_Params parameters = TrackerVit::Params())
    //

    /**
     * Constructor
     *     @param parameters vit tracker parameters TrackerVit::Params
     * @return automatically generated
     */
    public static TrackerVit create(TrackerVit_Params parameters) {
        return TrackerVit.__fromPtr__(create_0(parameters.getNativeObjAddr()));
    }

    /**
     * Constructor
     * @return automatically generated
     */
    public static TrackerVit create() {
        return TrackerVit.__fromPtr__(create_1());
    }


    //
    // C++: static Ptr_TrackerVit cv::TrackerVit::create(Net model, Scalar meanvalue = Scalar(0.485, 0.456, 0.406), Scalar stdvalue = Scalar(0.229, 0.224, 0.225), float tracking_score_threshold = 0.20f)
    //

    /**
     * Constructor
     * @param model pre-loaded DNN model
     * @param meanvalue mean value for image preprocessing
     * @param stdvalue std value for image preprocessing
     * @param tracking_score_threshold threshold for tracking score
     * @return automatically generated
     */
    public static TrackerVit create(Net model, Scalar meanvalue, Scalar stdvalue, float tracking_score_threshold) {
        return TrackerVit.__fromPtr__(create_2(model.getNativeObjAddr(), meanvalue.val[0], meanvalue.val[1], meanvalue.val[2], meanvalue.val[3], stdvalue.val[0], stdvalue.val[1], stdvalue.val[2], stdvalue.val[3], tracking_score_threshold));
    }

    /**
     * Constructor
     * @param model pre-loaded DNN model
     * @param meanvalue mean value for image preprocessing
     * @param stdvalue std value for image preprocessing
     * @return automatically generated
     */
    public static TrackerVit create(Net model, Scalar meanvalue, Scalar stdvalue) {
        return TrackerVit.__fromPtr__(create_3(model.getNativeObjAddr(), meanvalue.val[0], meanvalue.val[1], meanvalue.val[2], meanvalue.val[3], stdvalue.val[0], stdvalue.val[1], stdvalue.val[2], stdvalue.val[3]));
    }

    /**
     * Constructor
     * @param model pre-loaded DNN model
     * @param meanvalue mean value for image preprocessing
     * @return automatically generated
     */
    public static TrackerVit create(Net model, Scalar meanvalue) {
        return TrackerVit.__fromPtr__(create_4(model.getNativeObjAddr(), meanvalue.val[0], meanvalue.val[1], meanvalue.val[2], meanvalue.val[3]));
    }

    /**
     * Constructor
     * @param model pre-loaded DNN model
     * @return automatically generated
     */
    public static TrackerVit create(Net model) {
        return TrackerVit.__fromPtr__(create_5(model.getNativeObjAddr()));
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++: static Ptr_TrackerVit cv::TrackerVit::create(TrackerVit_Params parameters = TrackerVit::Params())
    private static native long create_0(long parameters_nativeObj);
    private static native long create_1();

    // C++: static Ptr_TrackerVit cv::TrackerVit::create(Net model, Scalar meanvalue = Scalar(0.485, 0.456, 0.406), Scalar stdvalue = Scalar(0.229, 0.224, 0.225), float tracking_score_threshold = 0.20f)
    private static native long create_2(long model_nativeObj, double meanvalue_val0, double meanvalue_val1, double meanvalue_val2, double meanvalue_val3, double stdvalue_val0, double stdvalue_val1, double stdvalue_val2, double stdvalue_val3, float tracking_score_threshold);
    private static native long create_3(long model_nativeObj, double meanvalue_val0, double meanvalue_val1, double meanvalue_val2, double meanvalue_val3, double stdvalue_val0, double stdvalue_val1, double stdvalue_val2, double stdvalue_val3);
    private static native long create_4(long model_nativeObj, double meanvalue_val0, double meanvalue_val1, double meanvalue_val2, double meanvalue_val3);
    private static native long create_5(long model_nativeObj);

    // native support for java finalize() or cleaner
    private static native void delete(long nativeObj);

}
