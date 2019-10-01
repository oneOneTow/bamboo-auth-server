-- 第三方账户
create TABLE t_account_platform (
  id                            int(11) unsigned      NOT NULL AUTO_INCREMENT COMMENT '自增id',
  uid                           int(11) unsigned      NOT NULL DEFAULT '0'   COMMENT '账号id',
  platform_id                   varchar(60)           NOT NULL DEFAULT ''    COMMENT '平台id',
  platform_token                varchar(60)           NOT NULL DEFAULT ''    COMMENT '平台access_token',
  account_type                  int(1)                NOT NULL DEFAULT '0'   COMMENT '平台类型 0:未知,1:wechat,2:qq',
  nickname                      varchar(60)           NOT NULL DEFAULT ''    COMMENT '昵称',
  avatar                        varchar(255)          NOT NULL DEFAULT ''    COMMENT '头像',


  create_time                   datetime              NOT NULL,
  create_user                   int(11)               NOT NULL,
  create_user_name              varchar(64)           NOT NULL,
  update_time                   datetime,
  update_user                   int(11),
  update_user_name              varchar(64),
  delete_time                   datetime,
  delete_user                   int(11),
  delete_user_name              varchar(64),
  enabled                       tinyint(1)            NOT NULL DEFAULT '1',


  PRIMARY KEY (`id`),
  KEY `idx_uid` (`uid`),
  KEY `idx_platform_id` (`platform_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='第三方用户信息';