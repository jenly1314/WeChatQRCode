//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.video;

import java.util.ArrayList;
import java.util.List;
import org.opencv.core.Mat;
import org.opencv.core.MatOfInt;
import org.opencv.core.TermCriteria;
import org.opencv.utils.Converters;

// C++: class ECCParameters
/**
 * struct ECCParameters is used by findTransformECCMultiScale
 *
 * motionType parameter, specifying the type of motion:
 * <ul>
 *   <li>
 *     <b>MOTION_TRANSLATION</b> sets a translational motion model; warpMatrix is \(2\times 3\) with
 *      the first \(2\times 2\) part being the unity matrix and the rest two parameters being
 *      estimated.
 *   </li>
 *   <li>
 *     <b>MOTION_EUCLIDEAN</b> sets a Euclidean (rigid) transformation as motion model; three
 *      parameters are estimated; warpMatrix is \(2\times 3\).
 *   </li>
 *   <li>
 *     <b>MOTION_AFFINE</b> sets an affine motion model (DEFAULT); six parameters are estimated;
 *      warpMatrix is \(2\times 3\).
 *   </li>
 *   <li>
 *     <b>MOTION_HOMOGRAPHY</b> sets a homography as a motion model; eight parameters are
 *      estimated;\{@code warpMatrix\} is \(3\times 3\).
 * criteria parameter, specifying the termination criteria of the ECC algorithm;
 * criteria.epsilon defines the threshold of the increment in the correlation coefficient between two
 * iterations (a negative criteria.epsilon makes criteria.maxcount the only termination criterion).
 * Default values are shown in the declaration above.
 * itersPerLevel Criterion extension: distribution of iterations limit over pyramid levels.
 * Can be empty, in this case, this algorithm will use criteria.maxCount on each level.
 * gaussFiltSize An optional value indicating size of gaussian blur filter; (DEFAULT: 5)
 * nlevels An optional value indicating amount of levels in the pyramid; (DEFAULT: 4)
 * interpolation Type of warp interpolation. Possible values are INTER_NEAREST and INTER_LINEAR.
 * Affects accuracy, especially when motionType == MOTION_TRANSLATION. (DEFAULT: INTER_LINEAR)
 *   </li>
 * </ul>
 */
public class ECCParameters {

    protected final long nativeObj;
    protected ECCParameters(long addr) {
      nativeObj = addr;
      
    }

    public long getNativeObjAddr() { return nativeObj; }

    // internal usage only
    public static ECCParameters __fromPtr__(long addr) { return new ECCParameters(addr); }

    //
    // C++:   cv::ECCParameters::ECCParameters()
    //

    public ECCParameters() {
        nativeObj = ECCParameters_0();
    }


    //
    // C++: int ECCParameters::motionType
    //

    public int get_motionType() {
        return get_motionType_0(nativeObj);
    }


    //
    // C++: void ECCParameters::motionType
    //

    public void set_motionType(int motionType) {
        set_motionType_0(nativeObj, motionType);
    }


    //
    // C++: TermCriteria ECCParameters::criteria
    //

    public TermCriteria get_criteria() {
        return new TermCriteria(get_criteria_0(nativeObj));
    }


    //
    // C++: void ECCParameters::criteria
    //

    public void set_criteria(TermCriteria criteria) {
        set_criteria_0(nativeObj, criteria.type, criteria.maxCount, criteria.epsilon);
    }


    //
    // C++: vector_int ECCParameters::itersPerLevel
    //

    public MatOfInt get_itersPerLevel() {
        return MatOfInt.fromNativeAddr(get_itersPerLevel_0(nativeObj));
    }


    //
    // C++: void ECCParameters::itersPerLevel
    //

    public void set_itersPerLevel(MatOfInt itersPerLevel) {
        Mat itersPerLevel_mat = itersPerLevel;
        set_itersPerLevel_0(nativeObj, itersPerLevel_mat.nativeObj);
    }


    //
    // C++: int ECCParameters::gaussFiltSize
    //

    public int get_gaussFiltSize() {
        return get_gaussFiltSize_0(nativeObj);
    }


    //
    // C++: void ECCParameters::gaussFiltSize
    //

    public void set_gaussFiltSize(int gaussFiltSize) {
        set_gaussFiltSize_0(nativeObj, gaussFiltSize);
    }


    //
    // C++: int ECCParameters::nlevels
    //

    public int get_nlevels() {
        return get_nlevels_0(nativeObj);
    }


    //
    // C++: void ECCParameters::nlevels
    //

    public void set_nlevels(int nlevels) {
        set_nlevels_0(nativeObj, nlevels);
    }


    //
    // C++: int ECCParameters::interpolation
    //

    public int get_interpolation() {
        return get_interpolation_0(nativeObj);
    }


    //
    // C++: void ECCParameters::interpolation
    //

    public void set_interpolation(int interpolation) {
        set_interpolation_0(nativeObj, interpolation);
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++:   cv::ECCParameters::ECCParameters()
    private static native long ECCParameters_0();

    // C++: int ECCParameters::motionType
    private static native int get_motionType_0(long nativeObj);

    // C++: void ECCParameters::motionType
    private static native void set_motionType_0(long nativeObj, int motionType);

    // C++: TermCriteria ECCParameters::criteria
    private static native double[] get_criteria_0(long nativeObj);

    // C++: void ECCParameters::criteria
    private static native void set_criteria_0(long nativeObj, int criteria_type, int criteria_maxCount, double criteria_epsilon);

    // C++: vector_int ECCParameters::itersPerLevel
    private static native long get_itersPerLevel_0(long nativeObj);

    // C++: void ECCParameters::itersPerLevel
    private static native void set_itersPerLevel_0(long nativeObj, long itersPerLevel_mat_nativeObj);

    // C++: int ECCParameters::gaussFiltSize
    private static native int get_gaussFiltSize_0(long nativeObj);

    // C++: void ECCParameters::gaussFiltSize
    private static native void set_gaussFiltSize_0(long nativeObj, int gaussFiltSize);

    // C++: int ECCParameters::nlevels
    private static native int get_nlevels_0(long nativeObj);

    // C++: void ECCParameters::nlevels
    private static native void set_nlevels_0(long nativeObj, int nlevels);

    // C++: int ECCParameters::interpolation
    private static native int get_interpolation_0(long nativeObj);

    // C++: void ECCParameters::interpolation
    private static native void set_interpolation_0(long nativeObj, int interpolation);

    // native support for java finalize() or cleaner
    private static native void delete(long nativeObj);

}
