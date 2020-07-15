package com.cultivation.javaBasic.showYourIntelligence;


public class StackFrameHelper {
    public static String getCurrentMethodName() {
        // TODO: please modify the following code to pass the test
        // <--start
        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
        return stackTraceElement[2].getClassName() + "." + stackTraceElement[2].getMethodName();
        // --end-->
    }
}
