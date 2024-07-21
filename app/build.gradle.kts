plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
    id ("kotlin-kapt")
    id ("com.google.dagger.hilt.android")
    id("dagger.hilt.android.plugin")
}

android {
    namespace = "com.example.appbuildingguide"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.appbuildingguide"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)

    //Compose Navigation
    implementation(libs.navigation.compose)

    //Retrofit
    implementation(libs.retrofit)
    implementation(libs.retrofit.converter.gson)
    implementation(libs.okhttp)
    implementation(libs.okhttp.logging.interceptor)

    //Room
    implementation(libs.androidx.room.runtime)
    implementation(libs.androidx.room.ktx)

    //Dagger Hilt
    implementation(libs.hilt.android)
    kapt(libs.hilt.compiler)
    kapt(libs.room.compiler)
    implementation(libs.hilt.android.v242)
    kapt(libs.hilt.compiler.v242)

    //Pager
    implementation(libs.accompanist.pager)

    //Coil
    implementation(libs.coil.compose)

    //Datastore
    implementation(libs.androidx.datastore.preferences)

    //Compose Foundation
    implementation(libs.androidx.foundation)

    //Accompanist
    implementation (libs.accompanist.systemuicontroller)



    implementation(libs.androidxComposeUi)
    implementation(libs.androidxComposeMaterial3)
    implementation(libs.androidxNavigationCompose)
    implementation(libs.androidxHiltNavigationCompose)
    implementation(libs.daggerHiltAndroid)
    kapt(libs.daggerHiltCompiler)
}

kapt {
    correctErrorTypes = true
}