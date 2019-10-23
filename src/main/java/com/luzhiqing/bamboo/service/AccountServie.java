package com.luzhiqing.bamboo.service;

import com.luzhiqing.bamboo.remote.dto.RegisterDTO;
import com.luzhiqing.bamboo.remote.dto.TokenDTO;


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
     * @param appId
     * @param code
     * @return
     */
    TokenDTO mpLogin(String appId, String code);
}
