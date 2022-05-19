package com.dumas.scta.mq.bus.kafka.publisher.event;

import org.springframework.cloud.bus.event.RemoteApplicationEvent;

/**
 * 用户注册事件
 * @author dumas
 * @date 2022/05/19 4:40 PM
 */
public class UserRegisterEvent extends RemoteApplicationEvent {
    /**
     * 用户名
     */
    private String username;

    public UserRegisterEvent() {
    }

    public UserRegisterEvent(Object source, String originService, String destinationService, String username) {
        super(source, originService);
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}
