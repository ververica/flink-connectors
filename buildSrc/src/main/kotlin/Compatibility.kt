import org.gradle.api.Project

enum class FlinkVersion {
    FLINK_1_11, FLINK_1_12, FLINK_1_13
}

/**
 * Just a sketch on how we express compatibility
 */
fun Project.compatibleTo(vararg versions: FlinkVersion): Unit {
    // TODO:
}