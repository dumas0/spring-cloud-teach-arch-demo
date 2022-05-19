package com.dumas.scta.mq.bus.consul.publisher.handler;

import com.ecwid.consul.v1.ConsulClient;
import com.ecwid.consul.v1.QueryParams;
import com.ecwid.consul.v1.Response;
import com.ecwid.consul.v1.event.model.Event;
import com.ecwid.consul.v1.event.model.EventParams;
import com.sun.org.apache.xpath.internal.operations.String;
import org.springframework.integration.handler.AbstractMessageHandler;
import org.springframework.messaging.Message;

/**
 * @author dumas
 * @desc TODO
 * @date 2022/05/19 22:52
 */
public class ConsulSendingHandler extends AbstractMessageHandler {

    private final ConsulClient consulClient;

    private final String eventName;

    public ConsulSendingHandler(ConsulClient consulClient, String eventName) {
        this.consulClient = consulClient;
        this.eventName = eventName;
    }

    @Override
    protected void handleMessageInternal(Message<?> message) {
        if(this.logger.isTraceEnabled()){
            this.logger.trace("Publishing message" + message);
        }
        // 转换成 String
        Object payload = message.getPayload();
        if(payload instanceof byte[]){
            //payload = new String((byte[])payload);
        }

        //Response<Event> event = this.consulClient.eventFire(this.eventName,
        //        (String) payload, new EventParams(), QueryParams.DEFAULT);

    }
}
