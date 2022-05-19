package com.dumas.scta.bus.mq.kafka.listener;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.bus.jackson.RemoteApplicationEventScan;

/**
 * @author dumas
 * @date 2022/05/19 5:49 PM
 */
@SpringBootApplication
@RemoteApplicationEventScan
public class KafkaListenerApplication {
    public static void main(String[] args) {
        SpringApplication.run(KafkaListenerApplication.class, args);
    }
}
