/**
 *
 */
package com.gelvt.oneshop.mapper;

import com.gelvt.oneshop.model.Role;
import org.apache.ibatis.annotations.Param;


/**
 * 角色数据映射器
 *
 * @author: Elvin Zeng
 * @date: 17-7-9.
 */
public interface RoleMapper extends PageHelperBasedListableMapper<Role> {
    /**
     * 给指定角色增加指定的权限
     *
     * @param roleId       角色id
     * @param permissionId 待增加的权限id
     */
    void savePermissionRelation(@Param("roleId") Long roleId
            , @Param("permissionId") Long permissionId);

    /**
     * 移除指定角色的指定权限
     *
     * @param roleId       角色id
     * @param permissionId 待移除的权限
     */
    void removePermissionRelation(@Param("roleId") Long roleId
            , @Param("permissionId") Long permissionId);

    /**
     * 根据角色名取角色
     *
     * @param roleName 角色名
     * @return 角色
     */
    Role getByName(@Param("name") String roleName);
}
