package com.mystery.cenarius.exception;


import com.mystery.cenarius.api.IErrorCode;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author Mystery
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class GateWayException extends RuntimeException{

    private static final long serialVersionUID = 1008440460692439223L;
    private long code;

    private String message;

    public GateWayException(IErrorCode iErrorCode) {
        this.code = iErrorCode.getCode();
        this.message = iErrorCode.getMessage();
    }
}
