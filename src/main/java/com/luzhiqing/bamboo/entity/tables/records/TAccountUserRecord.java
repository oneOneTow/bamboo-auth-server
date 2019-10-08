/*
 * This file is generated by jOOQ.
*/
package com.luzhiqing.bamboo.entity.tables.records;


import com.luzhiqing.bamboo.entity.tables.T_ACCOUNT_USER;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record16;
import org.jooq.Row16;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UInteger;

import javax.annotation.Generated;
import java.time.LocalDateTime;


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
public class TAccountUserRecord extends UpdatableRecordImpl<TAccountUserRecord> implements Record16<UInteger, String, String, String, String, Integer, LocalDateTime, Integer, String, LocalDateTime, Integer, String, LocalDateTime, Integer, String, Boolean> {

    private static final long serialVersionUID = -995449043;

    /**
     * Setter for <code>bamboo_auth.t_account_user.id</code>. 账号id
     */
    public void setId(UInteger value) {
        set(0, value);
    }

    /**
     * Getter for <code>bamboo_auth.t_account_user.id</code>. 账号id
     */
    public UInteger getId() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>bamboo_auth.t_account_user.email</code>. 邮箱
     */
    public void setEmail(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>bamboo_auth.t_account_user.email</code>. 邮箱
     */
    public String getEmail() {
        return (String) get(1);
    }

    /**
     * Setter for <code>bamboo_auth.t_account_user.phone</code>. 手机号
     */
    public void setPhone(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>bamboo_auth.t_account_user.phone</code>. 手机号
     */
    public String getPhone() {
        return (String) get(2);
    }

    /**
     * Setter for <code>bamboo_auth.t_account_user.user_name</code>. 用户名
     */
    public void setUserName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>bamboo_auth.t_account_user.user_name</code>. 用户名
     */
    public String getUserName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>bamboo_auth.t_account_user.password</code>. 密码
     */
    public void setPassword(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>bamboo_auth.t_account_user.password</code>. 密码
     */
    public String getPassword() {
        return (String) get(4);
    }

    /**
     * Setter for <code>bamboo_auth.t_account_user.login_times</code>. 登录次数
     */
    public void setLoginTimes(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>bamboo_auth.t_account_user.login_times</code>. 登录次数
     */
    public Integer getLoginTimes() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>bamboo_auth.t_account_user.create_time</code>.
     */
    public void setCreateTime(LocalDateTime value) {
        set(6, value);
    }

    /**
     * Getter for <code>bamboo_auth.t_account_user.create_time</code>.
     */
    public LocalDateTime getCreateTime() {
        return (LocalDateTime) get(6);
    }

    /**
     * Setter for <code>bamboo_auth.t_account_user.create_user</code>.
     */
    public void setCreateUser(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>bamboo_auth.t_account_user.create_user</code>.
     */
    public Integer getCreateUser() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>bamboo_auth.t_account_user.create_user_name</code>.
     */
    public void setCreateUserName(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>bamboo_auth.t_account_user.create_user_name</code>.
     */
    public String getCreateUserName() {
        return (String) get(8);
    }

    /**
     * Setter for <code>bamboo_auth.t_account_user.update_time</code>.
     */
    public void setUpdateTime(LocalDateTime value) {
        set(9, value);
    }

    /**
     * Getter for <code>bamboo_auth.t_account_user.update_time</code>.
     */
    public LocalDateTime getUpdateTime() {
        return (LocalDateTime) get(9);
    }

    /**
     * Setter for <code>bamboo_auth.t_account_user.update_user</code>.
     */
    public void setUpdateUser(Integer value) {
        set(10, value);
    }

    /**
     * Getter for <code>bamboo_auth.t_account_user.update_user</code>.
     */
    public Integer getUpdateUser() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>bamboo_auth.t_account_user.update_user_name</code>.
     */
    public void setUpdateUserName(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>bamboo_auth.t_account_user.update_user_name</code>.
     */
    public String getUpdateUserName() {
        return (String) get(11);
    }

    /**
     * Setter for <code>bamboo_auth.t_account_user.delete_time</code>.
     */
    public void setDeleteTime(LocalDateTime value) {
        set(12, value);
    }

    /**
     * Getter for <code>bamboo_auth.t_account_user.delete_time</code>.
     */
    public LocalDateTime getDeleteTime() {
        return (LocalDateTime) get(12);
    }

    /**
     * Setter for <code>bamboo_auth.t_account_user.delete_user</code>.
     */
    public void setDeleteUser(Integer value) {
        set(13, value);
    }

    /**
     * Getter for <code>bamboo_auth.t_account_user.delete_user</code>.
     */
    public Integer getDeleteUser() {
        return (Integer) get(13);
    }

    /**
     * Setter for <code>bamboo_auth.t_account_user.delete_user_name</code>.
     */
    public void setDeleteUserName(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>bamboo_auth.t_account_user.delete_user_name</code>.
     */
    public String getDeleteUserName() {
        return (String) get(14);
    }

    /**
     * Setter for <code>bamboo_auth.t_account_user.enabled</code>.
     */
    public void setEnabled(Boolean value) {
        set(15, value);
    }

    /**
     * Getter for <code>bamboo_auth.t_account_user.enabled</code>.
     */
    public Boolean getEnabled() {
        return (Boolean) get(15);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<UInteger> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record16 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row16<UInteger, String, String, String, String, Integer, LocalDateTime, Integer, String, LocalDateTime, Integer, String, LocalDateTime, Integer, String, Boolean> fieldsRow() {
        return (Row16) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row16<UInteger, String, String, String, String, Integer, LocalDateTime, Integer, String, LocalDateTime, Integer, String, LocalDateTime, Integer, String, Boolean> valuesRow() {
        return (Row16) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field1() {
        return T_ACCOUNT_USER.T_ACCOUNT_USER.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return T_ACCOUNT_USER.T_ACCOUNT_USER.EMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return T_ACCOUNT_USER.T_ACCOUNT_USER.PHONE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return T_ACCOUNT_USER.T_ACCOUNT_USER.USER_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return T_ACCOUNT_USER.T_ACCOUNT_USER.PASSWORD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return T_ACCOUNT_USER.T_ACCOUNT_USER.LOGIN_TIMES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field7() {
        return T_ACCOUNT_USER.T_ACCOUNT_USER.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return T_ACCOUNT_USER.T_ACCOUNT_USER.CREATE_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return T_ACCOUNT_USER.T_ACCOUNT_USER.CREATE_USER_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field10() {
        return T_ACCOUNT_USER.T_ACCOUNT_USER.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field11() {
        return T_ACCOUNT_USER.T_ACCOUNT_USER.UPDATE_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return T_ACCOUNT_USER.T_ACCOUNT_USER.UPDATE_USER_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field13() {
        return T_ACCOUNT_USER.T_ACCOUNT_USER.DELETE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field14() {
        return T_ACCOUNT_USER.T_ACCOUNT_USER.DELETE_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return T_ACCOUNT_USER.T_ACCOUNT_USER.DELETE_USER_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field16() {
        return T_ACCOUNT_USER.T_ACCOUNT_USER.ENABLED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getPhone();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getUserName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getPassword();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getLoginTimes();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime component7() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component8() {
        return getCreateUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getCreateUserName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime component10() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component11() {
        return getUpdateUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getUpdateUserName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime component13() {
        return getDeleteTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component14() {
        return getDeleteUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component15() {
        return getDeleteUserName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component16() {
        return getEnabled();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getPhone();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getUserName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getPassword();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getLoginTimes();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value7() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getCreateUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getCreateUserName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value10() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value11() {
        return getUpdateUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getUpdateUserName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value13() {
        return getDeleteTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value14() {
        return getDeleteUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getDeleteUserName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value16() {
        return getEnabled();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAccountUserRecord value1(UInteger value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAccountUserRecord value2(String value) {
        setEmail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAccountUserRecord value3(String value) {
        setPhone(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAccountUserRecord value4(String value) {
        setUserName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAccountUserRecord value5(String value) {
        setPassword(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAccountUserRecord value6(Integer value) {
        setLoginTimes(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAccountUserRecord value7(LocalDateTime value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAccountUserRecord value8(Integer value) {
        setCreateUser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAccountUserRecord value9(String value) {
        setCreateUserName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAccountUserRecord value10(LocalDateTime value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAccountUserRecord value11(Integer value) {
        setUpdateUser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAccountUserRecord value12(String value) {
        setUpdateUserName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAccountUserRecord value13(LocalDateTime value) {
        setDeleteTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAccountUserRecord value14(Integer value) {
        setDeleteUser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAccountUserRecord value15(String value) {
        setDeleteUserName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAccountUserRecord value16(Boolean value) {
        setEnabled(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAccountUserRecord values(UInteger value1, String value2, String value3, String value4, String value5, Integer value6, LocalDateTime value7, Integer value8, String value9, LocalDateTime value10, Integer value11, String value12, LocalDateTime value13, Integer value14, String value15, Boolean value16) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TAccountUserRecord
     */
    public TAccountUserRecord() {
        super(T_ACCOUNT_USER.T_ACCOUNT_USER);
    }

    /**
     * Create a detached, initialised TAccountUserRecord
     */
    public TAccountUserRecord(UInteger id, String email, String phone, String userName, String password, Integer loginTimes, LocalDateTime createTime, Integer createUser, String createUserName, LocalDateTime updateTime, Integer updateUser, String updateUserName, LocalDateTime deleteTime, Integer deleteUser, String deleteUserName, Boolean enabled) {
        super(T_ACCOUNT_USER.T_ACCOUNT_USER);

        set(0, id);
        set(1, email);
        set(2, phone);
        set(3, userName);
        set(4, password);
        set(5, loginTimes);
        set(6, createTime);
        set(7, createUser);
        set(8, createUserName);
        set(9, updateTime);
        set(10, updateUser);
        set(11, updateUserName);
        set(12, deleteTime);
        set(13, deleteUser);
        set(14, deleteUserName);
        set(15, enabled);
    }
}
