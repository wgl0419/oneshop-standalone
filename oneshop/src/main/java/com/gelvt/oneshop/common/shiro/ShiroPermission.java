package com.gelvt.oneshop.common.shiro;

/**
 * 权限接口。表示抽象的权限对象。
 * @author: Elvin Zeng
 * @date: 17-7-9.
 */
public interface ShiroPermission {
    /**
     * 取权限名
     * @return 权限名
     */
    String getName();
}
