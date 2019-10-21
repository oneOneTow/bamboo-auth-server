package com.luzhiqing.bamboo.login.impl;

import com.luzhiqing.bamboo.login.Loginer;
import com.luzhiqing.bamboo.remote.dto.LoginDTO;
import com.luzhiqing.bamboo.remote.dto.LoginResponseDTO;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @version:
 * @Author: 陆志庆
 * @CreateDate: 2019/10/9 20:17
 */
@Service("PLATFORM")
public class PlatformLoginerImpl implements Loginer {
    @Override
    public LoginResponseDTO login(LoginDTO loginDTO) {
        return null;
    }
}
