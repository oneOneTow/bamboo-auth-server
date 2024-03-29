/*
 * This file is generated by jOOQ.
*/
package com.luzhiqing.bamboo.entity.tables;


import com.luzhiqing.bamboo.constants.converter.AccountTypeConverter;
import com.luzhiqing.bamboo.constants.enums.AccountType;
import com.luzhiqing.bamboo.entity.BambooAuth;
import com.luzhiqing.bamboo.entity.Indexes;
import com.luzhiqing.bamboo.entity.Keys;
import com.luzhiqing.bamboo.entity.tables.records.TAccountPlatformRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.jooq.types.UInteger;

import javax.annotation.Generated;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;


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
public class T_ACCOUNT_PLATFORM extends TableImpl<TAccountPlatformRecord> {

    private static final long serialVersionUID = 381719401;

    /**
     * The reference instance of <code>bamboo_auth.t_account_platform</code>
     */
    public static final T_ACCOUNT_PLATFORM T_ACCOUNT_PLATFORM = new T_ACCOUNT_PLATFORM();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TAccountPlatformRecord> getRecordType() {
        return TAccountPlatformRecord.class;
    }

    /**
     * The column <code>bamboo_auth.t_account_platform.id</code>. 自增id
     */
    public final TableField<TAccountPlatformRecord, UInteger> ID = createField("id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).identity(true), this, "自增id");

    /**
     * The column <code>bamboo_auth.t_account_platform.uid</code>. 账号id
     */
    public final TableField<TAccountPlatformRecord, UInteger> UID = createField("uid", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "账号id");

    /**
     * The column <code>bamboo_auth.t_account_platform.platform_id</code>. 平台id
     */
    public final TableField<TAccountPlatformRecord, String> PLATFORM_ID = createField("platform_id", org.jooq.impl.SQLDataType.VARCHAR(60).nullable(false).defaultValue(DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "平台id");

    /**
     * The column <code>bamboo_auth.t_account_platform.platform_token</code>. 平台access_token
     */
    public final TableField<TAccountPlatformRecord, String> PLATFORM_TOKEN = createField("platform_token", org.jooq.impl.SQLDataType.VARCHAR(60).nullable(false).defaultValue(DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "平台access_token");

    /**
     * The column <code>bamboo_auth.t_account_platform.account_type</code>. 平台类型 0:未知,1:wechat,2:qq
     */
    public final TableField<TAccountPlatformRecord, AccountType> ACCOUNT_TYPE = createField("account_type", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "平台类型 0:未知,1:wechat,2:qq", new AccountTypeConverter());

    /**
     * The column <code>bamboo_auth.t_account_platform.nickname</code>. 昵称
     */
    public final TableField<TAccountPlatformRecord, String> NICKNAME = createField("nickname", org.jooq.impl.SQLDataType.VARCHAR(60).nullable(false).defaultValue(DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "昵称");

    /**
     * The column <code>bamboo_auth.t_account_platform.avatar</code>. 头像
     */
    public final TableField<TAccountPlatformRecord, String> AVATAR = createField("avatar", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false).defaultValue(DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "头像");

    /**
     * The column <code>bamboo_auth.t_account_platform.create_time</code>.
     */
    public final TableField<TAccountPlatformRecord, LocalDateTime> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false), this, "");

    /**
     * The column <code>bamboo_auth.t_account_platform.create_user</code>.
     */
    public final TableField<TAccountPlatformRecord, Integer> CREATE_USER = createField("create_user", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bamboo_auth.t_account_platform.create_user_name</code>.
     */
    public final TableField<TAccountPlatformRecord, String> CREATE_USER_NAME = createField("create_user_name", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>bamboo_auth.t_account_platform.update_time</code>.
     */
    public final TableField<TAccountPlatformRecord, LocalDateTime> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "");

    /**
     * The column <code>bamboo_auth.t_account_platform.update_user</code>.
     */
    public final TableField<TAccountPlatformRecord, Integer> UPDATE_USER = createField("update_user", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>bamboo_auth.t_account_platform.update_user_name</code>.
     */
    public final TableField<TAccountPlatformRecord, String> UPDATE_USER_NAME = createField("update_user_name", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>bamboo_auth.t_account_platform.delete_time</code>.
     */
    public final TableField<TAccountPlatformRecord, LocalDateTime> DELETE_TIME = createField("delete_time", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "");

    /**
     * The column <code>bamboo_auth.t_account_platform.delete_user</code>.
     */
    public final TableField<TAccountPlatformRecord, Integer> DELETE_USER = createField("delete_user", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>bamboo_auth.t_account_platform.delete_user_name</code>.
     */
    public final TableField<TAccountPlatformRecord, String> DELETE_USER_NAME = createField("delete_user_name", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>bamboo_auth.t_account_platform.enabled</code>.
     */
    public final TableField<TAccountPlatformRecord, Boolean> ENABLED = createField("enabled", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(DSL.inline("1", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * Create a <code>bamboo_auth.t_account_platform</code> table reference
     */
    public T_ACCOUNT_PLATFORM() {
        this(DSL.name("t_account_platform"), null);
    }

    /**
     * Create an aliased <code>bamboo_auth.t_account_platform</code> table reference
     */
    public T_ACCOUNT_PLATFORM(String alias) {
        this(DSL.name(alias), T_ACCOUNT_PLATFORM);
    }

    /**
     * Create an aliased <code>bamboo_auth.t_account_platform</code> table reference
     */
    public T_ACCOUNT_PLATFORM(Name alias) {
        this(alias, T_ACCOUNT_PLATFORM);
    }

    private T_ACCOUNT_PLATFORM(Name alias, Table<TAccountPlatformRecord> aliased) {
        this(alias, aliased, null);
    }

    private T_ACCOUNT_PLATFORM(Name alias, Table<TAccountPlatformRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "第三方用户信息");
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
        return Arrays.<Index>asList(Indexes.T_ACCOUNT_PLATFORM_IDX_PLATFORM_ID, Indexes.T_ACCOUNT_PLATFORM_IDX_UID, Indexes.T_ACCOUNT_PLATFORM_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<TAccountPlatformRecord, UInteger> getIdentity() {
        return Keys.IDENTITY_T_ACCOUNT_PLATFORM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TAccountPlatformRecord> getPrimaryKey() {
        return Keys.KEY_T_ACCOUNT_PLATFORM_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TAccountPlatformRecord>> getKeys() {
        return Arrays.<UniqueKey<TAccountPlatformRecord>>asList(Keys.KEY_T_ACCOUNT_PLATFORM_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public T_ACCOUNT_PLATFORM as(String alias) {
        return new T_ACCOUNT_PLATFORM(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public T_ACCOUNT_PLATFORM as(Name alias) {
        return new T_ACCOUNT_PLATFORM(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public T_ACCOUNT_PLATFORM rename(String name) {
        return new T_ACCOUNT_PLATFORM(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public T_ACCOUNT_PLATFORM rename(Name name) {
        return new T_ACCOUNT_PLATFORM(name, null);
    }
}
