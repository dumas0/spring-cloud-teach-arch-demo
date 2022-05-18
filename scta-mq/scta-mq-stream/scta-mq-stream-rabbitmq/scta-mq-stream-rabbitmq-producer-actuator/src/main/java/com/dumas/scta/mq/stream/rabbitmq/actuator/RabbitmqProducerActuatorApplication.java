package com.dumas.scta.mq.stream.rabbitmq.actuator;

import com.dumas.scta.mq.stream.rabbitmq.actuator.message.MySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

/**
 * @author dumas
 * @date 2022/05/18 3:15 PM
 */
@EnableBinding(MySource.class)
@SpringBootApplication
public class RabbitmqProducerActuatorApplication {
    public static void main(String[] args) {
        SpringApplication.run(RabbitmqProducerActuatorApplication.class, args);
    }
}
