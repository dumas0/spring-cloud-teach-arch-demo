package com.dumas.scta.mq.bus.consul.listener.actuator.listener;

import com.dumas.scta.mq.bus.consul.listener.actuator.event.UserRegisterEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author dumas
 * @date 2022/05/19 4:55 PM
 */
@Component
public class UserRegisterListener implements ApplicationListener<UserRegisterEvent> {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public void onApplicationEvent(UserRegisterEvent event) {
        logger.info("[onApplicationEvent][监听到用户（{}）注册]", event.getUsername());
    }
}
