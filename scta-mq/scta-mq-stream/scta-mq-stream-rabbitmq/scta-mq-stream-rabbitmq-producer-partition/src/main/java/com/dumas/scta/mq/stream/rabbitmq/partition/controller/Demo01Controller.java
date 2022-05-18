package com.dumas.scta.mq.stream.rabbitmq.partition.controller;

import com.dumas.scta.mq.stream.rabbitmq.partition.message.Demo01Message;
import com.dumas.scta.mq.stream.rabbitmq.partition.message.MySource;
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
        int id = new Random().nextInt();
        for (int i = 0; i < 3; i++) {
            Demo01Message message = new Demo01Message().setId(id);
            Message<Demo01Message> springMessage = MessageBuilder.withPayload(message).build();
            mySource.demo01Output().send(springMessage);
        }
        return true;
    }
}
