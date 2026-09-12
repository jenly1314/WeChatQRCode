//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.imgproc;

import java.util.ArrayList;
import java.util.List;
import org.opencv.core.Mat;
import org.opencv.core.MatOfInt;
import org.opencv.utils.Converters;

// C++: class FontFace
/**
 * Wrapper on top of a truetype/opentype/etc font, i.e. Freetype's FT_Face.
 *
 * The class is used to store the loaded fonts;
 * the font can then be passed to the functions
 * putText and getTextSize.
 */
public class FontFace {

    protected final long nativeObj;
    protected FontFace(long addr) {
      nativeObj = addr;
      
    }

    public long getNativeObjAddr() { return nativeObj; }

    // internal usage only
    public static FontFace __fromPtr__(long addr) { return new FontFace(addr); }

    //
    // C++:   cv::FontFace::FontFace()
    //

    /**
     * loads default font
     */
    public FontFace() {
        nativeObj = FontFace_0();
    }


    //
    // C++:   cv::FontFace::FontFace(String fontPathOrName)
    //

    /**
     * loads font at the specified path or with specified name.
     *        @param fontPathOrName either path to the custom font or the name of embedded font: "sans", "italic" or "uni".
     *           Empty fontPathOrName means the default embedded font.
     */
    public FontFace(String fontPathOrName) {
        nativeObj = FontFace_1(fontPathOrName);
    }


    //
    // C++:  bool cv::FontFace::set(String fontPathOrName)
    //

    /**
     * loads new font face
     * @param fontPathOrName automatically generated
     * @return automatically generated
     */
    public boolean set(String fontPathOrName) {
        return set_0(nativeObj, fontPathOrName);
    }


    //
    // C++:  String cv::FontFace::getName()
    //

    public String getName() {
        return getName_0(nativeObj);
    }


    //
    // C++:  bool cv::FontFace::setInstance(vector_int params)
    //

    /**
     * sets the current variable font instance.
     *         @param params The list of pairs key1, value1, key2, value2, ..., e.g.
     *              {@code myfont.setInstance({CV_FOURCC('w','g','h','t'), 400&lt;&lt;16, CV_FOURCC('s','l','n','t'), -(15&lt;&lt;16)});}
     *         Note that the parameter values are specified in 16.16 fixed-point format, that is, integer values
     *         need to be shifted by 16 (or multiplied by 65536).
     * @return automatically generated
     */
    public boolean setInstance(MatOfInt params) {
        Mat params_mat = params;
        return setInstance_0(nativeObj, params_mat.nativeObj);
    }


    //
    // C++:  bool cv::FontFace::getInstance(vector_int& params)
    //

    public boolean getInstance(MatOfInt params) {
        Mat params_mat = params;
        return getInstance_0(nativeObj, params_mat.nativeObj);
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++:   cv::FontFace::FontFace()
    private static native long FontFace_0();

    // C++:   cv::FontFace::FontFace(String fontPathOrName)
    private static native long FontFace_1(String fontPathOrName);

    // C++:  bool cv::FontFace::set(String fontPathOrName)
    private static native boolean set_0(long nativeObj, String fontPathOrName);

    // C++:  String cv::FontFace::getName()
    private static native String getName_0(long nativeObj);

    // C++:  bool cv::FontFace::setInstance(vector_int params)
    private static native boolean setInstance_0(long nativeObj, long params_mat_nativeObj);

    // C++:  bool cv::FontFace::getInstance(vector_int& params)
    private static native boolean getInstance_0(long nativeObj, long params_mat_nativeObj);

    // native support for java finalize() or cleaner
    private static native void delete(long nativeObj);

}
