//
// Created by jeffreycreswell on 2/5/20.
//

#include <jni.h>
#include "Tests.h"

extern "C" {

JNIEXPORT jboolean JNICALL
Java_com_example_nativetests_NativeTestsLauncher_runAllNativeTests(JNIEnv *env,
                                                                   jclass callingClazz) {
    Tests testSuite;
    return (jboolean) testSuite.runAllTests();
}

}