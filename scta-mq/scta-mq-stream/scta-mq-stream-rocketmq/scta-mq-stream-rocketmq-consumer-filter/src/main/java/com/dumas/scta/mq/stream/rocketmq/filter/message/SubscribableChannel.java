package com.dumas.scta.mq.stream.rocketmq.filter.message;

import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHandler;

/**
 * @author dumas
 * @desc TODO
 * @date 2022/05/04 22:06
 */
public interface SubscribableChannel extends MessageChannel {
    /**
     * 订阅
     * @param handler
     * @return
     */
    boolean subscribe(MessageHandler handler);

    /**
     * 取消订阅
     * @param handler
     * @return
     */
    boolean unsubscribe(MessageHandler handler);
}
