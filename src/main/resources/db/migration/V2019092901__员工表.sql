-- 员工表
create TABLE t_staff (
    id                            int(11) unsigned      NOT NULL AUTO_INCREMENT COMMENT '员工id',
    uid                           int(11) unsigned      NOT NULL DEFAULT '0'    COMMENT '账号id',
    email                         varchar(30)           NOT NULL DEFAULT ''     COMMENT '员工邮箱',
    phone                         varchar(15)           NOT NULL DEFAULT ''     COMMENT '员工手机号',
    staff_name                    varchar(30)           NOT NULL DEFAULT ''     COMMENT '员工姓名',
    nickname                      varchar(30)           NOT NULL DEFAULT ''     COMMENT '员工昵称',
    avatar                        varchar(255)          NOT NULL DEFAULT ''     COMMENT '员工头像(相对路径)',
    gender                        int(1)                NOT NULL DEFAULT '0'    COMMENT '员工性别',

    create_time                   datetime              NOT NULL,
    create_user                   int(11)               NOT NULL,
    create_user_name              varchar(64)           NOT NULL,
    update_time                   datetime,
    update_user                   int(11),
    update_user_name              varchar(64),
    delete_time                   datetime,
    delete_user                   int(11),
    delete_user_name              varchar(64),
    enabled                       tinyint(1)           NOT NULL DEFAULT '1',



    PRIMARY KEY (`id`),
    KEY `idx_uid` (`uid`),
    KEY `idx_email` (`email`),
    KEY `idx_phone` (`phone`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='员工信息(这里列了大概的信息，多的可以垂直拆表)';