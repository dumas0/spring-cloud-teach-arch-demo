package com.dumas.scta.mq.stream.rocketmq.broadcast.listener;

import com.dumas.scta.mq.stream.rocketmq.broadcast.message.Demo01Message;
import com.dumas.scta.mq.stream.rocketmq.broadcast.message.MySink;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

/**
 * @author dumas
 * @desc TODO
 * @date 2022/05/04 22:08
 */
@Component
public class Demo01Consumer {
    private Logger logger = LoggerFactory.getLogger(Demo01Consumer.class);

    @StreamListener(MySink.DEMO01_INPUT)
    public void onMessage(@Payload Demo01Message message) {
        logger.info("[onMessage][线程编号:{} 消息内容：{}]", Thread.currentThread().getId(), message);
    }
}
