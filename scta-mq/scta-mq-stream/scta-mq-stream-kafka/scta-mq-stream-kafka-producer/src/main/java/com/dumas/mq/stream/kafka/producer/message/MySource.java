package com.dumas.mq.stream.kafka.producer.message;

import org.springframework.cloud.stream.annotation.Output;

/**
 * @author dumas
 * @date 2022/05/19 10:54 AM
 */
public interface MySource {

    @Output("demo01-output")
    MessageChannel demo01Output();
}
