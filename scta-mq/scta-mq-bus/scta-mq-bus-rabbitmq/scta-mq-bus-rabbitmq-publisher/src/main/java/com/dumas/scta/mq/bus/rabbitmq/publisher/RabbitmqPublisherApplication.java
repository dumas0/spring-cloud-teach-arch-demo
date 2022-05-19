package com.dumas.scta.mq.bus.rabbitmq.publisher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author dumas
 * @date 2022/05/19 5:27 PM
 */
@SpringBootApplication
public class RabbitmqPublisherApplication {
    public static void main(String[] args) {
        SpringApplication.run(RabbitmqPublisherApplication.class, args);
    }
}
