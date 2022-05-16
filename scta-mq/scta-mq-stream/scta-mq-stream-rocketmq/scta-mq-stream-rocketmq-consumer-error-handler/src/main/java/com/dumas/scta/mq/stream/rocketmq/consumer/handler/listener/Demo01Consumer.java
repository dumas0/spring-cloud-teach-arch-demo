package com.dumas.scta.mq.stream.rocketmq.consumer.handler.listener;

import com.dumas.scta.mq.stream.rocketmq.consumer.handler.message.Demo01Message;
import com.dumas.scta.mq.stream.rocketmq.consumer.handler.message.MySink;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.integration.context.IntegrationContextUtils;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.support.ErrorMessage;
import org.springframework.stereotype.Component;

/**
 * @author dumas
 * @desc TODO
 * @date 2022/05/04 22:08
 */
@Component
public class Demo01Consumer {
    private Logger logger = LoggerFactory.getLogger(Demo01Consumer.class);

    // 对应 DEMO01-consumer-group-DEMO-TOPIC-01
    @StreamListener(MySink.DEMO01_INPUT)
    public void onMessage(@Payload Demo01Message message) {
        logger.info("[onMessage][线程编号:{} 消息内容：{}]", Thread.currentThread().getId(), message);
        // 注意，此处抛出一个 RuntimeException 异常，模拟消费失败
        throw new RuntimeException("模消费失败的异常情况");
    }

    /**
     * 局部错误异常处理
     *
     * @param errorMessage
     */
    @ServiceActivator(inputChannel = "DEMO-TOPIC-01.demo01-consumer-group-DEMO-TOPIC-01.errors")
    public void handleError(ErrorMessage errorMessage) {
        logger.error("[handleError][payload:{}]", ExceptionUtils.getRootCauseMessage(errorMessage.getPayload()));
        logger.error("[handleError][originalMessage:{}]", errorMessage.getOriginalMessage());
        logger.error("[handleError][headers:{}]", errorMessage.getHeaders());
    }

    /**
     * 全局异常处理
     *
     * @param errorMessage
     */
    @StreamListener(IntegrationContextUtils.ERROR_CHANNEL_BEAN_NAME)
    public void globalHandleError(ErrorMessage errorMessage) {
        logger.error("[globalHandleError][payload:{}]", ExceptionUtils.getRootCauseMessage(errorMessage.getPayload()));
        logger.error("[globalHandleError][originalMessage:{}]", errorMessage.getOriginalMessage());
        logger.error("[globalHandleError][headers:{}]", errorMessage.getHeaders());
    }
}
