package com.mystery.cenarius;

import com.mystery.cenarius.domain.MemberDetails;
import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Mystery
 * jwt自定义增强器(根据自己的业务需求添加非敏感字段)
 */
public class CenariusTokenEnhancer implements TokenEnhancer {

    @Override
    public OAuth2AccessToken enhance(OAuth2AccessToken oAuth2AccessToken, OAuth2Authentication oAuth2Authentication) {
        MemberDetails principal = (MemberDetails) oAuth2Authentication.getPrincipal();

        final Map<String, Object> additionalInfo = new HashMap<>();
        final Map<String, Object> retMap = new HashMap<>();

        additionalInfo.put("memberId", principal.getUmsMember().getId());
        additionalInfo.put("nickName", principal.getUmsMember().getNickname());
        additionalInfo.put("integration", principal.getUmsMember().getIntegration());

        retMap.put("additionalInfo", additionalInfo);

        ((DefaultOAuth2AccessToken)oAuth2AccessToken).setAdditionalInformation(retMap);
        return oAuth2AccessToken;
    }
}
