package com.dumas.scta.mq.stream.rocketmq.actuator;

import com.dumas.scta.mq.stream.rocketmq.actuator.message.MySink;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

/**
 * @author dumas
 * @desc TODO
 * @date 2022/05/04 11:06
 */
@EnableBinding(MySink.class)
@SpringBootApplication
public class RocketmqConsumerActuatorApplication {
    public static void main(String[] args) {
        SpringApplication.run(RocketmqConsumerActuatorApplication.class, args);
    }
}
