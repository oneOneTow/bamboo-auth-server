package com.luzhiqing.bamboo.service.impl;

import com.luzhiqing.bamboo.dao.AccountDao;
import com.luzhiqing.bamboo.entity.tables.pojos.TAccountUser;
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
}
