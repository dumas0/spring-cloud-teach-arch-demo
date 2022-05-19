package com.dumas.scta.mq.bus.consul.listener.actuator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.bus.jackson.RemoteApplicationEventScan;

/**
 * @author dumas
 * @desc TODO
 * @date 2022/05/19 22:45
 */
@SpringBootApplication
@RemoteApplicationEventScan
public class ConsulListenerActuatorApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsulListenerActuatorApplication.class, args);
    }
}
