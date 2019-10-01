-- 权限管理: 系统menu
CREATE TABLE t_auth_sys_menu (
    id                int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '自增id',
    sys_id            smallint(11) unsigned NOT NULL DEFAULT '0' COMMENT '系统id',
    parent_id         int(11) unsigned NOT NULL DEFAULT '0' COMMENT '父菜单id',
    menu_name         varchar(255)     NOT NULL DEFAULT '0' COMMENT '菜单名称',
    menu_desc         varchar(255)     NOT NULL DEFAULT '0' COMMENT '菜单描述',
    menu_uri          varchar(255)     NOT NULL DEFAULT '0' COMMENT '菜单uri',
    showing           tinyint(1)       NOT NULL DEFAULT '0' COMMENT '是否展示菜单',

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

    PRIMARY KEY (`id`),
    KEY `idx_sys_id` (`sys_id`),
    KEY `idx_parent_id` (`parent_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='系统menu';
