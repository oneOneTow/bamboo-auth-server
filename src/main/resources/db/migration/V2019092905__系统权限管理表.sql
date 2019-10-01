-- 权限管理: 系统map
CREATE TABLE t_auth_sys (
    id                            smallint(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '自增id',
    sys_name                      varchar(255) NOT NULL DEFAULT '0' COMMENT '系统名称',
    sys_desc                      varchar(255) NOT NULL DEFAULT '0' COMMENT '系统描述',
    sys_domain                    varchar(255) NOT NULL DEFAULT '0' COMMENT '系统域名',

    create_time                   datetime                NOT NULL,
    create_user                   int(11)                 NOT NULL,
    create_user_name              varchar(64)             NOT NULL,
    update_time                   datetime,
    update_user                   int(11),
    update_user_name              varchar(64),
    delete_time                   datetime,
    delete_user                   int(11),
    delete_user_name              varchar(64),
    enabled                       tinyint(1)             NOT NULL DEFAULT '1',

    PRIMARY KEY (`id`),
    KEY `idx_domain` (`sys_domain`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='系统map(登记目前存在的后台系统信息)';