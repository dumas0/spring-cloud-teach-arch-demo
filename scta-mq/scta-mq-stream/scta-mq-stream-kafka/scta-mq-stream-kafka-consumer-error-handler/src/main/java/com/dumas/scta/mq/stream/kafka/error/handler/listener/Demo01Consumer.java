package com.dumas.scta.mq.stream.kafka.error.handler.listener;

import com.dumas.scta.mq.stream.kafka.error.handler.message.Demo01Message;
import com.dumas.scta.mq.stream.kafka.error.handler.message.MySink;
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
 * @date 2022/05/19 11:11 AM
 */
@Component
public class Demo01Consumer {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @StreamListener(MySink.DEMO01_INPUT)
    public void onMessage(@Payload Demo01Message message) {
        logger.info("[onMessage][线程编号:{} 消息内容：{}]", Thread.currentThread().getId(), message);
    }

    /**
     * 局部异常处理
     *
     * @param errorMessage
     */
    @ServiceActivator(inputChannel = "DEMO-TOPIC-01.demo01-consumer-group.errors")
    public void handleError(ErrorMessage errorMessage) {
        logger.error("[handleError][payload：{}]", errorMessage.getPayload().getMessage());
        logger.error("[handleError][originalMessage：{}]", errorMessage.getOriginalMessage());
        logger.error("[handleError][headers：{}]", errorMessage.getHeaders());
    }

    /**
     * 全局异常处理
     *
     * @param errorMessage
     */
    @StreamListener(IntegrationContextUtils.ERROR_CHANNEL_BEAN_NAME)
    public void globalHandleError(ErrorMessage errorMessage) {
        logger.error("[globalHandleError][payload：{}]", errorMessage.getPayload().getMessage());
        logger.error("[globalHandleError][originalMessage：{}]", errorMessage.getOriginalMessage());
        logger.error("[globalHandleError][headers：{}]", errorMessage.getHeaders());
    }
}
