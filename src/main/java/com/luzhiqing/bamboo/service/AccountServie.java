package com.luzhiqing.bamboo.service;

import com.luzhiqing.bamboo.remote.dto.LoginDTO;
import com.luzhiqing.bamboo.remote.dto.LoginResponseDTO;
import com.luzhiqing.bamboo.remote.dto.RegisterDTO;
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
}
