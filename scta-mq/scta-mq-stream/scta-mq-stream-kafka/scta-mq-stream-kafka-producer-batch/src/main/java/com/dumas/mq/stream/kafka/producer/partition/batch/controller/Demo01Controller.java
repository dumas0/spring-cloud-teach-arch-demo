package com.dumas.mq.stream.kafka.producer.partition.batch.controller;

import com.dumas.mq.stream.kafka.producer.partition.batch.message.Demo01Message;
import com.dumas.mq.stream.kafka.producer.partition.batch.message.MySource;
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
 * @date 2022/05/19 11:00 AM
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
        return mySource.demo01Output().send(springMessage);
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

    @GetMapping("/send_batch")
    public boolean sendBatch() {
        for (int i = 0; i < 3; i++) {
            // 创建 Message
            int id = new Random().nextInt();
            Demo01Message message = new Demo01Message()
                    .setId(id);
            // 创建 Spring Message 对象
            Message<Demo01Message> springMessage = MessageBuilder.withPayload(message)
                    .build();
            // 发送消息
            mySource.demo01Output().send(springMessage);
            logger.info("[send_transaction][发送编号：[{}] 发送成功]", id);
        }
        return true;
    }
}
