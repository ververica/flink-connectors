plugins {
    java
}

val scalaVersion = "2.12"
val flinkVersion = "1.14.0"
dependencies {
    compileOnly("com.google.code.findbugs:jsr305:1.3.9")
    compileOnly("org.apache.flink:flink-annotations:${flinkVersion}")
    compileOnly("org.apache.flink:flink-runtime:${flinkVersion}") // for initial checkpoint ID ...
    api("org.apache.kafka:kafka-clients:2.8.1")
    implementation("org.slf4j:slf4j-api:1.7.15")
    implementation("org.apache.flink:flink-connector-base:${flinkVersion}")
    testImplementation("org.apache.flink:flink-connector-testing_${scalaVersion}:${flinkVersion}")
    testImplementation("org.apache.flink:flink-connector-test-utils:${flinkVersion}")
    testImplementation("org.apache.flink:flink-tests:${flinkVersion}:tests")
    testImplementation("org.apache.flink:flink-json:${flinkVersion}")
    testImplementation("org.testcontainers:kafka:1.16.0")
    testImplementation("org.testcontainers:junit-jupiter:1.16.0")
    testImplementation("org.hamcrest:hamcrest-all:1.3")
}

group = "org.apache.flink.connector"
version = "1.0.0"
description = "Flink : Connectors : Kafka"

tasks.create("gen-doc") {
    org.apache.flink.docs.configuration.ConfigOptionsDocGenerator.generate(
        "$rootDir",
        "$rootDir/docs/layouts/shortcodes/generated"
    )
}

tasks.shadowJar {
    archiveBaseName.set(project.name + "-sql")
    archiveClassifier.set("")
    dependencies {
        include(dependency("org.apache.kafka:kafka-clients:2.8.1"))
    }
    relocate("org.apache.kafka", "org.apache.kafka.shaded")
}

tasks.build {
    dependsOn(tasks.shadowJar)
}
