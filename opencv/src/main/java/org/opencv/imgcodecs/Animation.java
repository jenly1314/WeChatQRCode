//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.imgcodecs;

import java.util.ArrayList;
import java.util.List;
import org.opencv.core.Mat;
import org.opencv.core.MatOfInt;
import org.opencv.core.Scalar;
import org.opencv.utils.Converters;

// C++: class Animation
/**
 * Represents an animation with multiple frames.
 * The {@code Animation} struct is designed to store and manage data for animated sequences such as those from animated formats (e.g., GIF, AVIF, APNG, WebP).
 * It provides support for looping, background color settings, frame timing, and frame storage.
 */
public class Animation {

    protected final long nativeObj;
    protected Animation(long addr) {
      nativeObj = addr;
      
    }

    public long getNativeObjAddr() { return nativeObj; }

    // internal usage only
    public static Animation __fromPtr__(long addr) { return new Animation(addr); }

    //
    // C++:   cv::Animation::Animation(int loopCount = 0, Scalar bgColor = Scalar())
    //

    /**
     * Constructs an Animation object with optional loop count and background color.
     *
     *     @param loopCount An integer representing the number of times the animation should loop:
     * <ul>
     *   <li>
     *      {@code 0} (default) indicates infinite looping, meaning the animation will replay continuously.
     *   </li>
     *   <li>
     *      Positive values denote finite repeat counts, allowing the animation to play a limited number of times.
     *   </li>
     *   <li>
     *      If a negative value or a value beyond the maximum of {@code 0xffff} (65535) is provided, it is reset to {@code 0}
     *     (infinite looping) to maintain valid bounds.
     *   </li>
     * </ul>
     *
     *     @param bgColor A {@code Scalar} object representing the background color in BGR format:
     * <ul>
     *   <li>
     *      Defaults to {@code Scalar()}, indicating an empty color (usually transparent if supported).
     *   </li>
     *   <li>
     *      This background color provides a solid fill behind frames that have transparency, ensuring a consistent display appearance.
     *   </li>
     * </ul>
     */
    public Animation(int loopCount, Scalar bgColor) {
        nativeObj = Animation_0(loopCount, bgColor.val[0], bgColor.val[1], bgColor.val[2], bgColor.val[3]);
    }

    /**
     * Constructs an Animation object with optional loop count and background color.
     *
     *     @param loopCount An integer representing the number of times the animation should loop:
     * <ul>
     *   <li>
     *      {@code 0} (default) indicates infinite looping, meaning the animation will replay continuously.
     *   </li>
     *   <li>
     *      Positive values denote finite repeat counts, allowing the animation to play a limited number of times.
     *   </li>
     *   <li>
     *      If a negative value or a value beyond the maximum of {@code 0xffff} (65535) is provided, it is reset to {@code 0}
     *     (infinite looping) to maintain valid bounds.
     *   </li>
     * </ul>
     *
     * <ul>
     *   <li>
     *      Defaults to {@code Scalar()}, indicating an empty color (usually transparent if supported).
     *   </li>
     *   <li>
     *      This background color provides a solid fill behind frames that have transparency, ensuring a consistent display appearance.
     *   </li>
     * </ul>
     */
    public Animation(int loopCount) {
        nativeObj = Animation_1(loopCount);
    }

    /**
     * Constructs an Animation object with optional loop count and background color.
     *
     * <ul>
     *   <li>
     *      {@code 0} (default) indicates infinite looping, meaning the animation will replay continuously.
     *   </li>
     *   <li>
     *      Positive values denote finite repeat counts, allowing the animation to play a limited number of times.
     *   </li>
     *   <li>
     *      If a negative value or a value beyond the maximum of {@code 0xffff} (65535) is provided, it is reset to {@code 0}
     *     (infinite looping) to maintain valid bounds.
     *   </li>
     * </ul>
     *
     * <ul>
     *   <li>
     *      Defaults to {@code Scalar()}, indicating an empty color (usually transparent if supported).
     *   </li>
     *   <li>
     *      This background color provides a solid fill behind frames that have transparency, ensuring a consistent display appearance.
     *   </li>
     * </ul>
     */
    public Animation() {
        nativeObj = Animation_2();
    }


    //
    // C++: int Animation::loop_count
    //

    public int get_loop_count() {
        return get_loop_count_0(nativeObj);
    }


    //
    // C++: void Animation::loop_count
    //

    public void set_loop_count(int loop_count) {
        set_loop_count_0(nativeObj, loop_count);
    }


    //
    // C++: Scalar Animation::bgcolor
    //

    public Scalar get_bgcolor() {
        return new Scalar(get_bgcolor_0(nativeObj));
    }


    //
    // C++: void Animation::bgcolor
    //

    public void set_bgcolor(Scalar bgcolor) {
        set_bgcolor_0(nativeObj, bgcolor.val[0], bgcolor.val[1], bgcolor.val[2], bgcolor.val[3]);
    }


    //
    // C++: vector_int Animation::durations
    //

    public MatOfInt get_durations() {
        return MatOfInt.fromNativeAddr(get_durations_0(nativeObj));
    }


    //
    // C++: void Animation::durations
    //

    public void set_durations(MatOfInt durations) {
        Mat durations_mat = durations;
        set_durations_0(nativeObj, durations_mat.nativeObj);
    }


    //
    // C++: vector_Mat Animation::frames
    //

    public List<Mat> get_frames() {
        List<Mat> retVal = new ArrayList<Mat>();
        Mat retValMat = new Mat(get_frames_0(nativeObj));
        Converters.Mat_to_vector_Mat(retValMat, retVal);
        return retVal;
    }


    //
    // C++: void Animation::frames
    //

    public void set_frames(List<Mat> frames) {
        Mat frames_mat = Converters.vector_Mat_to_Mat(frames);
        set_frames_0(nativeObj, frames_mat.nativeObj);
    }


    //
    // C++: Mat Animation::still_image
    //

    public Mat get_still_image() {
        return new Mat(get_still_image_0(nativeObj));
    }


    //
    // C++: void Animation::still_image
    //

    public void set_still_image(Mat still_image) {
        set_still_image_0(nativeObj, still_image.nativeObj);
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++:   cv::Animation::Animation(int loopCount = 0, Scalar bgColor = Scalar())
    private static native long Animation_0(int loopCount, double bgColor_val0, double bgColor_val1, double bgColor_val2, double bgColor_val3);
    private static native long Animation_1(int loopCount);
    private static native long Animation_2();

    // C++: int Animation::loop_count
    private static native int get_loop_count_0(long nativeObj);

    // C++: void Animation::loop_count
    private static native void set_loop_count_0(long nativeObj, int loop_count);

    // C++: Scalar Animation::bgcolor
    private static native double[] get_bgcolor_0(long nativeObj);

    // C++: void Animation::bgcolor
    private static native void set_bgcolor_0(long nativeObj, double bgcolor_val0, double bgcolor_val1, double bgcolor_val2, double bgcolor_val3);

    // C++: vector_int Animation::durations
    private static native long get_durations_0(long nativeObj);

    // C++: void Animation::durations
    private static native void set_durations_0(long nativeObj, long durations_mat_nativeObj);

    // C++: vector_Mat Animation::frames
    private static native long get_frames_0(long nativeObj);

    // C++: void Animation::frames
    private static native void set_frames_0(long nativeObj, long frames_mat_nativeObj);

    // C++: Mat Animation::still_image
    private static native long get_still_image_0(long nativeObj);

    // C++: void Animation::still_image
    private static native void set_still_image_0(long nativeObj, long still_image_nativeObj);

    // native support for java finalize() or cleaner
    private static native void delete(long nativeObj);

}
