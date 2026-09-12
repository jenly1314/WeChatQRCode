//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.features;

import org.opencv.core.Size;

// C++: class Params

public class ALIKED_Params {

    protected final long nativeObj;
    protected ALIKED_Params(long addr) {
      nativeObj = addr;
      
    }

    public long getNativeObjAddr() { return nativeObj; }

    // internal usage only
    public static ALIKED_Params __fromPtr__(long addr) { return new ALIKED_Params(addr); }

    //
    // C++:   cv::ALIKED::Params::Params()
    //

    public ALIKED_Params() {
        nativeObj = ALIKED_Params_0();
    }


    //
    // C++: Size ALIKED_Params::inputSize
    //

    public Size get_inputSize() {
        return new Size(get_inputSize_0(nativeObj));
    }


    //
    // C++: void ALIKED_Params::inputSize
    //

    public void set_inputSize(Size inputSize) {
        set_inputSize_0(nativeObj, inputSize.width, inputSize.height);
    }


    //
    // C++: bool ALIKED_Params::normalizeDescriptors
    //

    public boolean get_normalizeDescriptors() {
        return get_normalizeDescriptors_0(nativeObj);
    }


    //
    // C++: void ALIKED_Params::normalizeDescriptors
    //

    public void set_normalizeDescriptors(boolean normalizeDescriptors) {
        set_normalizeDescriptors_0(nativeObj, normalizeDescriptors);
    }


    //
    // C++: int ALIKED_Params::engine
    //

    public int get_engine() {
        return get_engine_0(nativeObj);
    }


    //
    // C++: void ALIKED_Params::engine
    //

    public void set_engine(int engine) {
        set_engine_0(nativeObj, engine);
    }


    //
    // C++: int ALIKED_Params::backend
    //

    public int get_backend() {
        return get_backend_0(nativeObj);
    }


    //
    // C++: void ALIKED_Params::backend
    //

    public void set_backend(int backend) {
        set_backend_0(nativeObj, backend);
    }


    //
    // C++: int ALIKED_Params::target
    //

    public int get_target() {
        return get_target_0(nativeObj);
    }


    //
    // C++: void ALIKED_Params::target
    //

    public void set_target(int target) {
        set_target_0(nativeObj, target);
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++:   cv::ALIKED::Params::Params()
    private static native long ALIKED_Params_0();

    // C++: Size ALIKED_Params::inputSize
    private static native double[] get_inputSize_0(long nativeObj);

    // C++: void ALIKED_Params::inputSize
    private static native void set_inputSize_0(long nativeObj, double inputSize_width, double inputSize_height);

    // C++: bool ALIKED_Params::normalizeDescriptors
    private static native boolean get_normalizeDescriptors_0(long nativeObj);

    // C++: void ALIKED_Params::normalizeDescriptors
    private static native void set_normalizeDescriptors_0(long nativeObj, boolean normalizeDescriptors);

    // C++: int ALIKED_Params::engine
    private static native int get_engine_0(long nativeObj);

    // C++: void ALIKED_Params::engine
    private static native void set_engine_0(long nativeObj, int engine);

    // C++: int ALIKED_Params::backend
    private static native int get_backend_0(long nativeObj);

    // C++: void ALIKED_Params::backend
    private static native void set_backend_0(long nativeObj, int backend);

    // C++: int ALIKED_Params::target
    private static native int get_target_0(long nativeObj);

    // C++: void ALIKED_Params::target
    private static native void set_target_0(long nativeObj, int target);

    // native support for java finalize() or cleaner
    private static native void delete(long nativeObj);

}
