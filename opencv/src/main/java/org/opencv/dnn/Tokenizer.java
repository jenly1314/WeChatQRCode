//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.dnn;

import java.util.ArrayList;
import java.util.List;
import org.opencv.core.Mat;
import org.opencv.core.MatOfInt;
import org.opencv.dnn.Tokenizer;
import org.opencv.utils.Converters;

// C++: class Tokenizer
/**
 * High-level tokenizer wrapper for DNN usage.
 *
 * Provides a simple API to encode and decode tokens for LLMs.
 * Models are loaded via Tokenizer::load().
 *
 * <code>
 * using namespace cv::dnn;
 * Tokenizer tok = Tokenizer::load("/path/to/model/");
 * std::vector&lt;int&gt; ids = tok.encode("hello world");
 * std::string text = tok.decode(ids);
 * </code>
 */
public class Tokenizer {

    protected final long nativeObj;
    protected Tokenizer(long addr) {
      nativeObj = addr;
      
    }

    public long getNativeObjAddr() { return nativeObj; }

    // internal usage only
    public static Tokenizer __fromPtr__(long addr) { return new Tokenizer(addr); }

    //
    // C++: static Tokenizer cv::dnn::Tokenizer::load(string model_config)
    //

    /**
     * Load a tokenizer from a model directory.
     *
     * Expects the directory to contain:
     * - {@code config.json} with field {@code model_type} with value "gpt2" or "gpt4".
     * - {@code tokenizer.json} produced by the corresponding model family.
     *
     * The argument is a path prefix; this function concatenates file
     * names directly (e.g. {@code model_dir} + "config.json"), so {@code model_dir} must
     * end with an appropriate path separator.
     *
     * @param model_config  Path to config.json for model.
     * @return A Tokenizer ready for use. Throws cv::Exception if files are missing or {@code model_type} is unsupported.
     */
    public static Tokenizer load(String model_config) {
        return new Tokenizer(load_0(model_config));
    }


    //
    // C++:  vector_int cv::dnn::Tokenizer::encode(string text)
    //

    /**
     * Encode UTF-8 text to token ids (special tokens currently disabled).
     *
     * Calls the underlying {@code CoreBPE::encode} with an empty allowed-special set.
     *
     * @param text  UTF-8 input string.
     * @return Vector of token ids (32-bit ids narrowed to int for convenience).
     */
    public MatOfInt encode(String text) {
        return MatOfInt.fromNativeAddr(encode_0(nativeObj, text));
    }


    //
    // C++:  string cv::dnn::Tokenizer::decode(vector_int tokens)
    //

    public String decode(MatOfInt tokens) {
        Mat tokens_mat = tokens;
        return decode_0(nativeObj, tokens_mat.nativeObj);
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++: static Tokenizer cv::dnn::Tokenizer::load(string model_config)
    private static native long load_0(String model_config);

    // C++:  vector_int cv::dnn::Tokenizer::encode(string text)
    private static native long encode_0(long nativeObj, String text);

    // C++:  string cv::dnn::Tokenizer::decode(vector_int tokens)
    private static native String decode_0(long nativeObj, long tokens_mat_nativeObj);

    // native support for java finalize() or cleaner
    private static native void delete(long nativeObj);

}
