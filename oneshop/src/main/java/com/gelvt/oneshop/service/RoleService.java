/**
 * 
 */
package com.gelvt.oneshop.service;

import java.util.List;

import com.gelvt.oneshop.model.Permission;
import com.gelvt.oneshop.model.Role;
import org.apache.ibatis.session.RowBounds;


/**
 * 角色管理服务
 * @author: Elvin Zeng
 * @date: 17-7-9.
 */
public interface RoleService {
    /**
     * 根据id获取角色
     * @param roleId 角色id
     * @return 角色
     */
    public Role getRoleById(Long roleId);
    /**
     * 根据角色名取角色
     * @param roleName 角色名
     * @return 角色
     */
    public Role getRoleByName(String roleName);
    /**
     * 列出所有角色
     * @param rowBounds 分页参数
     * @return 角色列表
     */
    public List<Role> listRoles(RowBounds rowBounds);
    /**
     * 创建角色
     * @param role 角色
     */
    public void saveRole(Role role);
    /**
     * 更新角色
     * @param role 角色
     */
    public void updateRole(Role role);
    /**
     * 删除角色
     * @param role 角色
     */
    public void removeRole(Role role);
    /**
     * 给指定角色增加权限
     * @param role 角色
     * @param permission 权限
     */
    public void asignPermissionToRole(Role role, Permission permission);
    /**
     * 从指定角色中移除权限
     * @param role 角色
     * @param permission 权限
     */
    public void revokePermissionFromRole(Role role, Permission permission);
}
