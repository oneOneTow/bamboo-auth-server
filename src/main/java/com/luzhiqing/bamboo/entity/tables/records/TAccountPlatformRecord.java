/*
 * This file is generated by jOOQ.
*/
package com.luzhiqing.bamboo.entity.tables.records;


import com.luzhiqing.bamboo.constants.enums.AccountType;
import com.luzhiqing.bamboo.entity.tables.TAccountPlatform;

import java.time.LocalDateTime;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record17;
import org.jooq.Row17;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UInteger;


/**
 * 第三方用户信息
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TAccountPlatformRecord extends UpdatableRecordImpl<TAccountPlatformRecord> implements Record17<UInteger, UInteger, String, String, AccountType, String, String, LocalDateTime, Integer, String, LocalDateTime, Integer, String, LocalDateTime, Integer, String, Boolean> {

    private static final long serialVersionUID = -271505485;

    /**
     * Setter for <code>bamboo_auth.t_account_platform.id</code>. 自增id
     */
    public void setId(UInteger value) {
        set(0, value);
    }

    /**
     * Getter for <code>bamboo_auth.t_account_platform.id</code>. 自增id
     */
    public UInteger getId() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>bamboo_auth.t_account_platform.uid</code>. 账号id
     */
    public void setUid(UInteger value) {
        set(1, value);
    }

    /**
     * Getter for <code>bamboo_auth.t_account_platform.uid</code>. 账号id
     */
    public UInteger getUid() {
        return (UInteger) get(1);
    }

    /**
     * Setter for <code>bamboo_auth.t_account_platform.platform_id</code>. 平台id
     */
    public void setPlatformId(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>bamboo_auth.t_account_platform.platform_id</code>. 平台id
     */
    public String getPlatformId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>bamboo_auth.t_account_platform.platform_token</code>. 平台access_token
     */
    public void setPlatformToken(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>bamboo_auth.t_account_platform.platform_token</code>. 平台access_token
     */
    public String getPlatformToken() {
        return (String) get(3);
    }

    /**
     * Setter for <code>bamboo_auth.t_account_platform.account_type</code>. 平台类型 0:未知,1:wechat,2:qq
     */
    public void setAccountType(AccountType value) {
        set(4, value);
    }

    /**
     * Getter for <code>bamboo_auth.t_account_platform.account_type</code>. 平台类型 0:未知,1:wechat,2:qq
     */
    public AccountType getAccountType() {
        return (AccountType) get(4);
    }

    /**
     * Setter for <code>bamboo_auth.t_account_platform.nickname</code>. 昵称
     */
    public void setNickname(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>bamboo_auth.t_account_platform.nickname</code>. 昵称
     */
    public String getNickname() {
        return (String) get(5);
    }

    /**
     * Setter for <code>bamboo_auth.t_account_platform.avatar</code>. 头像
     */
    public void setAvatar(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>bamboo_auth.t_account_platform.avatar</code>. 头像
     */
    public String getAvatar() {
        return (String) get(6);
    }

    /**
     * Setter for <code>bamboo_auth.t_account_platform.create_time</code>.
     */
    public void setCreateTime(LocalDateTime value) {
        set(7, value);
    }

    /**
     * Getter for <code>bamboo_auth.t_account_platform.create_time</code>.
     */
    public LocalDateTime getCreateTime() {
        return (LocalDateTime) get(7);
    }

    /**
     * Setter for <code>bamboo_auth.t_account_platform.create_user</code>.
     */
    public void setCreateUser(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>bamboo_auth.t_account_platform.create_user</code>.
     */
    public Integer getCreateUser() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>bamboo_auth.t_account_platform.create_user_name</code>.
     */
    public void setCreateUserName(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>bamboo_auth.t_account_platform.create_user_name</code>.
     */
    public String getCreateUserName() {
        return (String) get(9);
    }

    /**
     * Setter for <code>bamboo_auth.t_account_platform.update_time</code>.
     */
    public void setUpdateTime(LocalDateTime value) {
        set(10, value);
    }

    /**
     * Getter for <code>bamboo_auth.t_account_platform.update_time</code>.
     */
    public LocalDateTime getUpdateTime() {
        return (LocalDateTime) get(10);
    }

    /**
     * Setter for <code>bamboo_auth.t_account_platform.update_user</code>.
     */
    public void setUpdateUser(Integer value) {
        set(11, value);
    }

    /**
     * Getter for <code>bamboo_auth.t_account_platform.update_user</code>.
     */
    public Integer getUpdateUser() {
        return (Integer) get(11);
    }

    /**
     * Setter for <code>bamboo_auth.t_account_platform.update_user_name</code>.
     */
    public void setUpdateUserName(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>bamboo_auth.t_account_platform.update_user_name</code>.
     */
    public String getUpdateUserName() {
        return (String) get(12);
    }

    /**
     * Setter for <code>bamboo_auth.t_account_platform.delete_time</code>.
     */
    public void setDeleteTime(LocalDateTime value) {
        set(13, value);
    }

    /**
     * Getter for <code>bamboo_auth.t_account_platform.delete_time</code>.
     */
    public LocalDateTime getDeleteTime() {
        return (LocalDateTime) get(13);
    }

    /**
     * Setter for <code>bamboo_auth.t_account_platform.delete_user</code>.
     */
    public void setDeleteUser(Integer value) {
        set(14, value);
    }

    /**
     * Getter for <code>bamboo_auth.t_account_platform.delete_user</code>.
     */
    public Integer getDeleteUser() {
        return (Integer) get(14);
    }

    /**
     * Setter for <code>bamboo_auth.t_account_platform.delete_user_name</code>.
     */
    public void setDeleteUserName(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>bamboo_auth.t_account_platform.delete_user_name</code>.
     */
    public String getDeleteUserName() {
        return (String) get(15);
    }

    /**
     * Setter for <code>bamboo_auth.t_account_platform.enabled</code>.
     */
    public void setEnabled(Boolean value) {
        set(16, value);
    }

    /**
     * Getter for <code>bamboo_auth.t_account_platform.enabled</code>.
     */
    public Boolean getEnabled() {
        return (Boolean) get(16);
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
    // Record17 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row17<UInteger, UInteger, String, String, AccountType, String, String, LocalDateTime, Integer, String, LocalDateTime, Integer, String, LocalDateTime, Integer, String, Boolean> fieldsRow() {
        return (Row17) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row17<UInteger, UInteger, String, String, AccountType, String, String, LocalDateTime, Integer, String, LocalDateTime, Integer, String, LocalDateTime, Integer, String, Boolean> valuesRow() {
        return (Row17) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field1() {
        return TAccountPlatform.T_ACCOUNT_PLATFORM.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field2() {
        return TAccountPlatform.T_ACCOUNT_PLATFORM.UID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TAccountPlatform.T_ACCOUNT_PLATFORM.PLATFORM_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return TAccountPlatform.T_ACCOUNT_PLATFORM.PLATFORM_TOKEN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<AccountType> field5() {
        return TAccountPlatform.T_ACCOUNT_PLATFORM.ACCOUNT_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return TAccountPlatform.T_ACCOUNT_PLATFORM.NICKNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return TAccountPlatform.T_ACCOUNT_PLATFORM.AVATAR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field8() {
        return TAccountPlatform.T_ACCOUNT_PLATFORM.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return TAccountPlatform.T_ACCOUNT_PLATFORM.CREATE_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return TAccountPlatform.T_ACCOUNT_PLATFORM.CREATE_USER_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field11() {
        return TAccountPlatform.T_ACCOUNT_PLATFORM.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field12() {
        return TAccountPlatform.T_ACCOUNT_PLATFORM.UPDATE_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return TAccountPlatform.T_ACCOUNT_PLATFORM.UPDATE_USER_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field14() {
        return TAccountPlatform.T_ACCOUNT_PLATFORM.DELETE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field15() {
        return TAccountPlatform.T_ACCOUNT_PLATFORM.DELETE_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field16() {
        return TAccountPlatform.T_ACCOUNT_PLATFORM.DELETE_USER_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field17() {
        return TAccountPlatform.T_ACCOUNT_PLATFORM.ENABLED;
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
    public UInteger component2() {
        return getUid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getPlatformId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getPlatformToken();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountType component5() {
        return getAccountType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getNickname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getAvatar();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime component8() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component9() {
        return getCreateUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getCreateUserName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime component11() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component12() {
        return getUpdateUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component13() {
        return getUpdateUserName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime component14() {
        return getDeleteTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component15() {
        return getDeleteUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component16() {
        return getDeleteUserName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component17() {
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
    public UInteger value2() {
        return getUid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getPlatformId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getPlatformToken();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountType value5() {
        return getAccountType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getNickname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getAvatar();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value8() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value9() {
        return getCreateUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getCreateUserName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value11() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value12() {
        return getUpdateUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getUpdateUserName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value14() {
        return getDeleteTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value15() {
        return getDeleteUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value16() {
        return getDeleteUserName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value17() {
        return getEnabled();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAccountPlatformRecord value1(UInteger value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAccountPlatformRecord value2(UInteger value) {
        setUid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAccountPlatformRecord value3(String value) {
        setPlatformId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAccountPlatformRecord value4(String value) {
        setPlatformToken(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAccountPlatformRecord value5(AccountType value) {
        setAccountType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAccountPlatformRecord value6(String value) {
        setNickname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAccountPlatformRecord value7(String value) {
        setAvatar(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAccountPlatformRecord value8(LocalDateTime value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAccountPlatformRecord value9(Integer value) {
        setCreateUser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAccountPlatformRecord value10(String value) {
        setCreateUserName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAccountPlatformRecord value11(LocalDateTime value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAccountPlatformRecord value12(Integer value) {
        setUpdateUser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAccountPlatformRecord value13(String value) {
        setUpdateUserName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAccountPlatformRecord value14(LocalDateTime value) {
        setDeleteTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAccountPlatformRecord value15(Integer value) {
        setDeleteUser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAccountPlatformRecord value16(String value) {
        setDeleteUserName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAccountPlatformRecord value17(Boolean value) {
        setEnabled(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAccountPlatformRecord values(UInteger value1, UInteger value2, String value3, String value4, AccountType value5, String value6, String value7, LocalDateTime value8, Integer value9, String value10, LocalDateTime value11, Integer value12, String value13, LocalDateTime value14, Integer value15, String value16, Boolean value17) {
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
        value17(value17);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TAccountPlatformRecord
     */
    public TAccountPlatformRecord() {
        super(TAccountPlatform.T_ACCOUNT_PLATFORM);
    }

    /**
     * Create a detached, initialised TAccountPlatformRecord
     */
    public TAccountPlatformRecord(UInteger id, UInteger uid, String platformId, String platformToken, AccountType accountType, String nickname, String avatar, LocalDateTime createTime, Integer createUser, String createUserName, LocalDateTime updateTime, Integer updateUser, String updateUserName, LocalDateTime deleteTime, Integer deleteUser, String deleteUserName, Boolean enabled) {
        super(TAccountPlatform.T_ACCOUNT_PLATFORM);

        set(0, id);
        set(1, uid);
        set(2, platformId);
        set(3, platformToken);
        set(4, accountType);
        set(5, nickname);
        set(6, avatar);
        set(7, createTime);
        set(8, createUser);
        set(9, createUserName);
        set(10, updateTime);
        set(11, updateUser);
        set(12, updateUserName);
        set(13, deleteTime);
        set(14, deleteUser);
        set(15, deleteUserName);
        set(16, enabled);
    }
}
