package com.dumas.scta.mq.stream.rocketmq.consumer.retry;

import com.dumas.scta.mq.stream.rocketmq.consumer.retry.message.MySink;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

/**
 * @author dumas
 * @date 2022/05/16 3:01 PM
 */
@EnableBinding(MySink.class)
@SpringBootApplication
public class RocketmqConsumerRetryApplication {
    public static void main(String[] args) {
        SpringApplication.run(RocketmqConsumerRetryApplication.class, args);
    }
}
