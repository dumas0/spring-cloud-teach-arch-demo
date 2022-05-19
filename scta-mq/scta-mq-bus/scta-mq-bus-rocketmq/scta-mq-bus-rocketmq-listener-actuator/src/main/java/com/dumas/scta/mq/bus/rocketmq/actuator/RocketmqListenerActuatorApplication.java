package com.dumas.scta.mq.bus.rocketmq.actuator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.bus.jackson.RemoteApplicationEventScan;

/**
 * @author dumas
 * @date 2022/05/19 4:52 PM
 */
@SpringBootApplication
@RemoteApplicationEventScan
public class RocketmqListenerActuatorApplication {
    public static void main(String[] args) {
        SpringApplication.run(RocketmqListenerActuatorApplication.class, args);
    }
}
