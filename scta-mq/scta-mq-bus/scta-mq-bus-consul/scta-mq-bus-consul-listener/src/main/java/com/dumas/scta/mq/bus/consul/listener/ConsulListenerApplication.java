package com.dumas.scta.mq.bus.consul.listener;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.bus.jackson.RemoteApplicationEventScan;

/**
 * @author dumas
 * @desc TODO
 * @date 2022/05/19 22:41
 */
@SpringBootApplication
@RemoteApplicationEventScan
public class ConsulListenerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsulListenerApplication.class, args);
    }
}
