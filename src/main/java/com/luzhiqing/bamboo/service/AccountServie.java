package com.luzhiqing.bamboo.service;

import com.luzhiqing.bamboo.remote.dto.LoginDTO;
import com.luzhiqing.bamboo.remote.dto.LoginResponseDTO;
import com.luzhiqing.bamboo.remote.dto.RegisterDTO;
import com.luzhiqing.bamboo.remote.dto.WxLoginDTO;
import org.springframework.stereotype.Service;


public interface AccountServie {
    /**
     * 注册用户
     *
     * @param registerDTO
     * @return
     */
    void register(RegisterDTO registerDTO);


    /**
     * 登录
     *
     * @param loginDTO
     * @return
     */
    LoginResponseDTO login(LoginDTO loginDTO);

    /**
     * 微信登录
     * @param appId
     * @param code
     * @return
     */
    WxLoginDTO wxLogin(String appId, String code);
}
