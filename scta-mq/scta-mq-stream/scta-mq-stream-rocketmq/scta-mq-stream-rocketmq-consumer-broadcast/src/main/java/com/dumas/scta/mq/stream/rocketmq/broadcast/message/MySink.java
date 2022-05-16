package com.dumas.scta.mq.stream.rocketmq.broadcast.message;

import org.springframework.cloud.stream.annotation.Input;

/**
 * @author dumas
 * @desc TODO
 * @date 2022/05/04 22:05
 */
public interface MySink {
    String DEMO01_INPUT = "demo01-input";

    @Input(DEMO01_INPUT)
    SubscribableChannel demo01Input();
}
