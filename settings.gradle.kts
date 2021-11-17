pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
        // needed for avro plugin
        jcenter()
        maven(url = "https://dl.bintray.com/gradle/gradle-plugins") {
            name = "JCenter Gradle Plugins"
        }
    }
}

plugins {
    id("com.gradle.enterprise") version "3.0" apply false
}

if (!gradle.startParameter.isBuildScan) {
    apply(plugin = "com.gradle.enterprise")
}

rootProject.name = "flink-connectors"
include(":kafka")
