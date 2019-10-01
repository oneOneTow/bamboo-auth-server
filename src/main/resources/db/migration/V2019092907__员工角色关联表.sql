-- 权限管理: 角色与员工关系
CREATE TABLE t_auth_role_staff_mapping (
    id                int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '自增id',
    staff_id          int(11) unsigned NOT NULL DEFAULT '0' COMMENT '员工id',
    role_set          text             COMMENT '角色集合 多个值,号隔开',

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
    KEY `idx_staff_id` (`staff_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='权限角色与员工关系';

