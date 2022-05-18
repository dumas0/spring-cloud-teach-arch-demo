package com.dumas.scta.mq.stream.rabbitmq.partition;

import com.dumas.scta.mq.stream.rabbitmq.partition.message.MySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

/**
 * @author dumas
 * @date 2022/05/18 3:15 PM
 */
@EnableBinding(MySource.class)
@SpringBootApplication
public class RabbitmqProducerPartitionApplication {
    public static void main(String[] args) {
        SpringApplication.run(RabbitmqProducerPartitionApplication.class, args);
    }
}
