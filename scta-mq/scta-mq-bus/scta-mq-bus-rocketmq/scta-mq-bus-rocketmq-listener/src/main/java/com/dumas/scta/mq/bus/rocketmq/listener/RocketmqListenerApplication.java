package com.dumas.scta.mq.bus.rocketmq.listener;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.bus.jackson.RemoteApplicationEventScan;

/**
 * @author dumas
 * @date 2022/05/19 4:52 PM
 */
@SpringBootApplication
@RemoteApplicationEventScan
public class RocketmqListenerApplication {
    public static void main(String[] args) {
        SpringApplication.run(RocketmqListenerApplication.class, args);
    }
}
