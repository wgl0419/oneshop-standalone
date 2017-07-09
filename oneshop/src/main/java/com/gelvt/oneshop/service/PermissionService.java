/**
 * 
 */
package com.gelvt.oneshop.service;

import java.util.List;

import com.gelvt.oneshop.model.Permission;
import org.apache.ibatis.session.RowBounds;


/**
 * 权限管理服务
 * @author: Elvin Zeng
 * @date: 17-7-9.
 */
public interface PermissionService {
    /**
     * 根据id获取权限
     * @param permissionId 权限id
     * @return 权限
     */
    public Permission getPermissionById(Long permissionId);
    /**
     * 列出所有权限
     * @param rowBounds 分页参数
     * @return 权限列表
     */
    public List<Permission> listPermissions(RowBounds rowBounds);
    /**
     * 创建权限
     * @param permission 权限
     */
    public void savePermission(Permission permission);
    /**
     * 更新权限
     * @param permission 权限
     */
    public void updatePermission(Permission permission);
    /**
     * 删除权限
     * @param permission 权限
     */
    public void removePermission(Permission permission);
}
