package com.gelvt.oneshop.common.shiro;

/**
 * service for user system.
 * @author: Elvin Zeng
 * @date: 17-7-9.
 */
public interface AuthorizingService {
    /**
     * 根据登录名加载用户信息
     * @param loginName 登录名
     * @return 表示用户的对象
     */
    ShiroUser loadUserByLoginName(String loginName);
}
