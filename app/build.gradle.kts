plugins {
    id("com.android.application") version "7.2.2"
    kotlin("android") version "1.5.31"
}

android {
    namespace = "com.lhaxre.base"
    compileSdk = 33
    buildToolsVersion = "30.0.3"

    defaultConfig {
        applicationId = "com.lhaxre.base"
        minSdk = 21
        targetSdk = 28
        versionCode = 1
        versionName = "1.0"
    }
}