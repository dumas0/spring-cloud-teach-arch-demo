package com.dumas.mq.stream.kafka.producer.actuator.message;

import org.springframework.messaging.Message;

/**
 * @author dumas
 * @date 2022/05/19 10:56 AM
 */
@FunctionalInterface
public interface MessageChannel {
    long INDEFINITE_TIMEOUR = -1;

    default boolean send(Message<?> message) {
        return send(message, INDEFINITE_TIMEOUR);
    }

    boolean send(Message<?> message, long timeout);
}
