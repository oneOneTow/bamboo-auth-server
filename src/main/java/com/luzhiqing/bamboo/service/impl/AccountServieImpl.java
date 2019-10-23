package com.luzhiqing.bamboo.service.impl;


import cn.binarywang.wx.miniapp.api.WxMaService;
import cn.binarywang.wx.miniapp.bean.WxMaJscode2SessionResult;
import com.luzhiqing.bamboo.config.WxMaServiceFactory;
import com.luzhiqing.bamboo.dao.AccountDao;
import com.luzhiqing.bamboo.dao.TAccountPlatformDao;
import com.luzhiqing.bamboo.entity.tables.pojos.TAccountPlatform;
import com.luzhiqing.bamboo.entity.tables.pojos.TAccountUser;
import com.luzhiqing.bamboo.exception.LoginExeption;
import com.luzhiqing.bamboo.remote.dto.RegisterDTO;
import com.luzhiqing.bamboo.remote.dto.TokenDTO;
import com.luzhiqing.bamboo.service.AccountServie;
import com.luzhiqing.common.token.*;
import com.luzhiqing.common.util.BeanUtil;
import com.luzhiqing.common.util.StringUtils;
import me.chanjar.weixin.common.error.WxErrorException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

@Service
public class AccountServieImpl implements AccountServie {
    private final static Logger logger = LoggerFactory.getLogger(AccountServieImpl.class);

    @Autowired
    AccountDao accountDao;
    @Autowired
    TAccountPlatformDao accountPlatformDao;

    @Override
    public void register(RegisterDTO registerDTO) {
        TAccountUser accountUser = BeanUtil.map(registerDTO,TAccountUser.class);
        accountDao.insert(accountUser);
    }

    @Override
    public TokenDTO mpLogin(String appId, String code) {
        StringUtils.isBlank(code, "code is blank!");
        WxMaService wxMaService = WxMaServiceFactory.getWxMaService(appId);
        Assert.isNull(wxMaService, "根据appid:" + appId + "找不到对应的服务");
        try {
            WxMaJscode2SessionResult session = wxMaService.getUserService().getSessionInfo(code);
            logger.info(appId+"sessionkey:{},openId:{}",session.getSessionKey(),session.getOpenid());
            TAccountPlatform accountPlatform = accountPlatformDao.selectOne(new TAccountPlatform());
            if(null != accountPlatform){
                accountPlatform.setSessionKey(session.getSessionKey());
                accountPlatformDao.update(accountPlatform);
            }else {
                TAccountUser accountUser = accountDao.insert(new TAccountUser());
                accountPlatform = BeanUtil.map(session,TAccountPlatform.class);
                accountPlatform.setUid(accountUser.getId());
                accountPlatform = accountPlatformDao.insert(accountPlatform);
            }
            Generator generator = new GeneratorFactory().produce();
            Token token = generator.generate(new MpUserInfo(false,accountPlatform.getNickname(),accountPlatform.getUid().toString()));
            return  BeanUtil.map(token,TokenDTO.class);
        } catch (WxErrorException e) {
            e.printStackTrace();
            throw new LoginExeption(e.getMessage());
        }

    }
}
