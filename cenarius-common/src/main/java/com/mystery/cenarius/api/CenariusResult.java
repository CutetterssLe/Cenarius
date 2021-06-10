package com.mystery.cenarius.api;

import java.io.Serializable;

/**
 * @author Mystery
 * 公共返回类
 */
public class CenariusResult<T> implements Serializable {
    private static final long serialVersionUID = 8134938740998439546L;

    private static final Integer SUCCESS_CODE = 1;
    private static final Integer ERROR_CODE = 0;

    private Integer code;

    private String msg;

    private boolean success;

    private T data;

    public CenariusResult(Integer code, String msg, boolean success) {
        this.code = code;
        this.msg = msg;
        this.success = success;
    }


    public CenariusResult(Integer code, String msg, T data, boolean success) {
        this.code = code;
        this.data = data;
        this.msg = msg;
        this.success = success;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static <T> CenariusResult<T> getSuccessResult(T data) {
        return new CenariusResult<T>(SUCCESS_CODE, null,data,true);
    }

    public static <T> CenariusResult<T> getSuccessResult(Integer code, T data) {
        return new CenariusResult<T>(code, null,data,true);
    }

    public static <T> CenariusResult<T> getSuccessResult() {
        return new CenariusResult<T>(SUCCESS_CODE, null,null,true);
    }

    public static <T> CenariusResult<T> getErrorResult(Integer code, String msg) {
        return new CenariusResult<>(code, msg, false);
    }
    public static <T> CenariusResult<T> getErrorResult(String msg) {
        return new CenariusResult<>(ERROR_CODE, msg, false);
    }

}
