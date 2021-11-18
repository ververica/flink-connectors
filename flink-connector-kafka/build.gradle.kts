
plugins {
    java
    `maven-publish`
}

repositories {
    mavenLocal()
    maven {
        url = uri("https://repository.apache.org/snapshots")
    }

    maven {
        url = uri("https://repo.maven.apache.org/maven2/")
    }
}

dependencies {
    implementation("org.apache.flink:flink-shaded-force-shading:14.0")
    implementation("org.slf4j:slf4j-api:1.7.15")
    implementation("com.google.code.findbugs:jsr305:1.3.9")
    implementation("org.apache.flink:flink-shaded-force-shading:14.0")
    implementation("org.apache.flink:flink-connector-base:1.15-SNAPSHOT")
    implementation("org.apache.kafka:kafka-clients:2.8.1")
    implementation("org.apache.flink:flink-shaded-force-shading:14.0")
    testImplementation("org.junit.jupiter:junit-jupiter:5.7.2")
    testImplementation("org.junit.vintage:junit-vintage-engine:5.7.2")
    testImplementation("org.mockito:mockito-core:2.21.0")
    testImplementation("org.powermock:powermock-module-junit4:2.0.9")
    testImplementation("org.powermock:powermock-api-mockito2:2.0.9")
    testImplementation("org.hamcrest:hamcrest-all:1.3")
    testImplementation("org.testcontainers:junit-jupiter:1.16.2")
    testImplementation("org.apache.logging.log4j:log4j-slf4j-impl:2.14.1")
    testImplementation("org.apache.logging.log4j:log4j-api:2.14.1")
    testImplementation("org.apache.logging.log4j:log4j-core:2.14.1")
    testImplementation("org.apache.logging.log4j:log4j-1.2-api:2.14.1")
    testImplementation("org.apache.flink:flink-test-utils-junit:1.15-SNAPSHOT")
    testImplementation("org.junit.jupiter:junit-jupiter:5.7.2")
    testImplementation("org.junit.vintage:junit-vintage-engine:5.7.2")
    testImplementation("org.mockito:mockito-core:2.21.0")
    testImplementation("org.powermock:powermock-module-junit4:2.0.9")
    testImplementation("org.powermock:powermock-api-mockito2:2.0.9")
    testImplementation("org.hamcrest:hamcrest-all:1.3")
    testImplementation("org.testcontainers:junit-jupiter:1.16.2")
    testImplementation("org.apache.logging.log4j:log4j-slf4j-impl:2.14.1")
    testImplementation("org.apache.logging.log4j:log4j-api:2.14.1")
    testImplementation("org.apache.logging.log4j:log4j-core:2.14.1")
    testImplementation("org.apache.logging.log4j:log4j-1.2-api:2.14.1")
    testImplementation("org.apache.flink:flink-core:1.15-SNAPSHOT") {
        artifact {
            name = "flink-core"
            extension = "jar"
            type ="test-jar"
            classifier = "tests"
        }
    }
    testImplementation("org.apache.flink:flink-tests:1.15-SNAPSHOT") {
        artifact {
            name = "flink-tests"
            extension = "jar"
            type ="test-jar"
            classifier = "tests"
        }
    }
    //testImplementation("org.apache.flink:flink-streaming-java:test:1.15-SNAPSHOT")
    testImplementation("org.apache.flink:flink-streaming-java:1.15-SNAPSHOT") {
        artifact {
            name = "flink-streaming-java"
            extension = "jar"
            type ="test-jar"
            classifier = "tests"
        }
    }
    testImplementation("org.apache.kafka:kafka_2.12:2.8.1")
    testImplementation("org.apache.zookeeper:zookeeper:3.5.9")
    testImplementation("org.testcontainers:kafka:1.16.2")
    testImplementation("org.testcontainers:junit-jupiter:1.16.2")
    testImplementation("org.apache.flink:flink-tests:1.15-SNAPSHOT")
    testImplementation("org.apache.flink:flink-test-utils:1.15-SNAPSHOT")
    testImplementation("org.apache.flink:flink-end-to-end-tests-common:1.15-SNAPSHOT")
    testImplementation("org.apache.flink:flink-connector-test-utils:1.15-SNAPSHOT")
    testImplementation("org.apache.flink:flink-runtime:1.15-SNAPSHOT")
    testImplementation("org.apache.flink:flink-metrics-jmx:1.15-SNAPSHOT")
    testImplementation("org.apache.flink:flink-table-common:1.15-SNAPSHOT") {
        artifact {
            name = "flink-table-common"
            extension = "jar"
            type ="test-jar"
            classifier = "tests"
        }
    }
    testImplementation("org.apache.flink:flink-table-planner_2.12:1.15-SNAPSHOT") {
        artifact {
            name = "flink-table-planner_2.12"
            extension = "jar"
            type ="test-jar"
            classifier = "tests"
        }
    }
    testImplementation("org.apache.flink:flink-json:1.15-SNAPSHOT")
    testImplementation("org.apache.flink:flink-avro:1.15-SNAPSHOT")
    testImplementation("org.apache.flink:flink-avro-confluent-registry:1.15-SNAPSHOT")
    testImplementation("org.apache.flink:flink-csv:1.15-SNAPSHOT")
    testImplementation("org.apache.flink:flink-connector-testing:1.15-SNAPSHOT")
    testImplementation("org.apache.flink:flink-test-utils-junit:1.15-SNAPSHOT")
    testImplementation("org.junit.jupiter:junit-jupiter:5.7.2")
    testImplementation("org.junit.vintage:junit-vintage-engine:5.7.2")
    testImplementation("org.mockito:mockito-core:2.21.0")
    testImplementation("org.powermock:powermock-module-junit4:2.0.9")
    testImplementation("org.powermock:powermock-api-mockito2:2.0.9")
    testImplementation("org.hamcrest:hamcrest-all:1.3")
    testImplementation("org.apache.logging.log4j:log4j-slf4j-impl:2.14.1")
    testImplementation("org.apache.logging.log4j:log4j-api:2.14.1")
    testImplementation("org.apache.logging.log4j:log4j-core:2.14.1")
    testImplementation("org.apache.logging.log4j:log4j-1.2-api:2.14.1")
    compileOnly("org.slf4j:slf4j-api:1.7.15")
    compileOnly("com.google.code.findbugs:jsr305:1.3.9")
    compileOnly("org.apache.flink:flink-streaming-java:1.15-SNAPSHOT")
    compileOnly("org.apache.flink:flink-table-api-java-bridge:1.15-SNAPSHOT")
    compileOnly("org.slf4j:slf4j-api:1.7.15")
    compileOnly("com.google.code.findbugs:jsr305:1.3.9")
}

group = "org.apache.flink"
version = "1.15-SNAPSHOT"
description = "Flink : Connectors : Kafka"

val testsJar by tasks.registering(Jar::class) {
    archiveClassifier.set("tests")
    from(sourceSets["test"].output)
}

publishing {
    publications.create<MavenPublication>("maven") {
        from(components["java"])
        artifact(testsJar)
    }
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
}
