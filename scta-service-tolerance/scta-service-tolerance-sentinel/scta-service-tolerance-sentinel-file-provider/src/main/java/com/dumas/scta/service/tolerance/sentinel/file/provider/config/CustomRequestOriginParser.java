package com.dumas.scta.service.tolerance.sentinel.file.provider.config;

import com.alibaba.cloud.commons.lang.StringUtils;
import com.alibaba.csp.sentinel.adapter.spring.webmvc.callback.RequestOriginParser;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * @author dumas
 * @date 2022/05/20 3:30 PM
 */
@Component
public class CustomRequestOriginParser implements RequestOriginParser {
    @Override
    public String parseOrigin(HttpServletRequest httpServletRequest) {
        // 从 header 中获得请求来源
        String origin = httpServletRequest.getHeader("x-user");
        // 如果为空给一个默认的值
        if (StringUtils.isEmpty(origin)) {
            origin = "default";
        }
        return origin;
    }
}
