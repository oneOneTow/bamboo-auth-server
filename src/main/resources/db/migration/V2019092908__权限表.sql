
-- 权限管理: 系统权限
CREATE TABLE t_auth_item (
    id                int(11) unsigned    NOT NULL AUTO_INCREMENT COMMENT '自增id',
    sys_id            tinyint(11) unsigned NOT NULL DEFAULT '0' COMMENT '系统id',
    menu_id           varchar(255)         NOT NULL DEFAULT '0' COMMENT '页面/接口uri',

    create_time       datetime             NOT NULL,
    create_user       int(11)              NOT NULL,
    create_user_name  varchar(64)          NOT NULL,
    update_time        datetime,
    update_user        int(11),
    update_user_name   varchar(64),
    delete_time        datetime,
    delete_user        int(11),
    delete_user_name   varchar(64),
    enabled            tinyint(1)          NOT NULL DEFAULT '1',

    PRIMARY KEY (`id`),
    KEY `idx_sys_menu` (`sys_id`, `menu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='系统权限';


