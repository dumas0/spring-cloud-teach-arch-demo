package com.dumas.scta.mq.stream.rocketmq.transaction.controller;

import com.alibaba.fastjson.JSON;
import com.dumas.scta.mq.stream.rocketmq.transaction.message.Demo01Message;
import com.dumas.scta.mq.stream.rocketmq.transaction.message.MySource;
import lombok.Data;
import lombok.experimental.Accessors;
import org.apache.rocketmq.common.message.MessageConst;
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
 * @desc TODO
 * @date 2022/05/04 21:52
 */
@RestController
@RequestMapping("/demo01")
public class Demo01Controller {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private MySource mySource;

    @GetMapping("/send")
    public boolean send() {
        // <1> 创建 Message
        Demo01Message message = new Demo01Message()
                .setId(new Random().nextInt());
        // <2> 创建 Spring Message 对象
        Message<Demo01Message> springMessage = MessageBuilder.withPayload(message)
                .build();
        // <3> 发送消息
        return mySource.demo01Output().send(springMessage);
    }

    /**
     * 定时消息/延迟消息
     *
     * @return
     */
    @GetMapping("send_delay")
    public boolean sendDelay() {
        // 创建 Message
        Demo01Message message = new Demo01Message()
                .setId(new Random().nextInt());
        // 创建 Spring Message 对象 设置延迟级别为 3，10 秒后消费
        Message<Demo01Message> springMessage = MessageBuilder.withPayload(message)
                .setHeader(MessageConst.PROPERTY_DELAY_TIME_LEVEL, "3")
                .build();
        // 发送消息
        boolean sendResult = mySource.demo01Output().send(springMessage);
        logger.info("[sendDelay][发送消息完成，结果 = {}]", sendResult);
        return sendResult;
    }

    /**
     * 事务消息
     *
     * @return
     */
    @GetMapping("/send_transaction")
    public boolean sendTransaction() {
        // 创建 Message
        Demo01Message message = new Demo01Message()
                .setId(new Random().nextInt());
        // 创建 Spring Message 对象
        Args args = new Args().setArgs1(1).setArgs2("2");
        Message<Demo01Message> springMessage = MessageBuilder.withPayload(message)
                .setHeader("args", JSON.toJSONString(args))
                .build();
        // 发送消息
        return mySource.demo01Output().send(springMessage);
    }

    @Data
    @Accessors(chain = true)
    public static class Args {
        private Integer args1;
        private String args2;
    }
}
