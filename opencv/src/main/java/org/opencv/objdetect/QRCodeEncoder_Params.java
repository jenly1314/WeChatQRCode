//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.objdetect;



// C++: class Params
/**
 * QR code encoder parameters.
 */
public class QRCodeEncoder_Params {

    protected final long nativeObj;
    protected QRCodeEncoder_Params(long addr) {
      nativeObj = addr;
      
    }

    public long getNativeObjAddr() { return nativeObj; }

    // internal usage only
    public static QRCodeEncoder_Params __fromPtr__(long addr) { return new QRCodeEncoder_Params(addr); }

    //
    // C++:   cv::QRCodeEncoder::Params::Params()
    //

    public QRCodeEncoder_Params() {
        nativeObj = QRCodeEncoder_Params_0();
    }


    //
    // C++: int QRCodeEncoder_Params::version
    //

    public int get_version() {
        return get_version_0(nativeObj);
    }


    //
    // C++: void QRCodeEncoder_Params::version
    //

    public void set_version(int version) {
        set_version_0(nativeObj, version);
    }


    //
    // C++: QRCodeEncoder_CorrectionLevel QRCodeEncoder_Params::correction_level
    //

    public int get_correction_level() {
        return get_correction_level_0(nativeObj);
    }


    //
    // C++: void QRCodeEncoder_Params::correction_level
    //

    public void set_correction_level(int correction_level) {
        set_correction_level_0(nativeObj, correction_level);
    }


    //
    // C++: QRCodeEncoder_EncodeMode QRCodeEncoder_Params::mode
    //

    public int get_mode() {
        return get_mode_0(nativeObj);
    }


    //
    // C++: void QRCodeEncoder_Params::mode
    //

    public void set_mode(int mode) {
        set_mode_0(nativeObj, mode);
    }


    //
    // C++: int QRCodeEncoder_Params::structure_number
    //

    public int get_structure_number() {
        return get_structure_number_0(nativeObj);
    }


    //
    // C++: void QRCodeEncoder_Params::structure_number
    //

    public void set_structure_number(int structure_number) {
        set_structure_number_0(nativeObj, structure_number);
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++:   cv::QRCodeEncoder::Params::Params()
    private static native long QRCodeEncoder_Params_0();

    // C++: int QRCodeEncoder_Params::version
    private static native int get_version_0(long nativeObj);

    // C++: void QRCodeEncoder_Params::version
    private static native void set_version_0(long nativeObj, int version);

    // C++: QRCodeEncoder_CorrectionLevel QRCodeEncoder_Params::correction_level
    private static native int get_correction_level_0(long nativeObj);

    // C++: void QRCodeEncoder_Params::correction_level
    private static native void set_correction_level_0(long nativeObj, int correction_level);

    // C++: QRCodeEncoder_EncodeMode QRCodeEncoder_Params::mode
    private static native int get_mode_0(long nativeObj);

    // C++: void QRCodeEncoder_Params::mode
    private static native void set_mode_0(long nativeObj, int mode);

    // C++: int QRCodeEncoder_Params::structure_number
    private static native int get_structure_number_0(long nativeObj);

    // C++: void QRCodeEncoder_Params::structure_number
    private static native void set_structure_number_0(long nativeObj, int structure_number);

    // native support for java finalize() or cleaner
    private static native void delete(long nativeObj);

}
