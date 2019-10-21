package com.luzhiqing.bamboo.dao;

import com.luzhiqing.bamboo.entity.tables.pojos.TBambooUser;
import com.luzhiqing.common.jooq.BaseJooqDao;

/**
 * @Description:
 * @version:
 * @Author: 陆志庆
 * @CreateDate: 2019/10/9 19:39
 */
public interface BambooUserDao extends BaseJooqDao<TBambooUser> {
    /**
     *
     * @param id
     * @return
     */
    TBambooUser findByUid(Integer id);
}
