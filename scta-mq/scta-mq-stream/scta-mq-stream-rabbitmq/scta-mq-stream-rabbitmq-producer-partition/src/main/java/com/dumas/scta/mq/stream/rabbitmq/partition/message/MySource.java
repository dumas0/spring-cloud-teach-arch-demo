package com.dumas.scta.mq.stream.rabbitmq.partition.message;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * @author dumas
 * @date 2022/05/18 3:23 PM
 */
public interface MySource {

    @Output("demo01-output")
    MessageChannel demo01Output();
}
