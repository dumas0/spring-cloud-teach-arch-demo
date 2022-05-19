package com.dumas.scta.mq.stream.kafka.consumer.transaction.message;

import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHandler;

/**
 * @author dumas
 * @date 2022/05/19 11:08 AM
 */
public interface SubscribableChannel extends MessageChannel {
    // 订阅
    boolean subscribe(MessageHandler handler);
    // 取消订阅
    boolean unsubscribe(MessageHandler handler);
}
