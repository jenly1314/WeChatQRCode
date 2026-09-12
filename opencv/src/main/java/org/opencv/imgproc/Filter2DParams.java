//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.imgproc;



// C++: class Filter2DParams

public class Filter2DParams {

    protected final long nativeObj;
    protected Filter2DParams(long addr) {
      nativeObj = addr;
      
    }

    public long getNativeObjAddr() { return nativeObj; }

    // internal usage only
    public static Filter2DParams __fromPtr__(long addr) { return new Filter2DParams(addr); }

    //
    // C++: int Filter2DParams::anchorX
    //

    public int get_anchorX() {
        return get_anchorX_0(nativeObj);
    }


    //
    // C++: void Filter2DParams::anchorX
    //

    public void set_anchorX(int anchorX) {
        set_anchorX_0(nativeObj, anchorX);
    }


    //
    // C++: int Filter2DParams::anchorY
    //

    public int get_anchorY() {
        return get_anchorY_0(nativeObj);
    }


    //
    // C++: void Filter2DParams::anchorY
    //

    public void set_anchorY(int anchorY) {
        set_anchorY_0(nativeObj, anchorY);
    }


    //
    // C++: int Filter2DParams::borderType
    //

    public int get_borderType() {
        return get_borderType_0(nativeObj);
    }


    //
    // C++: void Filter2DParams::borderType
    //

    public void set_borderType(int borderType) {
        set_borderType_0(nativeObj, borderType);
    }


    //
    // C++: int Filter2DParams::ddepth
    //

    public int get_ddepth() {
        return get_ddepth_0(nativeObj);
    }


    //
    // C++: void Filter2DParams::ddepth
    //

    public void set_ddepth(int ddepth) {
        set_ddepth_0(nativeObj, ddepth);
    }


    //
    // C++: double Filter2DParams::scale
    //

    public double get_scale() {
        return get_scale_0(nativeObj);
    }


    //
    // C++: void Filter2DParams::scale
    //

    public void set_scale(double scale) {
        set_scale_0(nativeObj, scale);
    }


    //
    // C++: double Filter2DParams::shift
    //

    public double get_shift() {
        return get_shift_0(nativeObj);
    }


    //
    // C++: void Filter2DParams::shift
    //

    public void set_shift(double shift) {
        set_shift_0(nativeObj, shift);
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++: int Filter2DParams::anchorX
    private static native int get_anchorX_0(long nativeObj);

    // C++: void Filter2DParams::anchorX
    private static native void set_anchorX_0(long nativeObj, int anchorX);

    // C++: int Filter2DParams::anchorY
    private static native int get_anchorY_0(long nativeObj);

    // C++: void Filter2DParams::anchorY
    private static native void set_anchorY_0(long nativeObj, int anchorY);

    // C++: int Filter2DParams::borderType
    private static native int get_borderType_0(long nativeObj);

    // C++: void Filter2DParams::borderType
    private static native void set_borderType_0(long nativeObj, int borderType);

    // C++: int Filter2DParams::ddepth
    private static native int get_ddepth_0(long nativeObj);

    // C++: void Filter2DParams::ddepth
    private static native void set_ddepth_0(long nativeObj, int ddepth);

    // C++: double Filter2DParams::scale
    private static native double get_scale_0(long nativeObj);

    // C++: void Filter2DParams::scale
    private static native void set_scale_0(long nativeObj, double scale);

    // C++: double Filter2DParams::shift
    private static native double get_shift_0(long nativeObj);

    // C++: void Filter2DParams::shift
    private static native void set_shift_0(long nativeObj, double shift);

    // native support for java finalize() or cleaner
    private static native void delete(long nativeObj);

}
