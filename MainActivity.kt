plugins {
    id 'com.android.application'
    id 'kotlin-android'
}

android {
    compileSdk 34
    defaultConfig {
        applicationId "com.billiard.float50"
        minSdk 26
        targetSdk 34
        versionCode 1
        versionName "1.0"
    }
    buildTypes {
        release {
            minifyEnabled false
        }
    }
    kotlinOptions {
        jvmTarget = '1.8'
    }
}

dependencies {
    implementation 'androidx.core:core-ktx:1.12.0'
}
