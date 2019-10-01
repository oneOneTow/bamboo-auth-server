/*
 * This file is generated by jOOQ.
*/
package com.luzhiqing.bamboo.entity.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;

import javax.annotation.Generated;

import org.jooq.types.UInteger;


/**
 * 账户
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TAccountUser implements Serializable {

    private static final long serialVersionUID = -123538946;

    private UInteger      id;
    private String        email;
    private String        phone;
    private String        userName;
    private String        password;
    private Integer       loginTimes;
    private LocalDateTime createTime;
    private Integer       createUser;
    private String        createUserName;
    private LocalDateTime updateTime;
    private Integer       updateUser;
    private String        updateUserName;
    private LocalDateTime deleteTime;
    private Integer       deleteUser;
    private String        deleteUserName;
    private Boolean       enabled;

    public TAccountUser() {}

    public TAccountUser(TAccountUser value) {
        this.id = value.id;
        this.email = value.email;
        this.phone = value.phone;
        this.userName = value.userName;
        this.password = value.password;
        this.loginTimes = value.loginTimes;
        this.createTime = value.createTime;
        this.createUser = value.createUser;
        this.createUserName = value.createUserName;
        this.updateTime = value.updateTime;
        this.updateUser = value.updateUser;
        this.updateUserName = value.updateUserName;
        this.deleteTime = value.deleteTime;
        this.deleteUser = value.deleteUser;
        this.deleteUserName = value.deleteUserName;
        this.enabled = value.enabled;
    }

    public TAccountUser(
        UInteger      id,
        String        email,
        String        phone,
        String        userName,
        String        password,
        Integer       loginTimes,
        LocalDateTime createTime,
        Integer       createUser,
        String        createUserName,
        LocalDateTime updateTime,
        Integer       updateUser,
        String        updateUserName,
        LocalDateTime deleteTime,
        Integer       deleteUser,
        String        deleteUserName,
        Boolean       enabled
    ) {
        this.id = id;
        this.email = email;
        this.phone = phone;
        this.userName = userName;
        this.password = password;
        this.loginTimes = loginTimes;
        this.createTime = createTime;
        this.createUser = createUser;
        this.createUserName = createUserName;
        this.updateTime = updateTime;
        this.updateUser = updateUser;
        this.updateUserName = updateUserName;
        this.deleteTime = deleteTime;
        this.deleteUser = deleteUser;
        this.deleteUserName = deleteUserName;
        this.enabled = enabled;
    }

    public UInteger getId() {
        return this.id;
    }

    public void setId(UInteger id) {
        this.id = id;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getLoginTimes() {
        return this.loginTimes;
    }

    public void setLoginTimes(Integer loginTimes) {
        this.loginTimes = loginTimes;
    }

    public LocalDateTime getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public Integer getCreateUser() {
        return this.createUser;
    }

    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    public String getCreateUserName() {
        return this.createUserName;
    }

    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
    }

    public LocalDateTime getUpdateTime() {
        return this.updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getUpdateUser() {
        return this.updateUser;
    }

    public void setUpdateUser(Integer updateUser) {
        this.updateUser = updateUser;
    }

    public String getUpdateUserName() {
        return this.updateUserName;
    }

    public void setUpdateUserName(String updateUserName) {
        this.updateUserName = updateUserName;
    }

    public LocalDateTime getDeleteTime() {
        return this.deleteTime;
    }

    public void setDeleteTime(LocalDateTime deleteTime) {
        this.deleteTime = deleteTime;
    }

    public Integer getDeleteUser() {
        return this.deleteUser;
    }

    public void setDeleteUser(Integer deleteUser) {
        this.deleteUser = deleteUser;
    }

    public String getDeleteUserName() {
        return this.deleteUserName;
    }

    public void setDeleteUserName(String deleteUserName) {
        this.deleteUserName = deleteUserName;
    }

    public Boolean getEnabled() {
        return this.enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TAccountUser (");

        sb.append(id);
        sb.append(", ").append(email);
        sb.append(", ").append(phone);
        sb.append(", ").append(userName);
        sb.append(", ").append(password);
        sb.append(", ").append(loginTimes);
        sb.append(", ").append(createTime);
        sb.append(", ").append(createUser);
        sb.append(", ").append(createUserName);
        sb.append(", ").append(updateTime);
        sb.append(", ").append(updateUser);
        sb.append(", ").append(updateUserName);
        sb.append(", ").append(deleteTime);
        sb.append(", ").append(deleteUser);
        sb.append(", ").append(deleteUserName);
        sb.append(", ").append(enabled);

        sb.append(")");
        return sb.toString();
    }
}