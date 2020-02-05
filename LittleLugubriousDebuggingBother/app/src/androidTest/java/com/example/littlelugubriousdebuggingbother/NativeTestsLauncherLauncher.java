package com.example.littlelugubriousdebuggingbother;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import com.example.nativetests.NativeTestsLauncher;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * JUnit shim to launch the JUnit shim that launches our native unit tests... *sigh*
 */
@RunWith(AndroidJUnit4.class)
public class NativeTestsLauncherLauncher {
    NativeTestsLauncher launcher = new NativeTestsLauncher();
    @Test
    public void launchNativeTestsFromAppModule() {
        launcher.launchNativeTests();
    }
}
