package com.luzhiqing.bamboo.dao.impl;

import com.luzhiqing.bamboo.dao.BambooUserDao;
import com.luzhiqing.bamboo.entity.tables.T_BAMBOO_USER;
import com.luzhiqing.bamboo.entity.tables.pojos.TBambooUser;
import com.luzhiqing.bamboo.entity.tables.records.TBambooUserRecord;
import com.luzhiqing.common.jooq.AbstractBaseJooqDao;
import org.jooq.types.UInteger;

/**
 * @Description:
 * @version:
 * @Author: 陆志庆
 * @CreateDate: 2019/10/9 19:40
 */
public class BambooUserDaoImpl
        extends AbstractBaseJooqDao<TBambooUserRecord, T_BAMBOO_USER, TBambooUser>
        implements BambooUserDao {

    @Override
    protected T_BAMBOO_USER getTable() {
        return T_BAMBOO_USER.T_BAMBOO_USER;
    }

    @Override
    protected Class<TBambooUser> getClazz() {
        return TBambooUser.class;
    }


    @Override
    public TBambooUser findByUid(Integer id) {
        return dsl.selectFrom(table)
                .where(table.UID.eq(UInteger.valueOf(id)))
                .fetchOneInto(TBambooUser.class);
    }
}
