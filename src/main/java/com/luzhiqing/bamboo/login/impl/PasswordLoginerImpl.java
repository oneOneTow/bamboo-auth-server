package com.luzhiqing.bamboo.login.impl;

import com.luzhiqing.bamboo.constants.enums.LoginType;
import com.luzhiqing.bamboo.dao.AccountDao;
import com.luzhiqing.bamboo.dao.BambooUserDao;
import com.luzhiqing.bamboo.entity.tables.pojos.TAccountUser;
import com.luzhiqing.bamboo.entity.tables.pojos.TBambooUser;
import com.luzhiqing.bamboo.login.Loginer;
import com.luzhiqing.bamboo.remote.dto.LoginDTO;
import com.luzhiqing.bamboo.remote.dto.LoginResponseDTO;
import com.luzhiqing.bamboo.remote.dto.TokenDTO;
import com.luzhiqing.common.token.Generator;
import com.luzhiqing.common.token.GeneratorFactory;
import com.luzhiqing.common.token.Token;
import com.luzhiqing.common.token.UserInfo;
import com.luzhiqing.common.util.BeanUtil;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @version:
 * @Author: 陆志庆
 * @CreateDate: 2019/10/9 20:16
 */
@Service("PASSWORD")
public class PasswordLoginerImpl implements Loginer {

    @Autowired
    AccountDao accountDao;

    @Autowired
    BambooUserDao bambooUserDao;

    @Override
    public LoginResponseDTO login(LoginDTO loginDTO) {
        LoginResponseDTO loginResponseDTO = null;

        TAccountUser accountUser = new TAccountUser();
        if(LoginType.PASSWORD.equals(loginDTO.getType())){
            if(StringUtils.isNotBlank(loginDTO.getEmile())){
                accountUser.setEmail(loginDTO.getEmile());
            }
            if(StringUtils.isNotBlank(loginDTO.getPhone())){
                accountUser.setPhone(loginDTO.getPhone());
            }
        }
        accountUser = accountDao.selectOne(accountUser);
        if (loginDTO.getPassword().equals(accountUser.getPassword())){
            TBambooUser bambooUser = bambooUserDao.findByUid(accountUser.getId().intValue());
            UserInfo userInfo = new UserInfo() {
                @Override
                public Boolean getAdmin() {
                    return false;
                }

                @Override
                public String getNickname() {
                    return bambooUser.getNickname();
                }

                @Override
                public int getUid() {
                    return bambooUser.getUid().intValue();
                }
            };
            Generator generator = new GeneratorFactory().produce();
            Token token = generator.generate(userInfo);
            TokenDTO tokenDTO = BeanUtil.map(token,TokenDTO.class);
            loginResponseDTO = BeanUtil.map(bambooUser,LoginResponseDTO.class);
            loginResponseDTO.setToken(tokenDTO);
        }
        return loginResponseDTO;
    }
}
