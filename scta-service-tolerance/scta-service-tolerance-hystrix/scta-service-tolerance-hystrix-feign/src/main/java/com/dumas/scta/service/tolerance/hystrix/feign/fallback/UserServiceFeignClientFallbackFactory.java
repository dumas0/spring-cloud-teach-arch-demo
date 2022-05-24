package com.dumas.scta.service.tolerance.hystrix.feign.fallback;

import com.dumas.scta.service.tolerance.hystrix.feign.feign.UserServiceFeignClient;
import org.apache.commons.lang.exception.ExceptionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @author dumas
 * @date 2022/05/24 11:14 AM
 */
@Component
public class UserServiceFeignClientFallbackFactory implements FallbackFactory<UserServiceFeignClient> {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public UserServiceFeignClient create(Throwable cause) {
        return new UserServiceFeignClient() {
            @Override
            public String getUser(Integer id) {
                logger.info("[getUserFallback][id({}) exception({})]", id, ExceptionUtils.getRootCauseMessage(cause));
                return "mock:User:" + id;
            }
        };
    }
}
