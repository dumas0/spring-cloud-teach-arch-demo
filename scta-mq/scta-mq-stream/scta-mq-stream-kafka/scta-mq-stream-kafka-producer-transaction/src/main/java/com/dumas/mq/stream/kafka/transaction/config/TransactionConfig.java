package com.dumas.mq.stream.kafka.transaction.config;

import org.springframework.cloud.stream.binder.BinderFactory;
import org.springframework.cloud.stream.binder.kafka.KafkaMessageChannelBinder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.transaction.KafkaTransactionManager;
import org.springframework.messaging.MessageChannel;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 创建 KafkaTransactionManager 事务管理器
 *
 * @author dumas
 * @date 2022/05/19 2:51 PM
 */
@Configuration
@EnableTransactionManagement
public class TransactionConfig {

    @Bean
    public PlatformTransactionManager transactionManager(BinderFactory binderFactory) {
        // 获得 Kafka ProducerFactory 对象
        ProducerFactory<byte[], byte[]> pf = ((KafkaMessageChannelBinder) binderFactory.getBinder(null,
                MessageChannel.class)).getTransactionalProducerFactory();
        // 创建 KafkaTransactionManager 事务管理器
        assert pf != null;
        return new KafkaTransactionManager<>(pf);
    }
}
