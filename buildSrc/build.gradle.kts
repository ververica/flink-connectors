plugins {
    `java-library`
    `kotlin-dsl`
}

// val flinkVersion = "1.15-SNAPSHOT"
val flinkVersion = "1.14.0"

repositories {
    mavenCentral()
    maven(url = uri("https://repo.maven.apache.org/maven2/"))
    maven(url = uri("https://repository.apache.org/snapshots"))
}

dependencies {
    // Use JUnit Jupiter for testing.
    testImplementation("org.junit.jupiter:junit-jupiter:5.7.2")

    // This dependency is used by the application.
    implementation("com.google.guava:guava:30.1.1-jre")

    implementation("org.apache.flink:flink-core:${flinkVersion}")
    implementation("org.apache.flink:flink-annotations:${flinkVersion}")
    implementation("org.slf4j:slf4j-api:1.7.15")
    implementation("org.apache.flink:flink-connector-base:${flinkVersion}")
    implementation("org.apache.flink:flink-runtime:${flinkVersion}")
    // implementation(":flink-connector-kafka")
}

tasks.named<Test>("test") {
    // Use JUnit Platform for unit tests.
    useJUnitPlatform()
}
