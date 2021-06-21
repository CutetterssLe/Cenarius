package com.mystery.cenarius.api;

import lombok.Data;

import java.util.Map;

/**
 * @author Mystery
 */
@Data
public class TokenInfo {

    private String accessToken;

    private String tokenType;

    private String refreshToken;

    private String scope;

    private Map<String, String> additionalInfo;
}
