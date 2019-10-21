/*
 * This file is generated by jOOQ.
*/
package com.luzhiqing.bamboo.entity.tables;


import com.luzhiqing.bamboo.constants.converter.GenderTypeConverter;
import com.luzhiqing.bamboo.constants.enums.GenderType;
import com.luzhiqing.bamboo.entity.BambooAuth;
import com.luzhiqing.bamboo.entity.Indexes;
import com.luzhiqing.bamboo.entity.Keys;
import com.luzhiqing.bamboo.entity.tables.records.TBambooUserRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.jooq.types.UByte;
import org.jooq.types.UInteger;

import javax.annotation.Generated;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;


/**
 * 账户信息
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class T_BAMBOO_USER extends TableImpl<TBambooUserRecord> {

    private static final long serialVersionUID = -1505022630;

    /**
     * The reference instance of <code>bamboo_auth.t_bamboo_user</code>
     */
    public static final T_BAMBOO_USER T_BAMBOO_USER = new T_BAMBOO_USER();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TBambooUserRecord> getRecordType() {
        return TBambooUserRecord.class;
    }

    /**
     * The column <code>bamboo_auth.t_bamboo_user.id</code>. 用户id
     */
    public final TableField<TBambooUserRecord, UInteger> ID = createField("id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).identity(true), this, "用户id");

    /**
     * The column <code>bamboo_auth.t_bamboo_user.uid</code>. 账号id
     */
    public final TableField<TBambooUserRecord, UInteger> UID = createField("uid", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "账号id");

    /**
     * The column <code>bamboo_auth.t_bamboo_user.nickname</code>. 昵称
     */
    public final TableField<TBambooUserRecord, String> NICKNAME = createField("nickname", org.jooq.impl.SQLDataType.VARCHAR(30).nullable(false).defaultValue(DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "昵称");

    /**
     * The column <code>bamboo_auth.t_bamboo_user.avatar</code>. 头像(相对路径)
     */
    public final TableField<TBambooUserRecord, String> AVATAR = createField("avatar", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false).defaultValue(DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "头像(相对路径)");

    /**
     * The column <code>bamboo_auth.t_bamboo_user.gender</code>. 性别
     */
    public final TableField<TBambooUserRecord, GenderType> GENDER = createField("gender", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "性别", new GenderTypeConverter());

    /**
     * The column <code>bamboo_auth.t_bamboo_user.user_role</code>. 角色 0:普通用户 1:vip
     */
    public final TableField<TBambooUserRecord, UByte> USER_ROLE = createField("user_role", org.jooq.impl.SQLDataType.TINYINTUNSIGNED.nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.TINYINTUNSIGNED)), this, "角色 0:普通用户 1:vip");

    /**
     * The column <code>bamboo_auth.t_bamboo_user.create_time</code>.
     */
    public final TableField<TBambooUserRecord, LocalDateTime> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false), this, "");

    /**
     * The column <code>bamboo_auth.t_bamboo_user.create_user</code>.
     */
    public final TableField<TBambooUserRecord, Integer> CREATE_USER = createField("create_user", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bamboo_auth.t_bamboo_user.create_user_name</code>.
     */
    public final TableField<TBambooUserRecord, String> CREATE_USER_NAME = createField("create_user_name", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>bamboo_auth.t_bamboo_user.update_time</code>.
     */
    public final TableField<TBambooUserRecord, LocalDateTime> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "");

    /**
     * The column <code>bamboo_auth.t_bamboo_user.update_user</code>.
     */
    public final TableField<TBambooUserRecord, Integer> UPDATE_USER = createField("update_user", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>bamboo_auth.t_bamboo_user.update_user_name</code>.
     */
    public final TableField<TBambooUserRecord, String> UPDATE_USER_NAME = createField("update_user_name", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>bamboo_auth.t_bamboo_user.delete_time</code>.
     */
    public final TableField<TBambooUserRecord, LocalDateTime> DELETE_TIME = createField("delete_time", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "");

    /**
     * The column <code>bamboo_auth.t_bamboo_user.delete_user</code>.
     */
    public final TableField<TBambooUserRecord, Integer> DELETE_USER = createField("delete_user", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>bamboo_auth.t_bamboo_user.delete_user_name</code>.
     */
    public final TableField<TBambooUserRecord, String> DELETE_USER_NAME = createField("delete_user_name", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>bamboo_auth.t_bamboo_user.enabled</code>.
     */
    public final TableField<TBambooUserRecord, Boolean> ENABLED = createField("enabled", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(DSL.inline("1", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * Create a <code>bamboo_auth.t_bamboo_user</code> table reference
     */
    public T_BAMBOO_USER() {
        this(DSL.name("t_bamboo_user"), null);
    }

    /**
     * Create an aliased <code>bamboo_auth.t_bamboo_user</code> table reference
     */
    public T_BAMBOO_USER(String alias) {
        this(DSL.name(alias), T_BAMBOO_USER);
    }

    /**
     * Create an aliased <code>bamboo_auth.t_bamboo_user</code> table reference
     */
    public T_BAMBOO_USER(Name alias) {
        this(alias, T_BAMBOO_USER);
    }

    private T_BAMBOO_USER(Name alias, Table<TBambooUserRecord> aliased) {
        this(alias, aliased, null);
    }

    private T_BAMBOO_USER(Name alias, Table<TBambooUserRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "账户信息");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return BambooAuth.BAMBOO_AUTH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.T_BAMBOO_USER_IDX_UID, Indexes.T_BAMBOO_USER_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<TBambooUserRecord, UInteger> getIdentity() {
        return Keys.IDENTITY_T_BAMBOO_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TBambooUserRecord> getPrimaryKey() {
        return Keys.KEY_T_BAMBOO_USER_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TBambooUserRecord>> getKeys() {
        return Arrays.<UniqueKey<TBambooUserRecord>>asList(Keys.KEY_T_BAMBOO_USER_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public T_BAMBOO_USER as(String alias) {
        return new T_BAMBOO_USER(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public T_BAMBOO_USER as(Name alias) {
        return new T_BAMBOO_USER(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public T_BAMBOO_USER rename(String name) {
        return new T_BAMBOO_USER(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public T_BAMBOO_USER rename(Name name) {
        return new T_BAMBOO_USER(name, null);
    }
}