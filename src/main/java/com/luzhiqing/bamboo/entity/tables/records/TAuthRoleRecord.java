/*
 * This file is generated by jOOQ.
*/
package com.luzhiqing.bamboo.entity.tables.records;


import com.luzhiqing.bamboo.entity.tables.T_AUTH_ROLE;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record14;
import org.jooq.Row14;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UInteger;

import javax.annotation.Generated;
import java.time.LocalDateTime;


/**
 * 员工角色
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TAuthRoleRecord extends UpdatableRecordImpl<TAuthRoleRecord> implements Record14<UInteger, String, String, String, LocalDateTime, Integer, String, LocalDateTime, Integer, String, LocalDateTime, Integer, String, Boolean> {

    private static final long serialVersionUID = -348782409;

    /**
     * Setter for <code>bamboo_auth.t_auth_role.id</code>. 自增id
     */
    public void setId(UInteger value) {
        set(0, value);
    }

    /**
     * Getter for <code>bamboo_auth.t_auth_role.id</code>. 自增id
     */
    public UInteger getId() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>bamboo_auth.t_auth_role.role_name</code>. 角色名称
     */
    public void setRoleName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>bamboo_auth.t_auth_role.role_name</code>. 角色名称
     */
    public String getRoleName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>bamboo_auth.t_auth_role.role_desc</code>. 角色描述
     */
    public void setRoleDesc(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>bamboo_auth.t_auth_role.role_desc</code>. 角色描述
     */
    public String getRoleDesc() {
        return (String) get(2);
    }

    /**
     * Setter for <code>bamboo_auth.t_auth_role.auth_item_set</code>. 权限集合 多个值,号隔开
     */
    public void setAuthItemSet(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>bamboo_auth.t_auth_role.auth_item_set</code>. 权限集合 多个值,号隔开
     */
    public String getAuthItemSet() {
        return (String) get(3);
    }

    /**
     * Setter for <code>bamboo_auth.t_auth_role.create_time</code>.
     */
    public void setCreateTime(LocalDateTime value) {
        set(4, value);
    }

    /**
     * Getter for <code>bamboo_auth.t_auth_role.create_time</code>.
     */
    public LocalDateTime getCreateTime() {
        return (LocalDateTime) get(4);
    }

    /**
     * Setter for <code>bamboo_auth.t_auth_role.create_user</code>.
     */
    public void setCreateUser(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>bamboo_auth.t_auth_role.create_user</code>.
     */
    public Integer getCreateUser() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>bamboo_auth.t_auth_role.create_user_name</code>.
     */
    public void setCreateUserName(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>bamboo_auth.t_auth_role.create_user_name</code>.
     */
    public String getCreateUserName() {
        return (String) get(6);
    }

    /**
     * Setter for <code>bamboo_auth.t_auth_role.update_time</code>.
     */
    public void setUpdateTime(LocalDateTime value) {
        set(7, value);
    }

    /**
     * Getter for <code>bamboo_auth.t_auth_role.update_time</code>.
     */
    public LocalDateTime getUpdateTime() {
        return (LocalDateTime) get(7);
    }

    /**
     * Setter for <code>bamboo_auth.t_auth_role.update_user</code>.
     */
    public void setUpdateUser(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>bamboo_auth.t_auth_role.update_user</code>.
     */
    public Integer getUpdateUser() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>bamboo_auth.t_auth_role.update_user_name</code>.
     */
    public void setUpdateUserName(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>bamboo_auth.t_auth_role.update_user_name</code>.
     */
    public String getUpdateUserName() {
        return (String) get(9);
    }

    /**
     * Setter for <code>bamboo_auth.t_auth_role.delete_time</code>.
     */
    public void setDeleteTime(LocalDateTime value) {
        set(10, value);
    }

    /**
     * Getter for <code>bamboo_auth.t_auth_role.delete_time</code>.
     */
    public LocalDateTime getDeleteTime() {
        return (LocalDateTime) get(10);
    }

    /**
     * Setter for <code>bamboo_auth.t_auth_role.delete_user</code>.
     */
    public void setDeleteUser(Integer value) {
        set(11, value);
    }

    /**
     * Getter for <code>bamboo_auth.t_auth_role.delete_user</code>.
     */
    public Integer getDeleteUser() {
        return (Integer) get(11);
    }

    /**
     * Setter for <code>bamboo_auth.t_auth_role.delete_user_name</code>.
     */
    public void setDeleteUserName(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>bamboo_auth.t_auth_role.delete_user_name</code>.
     */
    public String getDeleteUserName() {
        return (String) get(12);
    }

    /**
     * Setter for <code>bamboo_auth.t_auth_role.enabled</code>.
     */
    public void setEnabled(Boolean value) {
        set(13, value);
    }

    /**
     * Getter for <code>bamboo_auth.t_auth_role.enabled</code>.
     */
    public Boolean getEnabled() {
        return (Boolean) get(13);
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
    // Record14 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row14<UInteger, String, String, String, LocalDateTime, Integer, String, LocalDateTime, Integer, String, LocalDateTime, Integer, String, Boolean> fieldsRow() {
        return (Row14) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row14<UInteger, String, String, String, LocalDateTime, Integer, String, LocalDateTime, Integer, String, LocalDateTime, Integer, String, Boolean> valuesRow() {
        return (Row14) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field1() {
        return T_AUTH_ROLE.T_AUTH_ROLE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return T_AUTH_ROLE.T_AUTH_ROLE.ROLE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return T_AUTH_ROLE.T_AUTH_ROLE.ROLE_DESC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return T_AUTH_ROLE.T_AUTH_ROLE.AUTH_ITEM_SET;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field5() {
        return T_AUTH_ROLE.T_AUTH_ROLE.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return T_AUTH_ROLE.T_AUTH_ROLE.CREATE_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return T_AUTH_ROLE.T_AUTH_ROLE.CREATE_USER_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field8() {
        return T_AUTH_ROLE.T_AUTH_ROLE.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return T_AUTH_ROLE.T_AUTH_ROLE.UPDATE_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return T_AUTH_ROLE.T_AUTH_ROLE.UPDATE_USER_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field11() {
        return T_AUTH_ROLE.T_AUTH_ROLE.DELETE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field12() {
        return T_AUTH_ROLE.T_AUTH_ROLE.DELETE_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return T_AUTH_ROLE.T_AUTH_ROLE.DELETE_USER_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field14() {
        return T_AUTH_ROLE.T_AUTH_ROLE.ENABLED;
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
        return getRoleName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getRoleDesc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getAuthItemSet();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime component5() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getCreateUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getCreateUserName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime component8() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component9() {
        return getUpdateUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getUpdateUserName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime component11() {
        return getDeleteTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component12() {
        return getDeleteUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component13() {
        return getDeleteUserName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component14() {
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
        return getRoleName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getRoleDesc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getAuthItemSet();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value5() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getCreateUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getCreateUserName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value8() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value9() {
        return getUpdateUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getUpdateUserName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value11() {
        return getDeleteTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value12() {
        return getDeleteUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getDeleteUserName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value14() {
        return getEnabled();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAuthRoleRecord value1(UInteger value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAuthRoleRecord value2(String value) {
        setRoleName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAuthRoleRecord value3(String value) {
        setRoleDesc(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAuthRoleRecord value4(String value) {
        setAuthItemSet(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAuthRoleRecord value5(LocalDateTime value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAuthRoleRecord value6(Integer value) {
        setCreateUser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAuthRoleRecord value7(String value) {
        setCreateUserName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAuthRoleRecord value8(LocalDateTime value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAuthRoleRecord value9(Integer value) {
        setUpdateUser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAuthRoleRecord value10(String value) {
        setUpdateUserName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAuthRoleRecord value11(LocalDateTime value) {
        setDeleteTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAuthRoleRecord value12(Integer value) {
        setDeleteUser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAuthRoleRecord value13(String value) {
        setDeleteUserName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAuthRoleRecord value14(Boolean value) {
        setEnabled(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAuthRoleRecord values(UInteger value1, String value2, String value3, String value4, LocalDateTime value5, Integer value6, String value7, LocalDateTime value8, Integer value9, String value10, LocalDateTime value11, Integer value12, String value13, Boolean value14) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TAuthRoleRecord
     */
    public TAuthRoleRecord() {
        super(T_AUTH_ROLE.T_AUTH_ROLE);
    }

    /**
     * Create a detached, initialised TAuthRoleRecord
     */
    public TAuthRoleRecord(UInteger id, String roleName, String roleDesc, String authItemSet, LocalDateTime createTime, Integer createUser, String createUserName, LocalDateTime updateTime, Integer updateUser, String updateUserName, LocalDateTime deleteTime, Integer deleteUser, String deleteUserName, Boolean enabled) {
        super(T_AUTH_ROLE.T_AUTH_ROLE);

        set(0, id);
        set(1, roleName);
        set(2, roleDesc);
        set(3, authItemSet);
        set(4, createTime);
        set(5, createUser);
        set(6, createUserName);
        set(7, updateTime);
        set(8, updateUser);
        set(9, updateUserName);
        set(10, deleteTime);
        set(11, deleteUser);
        set(12, deleteUserName);
        set(13, enabled);
    }
}
