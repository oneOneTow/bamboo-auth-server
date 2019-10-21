package com.luzhiqing.bamboo.controller;

import cn.binarywang.wx.miniapp.api.WxMaService;
import cn.binarywang.wx.miniapp.bean.WxMaJscode2SessionResult;
import com.luzhiqing.bamboo.config.WxMaServiceFactory;
import com.luzhiqing.bamboo.remote.dto.LoginDTO;
import com.luzhiqing.bamboo.remote.dto.LoginResponseDTO;
import com.luzhiqing.bamboo.remote.dto.RegisterDTO;
import com.luzhiqing.bamboo.remote.dto.TokenDTO;
import com.luzhiqing.bamboo.service.AccountServie;
import com.luzhiqing.common.util.StringUtils;
import me.chanjar.weixin.common.error.WxErrorException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.PathVariable;
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
     * @param loginDTO
     * @return TokenDTO
     */
    @RequestMapping(value = "/auth/account/login/{appid}")
    public TokenDTO wxLogin(@PathVariable String appid, String code) {
        StringUtils.isBlank(code, "code is blank!");
        WxMaService wxMaService = WxMaServiceFactory.getWxMaService(appid);
        Assert.isNull(wxMaService, "根据appid:" + appid + "找不到对应的服务");
        try {
            WxMaJscode2SessionResult session = wxMaService.getUserService().getSessionInfo(code);
            logger.info(appid+"sessionkey:{},openId:{}",session.getSessionKey(),session.getOpenid());
        } catch (WxErrorException e) {
            e.printStackTrace();
        }

        return null;
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
