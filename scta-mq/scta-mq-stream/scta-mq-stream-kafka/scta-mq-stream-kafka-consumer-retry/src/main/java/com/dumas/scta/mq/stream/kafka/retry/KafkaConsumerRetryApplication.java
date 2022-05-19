package com.dumas.scta.mq.stream.kafka.retry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author dumas
 * @date 2022/05/19 10:46 AM
 */
@SpringBootApplication
public class KafkaConsumerRetryApplication {
    public static void main(String[] args) {
        SpringApplication.run(KafkaConsumerRetryApplication.class, args);
    }
}
