package com.dumas.scta.mq.stream.rabbitmq.consumer;

import com.dumas.scta.mq.stream.rabbitmq.consumer.message.MySink;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

/**
 * @author dumas
 * @date 2022/05/18 3:33 PM
 */
@EnableBinding(MySink.class)
@SpringBootApplication
public class RabbitmqConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(RabbitmqConsumerApplication.class, args);
    }
}
