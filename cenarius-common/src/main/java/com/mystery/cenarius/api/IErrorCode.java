package com.mystery.cenarius.api;

/**
 * 封装API的错误码
 *
 * @author Mystery
 */
public interface IErrorCode {
    /**
     * 获取错误码
     * @return
     */
    Integer getCode();

    /**
     * 获取返回信息
     * @return
     */
    String getMessage();
}