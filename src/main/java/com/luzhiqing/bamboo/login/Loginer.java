package com.luzhiqing.bamboo.login;

import com.luzhiqing.bamboo.remote.dto.LoginDTO;
import com.luzhiqing.bamboo.remote.dto.LoginResponseDTO;

/**
 * @Description:
 * @version:
 * @Author: 陆志庆
 * @CreateDate: 2019/10/9 20:14
 */
public interface Loginer {
    /**
     *
     * @param loginDTO
     * @return
     */
    LoginResponseDTO login(LoginDTO loginDTO);
}
