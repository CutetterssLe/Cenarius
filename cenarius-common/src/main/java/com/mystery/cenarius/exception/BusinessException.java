package com.mystery.cenarius.exception;

/**
 * @author Mystery
 */
public class BusinessException extends Exception {

    private static final long serialVersionUID = 1902194216578740405L;

    public BusinessException(){super();}

    public BusinessException(String message) {
        super(message);
    }

}
