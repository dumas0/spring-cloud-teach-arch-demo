package com.dumas.scta.mq.stream.rocketmq.producer.transaction.message;

import org.springframework.messaging.Message;

/**
 * @author dumas
 * @desc TODO
 * @date 2022/05/04 21:48
 */
@FunctionalInterface
public interface MessageChannel {

    long INDEFINITE_TIMEOUT = -1;

    default boolean send(Message<?> message) {
        return send(message, INDEFINITE_TIMEOUT);
    }

    boolean send(Message<?> message, long timeout);

}
