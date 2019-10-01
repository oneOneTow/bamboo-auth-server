-- 账户模型
create TABLE t_account_user (
  id                            int(11) unsigned    NOT NULL AUTO_INCREMENT COMMENT '账号id',
  email                         varchar(30)         NOT NULL DEFAULT '' COMMENT '邮箱',
  phone                         varchar(15)         NOT NULL DEFAULT '' COMMENT '手机号',
  user_name                     varchar(30)         NOT NULL DEFAULT '' COMMENT '用户名',
  password                      varchar(32)         NOT NULL DEFAULT '' COMMENT '密码',
  login_times                   int(11)             NOT NULL DEFAULT '0' COMMENT '登录次数',
  create_time                   datetime            NOT NULL,
  create_user                   int(11)             NOT NULL,
  create_user_name              varchar(64)         NOT NULL,
  update_time                   datetime,
  update_user                   int(11),
  update_user_name              varchar(64),
  delete_time                   datetime,
  delete_user                   int(11),
  delete_user_name              varchar(64),
  enabled                       boolean          NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`),
  KEY `idx_email` (`email`),
  KEY `idx_phone` (`phone`),
  KEY `idx_user_name` (`user_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='账户';










