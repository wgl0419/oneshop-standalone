package com.gelvt.oneshop.common.shiro;

import java.util.List;

/**
 * 角色接口。表示抽象的角色对象。
 * @author: Elvin Zeng
 * @date: 17-7-9.
 */
public interface ShiroRole {
    /**
     * 取该角色的所有权限
     * @return 该角色所拥有的所有权限
     */
    List<? extends ShiroPermission> getPermissions();

    /**
     * 取角色名
     * @return 角色名
     */
    String getName();
}
