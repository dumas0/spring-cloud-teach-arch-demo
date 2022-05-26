package com.dumas.scta.service.call.dubbo.filter.api.core;

/**
 * @author dumas
 * @date 2022/05/26 2:42 PM
 */
public final class ServiceException extends RuntimeException{
    /**
     * 错误码
     */
    private Integer code;

    // 创建默认构造方法，用于反序列化的场景
    public ServiceException() {
    }

    public ServiceException(ServiceExceptionEnum serviceExceptionEnum){
        // 使用父类的 message 字段
        super(serviceExceptionEnum.getMessage());
        // 设置错误码
        this.code = serviceExceptionEnum.getCode();
    }

    public ServiceException(ServiceExceptionEnum serviceExceptionEnum, String message) {
        super(message);
        this.code = serviceExceptionEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }
}
