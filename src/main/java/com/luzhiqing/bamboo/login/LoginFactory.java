package com.luzhiqing.bamboo.login;

import com.luzhiqing.bamboo.constants.enums.LoginType;
import com.luzhiqing.common.helper.SpringContextHelper;

/**
 * @Description:
 * @version:
 * @Author: 陆志庆
 * @CreateDate: 2019/10/9 20:18
 */
public class LoginFactory {
    /**
     *
     * @param type
     * @return
     */
    public static Loginer getLoginer(LoginType type){
        return (Loginer)SpringContextHelper.getBean(type.name());
    }
}
