package com.luzhiqing.bamboo.controller;

import com.luzhiqing.bamboo.remote.dto.LoginDTO;
import com.luzhiqing.bamboo.remote.dto.LoginResponseDTO;
import com.luzhiqing.bamboo.remote.dto.RegisterDTO;
import com.luzhiqing.bamboo.remote.dto.TokenDTO;
import com.luzhiqing.bamboo.service.AccountServie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @version:
 * @Author: 陆志庆
 * @CreateDate: 2019/10/1 21:08
 */
@RestController
public class AccountController {
    @Autowired
    AccountServie accountServie;
    /**
     * 注册账号
     *
     * @param registerDTO
     * @return 注册账号主键
     */
    @RequestMapping(value = "/auth/account/register",method = RequestMethod.POST)
    public void register(RegisterDTO registerDTO) {
         accountServie.register(registerDTO);
    }

    /**
     * 用户登录
     *
     * @param loginDTO
     * @return TokenDTO
     */
    @RequestMapping(value = "/auth/account/login",method = RequestMethod.POST)
    public LoginResponseDTO login(LoginDTO loginDTO) {
        return accountServie.;
    }
}
