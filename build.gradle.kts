buildscript {
    extra.apply {
        set("compose_ui_version", "1.5.0") // Última versão estável do Compose
    }
}

plugins {
    id("com.android.application") version "8.6.0" apply false
    id("com.android.library") version "8.6.0" apply false
    id("org.jetbrains.kotlin.android") version "1.9.0" apply false
}
