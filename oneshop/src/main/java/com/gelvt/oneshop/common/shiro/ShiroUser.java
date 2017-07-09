package com.gelvt.oneshop.common.shiro;

import java.util.List;

/**
 * 用户接口。表示抽象的用户对象。
 * @author: Elvin Zeng
 * @date: 17-7-9.
 */
public interface ShiroUser {
    /**
     * 获取用户密码的密文
     * @return 用户密码的密文
     */
    String getPassword();

    /**
     * 获取用于加密用户密码的盐
     * @return 盐
     */
    String getSalt();

    /**
     * 获取用户的所有角色
     * @return 用户所拥有的所有角色
     */
    List<? extends ShiroRole> getRoles();
}
