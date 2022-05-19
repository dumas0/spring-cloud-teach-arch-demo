package com.dumas.scta.mq.bus.kafka.listener.actuator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.bus.jackson.RemoteApplicationEventScan;

/**
 * @author dumas
 * @date 2022/05/19 5:52 PM
 */
@SpringBootApplication
@RemoteApplicationEventScan
public class KafkaListenerActuatorApplication {
    public static void main(String[] args) {
        SpringApplication.run(KafkaListenerActuatorApplication.class, args);
    }
}
