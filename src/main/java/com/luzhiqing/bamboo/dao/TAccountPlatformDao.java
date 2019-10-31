package com.luzhiqing.bamboo.dao;

import com.luzhiqing.bamboo.entity.tables.pojos.TAccountPlatform;
import com.luzhiqing.common.jooq.BaseJooqDao;

public interface TAccountPlatformDao extends BaseJooqDao<TAccountPlatform> {
    /**
     * 根据openId查用户信息
     *
     * @param openId
     * @return
     */
    TAccountPlatform selectByOpenId(String openId);

    /**
     * 根据uid查用户信息
     *
     * @param uid
     * @return
     */
    TAccountPlatform selectByUid(String uid);


}
