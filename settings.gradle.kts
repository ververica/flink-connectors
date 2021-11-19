pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
        // needed for avro plugin
        maven(url = "https://dl.bintray.com/gradle/gradle-plugins") {
            name = "JCenter Gradle Plugins"
        }
    }
}

plugins {
    id("com.gradle.enterprise") version "3.7.2" apply false
}

if (!gradle.startParameter.isOffline) {
    apply(plugin = "com.gradle.enterprise")
}

rootProject.name = "flink-connectors"
include(":flink-connector-kafka")
include(":genDocs")