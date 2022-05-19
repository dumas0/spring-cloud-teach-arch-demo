package com.dumas.scta.mq.stream.kafka.consumer.message;

import org.springframework.cloud.stream.annotation.Input;

/**
 * @author dumas
 * @date 2022/05/19 11:07 AM
 */
public interface MySink {
    String DEMO01_INPUT = "demo01-input";

    @Input(DEMO01_INPUT)
    SubscribableChannel demo01Input();
}
