package com.dumas.scta.mq.stream.kafka.consumer.ack;

import com.dumas.scta.mq.stream.kafka.consumer.ack.message.MySink;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

/**
 * @author dumas
 * @date 2022/05/19 10:46 AM
 */
@EnableBinding(MySink.class)
@SpringBootApplication
public class KafkaConsumerAckApplication {
    public static void main(String[] args) {
        SpringApplication.run(KafkaConsumerAckApplication.class, args);
    }
}
