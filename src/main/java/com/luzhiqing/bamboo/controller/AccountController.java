package com.luzhiqing.bamboo.controller;

import com.luzhiqing.bamboo.remote.dto.RegisterDTO;
import com.luzhiqing.bamboo.remote.dto.TokenDTO;
import com.luzhiqing.bamboo.service.AccountServie;
import com.luzhiqing.common.token.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Description:
 * @version:
 * @Author: 陆志庆
 * @CreateDate: 2019/10/1 21:08
 */
@RestController
public class AccountController {
    private final static Logger logger = LoggerFactory.getLogger(AccountController.class);
    @Autowired
    AccountServie accountServie;

    /**
     * 注册账号
     *
     * @param registerDTO
     * @return 注册账号主键
     */
    @RequestMapping(value = "/auth/account/register", method = RequestMethod.POST)
    public void register(RegisterDTO registerDTO) {
        accountServie.register(registerDTO);
    }

    /**
     * 用户登录
     *
     * @return TokenDTO
     */
    @RequestMapping(value = "/auth/account/login/{appId}", method = RequestMethod.GET)
    public TokenDTO mpLogin(@PathVariable String appId, @RequestParam String code) {
        return accountServie.mpLogin(appId, code);
    }

    @RequestMapping(value = "/auth/account/user/{appId}", method = RequestMethod.GET)
    public User fetchUser(@PathVariable String appId,
                          @RequestParam String uid,
                          @RequestParam String signature,
                          @RequestParam String rawData,
                          @RequestParam String encryptedData,
                          @RequestParam String iv) {
        User user = accountServie.fetchUserInfo(appId, uid, signature, rawData, encryptedData, iv);
        return user;
    }


}
