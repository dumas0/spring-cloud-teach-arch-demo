package com.dumas.scta.mq.stream.rocketmq.consumer.error.handler;

import com.dumas.scta.mq.stream.rocketmq.consumer.error.handler.message.MySink;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

/**
 * @author dumas
 * @date 2022/05/16 3:01 PM
 */
@EnableBinding(MySink.class)
@SpringBootApplication
public class RocketmqConsumerErrorHandlerApplication {
    public static void main(String[] args) {
        SpringApplication.run(RocketmqConsumerErrorHandlerApplication.class, args);
    }
}
