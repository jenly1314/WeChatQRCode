//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.video;

import org.opencv.dnn.Net;
import org.opencv.video.Tracker;
import org.opencv.video.TrackerDaSiamRPN;
import org.opencv.video.TrackerDaSiamRPN_Params;

// C++: class TrackerDaSiamRPN

public class TrackerDaSiamRPN extends Tracker {

    protected TrackerDaSiamRPN(long addr) { super(addr); }

    // internal usage only
    public static TrackerDaSiamRPN __fromPtr__(long addr) { return new TrackerDaSiamRPN(addr); }

    //
    // C++: static Ptr_TrackerDaSiamRPN cv::TrackerDaSiamRPN::create(TrackerDaSiamRPN_Params parameters = TrackerDaSiamRPN::Params())
    //

    /**
     * Constructor
     *     @param parameters DaSiamRPN parameters TrackerDaSiamRPN::Params
     * @return automatically generated
     */
    public static TrackerDaSiamRPN create(TrackerDaSiamRPN_Params parameters) {
        return TrackerDaSiamRPN.__fromPtr__(create_0(parameters.getNativeObjAddr()));
    }

    /**
     * Constructor
     * @return automatically generated
     */
    public static TrackerDaSiamRPN create() {
        return TrackerDaSiamRPN.__fromPtr__(create_1());
    }


    //
    // C++: static Ptr_TrackerDaSiamRPN cv::TrackerDaSiamRPN::create(Net siam_rpn, Net kernel_cls1, Net kernel_r1)
    //

    /**
     * Constructor
     * @param siam_rpn pre-loaded SiamRPN model
     * @param kernel_cls1 pre-loaded CLS model
     * @param kernel_r1 pre-loaded R1 model
     * @return automatically generated
     */
    public static TrackerDaSiamRPN create(Net siam_rpn, Net kernel_cls1, Net kernel_r1) {
        return TrackerDaSiamRPN.__fromPtr__(create_2(siam_rpn.getNativeObjAddr(), kernel_cls1.getNativeObjAddr(), kernel_r1.getNativeObjAddr()));
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++: static Ptr_TrackerDaSiamRPN cv::TrackerDaSiamRPN::create(TrackerDaSiamRPN_Params parameters = TrackerDaSiamRPN::Params())
    private static native long create_0(long parameters_nativeObj);
    private static native long create_1();

    // C++: static Ptr_TrackerDaSiamRPN cv::TrackerDaSiamRPN::create(Net siam_rpn, Net kernel_cls1, Net kernel_r1)
    private static native long create_2(long siam_rpn_nativeObj, long kernel_cls1_nativeObj, long kernel_r1_nativeObj);

    // native support for java finalize() or cleaner
    private static native void delete(long nativeObj);

}
