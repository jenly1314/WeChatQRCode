//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.dnn;

import java.util.ArrayList;
import java.util.List;
import org.opencv.core.Mat;
import org.opencv.core.MatOfByte;
import org.opencv.core.MatOfFloat;
import org.opencv.core.MatOfInt;
import org.opencv.core.MatOfRect;
import org.opencv.core.MatOfRect2d;
import org.opencv.core.MatOfRotatedRect;
import org.opencv.core.Scalar;
import org.opencv.core.Size;
import org.opencv.dnn.Image2BlobParams;
import org.opencv.dnn.Net;
import org.opencv.utils.Converters;

// C++: class Dnn

public class Dnn {

    // C++: enum ActivationType (cv.dnn.ActivationType)
    public static final int
            ACTIV_NONE = 0,
            ACTIV_MISH = 0+1,
            ACTIV_SWISH = 0+2,
            ACTIV_SIGMOID = 0+3,
            ACTIV_TANH = 0+4,
            ACTIV_ELU = 0+5,
            ACTIV_HARDSWISH = 0+6,
            ACTIV_HARDSIGMOID = 0+7,
            ACTIV_GELU = 0+8,
            ACTIV_GELU_APPROX = 0+9,
            ACTIV_RELU = 0+10,
            ACTIV_CLIP = 0+11;


    // C++: enum ArgKind (cv.dnn.ArgKind)
    public static final int
            DNN_ARG_EMPTY = 0,
            DNN_ARG_CONST = 1,
            DNN_ARG_INPUT = 2,
            DNN_ARG_OUTPUT = 3,
            DNN_ARG_TEMP = 4,
            DNN_ARG_PATTERN = 5;


    // C++: enum AutoPadding (cv.dnn.AutoPadding)
    public static final int
            AUTO_PAD_NONE = 0,
            AUTO_PAD_SAME_UPPER = 1,
            AUTO_PAD_SAME_LOWER = 2,
            AUTO_PAD_VALID = 3;


    // C++: enum Backend (cv.dnn.Backend)
    public static final int
            DNN_BACKEND_DEFAULT = 0,
            DNN_BACKEND_INFERENCE_ENGINE = 2,
            DNN_BACKEND_OPENCV = 2+1,
            DNN_BACKEND_VKCOM = 2+2,
            DNN_BACKEND_CUDA = 2+3,
            DNN_BACKEND_WEBNN = 2+4,
            DNN_BACKEND_TIMVX = 2+5,
            DNN_BACKEND_CANN = 2+6;


    // C++: enum EngineType (cv.dnn.EngineType)
    public static final int
            ENGINE_CLASSIC = 1,
            ENGINE_NEW = 2,
            ENGINE_AUTO = 3,
            ENGINE_ORT = 4;


    // C++: enum ImagePaddingMode (cv.dnn.ImagePaddingMode)
    public static final int
            DNN_PMODE_NULL = 0,
            DNN_PMODE_CROP_CENTER = 1,
            DNN_PMODE_LETTERBOX = 2;


    // C++: enum LossReduction (cv.dnn.LossReduction)
    public static final int
            LOSS_REDUCTION_NONE = 0,
            LOSS_REDUCTION_MEAN = 1,
            LOSS_REDUCTION_SUM = 2;


    // C++: enum ModelFormat (cv.dnn.ModelFormat)
    public static final int
            DNN_MODEL_GENERIC = 0,
            DNN_MODEL_ONNX = 1,
            DNN_MODEL_TF = 2,
            DNN_MODEL_TFLITE = 3;


    // C++: enum OPERATION (cv.dnn.NaryEltwiseLayer.OPERATION)
    public static final int
            OPERATION_AND = 0,
            OPERATION_EQUAL = 0+1,
            OPERATION_GREATER = 0+2,
            OPERATION_GREATER_EQUAL = 0+3,
            OPERATION_LESS = 0+4,
            OPERATION_LESS_EQUAL = 0+5,
            OPERATION_OR = 0+6,
            OPERATION_POW = 0+7,
            OPERATION_XOR = 0+8,
            OPERATION_BITSHIFT = 0+9,
            OPERATION_MAX = 0+10,
            OPERATION_MEAN = 0+11,
            OPERATION_MIN = 0+12,
            OPERATION_MOD = 0+13,
            OPERATION_FMOD = 0+14,
            OPERATION_PROD = 0+15,
            OPERATION_SUB = 0+16,
            OPERATION_SUM = 0+17,
            OPERATION_ADD = 0+18,
            OPERATION_DIV = 0+19,
            OPERATION_WHERE = 0+20,
            OPERATION_BITWISE_AND = 0+21,
            OPERATION_BITWISE_OR = 0+22,
            OPERATION_BITWISE_XOR = 0+23;


    // C++: enum ProfilingMode (cv.dnn.ProfilingMode)
    public static final int
            DNN_PROFILE_NONE = 0,
            DNN_PROFILE_SUMMARY = 1,
            DNN_PROFILE_DETAILED = 2;


    // C++: enum ReduceType (cv.dnn.Reduce2Layer.ReduceType)
    public static final int
            ReduceType_MAX = 0,
            ReduceType_MIN = 1,
            ReduceType_MEAN = 2,
            ReduceType_SUM = 3,
            ReduceType_L1 = 4,
            ReduceType_L2 = 5,
            ReduceType_PROD = 6,
            ReduceType_SUM_SQUARE = 7,
            ReduceType_LOG_SUM = 8,
            ReduceType_LOG_SUM_EXP = 9;


    // C++: enum SoftNMSMethod (cv.dnn.SoftNMSMethod)
    public static final int
            SoftNMSMethod_SOFTNMS_LINEAR = 1,
            SoftNMSMethod_SOFTNMS_GAUSSIAN = 2;


    // C++: enum Target (cv.dnn.Target)
    public static final int
            DNN_TARGET_CPU = 0,
            DNN_TARGET_OPENCL = 0+1,
            DNN_TARGET_OPENCL_FP16 = 0+2,
            DNN_TARGET_MYRIAD = 0+3,
            DNN_TARGET_VULKAN = 0+4,
            DNN_TARGET_FPGA = 0+5,
            DNN_TARGET_CUDA = 0+6,
            DNN_TARGET_CUDA_FP16 = 0+7,
            DNN_TARGET_HDDL = 0+8,
            DNN_TARGET_NPU = 0+9,
            DNN_TARGET_CPU_FP16 = 0+10;


    // C++: enum TracingMode (cv.dnn.TracingMode)
    public static final int
            DNN_TRACE_NONE = 0,
            DNN_TRACE_ALL = 1,
            DNN_TRACE_OP = 2;


    //
    // C++:  vector_Target cv::dnn::getAvailableTargets(dnn_Backend be)
    //

    public static List<Integer> getAvailableTargets(int be) {
        return getAvailableTargets_0(be);
    }


    //
    // C++:  Net cv::dnn::readNetFromTensorflow(String model, String config = String(), int engine = ENGINE_AUTO, vector_String extraOutputs = std::vector<String>())
    //

    /**
     * Reads a network model stored in &lt;a href="https://www.tensorflow.org/"&gt;TensorFlow&lt;/a&gt; framework's format.
     * @param model  path to the .pb file with binary protobuf description of the network architecture
     * @param config path to the .pbtxt file that contains text graph definition in protobuf format.
     * Resulting Net object is built by text graph using weights from a binary one that
     * let us make it more flexible.
     * @param engine select DNN engine to be used. With auto selection the new engine is used.
     * @param extraOutputs specify model outputs explicitly, in addition to the outputs the graph analyzer finds.
     * Please pay attention that the new DNN does not support non-CPU back-ends for now.
     * @return Net object.
     */
    public static Net readNetFromTensorflow(String model, String config, int engine, List<String> extraOutputs) {
        return new Net(readNetFromTensorflow_0(model, config, engine, extraOutputs));
    }

    /**
     * Reads a network model stored in &lt;a href="https://www.tensorflow.org/"&gt;TensorFlow&lt;/a&gt; framework's format.
     * @param model  path to the .pb file with binary protobuf description of the network architecture
     * @param config path to the .pbtxt file that contains text graph definition in protobuf format.
     * Resulting Net object is built by text graph using weights from a binary one that
     * let us make it more flexible.
     * @param engine select DNN engine to be used. With auto selection the new engine is used.
     * Please pay attention that the new DNN does not support non-CPU back-ends for now.
     * @return Net object.
     */
    public static Net readNetFromTensorflow(String model, String config, int engine) {
        return new Net(readNetFromTensorflow_1(model, config, engine));
    }

    /**
     * Reads a network model stored in &lt;a href="https://www.tensorflow.org/"&gt;TensorFlow&lt;/a&gt; framework's format.
     * @param model  path to the .pb file with binary protobuf description of the network architecture
     * @param config path to the .pbtxt file that contains text graph definition in protobuf format.
     * Resulting Net object is built by text graph using weights from a binary one that
     * let us make it more flexible.
     * Please pay attention that the new DNN does not support non-CPU back-ends for now.
     * @return Net object.
     */
    public static Net readNetFromTensorflow(String model, String config) {
        return new Net(readNetFromTensorflow_2(model, config));
    }

    /**
     * Reads a network model stored in &lt;a href="https://www.tensorflow.org/"&gt;TensorFlow&lt;/a&gt; framework's format.
     * @param model  path to the .pb file with binary protobuf description of the network architecture
     * Resulting Net object is built by text graph using weights from a binary one that
     * let us make it more flexible.
     * Please pay attention that the new DNN does not support non-CPU back-ends for now.
     * @return Net object.
     */
    public static Net readNetFromTensorflow(String model) {
        return new Net(readNetFromTensorflow_3(model));
    }


    //
    // C++:  Net cv::dnn::readNetFromTensorflow(vector_uchar bufferModel, vector_uchar bufferConfig = std::vector<uchar>(), int engine = ENGINE_AUTO, vector_String extraOutputs = std::vector<String>())
    //

    /**
     * Reads a network model stored in &lt;a href="https://www.tensorflow.org/"&gt;TensorFlow&lt;/a&gt; framework's format.
     * @param bufferModel buffer containing the content of the pb file
     * @param bufferConfig buffer containing the content of the pbtxt file
     * @param engine select DNN engine to be used. With auto selection the new engine is used.
     * @param extraOutputs specify model outputs explicitly, in addition to the outputs the graph analyzer finds.
     * Please pay attention that the new DNN does not support non-CPU back-ends for now.
     * @return Net object.
     */
    public static Net readNetFromTensorflow(MatOfByte bufferModel, MatOfByte bufferConfig, int engine, List<String> extraOutputs) {
        Mat bufferModel_mat = bufferModel;
        Mat bufferConfig_mat = bufferConfig;
        return new Net(readNetFromTensorflow_4(bufferModel_mat.nativeObj, bufferConfig_mat.nativeObj, engine, extraOutputs));
    }

    /**
     * Reads a network model stored in &lt;a href="https://www.tensorflow.org/"&gt;TensorFlow&lt;/a&gt; framework's format.
     * @param bufferModel buffer containing the content of the pb file
     * @param bufferConfig buffer containing the content of the pbtxt file
     * @param engine select DNN engine to be used. With auto selection the new engine is used.
     * Please pay attention that the new DNN does not support non-CPU back-ends for now.
     * @return Net object.
     */
    public static Net readNetFromTensorflow(MatOfByte bufferModel, MatOfByte bufferConfig, int engine) {
        Mat bufferModel_mat = bufferModel;
        Mat bufferConfig_mat = bufferConfig;
        return new Net(readNetFromTensorflow_5(bufferModel_mat.nativeObj, bufferConfig_mat.nativeObj, engine));
    }

    /**
     * Reads a network model stored in &lt;a href="https://www.tensorflow.org/"&gt;TensorFlow&lt;/a&gt; framework's format.
     * @param bufferModel buffer containing the content of the pb file
     * @param bufferConfig buffer containing the content of the pbtxt file
     * Please pay attention that the new DNN does not support non-CPU back-ends for now.
     * @return Net object.
     */
    public static Net readNetFromTensorflow(MatOfByte bufferModel, MatOfByte bufferConfig) {
        Mat bufferModel_mat = bufferModel;
        Mat bufferConfig_mat = bufferConfig;
        return new Net(readNetFromTensorflow_6(bufferModel_mat.nativeObj, bufferConfig_mat.nativeObj));
    }

    /**
     * Reads a network model stored in &lt;a href="https://www.tensorflow.org/"&gt;TensorFlow&lt;/a&gt; framework's format.
     * @param bufferModel buffer containing the content of the pb file
     * Please pay attention that the new DNN does not support non-CPU back-ends for now.
     * @return Net object.
     */
    public static Net readNetFromTensorflow(MatOfByte bufferModel) {
        Mat bufferModel_mat = bufferModel;
        return new Net(readNetFromTensorflow_7(bufferModel_mat.nativeObj));
    }


    //
    // C++:  Net cv::dnn::readNetFromTFLite(String model, int engine = ENGINE_AUTO)
    //

    /**
     * Reads a network model stored in &lt;a href="https://www.tensorflow.org/lite"&gt;TFLite&lt;/a&gt; framework's format.
     * @param model  path to the .tflite file with binary flatbuffers description of the network architecture
     * @param engine select DNN engine to be used. With auto selection the new engine is used first and falls back to classic.
     * Please pay attention that the new DNN does not support non-CPU back-ends for now.
     * @return Net object.
     */
    public static Net readNetFromTFLite(String model, int engine) {
        return new Net(readNetFromTFLite_0(model, engine));
    }

    /**
     * Reads a network model stored in &lt;a href="https://www.tensorflow.org/lite"&gt;TFLite&lt;/a&gt; framework's format.
     * @param model  path to the .tflite file with binary flatbuffers description of the network architecture
     * Please pay attention that the new DNN does not support non-CPU back-ends for now.
     * @return Net object.
     */
    public static Net readNetFromTFLite(String model) {
        return new Net(readNetFromTFLite_1(model));
    }


    //
    // C++:  Net cv::dnn::readNetFromTFLite(vector_uchar bufferModel, int engine = ENGINE_AUTO)
    //

    /**
     * Reads a network model stored in &lt;a href="https://www.tensorflow.org/lite"&gt;TFLite&lt;/a&gt; framework's format.
     * @param bufferModel buffer containing the content of the tflite file
     * @param engine select DNN engine to be used. With auto selection the new engine is used first and falls back to classic.
     * Please pay attention that the new DNN does not support non-CPU back-ends for now.
     * @return Net object.
     */
    public static Net readNetFromTFLite(MatOfByte bufferModel, int engine) {
        Mat bufferModel_mat = bufferModel;
        return new Net(readNetFromTFLite_2(bufferModel_mat.nativeObj, engine));
    }

    /**
     * Reads a network model stored in &lt;a href="https://www.tensorflow.org/lite"&gt;TFLite&lt;/a&gt; framework's format.
     * @param bufferModel buffer containing the content of the tflite file
     * Please pay attention that the new DNN does not support non-CPU back-ends for now.
     * @return Net object.
     */
    public static Net readNetFromTFLite(MatOfByte bufferModel) {
        Mat bufferModel_mat = bufferModel;
        return new Net(readNetFromTFLite_3(bufferModel_mat.nativeObj));
    }


    //
    // C++:  Net cv::dnn::readNet(String model, String config = "", String framework = "", int engine = ENGINE_AUTO)
    //

    /**
     * Read deep learning network represented in one of the supported formats.
     * @param model Binary file contains trained weights. The following file
     * extensions are expected for models from different frameworks:
     * * {@code *.pb} (TensorFlow, https://www.tensorflow.org/)
     * * {@code *.bin} | {@code *.onnx} (OpenVINO, https://software.intel.com/openvino-toolkit)
     * * {@code *.onnx} (ONNX, https://onnx.ai/)
     * @param config Text file contains network configuration. It could be a
     * file with the following extensions:
     * * {@code *.pbtxt} (TensorFlow, https://www.tensorflow.org/)
     * * {@code *.xml} (OpenVINO, https://software.intel.com/openvino-toolkit)
     * @param framework Explicit framework name tag to determine a format.
     * @param engine select DNN engine to be used. With auto selection the new engine is used first and falls back to classic.
     * Please pay attention that the new DNN does not support non-CPU back-ends for now.
     * Use ENGINE_CLASSIC if you want to use other back-ends.
     * @return Net object.
     *
     * This function automatically detects an origin framework of trained model
     * and calls an appropriate function such REF: readNetFromTensorflow, REF: readNetFromONNX.
     * An order of {@code model} and {@code config} arguments does not matter.
     */
    public static Net readNet(String model, String config, String framework, int engine) {
        return new Net(readNet_0(model, config, framework, engine));
    }

    /**
     * Read deep learning network represented in one of the supported formats.
     * @param model Binary file contains trained weights. The following file
     * extensions are expected for models from different frameworks:
     * * {@code *.pb} (TensorFlow, https://www.tensorflow.org/)
     * * {@code *.bin} | {@code *.onnx} (OpenVINO, https://software.intel.com/openvino-toolkit)
     * * {@code *.onnx} (ONNX, https://onnx.ai/)
     * @param config Text file contains network configuration. It could be a
     * file with the following extensions:
     * * {@code *.pbtxt} (TensorFlow, https://www.tensorflow.org/)
     * * {@code *.xml} (OpenVINO, https://software.intel.com/openvino-toolkit)
     * @param framework Explicit framework name tag to determine a format.
     * Please pay attention that the new DNN does not support non-CPU back-ends for now.
     * Use ENGINE_CLASSIC if you want to use other back-ends.
     * @return Net object.
     *
     * This function automatically detects an origin framework of trained model
     * and calls an appropriate function such REF: readNetFromTensorflow, REF: readNetFromONNX.
     * An order of {@code model} and {@code config} arguments does not matter.
     */
    public static Net readNet(String model, String config, String framework) {
        return new Net(readNet_1(model, config, framework));
    }

    /**
     * Read deep learning network represented in one of the supported formats.
     * @param model Binary file contains trained weights. The following file
     * extensions are expected for models from different frameworks:
     * * {@code *.pb} (TensorFlow, https://www.tensorflow.org/)
     * * {@code *.bin} | {@code *.onnx} (OpenVINO, https://software.intel.com/openvino-toolkit)
     * * {@code *.onnx} (ONNX, https://onnx.ai/)
     * @param config Text file contains network configuration. It could be a
     * file with the following extensions:
     * * {@code *.pbtxt} (TensorFlow, https://www.tensorflow.org/)
     * * {@code *.xml} (OpenVINO, https://software.intel.com/openvino-toolkit)
     * Please pay attention that the new DNN does not support non-CPU back-ends for now.
     * Use ENGINE_CLASSIC if you want to use other back-ends.
     * @return Net object.
     *
     * This function automatically detects an origin framework of trained model
     * and calls an appropriate function such REF: readNetFromTensorflow, REF: readNetFromONNX.
     * An order of {@code model} and {@code config} arguments does not matter.
     */
    public static Net readNet(String model, String config) {
        return new Net(readNet_2(model, config));
    }

    /**
     * Read deep learning network represented in one of the supported formats.
     * @param model Binary file contains trained weights. The following file
     * extensions are expected for models from different frameworks:
     * * {@code *.pb} (TensorFlow, https://www.tensorflow.org/)
     * * {@code *.bin} | {@code *.onnx} (OpenVINO, https://software.intel.com/openvino-toolkit)
     * * {@code *.onnx} (ONNX, https://onnx.ai/)
     * file with the following extensions:
     * * {@code *.pbtxt} (TensorFlow, https://www.tensorflow.org/)
     * * {@code *.xml} (OpenVINO, https://software.intel.com/openvino-toolkit)
     * Please pay attention that the new DNN does not support non-CPU back-ends for now.
     * Use ENGINE_CLASSIC if you want to use other back-ends.
     * @return Net object.
     *
     * This function automatically detects an origin framework of trained model
     * and calls an appropriate function such REF: readNetFromTensorflow, REF: readNetFromONNX.
     * An order of {@code model} and {@code config} arguments does not matter.
     */
    public static Net readNet(String model) {
        return new Net(readNet_3(model));
    }


    //
    // C++:  Net cv::dnn::readNet(String framework, vector_uchar bufferModel, vector_uchar bufferConfig = std::vector<uchar>(), int engine = ENGINE_AUTO)
    //

    /**
     * Read deep learning network represented in one of the supported formats.
     * This is an overloaded member function, provided for convenience.
     * It differs from the above function only in what argument(s) it accepts.
     * @param framework    Name of origin framework.
     * @param bufferModel  A buffer with a content of binary file with weights
     * @param bufferConfig A buffer with a content of text file contains network configuration.
     * @param engine select DNN engine to be used. With auto selection the new engine is used first and falls back to classic.
     * Please pay attention that the new DNN does not support non-CPU back-ends for now.
     * Use ENGINE_CLASSIC if you want to use other back-ends.
     * @return Net object.
     */
    public static Net readNet(String framework, MatOfByte bufferModel, MatOfByte bufferConfig, int engine) {
        Mat bufferModel_mat = bufferModel;
        Mat bufferConfig_mat = bufferConfig;
        return new Net(readNet_4(framework, bufferModel_mat.nativeObj, bufferConfig_mat.nativeObj, engine));
    }

    /**
     * Read deep learning network represented in one of the supported formats.
     * This is an overloaded member function, provided for convenience.
     * It differs from the above function only in what argument(s) it accepts.
     * @param framework    Name of origin framework.
     * @param bufferModel  A buffer with a content of binary file with weights
     * @param bufferConfig A buffer with a content of text file contains network configuration.
     * Please pay attention that the new DNN does not support non-CPU back-ends for now.
     * Use ENGINE_CLASSIC if you want to use other back-ends.
     * @return Net object.
     */
    public static Net readNet(String framework, MatOfByte bufferModel, MatOfByte bufferConfig) {
        Mat bufferModel_mat = bufferModel;
        Mat bufferConfig_mat = bufferConfig;
        return new Net(readNet_5(framework, bufferModel_mat.nativeObj, bufferConfig_mat.nativeObj));
    }

    /**
     * Read deep learning network represented in one of the supported formats.
     * This is an overloaded member function, provided for convenience.
     * It differs from the above function only in what argument(s) it accepts.
     * @param framework    Name of origin framework.
     * @param bufferModel  A buffer with a content of binary file with weights
     * Please pay attention that the new DNN does not support non-CPU back-ends for now.
     * Use ENGINE_CLASSIC if you want to use other back-ends.
     * @return Net object.
     */
    public static Net readNet(String framework, MatOfByte bufferModel) {
        Mat bufferModel_mat = bufferModel;
        return new Net(readNet_6(framework, bufferModel_mat.nativeObj));
    }


    //
    // C++:  Net cv::dnn::readNetFromModelOptimizer(String xml, String bin = "")
    //

    /**
     * Load a network from Intel's Model Optimizer intermediate representation.
     * @param xml XML configuration file with network's topology.
     * @param bin Binary file with trained weights.
     * @return Net object.
     * Networks imported from Intel's Model Optimizer are launched in Intel's Inference Engine
     * backend.
     */
    public static Net readNetFromModelOptimizer(String xml, String bin) {
        return new Net(readNetFromModelOptimizer_0(xml, bin));
    }

    /**
     * Load a network from Intel's Model Optimizer intermediate representation.
     * @param xml XML configuration file with network's topology.
     * @return Net object.
     * Networks imported from Intel's Model Optimizer are launched in Intel's Inference Engine
     * backend.
     */
    public static Net readNetFromModelOptimizer(String xml) {
        return new Net(readNetFromModelOptimizer_1(xml));
    }


    //
    // C++:  Net cv::dnn::readNetFromModelOptimizer(vector_uchar bufferModelConfig, vector_uchar bufferWeights)
    //

    /**
     * Load a network from Intel's Model Optimizer intermediate representation.
     * @param bufferModelConfig Buffer contains XML configuration with network's topology.
     * @param bufferWeights Buffer contains binary data with trained weights.
     * @return Net object.
     * Networks imported from Intel's Model Optimizer are launched in Intel's Inference Engine
     * backend.
     */
    public static Net readNetFromModelOptimizer(MatOfByte bufferModelConfig, MatOfByte bufferWeights) {
        Mat bufferModelConfig_mat = bufferModelConfig;
        Mat bufferWeights_mat = bufferWeights;
        return new Net(readNetFromModelOptimizer_2(bufferModelConfig_mat.nativeObj, bufferWeights_mat.nativeObj));
    }


    //
    // C++:  Net cv::dnn::readNetFromONNX(String onnxFile, int engine = ENGINE_AUTO)
    //

    /**
     * Reads a network model &lt;a href="https://onnx.ai/"&gt;ONNX&lt;/a&gt;.
     * @param onnxFile path to the .onnx file with text description of the network architecture.
     * @param engine select DNN engine to be used. With auto selection the new engine is used first and falls back to classic.
     * Please pay attention that the new DNN does not support non-CPU back-ends for now.
     * @return Network object that ready to do forward, throw an exception in failure cases.
     */
    public static Net readNetFromONNX(String onnxFile, int engine) {
        return new Net(readNetFromONNX_0(onnxFile, engine));
    }

    /**
     * Reads a network model &lt;a href="https://onnx.ai/"&gt;ONNX&lt;/a&gt;.
     * @param onnxFile path to the .onnx file with text description of the network architecture.
     * Please pay attention that the new DNN does not support non-CPU back-ends for now.
     * @return Network object that ready to do forward, throw an exception in failure cases.
     */
    public static Net readNetFromONNX(String onnxFile) {
        return new Net(readNetFromONNX_1(onnxFile));
    }


    //
    // C++:  Net cv::dnn::readNetFromONNX(vector_uchar buffer, int engine = ENGINE_AUTO)
    //

    /**
     * Reads a network model from &lt;a href="https://onnx.ai/"&gt;ONNX&lt;/a&gt;
     * in-memory buffer.
     * @param buffer in-memory buffer that stores the ONNX model bytes.
     * @param engine select DNN engine to be used. With auto selection the new engine is used first and falls back to classic.
     * Please pay attention that the new DNN does not support non-CPU back-ends for now.
     * @return Network object that ready to do forward, throw an exception
     * in failure cases.
     */
    public static Net readNetFromONNX(MatOfByte buffer, int engine) {
        Mat buffer_mat = buffer;
        return new Net(readNetFromONNX_2(buffer_mat.nativeObj, engine));
    }

    /**
     * Reads a network model from &lt;a href="https://onnx.ai/"&gt;ONNX&lt;/a&gt;
     * in-memory buffer.
     * @param buffer in-memory buffer that stores the ONNX model bytes.
     * Please pay attention that the new DNN does not support non-CPU back-ends for now.
     * @return Network object that ready to do forward, throw an exception
     * in failure cases.
     */
    public static Net readNetFromONNX(MatOfByte buffer) {
        Mat buffer_mat = buffer;
        return new Net(readNetFromONNX_3(buffer_mat.nativeObj));
    }


    //
    // C++:  Mat cv::dnn::readTensorFromONNX(String path)
    //

    /**
     * Creates blob from .pb file.
     * @param path to the .pb file with input tensor.
     * @return Mat.
     */
    public static Mat readTensorFromONNX(String path) {
        return new Mat(readTensorFromONNX_0(path));
    }


    //
    // C++:  Mat cv::dnn::blobFromImage(Mat image, double scalefactor = 1.0, Size size = Size(), Scalar mean = Scalar(), bool swapRB = false, bool crop = false, int ddepth = CV_32F)
    //

    /**
     * Creates 4-dimensional blob from image. Optionally resizes and crops {@code image} from center,
     * subtract {@code mean} values, scales values by {@code scalefactor}, swap Blue and Red channels.
     * @param image input image (with 1-, 3- or 4-channels).
     * @param scalefactor multiplier for {@code images} values.
     * @param size spatial size for output image
     * @param mean scalar with mean values which are subtracted from channels. Values are intended
     * to be in (mean-R, mean-G, mean-B) order if {@code image} has BGR ordering and {@code swapRB} is true.
     * @param swapRB flag which indicates that swap first and last channels
     * in 3-channel image is necessary.
     * @param crop flag which indicates whether image will be cropped after resize or not
     * @param ddepth Depth of output blob. Choose CV_32F or CV_8U.
     * if {@code crop} is true, input image is resized so one side after resize is equal to corresponding
     * dimension in {@code size} and another one is equal or larger. Then, crop from the center is performed.
     * If {@code crop} is false, direct resize without cropping and preserving aspect ratio is performed.
     * @return 4-dimensional Mat with NCHW dimensions order.
     *
     * <b>Note:</b>
     * The order and usage of {@code scalefactor} and {@code mean} are (input - mean) * scalefactor.
     */
    public static Mat blobFromImage(Mat image, double scalefactor, Size size, Scalar mean, boolean swapRB, boolean crop, int ddepth) {
        return new Mat(blobFromImage_0(image.nativeObj, scalefactor, size.width, size.height, mean.val[0], mean.val[1], mean.val[2], mean.val[3], swapRB, crop, ddepth));
    }

    /**
     * Creates 4-dimensional blob from image. Optionally resizes and crops {@code image} from center,
     * subtract {@code mean} values, scales values by {@code scalefactor}, swap Blue and Red channels.
     * @param image input image (with 1-, 3- or 4-channels).
     * @param scalefactor multiplier for {@code images} values.
     * @param size spatial size for output image
     * @param mean scalar with mean values which are subtracted from channels. Values are intended
     * to be in (mean-R, mean-G, mean-B) order if {@code image} has BGR ordering and {@code swapRB} is true.
     * @param swapRB flag which indicates that swap first and last channels
     * in 3-channel image is necessary.
     * @param crop flag which indicates whether image will be cropped after resize or not
     * if {@code crop} is true, input image is resized so one side after resize is equal to corresponding
     * dimension in {@code size} and another one is equal or larger. Then, crop from the center is performed.
     * If {@code crop} is false, direct resize without cropping and preserving aspect ratio is performed.
     * @return 4-dimensional Mat with NCHW dimensions order.
     *
     * <b>Note:</b>
     * The order and usage of {@code scalefactor} and {@code mean} are (input - mean) * scalefactor.
     */
    public static Mat blobFromImage(Mat image, double scalefactor, Size size, Scalar mean, boolean swapRB, boolean crop) {
        return new Mat(blobFromImage_1(image.nativeObj, scalefactor, size.width, size.height, mean.val[0], mean.val[1], mean.val[2], mean.val[3], swapRB, crop));
    }

    /**
     * Creates 4-dimensional blob from image. Optionally resizes and crops {@code image} from center,
     * subtract {@code mean} values, scales values by {@code scalefactor}, swap Blue and Red channels.
     * @param image input image (with 1-, 3- or 4-channels).
     * @param scalefactor multiplier for {@code images} values.
     * @param size spatial size for output image
     * @param mean scalar with mean values which are subtracted from channels. Values are intended
     * to be in (mean-R, mean-G, mean-B) order if {@code image} has BGR ordering and {@code swapRB} is true.
     * @param swapRB flag which indicates that swap first and last channels
     * in 3-channel image is necessary.
     * if {@code crop} is true, input image is resized so one side after resize is equal to corresponding
     * dimension in {@code size} and another one is equal or larger. Then, crop from the center is performed.
     * If {@code crop} is false, direct resize without cropping and preserving aspect ratio is performed.
     * @return 4-dimensional Mat with NCHW dimensions order.
     *
     * <b>Note:</b>
     * The order and usage of {@code scalefactor} and {@code mean} are (input - mean) * scalefactor.
     */
    public static Mat blobFromImage(Mat image, double scalefactor, Size size, Scalar mean, boolean swapRB) {
        return new Mat(blobFromImage_2(image.nativeObj, scalefactor, size.width, size.height, mean.val[0], mean.val[1], mean.val[2], mean.val[3], swapRB));
    }

    /**
     * Creates 4-dimensional blob from image. Optionally resizes and crops {@code image} from center,
     * subtract {@code mean} values, scales values by {@code scalefactor}, swap Blue and Red channels.
     * @param image input image (with 1-, 3- or 4-channels).
     * @param scalefactor multiplier for {@code images} values.
     * @param size spatial size for output image
     * @param mean scalar with mean values which are subtracted from channels. Values are intended
     * to be in (mean-R, mean-G, mean-B) order if {@code image} has BGR ordering and {@code swapRB} is true.
     * in 3-channel image is necessary.
     * if {@code crop} is true, input image is resized so one side after resize is equal to corresponding
     * dimension in {@code size} and another one is equal or larger. Then, crop from the center is performed.
     * If {@code crop} is false, direct resize without cropping and preserving aspect ratio is performed.
     * @return 4-dimensional Mat with NCHW dimensions order.
     *
     * <b>Note:</b>
     * The order and usage of {@code scalefactor} and {@code mean} are (input - mean) * scalefactor.
     */
    public static Mat blobFromImage(Mat image, double scalefactor, Size size, Scalar mean) {
        return new Mat(blobFromImage_3(image.nativeObj, scalefactor, size.width, size.height, mean.val[0], mean.val[1], mean.val[2], mean.val[3]));
    }

    /**
     * Creates 4-dimensional blob from image. Optionally resizes and crops {@code image} from center,
     * subtract {@code mean} values, scales values by {@code scalefactor}, swap Blue and Red channels.
     * @param image input image (with 1-, 3- or 4-channels).
     * @param scalefactor multiplier for {@code images} values.
     * @param size spatial size for output image
     * to be in (mean-R, mean-G, mean-B) order if {@code image} has BGR ordering and {@code swapRB} is true.
     * in 3-channel image is necessary.
     * if {@code crop} is true, input image is resized so one side after resize is equal to corresponding
     * dimension in {@code size} and another one is equal or larger. Then, crop from the center is performed.
     * If {@code crop} is false, direct resize without cropping and preserving aspect ratio is performed.
     * @return 4-dimensional Mat with NCHW dimensions order.
     *
     * <b>Note:</b>
     * The order and usage of {@code scalefactor} and {@code mean} are (input - mean) * scalefactor.
     */
    public static Mat blobFromImage(Mat image, double scalefactor, Size size) {
        return new Mat(blobFromImage_4(image.nativeObj, scalefactor, size.width, size.height));
    }

    /**
     * Creates 4-dimensional blob from image. Optionally resizes and crops {@code image} from center,
     * subtract {@code mean} values, scales values by {@code scalefactor}, swap Blue and Red channels.
     * @param image input image (with 1-, 3- or 4-channels).
     * @param scalefactor multiplier for {@code images} values.
     * to be in (mean-R, mean-G, mean-B) order if {@code image} has BGR ordering and {@code swapRB} is true.
     * in 3-channel image is necessary.
     * if {@code crop} is true, input image is resized so one side after resize is equal to corresponding
     * dimension in {@code size} and another one is equal or larger. Then, crop from the center is performed.
     * If {@code crop} is false, direct resize without cropping and preserving aspect ratio is performed.
     * @return 4-dimensional Mat with NCHW dimensions order.
     *
     * <b>Note:</b>
     * The order and usage of {@code scalefactor} and {@code mean} are (input - mean) * scalefactor.
     */
    public static Mat blobFromImage(Mat image, double scalefactor) {
        return new Mat(blobFromImage_5(image.nativeObj, scalefactor));
    }

    /**
     * Creates 4-dimensional blob from image. Optionally resizes and crops {@code image} from center,
     * subtract {@code mean} values, scales values by {@code scalefactor}, swap Blue and Red channels.
     * @param image input image (with 1-, 3- or 4-channels).
     * to be in (mean-R, mean-G, mean-B) order if {@code image} has BGR ordering and {@code swapRB} is true.
     * in 3-channel image is necessary.
     * if {@code crop} is true, input image is resized so one side after resize is equal to corresponding
     * dimension in {@code size} and another one is equal or larger. Then, crop from the center is performed.
     * If {@code crop} is false, direct resize without cropping and preserving aspect ratio is performed.
     * @return 4-dimensional Mat with NCHW dimensions order.
     *
     * <b>Note:</b>
     * The order and usage of {@code scalefactor} and {@code mean} are (input - mean) * scalefactor.
     */
    public static Mat blobFromImage(Mat image) {
        return new Mat(blobFromImage_6(image.nativeObj));
    }


    //
    // C++:  Mat cv::dnn::blobFromImages(vector_Mat images, double scalefactor = 1.0, Size size = Size(), Scalar mean = Scalar(), bool swapRB = false, bool crop = false, int ddepth = CV_32F)
    //

    /**
     * Creates 4-dimensional blob from series of images. Optionally resizes and
     * crops {@code images} from center, subtract {@code mean} values, scales values by {@code scalefactor},
     * swap Blue and Red channels.
     * @param images input images (all with 1-, 3- or 4-channels).
     * @param size spatial size for output image
     * @param mean scalar with mean values which are subtracted from channels. Values are intended
     * to be in (mean-R, mean-G, mean-B) order if {@code image} has BGR ordering and {@code swapRB} is true.
     * @param scalefactor multiplier for {@code images} values.
     * @param swapRB flag which indicates that swap first and last channels
     * in 3-channel image is necessary.
     * @param crop flag which indicates whether image will be cropped after resize or not
     * @param ddepth Depth of output blob. Choose CV_32F or CV_8U.
     * if {@code crop} is true, input image is resized so one side after resize is equal to corresponding
     * dimension in {@code size} and another one is equal or larger. Then, crop from the center is performed.
     * If {@code crop} is false, direct resize without cropping and preserving aspect ratio is performed.
     * @return 4-dimensional Mat with NCHW dimensions order.
     *
     * <b>Note:</b>
     * The order and usage of {@code scalefactor} and {@code mean} are (input - mean) * scalefactor.
     */
    public static Mat blobFromImages(List<Mat> images, double scalefactor, Size size, Scalar mean, boolean swapRB, boolean crop, int ddepth) {
        Mat images_mat = Converters.vector_Mat_to_Mat(images);
        return new Mat(blobFromImages_0(images_mat.nativeObj, scalefactor, size.width, size.height, mean.val[0], mean.val[1], mean.val[2], mean.val[3], swapRB, crop, ddepth));
    }

    /**
     * Creates 4-dimensional blob from series of images. Optionally resizes and
     * crops {@code images} from center, subtract {@code mean} values, scales values by {@code scalefactor},
     * swap Blue and Red channels.
     * @param images input images (all with 1-, 3- or 4-channels).
     * @param size spatial size for output image
     * @param mean scalar with mean values which are subtracted from channels. Values are intended
     * to be in (mean-R, mean-G, mean-B) order if {@code image} has BGR ordering and {@code swapRB} is true.
     * @param scalefactor multiplier for {@code images} values.
     * @param swapRB flag which indicates that swap first and last channels
     * in 3-channel image is necessary.
     * @param crop flag which indicates whether image will be cropped after resize or not
     * if {@code crop} is true, input image is resized so one side after resize is equal to corresponding
     * dimension in {@code size} and another one is equal or larger. Then, crop from the center is performed.
     * If {@code crop} is false, direct resize without cropping and preserving aspect ratio is performed.
     * @return 4-dimensional Mat with NCHW dimensions order.
     *
     * <b>Note:</b>
     * The order and usage of {@code scalefactor} and {@code mean} are (input - mean) * scalefactor.
     */
    public static Mat blobFromImages(List<Mat> images, double scalefactor, Size size, Scalar mean, boolean swapRB, boolean crop) {
        Mat images_mat = Converters.vector_Mat_to_Mat(images);
        return new Mat(blobFromImages_1(images_mat.nativeObj, scalefactor, size.width, size.height, mean.val[0], mean.val[1], mean.val[2], mean.val[3], swapRB, crop));
    }

    /**
     * Creates 4-dimensional blob from series of images. Optionally resizes and
     * crops {@code images} from center, subtract {@code mean} values, scales values by {@code scalefactor},
     * swap Blue and Red channels.
     * @param images input images (all with 1-, 3- or 4-channels).
     * @param size spatial size for output image
     * @param mean scalar with mean values which are subtracted from channels. Values are intended
     * to be in (mean-R, mean-G, mean-B) order if {@code image} has BGR ordering and {@code swapRB} is true.
     * @param scalefactor multiplier for {@code images} values.
     * @param swapRB flag which indicates that swap first and last channels
     * in 3-channel image is necessary.
     * if {@code crop} is true, input image is resized so one side after resize is equal to corresponding
     * dimension in {@code size} and another one is equal or larger. Then, crop from the center is performed.
     * If {@code crop} is false, direct resize without cropping and preserving aspect ratio is performed.
     * @return 4-dimensional Mat with NCHW dimensions order.
     *
     * <b>Note:</b>
     * The order and usage of {@code scalefactor} and {@code mean} are (input - mean) * scalefactor.
     */
    public static Mat blobFromImages(List<Mat> images, double scalefactor, Size size, Scalar mean, boolean swapRB) {
        Mat images_mat = Converters.vector_Mat_to_Mat(images);
        return new Mat(blobFromImages_2(images_mat.nativeObj, scalefactor, size.width, size.height, mean.val[0], mean.val[1], mean.val[2], mean.val[3], swapRB));
    }

    /**
     * Creates 4-dimensional blob from series of images. Optionally resizes and
     * crops {@code images} from center, subtract {@code mean} values, scales values by {@code scalefactor},
     * swap Blue and Red channels.
     * @param images input images (all with 1-, 3- or 4-channels).
     * @param size spatial size for output image
     * @param mean scalar with mean values which are subtracted from channels. Values are intended
     * to be in (mean-R, mean-G, mean-B) order if {@code image} has BGR ordering and {@code swapRB} is true.
     * @param scalefactor multiplier for {@code images} values.
     * in 3-channel image is necessary.
     * if {@code crop} is true, input image is resized so one side after resize is equal to corresponding
     * dimension in {@code size} and another one is equal or larger. Then, crop from the center is performed.
     * If {@code crop} is false, direct resize without cropping and preserving aspect ratio is performed.
     * @return 4-dimensional Mat with NCHW dimensions order.
     *
     * <b>Note:</b>
     * The order and usage of {@code scalefactor} and {@code mean} are (input - mean) * scalefactor.
     */
    public static Mat blobFromImages(List<Mat> images, double scalefactor, Size size, Scalar mean) {
        Mat images_mat = Converters.vector_Mat_to_Mat(images);
        return new Mat(blobFromImages_3(images_mat.nativeObj, scalefactor, size.width, size.height, mean.val[0], mean.val[1], mean.val[2], mean.val[3]));
    }

    /**
     * Creates 4-dimensional blob from series of images. Optionally resizes and
     * crops {@code images} from center, subtract {@code mean} values, scales values by {@code scalefactor},
     * swap Blue and Red channels.
     * @param images input images (all with 1-, 3- or 4-channels).
     * @param size spatial size for output image
     * to be in (mean-R, mean-G, mean-B) order if {@code image} has BGR ordering and {@code swapRB} is true.
     * @param scalefactor multiplier for {@code images} values.
     * in 3-channel image is necessary.
     * if {@code crop} is true, input image is resized so one side after resize is equal to corresponding
     * dimension in {@code size} and another one is equal or larger. Then, crop from the center is performed.
     * If {@code crop} is false, direct resize without cropping and preserving aspect ratio is performed.
     * @return 4-dimensional Mat with NCHW dimensions order.
     *
     * <b>Note:</b>
     * The order and usage of {@code scalefactor} and {@code mean} are (input - mean) * scalefactor.
     */
    public static Mat blobFromImages(List<Mat> images, double scalefactor, Size size) {
        Mat images_mat = Converters.vector_Mat_to_Mat(images);
        return new Mat(blobFromImages_4(images_mat.nativeObj, scalefactor, size.width, size.height));
    }

    /**
     * Creates 4-dimensional blob from series of images. Optionally resizes and
     * crops {@code images} from center, subtract {@code mean} values, scales values by {@code scalefactor},
     * swap Blue and Red channels.
     * @param images input images (all with 1-, 3- or 4-channels).
     * to be in (mean-R, mean-G, mean-B) order if {@code image} has BGR ordering and {@code swapRB} is true.
     * @param scalefactor multiplier for {@code images} values.
     * in 3-channel image is necessary.
     * if {@code crop} is true, input image is resized so one side after resize is equal to corresponding
     * dimension in {@code size} and another one is equal or larger. Then, crop from the center is performed.
     * If {@code crop} is false, direct resize without cropping and preserving aspect ratio is performed.
     * @return 4-dimensional Mat with NCHW dimensions order.
     *
     * <b>Note:</b>
     * The order and usage of {@code scalefactor} and {@code mean} are (input - mean) * scalefactor.
     */
    public static Mat blobFromImages(List<Mat> images, double scalefactor) {
        Mat images_mat = Converters.vector_Mat_to_Mat(images);
        return new Mat(blobFromImages_5(images_mat.nativeObj, scalefactor));
    }

    /**
     * Creates 4-dimensional blob from series of images. Optionally resizes and
     * crops {@code images} from center, subtract {@code mean} values, scales values by {@code scalefactor},
     * swap Blue and Red channels.
     * @param images input images (all with 1-, 3- or 4-channels).
     * to be in (mean-R, mean-G, mean-B) order if {@code image} has BGR ordering and {@code swapRB} is true.
     * in 3-channel image is necessary.
     * if {@code crop} is true, input image is resized so one side after resize is equal to corresponding
     * dimension in {@code size} and another one is equal or larger. Then, crop from the center is performed.
     * If {@code crop} is false, direct resize without cropping and preserving aspect ratio is performed.
     * @return 4-dimensional Mat with NCHW dimensions order.
     *
     * <b>Note:</b>
     * The order and usage of {@code scalefactor} and {@code mean} are (input - mean) * scalefactor.
     */
    public static Mat blobFromImages(List<Mat> images) {
        Mat images_mat = Converters.vector_Mat_to_Mat(images);
        return new Mat(blobFromImages_6(images_mat.nativeObj));
    }


    //
    // C++:  Mat cv::dnn::blobFromImageWithParams(Mat image, Image2BlobParams param = Image2BlobParams())
    //

    /**
     * Creates 4-dimensional blob from image with given params.
     *
     * This function is an extension of REF: blobFromImage to meet more image preprocess needs.
     * Given input image and preprocessing parameters, and function outputs the blob.
     *
     * @param image input image (all with 1-, 3- or 4-channels).
     * @param param struct of Image2BlobParams, contains all parameters needed by processing of image to blob.
     * @return 4-dimensional Mat.
     */
    public static Mat blobFromImageWithParams(Mat image, Image2BlobParams param) {
        return new Mat(blobFromImageWithParams_0(image.nativeObj, param.getNativeObjAddr()));
    }

    /**
     * Creates 4-dimensional blob from image with given params.
     *
     * This function is an extension of REF: blobFromImage to meet more image preprocess needs.
     * Given input image and preprocessing parameters, and function outputs the blob.
     *
     * @param image input image (all with 1-, 3- or 4-channels).
     * @return 4-dimensional Mat.
     */
    public static Mat blobFromImageWithParams(Mat image) {
        return new Mat(blobFromImageWithParams_1(image.nativeObj));
    }


    //
    // C++:  void cv::dnn::blobFromImageWithParams(Mat image, Mat& blob, Image2BlobParams param = Image2BlobParams())
    //

    public static void blobFromImageWithParams(Mat image, Mat blob, Image2BlobParams param) {
        blobFromImageWithParams_2(image.nativeObj, blob.nativeObj, param.getNativeObjAddr());
    }

    public static void blobFromImageWithParams(Mat image, Mat blob) {
        blobFromImageWithParams_3(image.nativeObj, blob.nativeObj);
    }


    //
    // C++:  Mat cv::dnn::blobFromImagesWithParams(vector_Mat images, Image2BlobParams param = Image2BlobParams())
    //

    /**
     * Creates 4-dimensional blob from series of images with given params.
     *
     * This function is an extension of REF: blobFromImages to meet more image preprocess needs.
     * Given input image and preprocessing parameters, and function outputs the blob.
     *
     * @param images input image (all with 1-, 3- or 4-channels).
     * @param param struct of Image2BlobParams, contains all parameters needed by processing of image to blob.
     * @return 4-dimensional Mat.
     */
    public static Mat blobFromImagesWithParams(List<Mat> images, Image2BlobParams param) {
        Mat images_mat = Converters.vector_Mat_to_Mat(images);
        return new Mat(blobFromImagesWithParams_0(images_mat.nativeObj, param.getNativeObjAddr()));
    }

    /**
     * Creates 4-dimensional blob from series of images with given params.
     *
     * This function is an extension of REF: blobFromImages to meet more image preprocess needs.
     * Given input image and preprocessing parameters, and function outputs the blob.
     *
     * @param images input image (all with 1-, 3- or 4-channels).
     * @return 4-dimensional Mat.
     */
    public static Mat blobFromImagesWithParams(List<Mat> images) {
        Mat images_mat = Converters.vector_Mat_to_Mat(images);
        return new Mat(blobFromImagesWithParams_1(images_mat.nativeObj));
    }


    //
    // C++:  void cv::dnn::blobFromImagesWithParams(vector_Mat images, Mat& blob, Image2BlobParams param = Image2BlobParams())
    //

    public static void blobFromImagesWithParams(List<Mat> images, Mat blob, Image2BlobParams param) {
        Mat images_mat = Converters.vector_Mat_to_Mat(images);
        blobFromImagesWithParams_2(images_mat.nativeObj, blob.nativeObj, param.getNativeObjAddr());
    }

    public static void blobFromImagesWithParams(List<Mat> images, Mat blob) {
        Mat images_mat = Converters.vector_Mat_to_Mat(images);
        blobFromImagesWithParams_3(images_mat.nativeObj, blob.nativeObj);
    }


    //
    // C++:  void cv::dnn::imagesFromBlob(Mat blob_, vector_Mat& images_)
    //

    /**
     * Parse a 4D blob and output the images it contains as 2D arrays through a simpler data structure
     * (std::vector&lt;cv::Mat&gt;).
     * @param blob_ 4 dimensional array (images, channels, height, width) in floating point precision (CV_32F) from
     * which you would like to extract the images.
     * @param images_ array of 2D Mat containing the images extracted from the blob in floating point precision
     * (CV_32F). They are non normalized neither mean added. The number of returned images equals the first dimension
     * of the blob (batch size). Every image has a number of channels equals to the second dimension of the blob (depth).
     */
    public static void imagesFromBlob(Mat blob_, List<Mat> images_) {
        Mat images__mat = new Mat();
        imagesFromBlob_0(blob_.nativeObj, images__mat.nativeObj);
        Converters.Mat_to_vector_Mat(images__mat, images_);
        images__mat.release();
    }


    //
    // C++:  void cv::dnn::writeTextGraph(String model, String output)
    //

    /**
     * Create a text representation for a binary network stored in protocol buffer format.
     * @param model  A path to binary network.
     * @param output A path to output text file to be created.
     *
     * <b>Note:</b> To reduce output file size, trained weights are not included.
     */
    public static void writeTextGraph(String model, String output) {
        writeTextGraph_0(model, output);
    }


    //
    // C++:  void cv::dnn::NMSBoxes(vector_Rect2d bboxes, vector_float scores, float score_threshold, float nms_threshold, vector_int& indices, float eta = 1.f, int top_k = 0)
    //

    /**
     * Performs non maximum suppression given boxes and corresponding scores.
     *
     * @param bboxes a set of bounding boxes to apply NMS.
     * @param scores a set of corresponding confidences.
     * @param score_threshold a threshold used to filter boxes by score.
     * @param nms_threshold a threshold used in non maximum suppression.
     * @param indices the kept indices of bboxes after NMS.
     * @param eta a coefficient in adaptive threshold formula: \(nms\_threshold_{i+1}=eta\cdot nms\_threshold_i\).
     * @param top_k if {@code &gt;0}, keep at most {@code top_k} picked indices.
     */
    public static void NMSBoxes(MatOfRect2d bboxes, MatOfFloat scores, float score_threshold, float nms_threshold, MatOfInt indices, float eta, int top_k) {
        Mat bboxes_mat = bboxes;
        Mat scores_mat = scores;
        Mat indices_mat = indices;
        NMSBoxes_0(bboxes_mat.nativeObj, scores_mat.nativeObj, score_threshold, nms_threshold, indices_mat.nativeObj, eta, top_k);
    }

    /**
     * Performs non maximum suppression given boxes and corresponding scores.
     *
     * @param bboxes a set of bounding boxes to apply NMS.
     * @param scores a set of corresponding confidences.
     * @param score_threshold a threshold used to filter boxes by score.
     * @param nms_threshold a threshold used in non maximum suppression.
     * @param indices the kept indices of bboxes after NMS.
     * @param eta a coefficient in adaptive threshold formula: \(nms\_threshold_{i+1}=eta\cdot nms\_threshold_i\).
     */
    public static void NMSBoxes(MatOfRect2d bboxes, MatOfFloat scores, float score_threshold, float nms_threshold, MatOfInt indices, float eta) {
        Mat bboxes_mat = bboxes;
        Mat scores_mat = scores;
        Mat indices_mat = indices;
        NMSBoxes_1(bboxes_mat.nativeObj, scores_mat.nativeObj, score_threshold, nms_threshold, indices_mat.nativeObj, eta);
    }

    /**
     * Performs non maximum suppression given boxes and corresponding scores.
     *
     * @param bboxes a set of bounding boxes to apply NMS.
     * @param scores a set of corresponding confidences.
     * @param score_threshold a threshold used to filter boxes by score.
     * @param nms_threshold a threshold used in non maximum suppression.
     * @param indices the kept indices of bboxes after NMS.
     */
    public static void NMSBoxes(MatOfRect2d bboxes, MatOfFloat scores, float score_threshold, float nms_threshold, MatOfInt indices) {
        Mat bboxes_mat = bboxes;
        Mat scores_mat = scores;
        Mat indices_mat = indices;
        NMSBoxes_2(bboxes_mat.nativeObj, scores_mat.nativeObj, score_threshold, nms_threshold, indices_mat.nativeObj);
    }


    //
    // C++:  void cv::dnn::NMSBoxes(vector_RotatedRect bboxes, vector_float scores, float score_threshold, float nms_threshold, vector_int& indices, float eta = 1.f, int top_k = 0)
    //

    public static void NMSBoxesRotated(MatOfRotatedRect bboxes, MatOfFloat scores, float score_threshold, float nms_threshold, MatOfInt indices, float eta, int top_k) {
        Mat bboxes_mat = bboxes;
        Mat scores_mat = scores;
        Mat indices_mat = indices;
        NMSBoxesRotated_0(bboxes_mat.nativeObj, scores_mat.nativeObj, score_threshold, nms_threshold, indices_mat.nativeObj, eta, top_k);
    }

    public static void NMSBoxesRotated(MatOfRotatedRect bboxes, MatOfFloat scores, float score_threshold, float nms_threshold, MatOfInt indices, float eta) {
        Mat bboxes_mat = bboxes;
        Mat scores_mat = scores;
        Mat indices_mat = indices;
        NMSBoxesRotated_1(bboxes_mat.nativeObj, scores_mat.nativeObj, score_threshold, nms_threshold, indices_mat.nativeObj, eta);
    }

    public static void NMSBoxesRotated(MatOfRotatedRect bboxes, MatOfFloat scores, float score_threshold, float nms_threshold, MatOfInt indices) {
        Mat bboxes_mat = bboxes;
        Mat scores_mat = scores;
        Mat indices_mat = indices;
        NMSBoxesRotated_2(bboxes_mat.nativeObj, scores_mat.nativeObj, score_threshold, nms_threshold, indices_mat.nativeObj);
    }


    //
    // C++:  void cv::dnn::NMSBoxesBatched(vector_Rect2d bboxes, vector_float scores, vector_int class_ids, float score_threshold, float nms_threshold, vector_int& indices, float eta = 1.f, int top_k = 0)
    //

    /**
     * Performs batched non maximum suppression on given boxes and corresponding scores across different classes.
     *
     * @param bboxes a set of bounding boxes to apply NMS.
     * @param scores a set of corresponding confidences.
     * @param class_ids a set of corresponding class ids. Ids are integer and usually start from 0.
     * @param score_threshold a threshold used to filter boxes by score.
     * @param nms_threshold a threshold used in non maximum suppression.
     * @param indices the kept indices of bboxes after NMS.
     * @param eta a coefficient in adaptive threshold formula: \(nms\_threshold_{i+1}=eta\cdot nms\_threshold_i\).
     * @param top_k if {@code &gt;0}, keep at most {@code top_k} picked indices.
     */
    public static void NMSBoxesBatched(MatOfRect2d bboxes, MatOfFloat scores, MatOfInt class_ids, float score_threshold, float nms_threshold, MatOfInt indices, float eta, int top_k) {
        Mat bboxes_mat = bboxes;
        Mat scores_mat = scores;
        Mat class_ids_mat = class_ids;
        Mat indices_mat = indices;
        NMSBoxesBatched_0(bboxes_mat.nativeObj, scores_mat.nativeObj, class_ids_mat.nativeObj, score_threshold, nms_threshold, indices_mat.nativeObj, eta, top_k);
    }

    /**
     * Performs batched non maximum suppression on given boxes and corresponding scores across different classes.
     *
     * @param bboxes a set of bounding boxes to apply NMS.
     * @param scores a set of corresponding confidences.
     * @param class_ids a set of corresponding class ids. Ids are integer and usually start from 0.
     * @param score_threshold a threshold used to filter boxes by score.
     * @param nms_threshold a threshold used in non maximum suppression.
     * @param indices the kept indices of bboxes after NMS.
     * @param eta a coefficient in adaptive threshold formula: \(nms\_threshold_{i+1}=eta\cdot nms\_threshold_i\).
     */
    public static void NMSBoxesBatched(MatOfRect2d bboxes, MatOfFloat scores, MatOfInt class_ids, float score_threshold, float nms_threshold, MatOfInt indices, float eta) {
        Mat bboxes_mat = bboxes;
        Mat scores_mat = scores;
        Mat class_ids_mat = class_ids;
        Mat indices_mat = indices;
        NMSBoxesBatched_1(bboxes_mat.nativeObj, scores_mat.nativeObj, class_ids_mat.nativeObj, score_threshold, nms_threshold, indices_mat.nativeObj, eta);
    }

    /**
     * Performs batched non maximum suppression on given boxes and corresponding scores across different classes.
     *
     * @param bboxes a set of bounding boxes to apply NMS.
     * @param scores a set of corresponding confidences.
     * @param class_ids a set of corresponding class ids. Ids are integer and usually start from 0.
     * @param score_threshold a threshold used to filter boxes by score.
     * @param nms_threshold a threshold used in non maximum suppression.
     * @param indices the kept indices of bboxes after NMS.
     */
    public static void NMSBoxesBatched(MatOfRect2d bboxes, MatOfFloat scores, MatOfInt class_ids, float score_threshold, float nms_threshold, MatOfInt indices) {
        Mat bboxes_mat = bboxes;
        Mat scores_mat = scores;
        Mat class_ids_mat = class_ids;
        Mat indices_mat = indices;
        NMSBoxesBatched_2(bboxes_mat.nativeObj, scores_mat.nativeObj, class_ids_mat.nativeObj, score_threshold, nms_threshold, indices_mat.nativeObj);
    }


    //
    // C++:  void cv::dnn::softNMSBoxes(vector_Rect bboxes, vector_float scores, vector_float& updated_scores, float score_threshold, float nms_threshold, vector_int& indices, size_t top_k = 0, float sigma = 0.5, SoftNMSMethod method = SoftNMSMethod::SOFTNMS_GAUSSIAN)
    //

    /**
     * Performs soft non maximum suppression given boxes and corresponding scores.
     * Reference: https://arxiv.org/abs/1704.04503
     * @param bboxes a set of bounding boxes to apply Soft NMS.
     * @param scores a set of corresponding confidences.
     * @param updated_scores a set of corresponding updated confidences.
     * @param score_threshold a threshold used to filter boxes by score.
     * @param nms_threshold a threshold used in non maximum suppression.
     * @param indices the kept indices of bboxes after NMS.
     * @param top_k keep at most {@code top_k} picked indices.
     * @param sigma parameter of Gaussian weighting.
     * SEE: SoftNMSMethod
     */
    public static void softNMSBoxes(MatOfRect bboxes, MatOfFloat scores, MatOfFloat updated_scores, float score_threshold, float nms_threshold, MatOfInt indices, long top_k, float sigma) {
        Mat bboxes_mat = bboxes;
        Mat scores_mat = scores;
        Mat updated_scores_mat = updated_scores;
        Mat indices_mat = indices;
        softNMSBoxes_0(bboxes_mat.nativeObj, scores_mat.nativeObj, updated_scores_mat.nativeObj, score_threshold, nms_threshold, indices_mat.nativeObj, top_k, sigma);
    }

    /**
     * Performs soft non maximum suppression given boxes and corresponding scores.
     * Reference: https://arxiv.org/abs/1704.04503
     * @param bboxes a set of bounding boxes to apply Soft NMS.
     * @param scores a set of corresponding confidences.
     * @param updated_scores a set of corresponding updated confidences.
     * @param score_threshold a threshold used to filter boxes by score.
     * @param nms_threshold a threshold used in non maximum suppression.
     * @param indices the kept indices of bboxes after NMS.
     * @param top_k keep at most {@code top_k} picked indices.
     * SEE: SoftNMSMethod
     */
    public static void softNMSBoxes(MatOfRect bboxes, MatOfFloat scores, MatOfFloat updated_scores, float score_threshold, float nms_threshold, MatOfInt indices, long top_k) {
        Mat bboxes_mat = bboxes;
        Mat scores_mat = scores;
        Mat updated_scores_mat = updated_scores;
        Mat indices_mat = indices;
        softNMSBoxes_2(bboxes_mat.nativeObj, scores_mat.nativeObj, updated_scores_mat.nativeObj, score_threshold, nms_threshold, indices_mat.nativeObj, top_k);
    }

    /**
     * Performs soft non maximum suppression given boxes and corresponding scores.
     * Reference: https://arxiv.org/abs/1704.04503
     * @param bboxes a set of bounding boxes to apply Soft NMS.
     * @param scores a set of corresponding confidences.
     * @param updated_scores a set of corresponding updated confidences.
     * @param score_threshold a threshold used to filter boxes by score.
     * @param nms_threshold a threshold used in non maximum suppression.
     * @param indices the kept indices of bboxes after NMS.
     * SEE: SoftNMSMethod
     */
    public static void softNMSBoxes(MatOfRect bboxes, MatOfFloat scores, MatOfFloat updated_scores, float score_threshold, float nms_threshold, MatOfInt indices) {
        Mat bboxes_mat = bboxes;
        Mat scores_mat = scores;
        Mat updated_scores_mat = updated_scores;
        Mat indices_mat = indices;
        softNMSBoxes_3(bboxes_mat.nativeObj, scores_mat.nativeObj, updated_scores_mat.nativeObj, score_threshold, nms_threshold, indices_mat.nativeObj);
    }


    //
    // C++:  String cv::dnn::getInferenceEngineBackendType()
    //

    /**
     * Returns Inference Engine internal backend API.
     *
     * See values of {@code CV_DNN_BACKEND_INFERENCE_ENGINE_*} macros.
     *
     * {@code OPENCV_DNN_BACKEND_INFERENCE_ENGINE_TYPE} runtime parameter (environment variable) is ignored since 4.6.0.
     *
     * @deprecated
     * @return automatically generated
     */
    @Deprecated
    public static String getInferenceEngineBackendType() {
        return getInferenceEngineBackendType_0();
    }


    //
    // C++:  String cv::dnn::setInferenceEngineBackendType(String newBackendType)
    //

    /**
     * Specify Inference Engine internal backend API.
     *
     * See values of {@code CV_DNN_BACKEND_INFERENCE_ENGINE_*} macros.
     *
     * @return previous value of internal backend API
     *
     * @deprecated
     * @param newBackendType automatically generated
     */
    @Deprecated
    public static String setInferenceEngineBackendType(String newBackendType) {
        return setInferenceEngineBackendType_0(newBackendType);
    }


    //
    // C++:  void cv::dnn::resetMyriadDevice()
    //

    /**
     * Release a Myriad device (binded by OpenCV).
     *
     * Single Myriad device cannot be shared across multiple processes which uses
     * Inference Engine's Myriad plugin.
     */
    public static void resetMyriadDevice() {
        resetMyriadDevice_0();
    }


    //
    // C++:  String cv::dnn::getInferenceEngineVPUType()
    //

    /**
     * Returns Inference Engine VPU type.
     *
     * See values of {@code CV_DNN_INFERENCE_ENGINE_VPU_TYPE_*} macros.
     * @return automatically generated
     */
    public static String getInferenceEngineVPUType() {
        return getInferenceEngineVPUType_0();
    }


    //
    // C++:  String cv::dnn::getInferenceEngineCPUType()
    //

    /**
     * Returns Inference Engine CPU type.
     *
     * Specify OpenVINO plugin: CPU or ARM.
     * @return automatically generated
     */
    public static String getInferenceEngineCPUType() {
        return getInferenceEngineCPUType_0();
    }


    //
    // C++:  void cv::dnn::releaseHDDLPlugin()
    //

    /**
     * Release a HDDL plugin.
     */
    public static void releaseHDDLPlugin() {
        releaseHDDLPlugin_0();
    }




    // C++:  vector_Target cv::dnn::getAvailableTargets(dnn_Backend be)
    private static native List<Integer> getAvailableTargets_0(int be);

    // C++:  Net cv::dnn::readNetFromTensorflow(String model, String config = String(), int engine = ENGINE_AUTO, vector_String extraOutputs = std::vector<String>())
    private static native long readNetFromTensorflow_0(String model, String config, int engine, List<String> extraOutputs);
    private static native long readNetFromTensorflow_1(String model, String config, int engine);
    private static native long readNetFromTensorflow_2(String model, String config);
    private static native long readNetFromTensorflow_3(String model);

    // C++:  Net cv::dnn::readNetFromTensorflow(vector_uchar bufferModel, vector_uchar bufferConfig = std::vector<uchar>(), int engine = ENGINE_AUTO, vector_String extraOutputs = std::vector<String>())
    private static native long readNetFromTensorflow_4(long bufferModel_mat_nativeObj, long bufferConfig_mat_nativeObj, int engine, List<String> extraOutputs);
    private static native long readNetFromTensorflow_5(long bufferModel_mat_nativeObj, long bufferConfig_mat_nativeObj, int engine);
    private static native long readNetFromTensorflow_6(long bufferModel_mat_nativeObj, long bufferConfig_mat_nativeObj);
    private static native long readNetFromTensorflow_7(long bufferModel_mat_nativeObj);

    // C++:  Net cv::dnn::readNetFromTFLite(String model, int engine = ENGINE_AUTO)
    private static native long readNetFromTFLite_0(String model, int engine);
    private static native long readNetFromTFLite_1(String model);

    // C++:  Net cv::dnn::readNetFromTFLite(vector_uchar bufferModel, int engine = ENGINE_AUTO)
    private static native long readNetFromTFLite_2(long bufferModel_mat_nativeObj, int engine);
    private static native long readNetFromTFLite_3(long bufferModel_mat_nativeObj);

    // C++:  Net cv::dnn::readNet(String model, String config = "", String framework = "", int engine = ENGINE_AUTO)
    private static native long readNet_0(String model, String config, String framework, int engine);
    private static native long readNet_1(String model, String config, String framework);
    private static native long readNet_2(String model, String config);
    private static native long readNet_3(String model);

    // C++:  Net cv::dnn::readNet(String framework, vector_uchar bufferModel, vector_uchar bufferConfig = std::vector<uchar>(), int engine = ENGINE_AUTO)
    private static native long readNet_4(String framework, long bufferModel_mat_nativeObj, long bufferConfig_mat_nativeObj, int engine);
    private static native long readNet_5(String framework, long bufferModel_mat_nativeObj, long bufferConfig_mat_nativeObj);
    private static native long readNet_6(String framework, long bufferModel_mat_nativeObj);

    // C++:  Net cv::dnn::readNetFromModelOptimizer(String xml, String bin = "")
    private static native long readNetFromModelOptimizer_0(String xml, String bin);
    private static native long readNetFromModelOptimizer_1(String xml);

    // C++:  Net cv::dnn::readNetFromModelOptimizer(vector_uchar bufferModelConfig, vector_uchar bufferWeights)
    private static native long readNetFromModelOptimizer_2(long bufferModelConfig_mat_nativeObj, long bufferWeights_mat_nativeObj);

    // C++:  Net cv::dnn::readNetFromONNX(String onnxFile, int engine = ENGINE_AUTO)
    private static native long readNetFromONNX_0(String onnxFile, int engine);
    private static native long readNetFromONNX_1(String onnxFile);

    // C++:  Net cv::dnn::readNetFromONNX(vector_uchar buffer, int engine = ENGINE_AUTO)
    private static native long readNetFromONNX_2(long buffer_mat_nativeObj, int engine);
    private static native long readNetFromONNX_3(long buffer_mat_nativeObj);

    // C++:  Mat cv::dnn::readTensorFromONNX(String path)
    private static native long readTensorFromONNX_0(String path);

    // C++:  Mat cv::dnn::blobFromImage(Mat image, double scalefactor = 1.0, Size size = Size(), Scalar mean = Scalar(), bool swapRB = false, bool crop = false, int ddepth = CV_32F)
    private static native long blobFromImage_0(long image_nativeObj, double scalefactor, double size_width, double size_height, double mean_val0, double mean_val1, double mean_val2, double mean_val3, boolean swapRB, boolean crop, int ddepth);
    private static native long blobFromImage_1(long image_nativeObj, double scalefactor, double size_width, double size_height, double mean_val0, double mean_val1, double mean_val2, double mean_val3, boolean swapRB, boolean crop);
    private static native long blobFromImage_2(long image_nativeObj, double scalefactor, double size_width, double size_height, double mean_val0, double mean_val1, double mean_val2, double mean_val3, boolean swapRB);
    private static native long blobFromImage_3(long image_nativeObj, double scalefactor, double size_width, double size_height, double mean_val0, double mean_val1, double mean_val2, double mean_val3);
    private static native long blobFromImage_4(long image_nativeObj, double scalefactor, double size_width, double size_height);
    private static native long blobFromImage_5(long image_nativeObj, double scalefactor);
    private static native long blobFromImage_6(long image_nativeObj);

    // C++:  Mat cv::dnn::blobFromImages(vector_Mat images, double scalefactor = 1.0, Size size = Size(), Scalar mean = Scalar(), bool swapRB = false, bool crop = false, int ddepth = CV_32F)
    private static native long blobFromImages_0(long images_mat_nativeObj, double scalefactor, double size_width, double size_height, double mean_val0, double mean_val1, double mean_val2, double mean_val3, boolean swapRB, boolean crop, int ddepth);
    private static native long blobFromImages_1(long images_mat_nativeObj, double scalefactor, double size_width, double size_height, double mean_val0, double mean_val1, double mean_val2, double mean_val3, boolean swapRB, boolean crop);
    private static native long blobFromImages_2(long images_mat_nativeObj, double scalefactor, double size_width, double size_height, double mean_val0, double mean_val1, double mean_val2, double mean_val3, boolean swapRB);
    private static native long blobFromImages_3(long images_mat_nativeObj, double scalefactor, double size_width, double size_height, double mean_val0, double mean_val1, double mean_val2, double mean_val3);
    private static native long blobFromImages_4(long images_mat_nativeObj, double scalefactor, double size_width, double size_height);
    private static native long blobFromImages_5(long images_mat_nativeObj, double scalefactor);
    private static native long blobFromImages_6(long images_mat_nativeObj);

    // C++:  Mat cv::dnn::blobFromImageWithParams(Mat image, Image2BlobParams param = Image2BlobParams())
    private static native long blobFromImageWithParams_0(long image_nativeObj, long param_nativeObj);
    private static native long blobFromImageWithParams_1(long image_nativeObj);

    // C++:  void cv::dnn::blobFromImageWithParams(Mat image, Mat& blob, Image2BlobParams param = Image2BlobParams())
    private static native void blobFromImageWithParams_2(long image_nativeObj, long blob_nativeObj, long param_nativeObj);
    private static native void blobFromImageWithParams_3(long image_nativeObj, long blob_nativeObj);

    // C++:  Mat cv::dnn::blobFromImagesWithParams(vector_Mat images, Image2BlobParams param = Image2BlobParams())
    private static native long blobFromImagesWithParams_0(long images_mat_nativeObj, long param_nativeObj);
    private static native long blobFromImagesWithParams_1(long images_mat_nativeObj);

    // C++:  void cv::dnn::blobFromImagesWithParams(vector_Mat images, Mat& blob, Image2BlobParams param = Image2BlobParams())
    private static native void blobFromImagesWithParams_2(long images_mat_nativeObj, long blob_nativeObj, long param_nativeObj);
    private static native void blobFromImagesWithParams_3(long images_mat_nativeObj, long blob_nativeObj);

    // C++:  void cv::dnn::imagesFromBlob(Mat blob_, vector_Mat& images_)
    private static native void imagesFromBlob_0(long blob__nativeObj, long images__mat_nativeObj);

    // C++:  void cv::dnn::writeTextGraph(String model, String output)
    private static native void writeTextGraph_0(String model, String output);

    // C++:  void cv::dnn::NMSBoxes(vector_Rect2d bboxes, vector_float scores, float score_threshold, float nms_threshold, vector_int& indices, float eta = 1.f, int top_k = 0)
    private static native void NMSBoxes_0(long bboxes_mat_nativeObj, long scores_mat_nativeObj, float score_threshold, float nms_threshold, long indices_mat_nativeObj, float eta, int top_k);
    private static native void NMSBoxes_1(long bboxes_mat_nativeObj, long scores_mat_nativeObj, float score_threshold, float nms_threshold, long indices_mat_nativeObj, float eta);
    private static native void NMSBoxes_2(long bboxes_mat_nativeObj, long scores_mat_nativeObj, float score_threshold, float nms_threshold, long indices_mat_nativeObj);

    // C++:  void cv::dnn::NMSBoxes(vector_RotatedRect bboxes, vector_float scores, float score_threshold, float nms_threshold, vector_int& indices, float eta = 1.f, int top_k = 0)
    private static native void NMSBoxesRotated_0(long bboxes_mat_nativeObj, long scores_mat_nativeObj, float score_threshold, float nms_threshold, long indices_mat_nativeObj, float eta, int top_k);
    private static native void NMSBoxesRotated_1(long bboxes_mat_nativeObj, long scores_mat_nativeObj, float score_threshold, float nms_threshold, long indices_mat_nativeObj, float eta);
    private static native void NMSBoxesRotated_2(long bboxes_mat_nativeObj, long scores_mat_nativeObj, float score_threshold, float nms_threshold, long indices_mat_nativeObj);

    // C++:  void cv::dnn::NMSBoxesBatched(vector_Rect2d bboxes, vector_float scores, vector_int class_ids, float score_threshold, float nms_threshold, vector_int& indices, float eta = 1.f, int top_k = 0)
    private static native void NMSBoxesBatched_0(long bboxes_mat_nativeObj, long scores_mat_nativeObj, long class_ids_mat_nativeObj, float score_threshold, float nms_threshold, long indices_mat_nativeObj, float eta, int top_k);
    private static native void NMSBoxesBatched_1(long bboxes_mat_nativeObj, long scores_mat_nativeObj, long class_ids_mat_nativeObj, float score_threshold, float nms_threshold, long indices_mat_nativeObj, float eta);
    private static native void NMSBoxesBatched_2(long bboxes_mat_nativeObj, long scores_mat_nativeObj, long class_ids_mat_nativeObj, float score_threshold, float nms_threshold, long indices_mat_nativeObj);

    // C++:  void cv::dnn::softNMSBoxes(vector_Rect bboxes, vector_float scores, vector_float& updated_scores, float score_threshold, float nms_threshold, vector_int& indices, size_t top_k = 0, float sigma = 0.5, SoftNMSMethod method = SoftNMSMethod::SOFTNMS_GAUSSIAN)
    private static native void softNMSBoxes_0(long bboxes_mat_nativeObj, long scores_mat_nativeObj, long updated_scores_mat_nativeObj, float score_threshold, float nms_threshold, long indices_mat_nativeObj, long top_k, float sigma);
    private static native void softNMSBoxes_2(long bboxes_mat_nativeObj, long scores_mat_nativeObj, long updated_scores_mat_nativeObj, float score_threshold, float nms_threshold, long indices_mat_nativeObj, long top_k);
    private static native void softNMSBoxes_3(long bboxes_mat_nativeObj, long scores_mat_nativeObj, long updated_scores_mat_nativeObj, float score_threshold, float nms_threshold, long indices_mat_nativeObj);

    // C++:  String cv::dnn::getInferenceEngineBackendType()
    private static native String getInferenceEngineBackendType_0();

    // C++:  String cv::dnn::setInferenceEngineBackendType(String newBackendType)
    private static native String setInferenceEngineBackendType_0(String newBackendType);

    // C++:  void cv::dnn::resetMyriadDevice()
    private static native void resetMyriadDevice_0();

    // C++:  String cv::dnn::getInferenceEngineVPUType()
    private static native String getInferenceEngineVPUType_0();

    // C++:  String cv::dnn::getInferenceEngineCPUType()
    private static native String getInferenceEngineCPUType_0();

    // C++:  void cv::dnn::releaseHDDLPlugin()
    private static native void releaseHDDLPlugin_0();

}
