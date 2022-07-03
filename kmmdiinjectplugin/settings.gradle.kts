pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

rootProject.name = "kmm-di-inject-plugin"
include(":kmm-di-inject-annotation")
include(":kmm-di-inject-gradle")
include(":kmm-di-inject-plugin")
include(":kmm-di-inject-plugin-native")
include(":kmm-di-inject-runtime")