package com.dumas.scta.mq.stream.rocketmq.producer.transaction;

import com.dumas.scta.mq.stream.rocketmq.producer.transaction.message.MySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

/**
 * @author dumas
 * @desc TODO
 * @date 2022/05/04 11:04
 */
@EnableBinding(MySource.class)
@SpringBootApplication
public class RocketmqProducerTransactionApplication {
    public static void main(String[] args) {
        SpringApplication.run(RocketmqProducerTransactionApplication.class, args);
    }
}
