package com.luzhiqing.bamboo.service;

import com.luzhiqing.bamboo.remote.dto.RegisterDTO;
import com.luzhiqing.bamboo.remote.dto.TokenDTO;
import com.luzhiqing.common.token.User;


public interface AccountServie {
    /**
     * 注册用户
     *
     * @param registerDTO
     * @return
     */
    void register(RegisterDTO registerDTO);


    /**
     * 微信登录
     *
     * @param appId
     * @param code
     * @return
     */
    TokenDTO mpLogin(String appId, String code);

    /**
     * 获取user信息
     *
     * @param appId
     * @param sessionKey
     * @param signature
     * @param rawData
     * @param encryptedData
     * @param iv
     * @return
     */
    User fetchUserInfo(String appId, String sessionKey, String signature, String rawData, String encryptedData, String iv);

}
