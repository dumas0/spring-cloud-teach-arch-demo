package com.dumas.scta.mq.stream.rocketmq.aliyun.message;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * @author dumas
 * @desc TODO
 * @date 2022/05/04 21:47
 */
public interface MySource {
    @Output("demo01-output")
    MessageChannel demo01Output();
}
