-- 用户模型
create TABLE t_bamboo_user (
  id                            int(11) unsigned        NOT NULL AUTO_INCREMENT      COMMENT '用户id',
  uid                           int(11) unsigned        NOT NULL DEFAULT '0'        COMMENT '账号id',
  nickname                      varchar(30)             NOT NULL DEFAULT ''         COMMENT '昵称',
  avatar                        varchar(255)            NOT NULL DEFAULT ''         COMMENT '头像(相对路径)',
  gender                        int(1)                  NOT NULL DEFAULT '0'        COMMENT '性别',
  user_role                     tinyint(1) unsigned     NOT NULL DEFAULT '0'        COMMENT '角色 0:普通用户 1:vip',

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
  KEY `idx_uid` (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='账户信息';