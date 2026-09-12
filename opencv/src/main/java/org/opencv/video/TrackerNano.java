//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.video;

import org.opencv.dnn.Net;
import org.opencv.video.Tracker;
import org.opencv.video.TrackerNano;
import org.opencv.video.TrackerNano_Params;

// C++: class TrackerNano
/**
 * the Nano tracker is a super lightweight dnn-based general object tracking.
 *
 * Nano tracker is much faster and extremely lightweight due to special model structure, the whole model size is about 1.9 MB.
 * Nano tracker needs two models: one for feature extraction (backbone) and the another for localization (neckhead).
 * Model download link: https://github.com/HonglinChu/SiamTrackers/tree/master/NanoTrack/models/nanotrackv2
 * Original repo is here: https://github.com/HonglinChu/NanoTrack
 * Author: HongLinChu, 1628464345@qq.com
 */
public class TrackerNano extends Tracker {

    protected TrackerNano(long addr) { super(addr); }

    // internal usage only
    public static TrackerNano __fromPtr__(long addr) { return new TrackerNano(addr); }

    //
    // C++: static Ptr_TrackerNano cv::TrackerNano::create(TrackerNano_Params parameters = TrackerNano::Params())
    //

    /**
     * Constructor
     *     @param parameters NanoTrack parameters TrackerNano::Params
     * @return automatically generated
     */
    public static TrackerNano create(TrackerNano_Params parameters) {
        return TrackerNano.__fromPtr__(create_0(parameters.getNativeObjAddr()));
    }

    /**
     * Constructor
     * @return automatically generated
     */
    public static TrackerNano create() {
        return TrackerNano.__fromPtr__(create_1());
    }


    //
    // C++: static Ptr_TrackerNano cv::TrackerNano::create(Net backbone, Net neckhead)
    //

    /**
     * Constructor
     * @param backbone pre-loaded backbone model
     * @param neckhead pre-loaded neckhead model
     * @return automatically generated
     */
    public static TrackerNano create(Net backbone, Net neckhead) {
        return TrackerNano.__fromPtr__(create_2(backbone.getNativeObjAddr(), neckhead.getNativeObjAddr()));
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++: static Ptr_TrackerNano cv::TrackerNano::create(TrackerNano_Params parameters = TrackerNano::Params())
    private static native long create_0(long parameters_nativeObj);
    private static native long create_1();

    // C++: static Ptr_TrackerNano cv::TrackerNano::create(Net backbone, Net neckhead)
    private static native long create_2(long backbone_nativeObj, long neckhead_nativeObj);

    // native support for java finalize() or cleaner
    private static native void delete(long nativeObj);

}
