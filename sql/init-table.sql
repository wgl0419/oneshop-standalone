--
-- 数据库表结构初始化脚本
-- Author: Elvin Zeng
-- Date: 2017-06-20
--


DROP TABLE IF EXISTS `tb_permission`;
create table `tb_permission` (
  id bigint auto_increment primary key,
  name varchar(128) not null comment '权限名',
  remark varchar(255) null comment '权限备注',
  constraint tb_permission_name_uindex unique (name)
)
comment '权限表';

DROP TABLE IF EXISTS `tb_role`;
create table `tb_role` (
  id bigint auto_increment primary key,
  name varchar(64) not null comment '角色名',
  remark varchar(255) null comment '角色备注',
  constraint tb_role_name_uindex unique (name)
)
comment '角色表';

DROP TABLE IF EXISTS `tb_role_permission`;
create table `tb_role_permission` (
  role_id bigint not null comment '角色id',
  permission_id bigint not null comment '权限id',
  constraint tb_role_permission_role_id_permission_id_uk
  unique (role_id, permission_id)
)
;

DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user` (
  id BIGINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
  username VARCHAR(64) COMMENT '用户名',
  email VARCHAR(128) COMMENT '邮箱',
  mobile_no VARCHAR(16) COMMENT '手机号',
  is_email_verified TINYINT UNSIGNED DEFAULT 0 NOT NULL COMMENT '邮箱是否已经被验证',
  is_mobile_no_verified TINYINT UNSIGNED DEFAULT 0 NOT NULL COMMENT '用户的手机号码是否已经被验证',
  passwd VARCHAR(255) COMMENT '密码',
  salt VARCHAR(255) COMMENT '盐',
  is_disabled TINYINT UNSIGNED DEFAULT 0 NOT NULL COMMENT '账户是否被禁用',
  reg_ip VARCHAR(255) COMMENT '帐号注册时候的ip地址',
  gmt_create DATETIME DEFAULT NOW() NOT NULL COMMENT '创建时间',
  gmt_modified DATETIME COMMENT '更新时间',
  is_deleted TINYINT UNSIGNED DEFAULT 0 NOT NULL COMMENT '逻辑删除标志'
);
ALTER TABLE tb_user COMMENT = '用户表';

DROP TABLE IF EXISTS `tb_user_role`;
create table `tb_user_role`(
  user_id bigint not null,
  role_id bigint not null,
  constraint tb_user_role_user_id_role_id_pk
  unique (user_id, role_id)
)
;