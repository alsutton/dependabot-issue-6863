buildscript {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

plugins {
    id("com.google.protobuf") version libs.versions.protoPlugin apply false
}
