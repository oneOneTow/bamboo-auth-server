package com.luzhiqing.bamboo.dao.impl;

import com.luzhiqing.bamboo.dao.AccountDao;
import com.luzhiqing.bamboo.entity.tables.T_ACCOUNT_USER;
import com.luzhiqing.bamboo.entity.tables.pojos.TAccountUser;
import com.luzhiqing.bamboo.entity.tables.records.TAccountUserRecord;
import com.luzhiqing.common.jooq.AbstractBaseJooqDao;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDaoImpl
        extends AbstractBaseJooqDao<TAccountUserRecord, T_ACCOUNT_USER, TAccountUser>
        implements AccountDao {
    @Override
    protected T_ACCOUNT_USER getTable() {
        return T_ACCOUNT_USER.T_ACCOUNT_USER;
    }

    @Override
    protected Class<TAccountUser> getClazz() {
        return TAccountUser.class;
    }
}
