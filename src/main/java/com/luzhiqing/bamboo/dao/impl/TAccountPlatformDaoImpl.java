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
        return T_ACCOUNT_PLATFORM.T_ACCOUNT_PLATFORM;
    }

    @Override
    protected Class<TAccountPlatform> getClazz() {
        return TAccountPlatform.class;
    }

    @Override
    public TAccountPlatform selectByOpenId(String openId) {
        return dsl.selectFrom(table)
                .where(table.PLATFORM_ID.eq(openId))
                .fetchOneInto(TAccountPlatform.class);
    }

    @Override
    public TAccountPlatform selectByUid(String uid) {
        return dsl.selectFrom(table)
                .where(table.PLATFORM_ID.eq(uid))
                .fetchOneInto(TAccountPlatform.class);
    }
}
