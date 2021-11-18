plugins {
    `java-library`
    `kotlin-dsl`
}

val flinkVersion = "1.15-SNAPSHOT"

repositories {
    mavenLocal()
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
    api("org.apache.flink:flink-core:${flinkVersion}")
    compileOnly("org.apache.flink:flink-annotations:${flinkVersion}")
    implementation("org.slf4j:slf4j-api:1.7.15")
    implementation("org.apache.flink:flink-connector-base:${flinkVersion}")
    implementation("org.apache.flink:flink-runtime:${flinkVersion}")
    implementation("org.apache.flink:flink-docs:${flinkVersion}")

}
