plugins {
    java
    `maven-publish`
    id("com.diffplug.spotless") version "6.0.0" apply false
    id("com.github.johnrengelman.shadow") version "7.1.0"
}

group = "org.apache.flink.connectors"
version = "1.0.0-SNAPSHOT"

val isCiServer = System.getenv().containsKey("CI")
//if (!gradle.startParameter.isOffline && isCiServer) {
    configure<com.gradle.scan.plugin.BuildScanExtension> {
        termsOfServiceUrl = "https://gradle.com/terms-of-service"
        termsOfServiceAgree = "yes"

        publishAlways()
    }
//}

subprojects {
    apply(plugin = "java-library")
    apply(plugin = "maven-publish")
    apply(plugin = "checkstyle")
    apply(plugin = "com.diffplug.spotless")
    apply(plugin = "com.github.johnrengelman.shadow")

    repositories {
        mavenCentral()
        maven(url = uri("https://repo.maven.apache.org/maven2/"))
        maven(url = uri("https://repository.apache.org/snapshots"))
    }

    java {
        toolchain {
            languageVersion.set(JavaLanguageVersion.of(8))
        }
    }

    dependencies {
        testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
        testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
    }

    tasks.getByName<Test>("test") {
        useJUnitPlatform()
    }

    publishing {
        publications.create<MavenPublication>("maven") {
            from(components["java"])
        }
    }

    tasks.withType<JavaCompile> {
        options.encoding = "UTF-8"
    }

    configure<CheckstyleExtension> {
        toolVersion = "8.14"
    }

    configure<com.diffplug.gradle.spotless.SpotlessExtension> {
        java {
            googleJavaFormat("1.7").aosp()
            // "" refers to all third party dependencies and "\\#" captures the static imports
            importOrder("org.apache.flink","org.apache.flink.shaded","","javax","java","scala","\\#")
            removeUnusedImports()
        }
    }
}

