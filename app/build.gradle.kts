plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.google.gms.google.services)
}

android {
    namespace = "com.example.convox"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.convox"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    implementation(platform("com.google.firebase:firebase-bom:32.7.0"))
    implementation(libs.firebase.firestore)
    implementation("com.google.firebase:firebase-auth")
    implementation("com.hbb20:ccp:2.7.3")

    testImplementation("junit:junit:4.13.2")
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}
