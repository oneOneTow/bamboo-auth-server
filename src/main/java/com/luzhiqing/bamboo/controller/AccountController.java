package com.luzhiqing.bamboo.controller;

import com.luzhiqing.bamboo.vo.request.LoginRequestVO;
import com.luzhiqing.bamboo.vo.request.RegisterRequestVO;
import com.luzhiqing.bamboo.vo.response.TokenResponseVO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @version:
 * @Author: 陆志庆
 * @CreateDate: 2019/10/1 21:08
 */
@RestController
@RequestMapping(value = "/")
public class AccountController {
    /**
     * 注册账号
     *
     * @param registerRequestVO
     * @return 注册账号主键
     */
    public int register(RegisterRequestVO registerRequestVO) {
        return 0;
    }

    /**
     * 用户登录
     *
     * @param loginRequestVO
     * @return token
     */
    public TokenResponseVO login(LoginRequestVO loginRequestVO) {

    }
}
