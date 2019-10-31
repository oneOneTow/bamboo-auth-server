package com.luzhiqing.bamboo.exception;

/**
 * @Description:
 * @version:
 * @Author: 陆志庆
 * @CreateDate: 2019/10/27 19:17
 */
public enum ErrorCode {
    /**
     *
     */
    WX_FAIL_LOGIN("WX_FAIL_LOGIN","微信登录失败"),

    /**
     *
     */
    WX_FAIL_FETCH_USER("WX_FAIL_FETCH_USER","微信获取用户信息失败");
    /**
     *
     */
    private String code;
    /**
     *
     */
    private String msg;

    ErrorCode(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
