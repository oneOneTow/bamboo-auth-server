package com.luzhiqing.bamboo.exception;

import com.luzhiqing.common.exception.BaseException;
import com.luzhiqing.common.exception.ErrorCode;

public class LoginExeption extends BaseException {
    public LoginExeption(String message) {
        super(ErrorCode.WX_FAIL_LOGIN.getCode(),message);
    }
}
