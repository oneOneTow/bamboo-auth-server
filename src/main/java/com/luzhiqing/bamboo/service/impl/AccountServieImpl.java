package com.luzhiqing.bamboo.service.impl;


import cn.binarywang.wx.miniapp.api.WxMaService;
import cn.binarywang.wx.miniapp.bean.WxMaJscode2SessionResult;
import cn.binarywang.wx.miniapp.bean.WxMaUserInfo;
import com.luzhiqing.bamboo.config.WxMaServiceFactory;
import com.luzhiqing.bamboo.constants.enums.AccountType;
import com.luzhiqing.bamboo.dao.AccountDao;
import com.luzhiqing.bamboo.dao.TAccountPlatformDao;
import com.luzhiqing.bamboo.entity.tables.pojos.TAccountPlatform;
import com.luzhiqing.bamboo.entity.tables.pojos.TAccountUser;
import com.luzhiqing.bamboo.exception.ErrorCode;
import com.luzhiqing.bamboo.exception.LoginException;
import com.luzhiqing.bamboo.remote.dto.RegisterDTO;
import com.luzhiqing.bamboo.remote.dto.TokenDTO;
import com.luzhiqing.bamboo.service.AccountServie;
import com.luzhiqing.bamboo.wx.mp.MpUser;
import com.luzhiqing.common.exception.BaseException;
import com.luzhiqing.common.token.*;
import com.luzhiqing.common.util.BeanUtil;
import com.luzhiqing.common.util.BeanUtils;
import me.chanjar.weixin.common.error.WxErrorException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
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
    @Transactional(rollbackFor = RuntimeException.class)
    public TokenDTO mpLogin(String appId, String code) {
        final WxMaService wxMaService = WxMaServiceFactory.getWxMaService(appId);
        Assert.notNull(wxMaService, "根据appid:" + appId + "找不到对应的服务");
        try {
            WxMaJscode2SessionResult session = wxMaService.getUserService().getSessionInfo(code);
            logger.info(appId+"sessionkey:{},openId:{}",session.getSessionKey(),session.getOpenid());
            TAccountPlatform accountPlatform = accountPlatformDao.selectByOpenId(session.getOpenid());
            if(null != accountPlatform){
                accountPlatform.setSessionKey(session.getSessionKey());
                accountPlatformDao.update(accountPlatform);
            }else {
                TAccountUser accountUser = accountDao.insert(new TAccountUser());
                accountPlatform = BeanUtils.map(session,TAccountPlatform.class);
                accountPlatform.setPlatformId(session.getOpenid());
                accountPlatform.setUid(accountUser.getId());
                accountPlatform.setAccountType(AccountType.WE_CHAT);
                accountPlatform = accountPlatformDao.insert(accountPlatform);
            }
            Generator generator = new GeneratorFactory().produce();
            UserInfo userInfo = new MpUser(accountPlatform.getUid().intValue(),accountPlatform.getNickname(),false);
            Token token = generator.generate(userInfo);
            return  BeanUtil.map(token,TokenDTO.class);
        } catch (WxErrorException e) {
            e.printStackTrace();
            throw new LoginException(e.getMessage());
        }

    }

    @Override
    public User fetchUserInfo(String appId, String uid, String signature, String rawData, String encryptedData, String iv) {
        final WxMaService wxMaService = WxMaServiceFactory.getWxMaService(appId);
        // 用户信息校验
        TAccountPlatform accountPlatform = accountPlatformDao.selectByOpenId(uid);
        Assert.notNull(accountPlatform,"用户未注册");
        String sessionKey = accountPlatform.getSessionKey();
        if (!wxMaService.getUserService().checkUserInfo(sessionKey, rawData, signature)) {
            throw new BaseException(ErrorCode.WX_FAIL_FETCH_USER.getCode(),ErrorCode.WX_FAIL_FETCH_USER.getMsg());
        }

        // 解密用户信息
        WxMaUserInfo userInfo = wxMaService.getUserService().getUserInfo(sessionKey, encryptedData, iv);

        return BeanUtil.map(userInfo,User.class);
    }
}
