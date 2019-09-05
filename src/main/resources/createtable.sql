CREATE TABLE `miaosha_user` (
  `id` bigint(20) NOT NULL COMMENT '用户ID，手机号',
  `nickname` varchar(255) CHARACTER SET utf8mb4 NOT NULL COMMENT '用户昵称',
  `password` varchar(32) CHARACTER SET utf8mb4 DEFAULT NULL COMMENT '密码 MD5(MD5(pass明文+固定salt)+salt)',
  `salt` varchar(10) CHARACTER SET utf8mb4 DEFAULT NULL COMMENT '用户昵称',
  `head` varchar(128) CHARACTER SET utf8mb4 DEFAULT NULL COMMENT '头像，云存储的ID',
  `register_date` datetime DEFAULT NULL COMMENT '注册时间',
  `last_login_date` datetime DEFAULT NULL COMMENT '上次登录事件',
  `login_count` int(11) DEFAULT '0' COMMENT '登录次数',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='秒杀用户表';



