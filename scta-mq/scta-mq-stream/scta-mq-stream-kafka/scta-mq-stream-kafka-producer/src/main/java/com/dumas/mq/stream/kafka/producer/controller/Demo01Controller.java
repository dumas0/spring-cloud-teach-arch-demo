package com.dumas.mq.stream.kafka.producer.controller;

import com.dumas.mq.stream.kafka.producer.message.Demo01Message;
import com.dumas.mq.stream.kafka.producer.message.MySource;
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
    @Autowired
    private MySource mySource;

    @GetMapping("/send")
    public boolean send() {
        Demo01Message message = new Demo01Message().setId(new Random().nextInt());
        Message<Demo01Message> springMessage = MessageBuilder.withPayload(message).build();
        return mySource.demo01Output().send(springMessage);
    }
}
