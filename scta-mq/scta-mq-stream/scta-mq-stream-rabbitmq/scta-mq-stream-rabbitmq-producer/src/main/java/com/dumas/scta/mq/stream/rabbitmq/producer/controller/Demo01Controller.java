package com.dumas.scta.mq.stream.rabbitmq.producer.controller;

import com.dumas.scta.mq.stream.rabbitmq.producer.message.Demo01Message;
import com.dumas.scta.mq.stream.rabbitmq.producer.message.MySource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * @author dumas
 * @date 2022/05/18 3:28 PM
 */
@RestController
@RequestMapping("/demo01")
public class Demo01Controller {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private MySource mySource;

    @GetMapping("/send")
    public boolean send() {
        Demo01Message message = new Demo01Message().setId(new Random().nextInt());
        Message<Demo01Message> springMessage = MessageBuilder.withPayload(message).build();
        boolean result = mySource.demo01Output().send(springMessage);
        logger.info("[send][发送编号：[{}] 发送成功]", message.getId());
        return result;
    }

    @GetMapping("/send_tag")
    public boolean sendTag() {
        for (String tag : new String[]{"dumas", "du", "dum"}) {
            // 创建 Message
            Demo01Message message = new Demo01Message()
                    .setId(new Random().nextInt());
            // 创建 Spring Message 对象
            Message<Demo01Message> springMessage = MessageBuilder.withPayload(message)
                    .setHeader("tag", tag)
                    .build();
            // 发送消息
            mySource.demo01Output().send(springMessage);
        }
        return true;
    }
}
