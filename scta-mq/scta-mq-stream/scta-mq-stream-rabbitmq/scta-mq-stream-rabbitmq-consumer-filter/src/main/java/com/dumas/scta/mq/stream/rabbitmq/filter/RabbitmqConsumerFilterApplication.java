package com.dumas.scta.mq.stream.rabbitmq.filter;

import com.dumas.scta.mq.stream.rabbitmq.filter.message.MySink;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

/**
 * @author dumas
 * @date 2022/05/18 3:33 PM
 */
@EnableBinding(MySink.class)
@SpringBootApplication
public class RabbitmqConsumerFilterApplication {
    public static void main(String[] args) {
        SpringApplication.run(RabbitmqConsumerFilterApplication.class, args);
    }
}
