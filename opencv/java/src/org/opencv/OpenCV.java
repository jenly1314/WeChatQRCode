package org.opencv;

import android.content.Context;
import android.util.Log;

import org.opencv.android.BaseLoaderCallback;
import org.opencv.android.LoaderCallbackInterface;
import org.opencv.android.OpenCVLoader;

/**
 * OpenCV
 *
 * @author <a href="mailto:jenly1314@gmail.com">Jenly</a>
 */
public final class OpenCV {

    private static final String TAG = "OpenCV";

    private OpenCV() {
        throw new AssertionError();
    }

    /**
     * 初始化 OpenCV
     *
     * @param context
     */
    public static void initAsync(Context context) {
        LoaderCallbackInterface loaderCallback = new BaseLoaderCallback(context) {
            @Override
            public void onManagerConnected(int status) {
                super.onManagerConnected(status);
                Log.i(TAG, "onManagerConnected:" + status);
                if (status == SUCCESS) {
                    Log.i(TAG, "OpenCV loaded successfully");
                }
            }
        };
        if (!OpenCVLoader.initDebug()) {
            Log.d(TAG, "Internal OpenCV library not found. Using OpenCV Manager for initialization");
            OpenCVLoader.initAsync(OpenCVLoader.OPENCV_VERSION, context, loaderCallback);
        } else {
            Log.d(TAG, "OpenCV library found inside package. Using it!");
            loaderCallback.onManagerConnected(LoaderCallbackInterface.SUCCESS);
        }

    }

}
