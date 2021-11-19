package org.apache.flink.connector.kafka.configuration;

import org.apache.flink.annotation.docs.Documentation;
import org.apache.flink.configuration.ConfigOption;

import static org.apache.flink.configuration.ConfigOptions.key;

/** The set of configuration options relating to Monitoring settings. */
public class MonitoringOptions {

    public static final String KAFKA_SOURCE_MONITORING = "kafka_source_monitoring";
    public static final String KAFKA_SINK_MONITORING = "kafka_sink_monitoring";

    @Documentation.Section(KAFKA_SOURCE_MONITORING)
    public static final ConfigOption<Long> CURRENT_EMIT_EVENT_TIME_LAG =
            key("currentEmitEventTimeLag")
                    .longType()
                    .defaultValue(200L)
                    .withDeprecatedKeys("deprecated.emitEventTimeLag")
                    .withDescription(
                            "The time span from the record event timestamp to the time "
                                    + "the record is emitted by the source connector¹: "
                                    + "currentEmitEventTimeLag = EmitTime - EventTime.");

    @Documentation.Section(KAFKA_SOURCE_MONITORING)
    public static final ConfigOption<Long> WATERMARK_LAG =
            key("watermarkLag")
                    .longType()
                    .defaultValue(300L)
                    .withDeprecatedKeys("deprecated.watermarkLag")
                    .withDescription(
                            "The time span that the watermark lags "
                                    + "behind the wall clock time: "
                                    + "watermarkLag = CurrentTime - Watermark ");

    @Documentation.Section(KAFKA_SINK_MONITORING)
    public static final ConfigOption<Long> CURRENT_SEND_TIME =
            key("currentSendTime")
                    .longType()
                    .defaultValue(100L)
                    .withDeprecatedKeys("deprecated.sendTime")
                    .withDescription(
                            "The time it takes to send the last record. "
                                    + "This metric is an instantaneous value recorded for the last processed record.");
}
