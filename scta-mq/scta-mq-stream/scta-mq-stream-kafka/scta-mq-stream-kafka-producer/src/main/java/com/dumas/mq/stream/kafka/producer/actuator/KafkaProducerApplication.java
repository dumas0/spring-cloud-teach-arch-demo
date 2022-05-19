package com.dumas.mq.stream.kafka.producer.actuator;

import com.dumas.mq.stream.kafka.producer.actuator.message.MySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

/**
 * @author dumas
 * @date 2022/05/19 10:48 AM
 */
@SpringBootApplication
@EnableBinding(MySource.class)
public class KafkaProducerApplication {
    public static void main(String[] args) {
        SpringApplication.run(KafkaProducerApplication.class, args);
    }
}
