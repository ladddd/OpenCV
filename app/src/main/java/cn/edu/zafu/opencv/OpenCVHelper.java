package cn.edu.zafu.opencv;

import org.opencv.core.Mat;

public class OpenCVHelper {
    static {
        System.loadLibrary("OpenCV");
    }
    public static native int[] gray(int[] buf, int w, int h);

    public static native void detectLines(Mat image, Mat edges, double threshold1, double threshold2);
}
