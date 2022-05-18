package com.dumas.scta.mq.stream.rabbitmq.batch.message;

import org.springframework.messaging.Message;

/**
 * @author dumas
 * @date 2022/05/18 3:25 PM
 */
@FunctionalInterface
public interface MessageChannel {
    long INDEFINITE_TIMEOUT = -1;

    default boolean send(Message<?> message) {
        return send(message, INDEFINITE_TIMEOUT);
    }

    boolean send(Message<?> message, long timeout);
}
