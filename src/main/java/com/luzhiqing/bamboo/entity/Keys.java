/*
 * This file is generated by jOOQ.
*/
package com.luzhiqing.bamboo.entity;


import com.luzhiqing.bamboo.entity.tables.TAccountPlatform;
import com.luzhiqing.bamboo.entity.tables.TAccountUser;
import com.luzhiqing.bamboo.entity.tables.TAuthItem;
import com.luzhiqing.bamboo.entity.tables.TAuthRole;
import com.luzhiqing.bamboo.entity.tables.TAuthRoleStaffMapping;
import com.luzhiqing.bamboo.entity.tables.TAuthSys;
import com.luzhiqing.bamboo.entity.tables.TAuthSysMenu;
import com.luzhiqing.bamboo.entity.tables.TBambooUser;
import com.luzhiqing.bamboo.entity.tables.TStaff;
import com.luzhiqing.bamboo.entity.tables.records.TAccountPlatformRecord;
import com.luzhiqing.bamboo.entity.tables.records.TAccountUserRecord;
import com.luzhiqing.bamboo.entity.tables.records.TAuthItemRecord;
import com.luzhiqing.bamboo.entity.tables.records.TAuthRoleRecord;
import com.luzhiqing.bamboo.entity.tables.records.TAuthRoleStaffMappingRecord;
import com.luzhiqing.bamboo.entity.tables.records.TAuthSysMenuRecord;
import com.luzhiqing.bamboo.entity.tables.records.TAuthSysRecord;
import com.luzhiqing.bamboo.entity.tables.records.TBambooUserRecord;
import com.luzhiqing.bamboo.entity.tables.records.TStaffRecord;

import javax.annotation.Generated;

import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;
import org.jooq.types.UInteger;
import org.jooq.types.UShort;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>bamboo_auth</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<TAccountPlatformRecord, UInteger> IDENTITY_T_ACCOUNT_PLATFORM = Identities0.IDENTITY_T_ACCOUNT_PLATFORM;
    public static final Identity<TAccountUserRecord, UInteger> IDENTITY_T_ACCOUNT_USER = Identities0.IDENTITY_T_ACCOUNT_USER;
    public static final Identity<TAuthItemRecord, UInteger> IDENTITY_T_AUTH_ITEM = Identities0.IDENTITY_T_AUTH_ITEM;
    public static final Identity<TAuthRoleRecord, UInteger> IDENTITY_T_AUTH_ROLE = Identities0.IDENTITY_T_AUTH_ROLE;
    public static final Identity<TAuthRoleStaffMappingRecord, UInteger> IDENTITY_T_AUTH_ROLE_STAFF_MAPPING = Identities0.IDENTITY_T_AUTH_ROLE_STAFF_MAPPING;
    public static final Identity<TAuthSysRecord, UShort> IDENTITY_T_AUTH_SYS = Identities0.IDENTITY_T_AUTH_SYS;
    public static final Identity<TAuthSysMenuRecord, UInteger> IDENTITY_T_AUTH_SYS_MENU = Identities0.IDENTITY_T_AUTH_SYS_MENU;
    public static final Identity<TBambooUserRecord, UInteger> IDENTITY_T_BAMBOO_USER = Identities0.IDENTITY_T_BAMBOO_USER;
    public static final Identity<TStaffRecord, UInteger> IDENTITY_T_STAFF = Identities0.IDENTITY_T_STAFF;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<TAccountPlatformRecord> KEY_T_ACCOUNT_PLATFORM_PRIMARY = UniqueKeys0.KEY_T_ACCOUNT_PLATFORM_PRIMARY;
    public static final UniqueKey<TAccountUserRecord> KEY_T_ACCOUNT_USER_PRIMARY = UniqueKeys0.KEY_T_ACCOUNT_USER_PRIMARY;
    public static final UniqueKey<TAuthItemRecord> KEY_T_AUTH_ITEM_PRIMARY = UniqueKeys0.KEY_T_AUTH_ITEM_PRIMARY;
    public static final UniqueKey<TAuthRoleRecord> KEY_T_AUTH_ROLE_PRIMARY = UniqueKeys0.KEY_T_AUTH_ROLE_PRIMARY;
    public static final UniqueKey<TAuthRoleStaffMappingRecord> KEY_T_AUTH_ROLE_STAFF_MAPPING_PRIMARY = UniqueKeys0.KEY_T_AUTH_ROLE_STAFF_MAPPING_PRIMARY;
    public static final UniqueKey<TAuthSysRecord> KEY_T_AUTH_SYS_PRIMARY = UniqueKeys0.KEY_T_AUTH_SYS_PRIMARY;
    public static final UniqueKey<TAuthSysMenuRecord> KEY_T_AUTH_SYS_MENU_PRIMARY = UniqueKeys0.KEY_T_AUTH_SYS_MENU_PRIMARY;
    public static final UniqueKey<TBambooUserRecord> KEY_T_BAMBOO_USER_PRIMARY = UniqueKeys0.KEY_T_BAMBOO_USER_PRIMARY;
    public static final UniqueKey<TStaffRecord> KEY_T_STAFF_PRIMARY = UniqueKeys0.KEY_T_STAFF_PRIMARY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 {
        public static Identity<TAccountPlatformRecord, UInteger> IDENTITY_T_ACCOUNT_PLATFORM = Internal.createIdentity(TAccountPlatform.T_ACCOUNT_PLATFORM, TAccountPlatform.T_ACCOUNT_PLATFORM.ID);
        public static Identity<TAccountUserRecord, UInteger> IDENTITY_T_ACCOUNT_USER = Internal.createIdentity(TAccountUser.T_ACCOUNT_USER, TAccountUser.T_ACCOUNT_USER.ID);
        public static Identity<TAuthItemRecord, UInteger> IDENTITY_T_AUTH_ITEM = Internal.createIdentity(TAuthItem.T_AUTH_ITEM, TAuthItem.T_AUTH_ITEM.ID);
        public static Identity<TAuthRoleRecord, UInteger> IDENTITY_T_AUTH_ROLE = Internal.createIdentity(TAuthRole.T_AUTH_ROLE, TAuthRole.T_AUTH_ROLE.ID);
        public static Identity<TAuthRoleStaffMappingRecord, UInteger> IDENTITY_T_AUTH_ROLE_STAFF_MAPPING = Internal.createIdentity(TAuthRoleStaffMapping.T_AUTH_ROLE_STAFF_MAPPING, TAuthRoleStaffMapping.T_AUTH_ROLE_STAFF_MAPPING.ID);
        public static Identity<TAuthSysRecord, UShort> IDENTITY_T_AUTH_SYS = Internal.createIdentity(TAuthSys.T_AUTH_SYS, TAuthSys.T_AUTH_SYS.ID);
        public static Identity<TAuthSysMenuRecord, UInteger> IDENTITY_T_AUTH_SYS_MENU = Internal.createIdentity(TAuthSysMenu.T_AUTH_SYS_MENU, TAuthSysMenu.T_AUTH_SYS_MENU.ID);
        public static Identity<TBambooUserRecord, UInteger> IDENTITY_T_BAMBOO_USER = Internal.createIdentity(TBambooUser.T_BAMBOO_USER, TBambooUser.T_BAMBOO_USER.ID);
        public static Identity<TStaffRecord, UInteger> IDENTITY_T_STAFF = Internal.createIdentity(TStaff.T_STAFF, TStaff.T_STAFF.ID);
    }

    private static class UniqueKeys0 {
        public static final UniqueKey<TAccountPlatformRecord> KEY_T_ACCOUNT_PLATFORM_PRIMARY = Internal.createUniqueKey(TAccountPlatform.T_ACCOUNT_PLATFORM, "KEY_t_account_platform_PRIMARY", TAccountPlatform.T_ACCOUNT_PLATFORM.ID);
        public static final UniqueKey<TAccountUserRecord> KEY_T_ACCOUNT_USER_PRIMARY = Internal.createUniqueKey(TAccountUser.T_ACCOUNT_USER, "KEY_t_account_user_PRIMARY", TAccountUser.T_ACCOUNT_USER.ID);
        public static final UniqueKey<TAuthItemRecord> KEY_T_AUTH_ITEM_PRIMARY = Internal.createUniqueKey(TAuthItem.T_AUTH_ITEM, "KEY_t_auth_item_PRIMARY", TAuthItem.T_AUTH_ITEM.ID);
        public static final UniqueKey<TAuthRoleRecord> KEY_T_AUTH_ROLE_PRIMARY = Internal.createUniqueKey(TAuthRole.T_AUTH_ROLE, "KEY_t_auth_role_PRIMARY", TAuthRole.T_AUTH_ROLE.ID);
        public static final UniqueKey<TAuthRoleStaffMappingRecord> KEY_T_AUTH_ROLE_STAFF_MAPPING_PRIMARY = Internal.createUniqueKey(TAuthRoleStaffMapping.T_AUTH_ROLE_STAFF_MAPPING, "KEY_t_auth_role_staff_mapping_PRIMARY", TAuthRoleStaffMapping.T_AUTH_ROLE_STAFF_MAPPING.ID);
        public static final UniqueKey<TAuthSysRecord> KEY_T_AUTH_SYS_PRIMARY = Internal.createUniqueKey(TAuthSys.T_AUTH_SYS, "KEY_t_auth_sys_PRIMARY", TAuthSys.T_AUTH_SYS.ID);
        public static final UniqueKey<TAuthSysMenuRecord> KEY_T_AUTH_SYS_MENU_PRIMARY = Internal.createUniqueKey(TAuthSysMenu.T_AUTH_SYS_MENU, "KEY_t_auth_sys_menu_PRIMARY", TAuthSysMenu.T_AUTH_SYS_MENU.ID);
        public static final UniqueKey<TBambooUserRecord> KEY_T_BAMBOO_USER_PRIMARY = Internal.createUniqueKey(TBambooUser.T_BAMBOO_USER, "KEY_t_bamboo_user_PRIMARY", TBambooUser.T_BAMBOO_USER.ID);
        public static final UniqueKey<TStaffRecord> KEY_T_STAFF_PRIMARY = Internal.createUniqueKey(TStaff.T_STAFF, "KEY_t_staff_PRIMARY", TStaff.T_STAFF.ID);
    }
}