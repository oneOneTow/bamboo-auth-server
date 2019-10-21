package com.luzhiqing.bamboo.dao.impl;

import com.luzhiqing.bamboo.dao.TAccountPlatformDao;
import com.luzhiqing.bamboo.entity.tables.T_ACCOUNT_PLATFORM;
import com.luzhiqing.bamboo.entity.tables.pojos.TAccountPlatform;
import com.luzhiqing.bamboo.entity.tables.records.TAccountPlatformRecord;
import com.luzhiqing.common.jooq.AbstractBaseJooqDao;
import org.springframework.stereotype.Repository;

@Repository
public class TAccountPlatformDaoImpl extends
        AbstractBaseJooqDao<TAccountPlatformRecord, T_ACCOUNT_PLATFORM, TAccountPlatform>
        implements TAccountPlatformDao {
    @Override
    protected T_ACCOUNT_PLATFORM getTable() {
        return null;
    }

    @Override
    protected Class<TAccountPlatform> getClazz() {
        return null;
    }
}
