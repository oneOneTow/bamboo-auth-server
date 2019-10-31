package com.luzhiqing.bamboo.exception;

import com.luzhiqing.common.exception.BaseException;


public class LoginException extends BaseException {
    public LoginException(String message) {
        super(ErrorCode.WX_FAIL_LOGIN.getCode(),message);
    }
}
