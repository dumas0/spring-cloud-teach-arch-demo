package com.dumas.scta.mq.stream.rabbitmq.ack;

import com.dumas.scta.mq.stream.rabbitmq.ack.message.MySink;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

/**
 * @author dumas
 * @date 2022/05/18 3:33 PM
 */
@EnableBinding(MySink.class)
@SpringBootApplication
public class RabbitmqConsumerAckApplication {
    public static void main(String[] args) {
        SpringApplication.run(RabbitmqConsumerAckApplication.class, args);
    }
}
