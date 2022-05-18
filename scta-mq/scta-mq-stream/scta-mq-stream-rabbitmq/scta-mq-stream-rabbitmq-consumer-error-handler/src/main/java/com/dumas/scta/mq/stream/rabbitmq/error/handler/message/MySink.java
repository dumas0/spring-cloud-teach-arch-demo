package com.dumas.scta.mq.stream.rabbitmq.error.handler.message;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 * @author dumas
 * @date 2022/05/18 3:47 PM
 */
public interface MySink {

    String DEMO01_INPUT = "demo01-input";

    @Input(DEMO01_INPUT)
    SubscribableChannel demo01Input();
}
