package com.luzhiqing.bamboo.service.impl;


import com.luzhiqing.bamboo.dao.AccountDao;
import com.luzhiqing.bamboo.dao.BambooUserDao;
import com.luzhiqing.bamboo.entity.tables.pojos.TAccountUser;
import com.luzhiqing.bamboo.login.LoginFactory;
import com.luzhiqing.bamboo.login.Loginer;
import com.luzhiqing.bamboo.remote.dto.LoginDTO;
import com.luzhiqing.bamboo.remote.dto.LoginResponseDTO;
import com.luzhiqing.bamboo.remote.dto.RegisterDTO;
import com.luzhiqing.bamboo.service.AccountServie;
import com.luzhiqing.common.util.BeanUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServieImpl implements AccountServie {

    @Autowired
    AccountDao accountDao;

    @Override
    public void register(RegisterDTO registerDTO) {
        TAccountUser accountUser = BeanUtil.map(registerDTO,TAccountUser.class);
        accountDao.insert(accountUser);
    }

    @Override
    public LoginResponseDTO login(LoginDTO loginDTO) {
        Loginer loginer = LoginFactory.getLoginer(loginDTO.getType());
        return loginer.login(loginDTO);
    }
}
