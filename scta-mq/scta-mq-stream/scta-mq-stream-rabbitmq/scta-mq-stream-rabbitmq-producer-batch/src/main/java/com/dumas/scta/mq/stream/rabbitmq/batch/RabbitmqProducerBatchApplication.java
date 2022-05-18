package com.dumas.scta.mq.stream.rabbitmq.batch;

import com.dumas.scta.mq.stream.rabbitmq.batch.message.MySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

/**
 * @author dumas
 * @date 2022/05/18 3:15 PM
 */
@EnableBinding(MySource.class)
@SpringBootApplication
public class RabbitmqProducerBatchApplication {
    public static void main(String[] args) {
        SpringApplication.run(RabbitmqProducerBatchApplication.class, args);
    }
}
