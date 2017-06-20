--
-- desc：oneshop(standalone version)数据库表结构初始化脚本
-- Author:elvin
-- Date: 2017-06-20
--

-- ----------------------------
-- Table structure for tb_user
-- ----------------------------
DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(64) DEFAULT NULL,
  `email` varchar(128) DEFAULT NULL,
  `mobileNo` varchar(16) DEFAULT NULL,
  `isActive` bit(1) NOT NULL,
  `isDeleted` bit(1) NOT NULL,
  `isEmailAuthenticated` bit(1) NOT NULL,
  `isMobileNoAuthenticated` bit(1) NOT NULL,
  `password` varchar(255) DEFAULT NULL,
  `salt` varchar(255) DEFAULT NULL,
  `regTime` datetime NOT NULL,
  `updateTime` datetime DEFAULT NULL,
  `expireTime` datetime DEFAULT NULL,
  `regIp` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `uk_username` (`username`) USING BTREE,
  UNIQUE KEY `uk_mobileno` (`mobileNo`) USING BTREE,
  UNIQUE KEY `uk_email` (`email`) USING BTREE
);
