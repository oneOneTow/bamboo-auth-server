-- 权限管理: 系统权限(权限的各个集合)
CREATE TABLE t_auth_role (
    id               int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '自增id',
    role_name         varchar(255)     NOT NULL DEFAULT '0' COMMENT '角色名称',
    role_desc         varchar(255)     NOT NULL DEFAULT '0' COMMENT '角色描述',
    auth_item_set     text             COMMENT '权限集合 多个值,号隔开',

    create_time       datetime         NOT NULL,
    create_user       int(11)          NOT NULL,
    create_user_name  varchar(64)      NOT NULL,
    update_time        datetime,
    update_user        int(11),
    update_user_name   varchar(64),
    delete_time        datetime,
    delete_user        int(11),
    delete_user_name   varchar(64),
    enabled            tinyint(1)       NOT NULL DEFAULT '1',

    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='员工角色';
