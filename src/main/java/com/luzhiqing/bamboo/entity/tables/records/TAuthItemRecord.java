/*
 * This file is generated by jOOQ.
*/
package com.luzhiqing.bamboo.entity.tables.records;


import com.luzhiqing.bamboo.entity.tables.TAuthItem;

import java.time.LocalDateTime;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record13;
import org.jooq.Row13;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UByte;
import org.jooq.types.UInteger;


/**
 * 系统权限
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TAuthItemRecord extends UpdatableRecordImpl<TAuthItemRecord> implements Record13<UInteger, UByte, String, LocalDateTime, Integer, String, LocalDateTime, Integer, String, LocalDateTime, Integer, String, Boolean> {

    private static final long serialVersionUID = -173956094;

    /**
     * Setter for <code>bamboo_auth.t_auth_item.id</code>. 自增id
     */
    public void setId(UInteger value) {
        set(0, value);
    }

    /**
     * Getter for <code>bamboo_auth.t_auth_item.id</code>. 自增id
     */
    public UInteger getId() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>bamboo_auth.t_auth_item.sys_id</code>. 系统id
     */
    public void setSysId(UByte value) {
        set(1, value);
    }

    /**
     * Getter for <code>bamboo_auth.t_auth_item.sys_id</code>. 系统id
     */
    public UByte getSysId() {
        return (UByte) get(1);
    }

    /**
     * Setter for <code>bamboo_auth.t_auth_item.menu_id</code>. 页面/接口uri
     */
    public void setMenuId(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>bamboo_auth.t_auth_item.menu_id</code>. 页面/接口uri
     */
    public String getMenuId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>bamboo_auth.t_auth_item.create_time</code>.
     */
    public void setCreateTime(LocalDateTime value) {
        set(3, value);
    }

    /**
     * Getter for <code>bamboo_auth.t_auth_item.create_time</code>.
     */
    public LocalDateTime getCreateTime() {
        return (LocalDateTime) get(3);
    }

    /**
     * Setter for <code>bamboo_auth.t_auth_item.create_user</code>.
     */
    public void setCreateUser(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>bamboo_auth.t_auth_item.create_user</code>.
     */
    public Integer getCreateUser() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>bamboo_auth.t_auth_item.create_user_name</code>.
     */
    public void setCreateUserName(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>bamboo_auth.t_auth_item.create_user_name</code>.
     */
    public String getCreateUserName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>bamboo_auth.t_auth_item.update_time</code>.
     */
    public void setUpdateTime(LocalDateTime value) {
        set(6, value);
    }

    /**
     * Getter for <code>bamboo_auth.t_auth_item.update_time</code>.
     */
    public LocalDateTime getUpdateTime() {
        return (LocalDateTime) get(6);
    }

    /**
     * Setter for <code>bamboo_auth.t_auth_item.update_user</code>.
     */
    public void setUpdateUser(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>bamboo_auth.t_auth_item.update_user</code>.
     */
    public Integer getUpdateUser() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>bamboo_auth.t_auth_item.update_user_name</code>.
     */
    public void setUpdateUserName(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>bamboo_auth.t_auth_item.update_user_name</code>.
     */
    public String getUpdateUserName() {
        return (String) get(8);
    }

    /**
     * Setter for <code>bamboo_auth.t_auth_item.delete_time</code>.
     */
    public void setDeleteTime(LocalDateTime value) {
        set(9, value);
    }

    /**
     * Getter for <code>bamboo_auth.t_auth_item.delete_time</code>.
     */
    public LocalDateTime getDeleteTime() {
        return (LocalDateTime) get(9);
    }

    /**
     * Setter for <code>bamboo_auth.t_auth_item.delete_user</code>.
     */
    public void setDeleteUser(Integer value) {
        set(10, value);
    }

    /**
     * Getter for <code>bamboo_auth.t_auth_item.delete_user</code>.
     */
    public Integer getDeleteUser() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>bamboo_auth.t_auth_item.delete_user_name</code>.
     */
    public void setDeleteUserName(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>bamboo_auth.t_auth_item.delete_user_name</code>.
     */
    public String getDeleteUserName() {
        return (String) get(11);
    }

    /**
     * Setter for <code>bamboo_auth.t_auth_item.enabled</code>.
     */
    public void setEnabled(Boolean value) {
        set(12, value);
    }

    /**
     * Getter for <code>bamboo_auth.t_auth_item.enabled</code>.
     */
    public Boolean getEnabled() {
        return (Boolean) get(12);
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
    // Record13 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<UInteger, UByte, String, LocalDateTime, Integer, String, LocalDateTime, Integer, String, LocalDateTime, Integer, String, Boolean> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<UInteger, UByte, String, LocalDateTime, Integer, String, LocalDateTime, Integer, String, LocalDateTime, Integer, String, Boolean> valuesRow() {
        return (Row13) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field1() {
        return TAuthItem.T_AUTH_ITEM.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UByte> field2() {
        return TAuthItem.T_AUTH_ITEM.SYS_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TAuthItem.T_AUTH_ITEM.MENU_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field4() {
        return TAuthItem.T_AUTH_ITEM.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return TAuthItem.T_AUTH_ITEM.CREATE_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return TAuthItem.T_AUTH_ITEM.CREATE_USER_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field7() {
        return TAuthItem.T_AUTH_ITEM.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return TAuthItem.T_AUTH_ITEM.UPDATE_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return TAuthItem.T_AUTH_ITEM.UPDATE_USER_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field10() {
        return TAuthItem.T_AUTH_ITEM.DELETE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field11() {
        return TAuthItem.T_AUTH_ITEM.DELETE_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return TAuthItem.T_AUTH_ITEM.DELETE_USER_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field13() {
        return TAuthItem.T_AUTH_ITEM.ENABLED;
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
    public UByte component2() {
        return getSysId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getMenuId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime component4() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getCreateUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getCreateUserName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime component7() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component8() {
        return getUpdateUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getUpdateUserName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime component10() {
        return getDeleteTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component11() {
        return getDeleteUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getDeleteUserName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component13() {
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
    public UByte value2() {
        return getSysId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getMenuId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value4() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getCreateUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getCreateUserName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value7() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getUpdateUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getUpdateUserName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value10() {
        return getDeleteTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value11() {
        return getDeleteUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getDeleteUserName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value13() {
        return getEnabled();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAuthItemRecord value1(UInteger value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAuthItemRecord value2(UByte value) {
        setSysId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAuthItemRecord value3(String value) {
        setMenuId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAuthItemRecord value4(LocalDateTime value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAuthItemRecord value5(Integer value) {
        setCreateUser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAuthItemRecord value6(String value) {
        setCreateUserName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAuthItemRecord value7(LocalDateTime value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAuthItemRecord value8(Integer value) {
        setUpdateUser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAuthItemRecord value9(String value) {
        setUpdateUserName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAuthItemRecord value10(LocalDateTime value) {
        setDeleteTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAuthItemRecord value11(Integer value) {
        setDeleteUser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAuthItemRecord value12(String value) {
        setDeleteUserName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAuthItemRecord value13(Boolean value) {
        setEnabled(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAuthItemRecord values(UInteger value1, UByte value2, String value3, LocalDateTime value4, Integer value5, String value6, LocalDateTime value7, Integer value8, String value9, LocalDateTime value10, Integer value11, String value12, Boolean value13) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TAuthItemRecord
     */
    public TAuthItemRecord() {
        super(TAuthItem.T_AUTH_ITEM);
    }

    /**
     * Create a detached, initialised TAuthItemRecord
     */
    public TAuthItemRecord(UInteger id, UByte sysId, String menuId, LocalDateTime createTime, Integer createUser, String createUserName, LocalDateTime updateTime, Integer updateUser, String updateUserName, LocalDateTime deleteTime, Integer deleteUser, String deleteUserName, Boolean enabled) {
        super(TAuthItem.T_AUTH_ITEM);

        set(0, id);
        set(1, sysId);
        set(2, menuId);
        set(3, createTime);
        set(4, createUser);
        set(5, createUserName);
        set(6, updateTime);
        set(7, updateUser);
        set(8, updateUserName);
        set(9, deleteTime);
        set(10, deleteUser);
        set(11, deleteUserName);
        set(12, enabled);
    }
}