package com.dumas.scta.mq.stream.kafka.consumer.transaction;

import com.dumas.scta.mq.stream.kafka.consumer.transaction.message.MySink;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

/**
 * @author dumas
 * @date 2022/05/19 10:46 AM
 */
@EnableBinding(MySink.class)
@SpringBootApplication
public class KafkaConsumerTransactionApplication {
    public static void main(String[] args) {
        SpringApplication.run(KafkaConsumerTransactionApplication.class, args);
    }
}
