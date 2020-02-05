//
// Created by jeffreycreswell on 2/5/20.
//

#include "Tests.h"
#include <android/log.h>

bool Tests::runTautologyTest() {
    bool pass = true==true;
    __android_log_print(ANDROID_LOG_DEBUG, "NativeTests", "runTautologyTest %s", (pass?"passed":"failed"));
    return pass;
}
bool Tests::runArithmeticTest() {
    bool pass = 2+2==4;
    __android_log_print(ANDROID_LOG_DEBUG, "NativeTests", "runArithmeticTest %s", (pass?"passed":"failed"));
    return pass;
}

bool Tests::runAllTests() {
    return runArithmeticTest() &&
           runTautologyTest();
}