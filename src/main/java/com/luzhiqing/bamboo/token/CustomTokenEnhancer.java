//package com.luzhiqing.bamboo.token;
//
//import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
//import org.springframework.security.oauth2.common.OAuth2AccessToken;
//import org.springframework.security.oauth2.provider.OAuth2Authentication;
//import org.springframework.security.oauth2.provider.token.TokenEnhancer;
//
//import java.util.HashMap;
//import java.util.Map;
//
///**
// * @Description:
// * @version:
// * @Author: 陆志庆
// * @CreateDate: 2019/10/26 11:17
// */
//public class CustomTokenEnhancer implements TokenEnhancer {
//    @Override
//    public OAuth2AccessToken enhance(OAuth2AccessToken accessToken, OAuth2Authentication authentication) {
//        Map<String,Object> userInfo = new HashMap<>();
//        userInfo.put("uid","14101310");
//        ((DefaultOAuth2AccessToken)accessToken).setAdditionalInformation(userInfo);
//        return accessToken;
//    }
//}
