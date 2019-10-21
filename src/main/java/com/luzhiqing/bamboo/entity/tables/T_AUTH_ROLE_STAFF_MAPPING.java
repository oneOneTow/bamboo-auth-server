/*
 * This file is generated by jOOQ.
*/
package com.luzhiqing.bamboo.entity.tables;


import com.luzhiqing.bamboo.entity.BambooAuth;
import com.luzhiqing.bamboo.entity.Indexes;
import com.luzhiqing.bamboo.entity.Keys;
import com.luzhiqing.bamboo.entity.tables.records.TAuthRoleStaffMappingRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.jooq.types.UInteger;

import javax.annotation.Generated;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;


/**
 * 权限角色与员工关系
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class T_AUTH_ROLE_STAFF_MAPPING extends TableImpl<TAuthRoleStaffMappingRecord> {

    private static final long serialVersionUID = -1127258544;

    /**
     * The reference instance of <code>bamboo_auth.t_auth_role_staff_mapping</code>
     */
    public static final T_AUTH_ROLE_STAFF_MAPPING T_AUTH_ROLE_STAFF_MAPPING = new T_AUTH_ROLE_STAFF_MAPPING();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TAuthRoleStaffMappingRecord> getRecordType() {
        return TAuthRoleStaffMappingRecord.class;
    }

    /**
     * The column <code>bamboo_auth.t_auth_role_staff_mapping.id</code>. 自增id
     */
    public final TableField<TAuthRoleStaffMappingRecord, UInteger> ID = createField("id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).identity(true), this, "自增id");

    /**
     * The column <code>bamboo_auth.t_auth_role_staff_mapping.staff_id</code>. 员工id
     */
    public final TableField<TAuthRoleStaffMappingRecord, UInteger> STAFF_ID = createField("staff_id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "员工id");

    /**
     * The column <code>bamboo_auth.t_auth_role_staff_mapping.role_set</code>. 角色集合 多个值,号隔开
     */
    public final TableField<TAuthRoleStaffMappingRecord, String> ROLE_SET = createField("role_set", org.jooq.impl.SQLDataType.CLOB, this, "角色集合 多个值,号隔开");

    /**
     * The column <code>bamboo_auth.t_auth_role_staff_mapping.create_time</code>.
     */
    public final TableField<TAuthRoleStaffMappingRecord, LocalDateTime> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false), this, "");

    /**
     * The column <code>bamboo_auth.t_auth_role_staff_mapping.create_user</code>.
     */
    public final TableField<TAuthRoleStaffMappingRecord, Integer> CREATE_USER = createField("create_user", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bamboo_auth.t_auth_role_staff_mapping.create_user_name</code>.
     */
    public final TableField<TAuthRoleStaffMappingRecord, String> CREATE_USER_NAME = createField("create_user_name", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>bamboo_auth.t_auth_role_staff_mapping.update_time</code>.
     */
    public final TableField<TAuthRoleStaffMappingRecord, LocalDateTime> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "");

    /**
     * The column <code>bamboo_auth.t_auth_role_staff_mapping.update_user</code>.
     */
    public final TableField<TAuthRoleStaffMappingRecord, Integer> UPDATE_USER = createField("update_user", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>bamboo_auth.t_auth_role_staff_mapping.update_user_name</code>.
     */
    public final TableField<TAuthRoleStaffMappingRecord, String> UPDATE_USER_NAME = createField("update_user_name", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>bamboo_auth.t_auth_role_staff_mapping.delete_time</code>.
     */
    public final TableField<TAuthRoleStaffMappingRecord, LocalDateTime> DELETE_TIME = createField("delete_time", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "");

    /**
     * The column <code>bamboo_auth.t_auth_role_staff_mapping.delete_user</code>.
     */
    public final TableField<TAuthRoleStaffMappingRecord, Integer> DELETE_USER = createField("delete_user", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>bamboo_auth.t_auth_role_staff_mapping.delete_user_name</code>.
     */
    public final TableField<TAuthRoleStaffMappingRecord, String> DELETE_USER_NAME = createField("delete_user_name", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>bamboo_auth.t_auth_role_staff_mapping.enabled</code>.
     */
    public final TableField<TAuthRoleStaffMappingRecord, Boolean> ENABLED = createField("enabled", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(DSL.inline("1", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * Create a <code>bamboo_auth.t_auth_role_staff_mapping</code> table reference
     */
    public T_AUTH_ROLE_STAFF_MAPPING() {
        this(DSL.name("t_auth_role_staff_mapping"), null);
    }

    /**
     * Create an aliased <code>bamboo_auth.t_auth_role_staff_mapping</code> table reference
     */
    public T_AUTH_ROLE_STAFF_MAPPING(String alias) {
        this(DSL.name(alias), T_AUTH_ROLE_STAFF_MAPPING);
    }

    /**
     * Create an aliased <code>bamboo_auth.t_auth_role_staff_mapping</code> table reference
     */
    public T_AUTH_ROLE_STAFF_MAPPING(Name alias) {
        this(alias, T_AUTH_ROLE_STAFF_MAPPING);
    }

    private T_AUTH_ROLE_STAFF_MAPPING(Name alias, Table<TAuthRoleStaffMappingRecord> aliased) {
        this(alias, aliased, null);
    }

    private T_AUTH_ROLE_STAFF_MAPPING(Name alias, Table<TAuthRoleStaffMappingRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "权限角色与员工关系");
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
        return Arrays.<Index>asList(Indexes.T_AUTH_ROLE_STAFF_MAPPING_IDX_STAFF_ID, Indexes.T_AUTH_ROLE_STAFF_MAPPING_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<TAuthRoleStaffMappingRecord, UInteger> getIdentity() {
        return Keys.IDENTITY_T_AUTH_ROLE_STAFF_MAPPING;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TAuthRoleStaffMappingRecord> getPrimaryKey() {
        return Keys.KEY_T_AUTH_ROLE_STAFF_MAPPING_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TAuthRoleStaffMappingRecord>> getKeys() {
        return Arrays.<UniqueKey<TAuthRoleStaffMappingRecord>>asList(Keys.KEY_T_AUTH_ROLE_STAFF_MAPPING_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public T_AUTH_ROLE_STAFF_MAPPING as(String alias) {
        return new T_AUTH_ROLE_STAFF_MAPPING(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public T_AUTH_ROLE_STAFF_MAPPING as(Name alias) {
        return new T_AUTH_ROLE_STAFF_MAPPING(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public T_AUTH_ROLE_STAFF_MAPPING rename(String name) {
        return new T_AUTH_ROLE_STAFF_MAPPING(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public T_AUTH_ROLE_STAFF_MAPPING rename(Name name) {
        return new T_AUTH_ROLE_STAFF_MAPPING(name, null);
    }
}
