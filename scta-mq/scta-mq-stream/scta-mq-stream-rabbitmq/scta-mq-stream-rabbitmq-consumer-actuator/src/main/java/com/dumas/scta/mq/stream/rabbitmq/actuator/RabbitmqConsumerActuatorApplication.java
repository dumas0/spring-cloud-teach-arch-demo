package com.dumas.scta.mq.stream.rabbitmq.actuator;

import com.dumas.scta.mq.stream.rabbitmq.actuator.message.MySink;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

/**
 * @author dumas
 * @date 2022/05/18 3:33 PM
 */
@EnableBinding(MySink.class)
@SpringBootApplication
public class RabbitmqConsumerActuatorApplication {
    public static void main(String[] args) {
        SpringApplication.run(RabbitmqConsumerActuatorApplication.class, args);
    }
}
