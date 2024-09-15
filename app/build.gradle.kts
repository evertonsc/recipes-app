plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.example.recipes"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.yourapp"
        minSdk = 21
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
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.0"
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }

    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    val compose_ui_version = "1.5.0"

    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.compose.material3:material3:1.2.0")
    implementation("androidx.compose.ui:ui:1.4.0") // Certifique-se de usar a versão correta
    implementation("androidx.compose.foundation:foundation:1.4.0")
    implementation("androidx.compose.material:material:1.4.0")

    // Jetpack Compose
    implementation("androidx.compose.ui:ui:$compose_ui_version")
    implementation("androidx.compose.material:material:$compose_ui_version")
    implementation("androidx.compose.ui:ui-tooling-preview:$compose_ui_version")

    // Compose Activity
    implementation("androidx.activity:activity-compose:1.8.0")

    // Navegação no Compose
    implementation("androidx.navigation:navigation-compose:2.7.2")

    // Para adicionar ícones padrão do Material Design
    implementation("androidx.compose.material:material-icons-core:$compose_ui_version")
    implementation("androidx.compose.material:material-icons-extended:$compose_ui_version")

    // Para carregar imagens (como as imagens dos croissants e do perfil do usuário)
    implementation("io.coil-kt:coil-compose:2.4.0")

    // Ferramentas de desenvolvimento para pré-visualização e depuração
    debugImplementation("androidx.compose.ui:ui-tooling:$compose_ui_version")
    debugImplementation("androidx.compose.ui:ui-test-manifest:$compose_ui_version")

    // Para testes
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    androidTestImplementation("androidx.compose.ui:ui-test-junit4:$compose_ui_version")



}
