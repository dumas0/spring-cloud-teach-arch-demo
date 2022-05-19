package com.dumas.scta.mq.bus.kafka.publisher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author dumas
 * @date 2022/05/19 5:46 PM
 */
@SpringBootApplication
public class KafkaPublisherApplication {
    public static void main(String[] args) {
        SpringApplication.run(KafkaPublisherApplication.class, args);
    }
}
