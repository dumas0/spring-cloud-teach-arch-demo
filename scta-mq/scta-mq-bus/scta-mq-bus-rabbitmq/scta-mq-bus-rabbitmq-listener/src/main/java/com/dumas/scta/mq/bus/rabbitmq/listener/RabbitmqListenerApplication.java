package com.dumas.scta.mq.bus.rabbitmq.listener;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.bus.jackson.RemoteApplicationEventScan;

/**
 * @author dumas
 * @date 2022/05/19 5:29 PM
 */
@SpringBootApplication
@RemoteApplicationEventScan
public class RabbitmqListenerApplication {
    public static void main(String[] args) {
        SpringApplication.run(RabbitmqListenerApplication.class, args);
    }
}
