/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.cl.slack.audio_foreign.opensl_example;

public class opensl_exampleJNI {

    static {
        try {
            System.loadLibrary("opensl_audio");
        } catch (UnsatisfiedLinkError e) {
            System.err.println("native code library failed to load.\n" + e);
            System.exit(1);
        }
    }

    public final static native void start_process();

    public final static native void stop_process();
}