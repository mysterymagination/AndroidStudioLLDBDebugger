package com.example.nativetests;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;

/**
 * JUnit shim that launches our native unit test suite by crossing JNI into C++ land, where a test suite
 * runs and returns pass/fail status back to Java
 */
@RunWith(AndroidJUnit4.class)
public class NativeTestsLauncher {

    static {
        System.loadLibrary("nativetestsuite");
    }

    @Test
    public void launchNativeTests() {
        assertTrue(runAllNativeTests());
    }

    public static native boolean runAllNativeTests();
}
