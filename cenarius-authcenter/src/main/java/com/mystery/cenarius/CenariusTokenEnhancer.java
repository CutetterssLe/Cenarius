package com.mystery.cenarius;

import com.mystery.cenarius.domain.MemberDetails;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;

/**
 * @author Mystery
 */
public class CenariusTokenEnhancer implements TokenEnhancer {

    @Override
    public OAuth2AccessToken enhance(OAuth2AccessToken oAuth2AccessToken, OAuth2Authentication oAuth2Authentication) {
        MemberDetails principal = (MemberDetails) oAuth2Authentication.getPrincipal();
        return null;
    }
}
