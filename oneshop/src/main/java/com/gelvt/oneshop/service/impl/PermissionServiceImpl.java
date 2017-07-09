/**
 * 
 */
package com.gelvt.oneshop.service.impl;

import com.gelvt.oneshop.mapper.PermissionMapper;
import com.gelvt.oneshop.model.Permission;
import com.gelvt.oneshop.service.PermissionService;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



/**
 * 权限管理服务默认实现类
 * @author: Elvin Zeng
 * @date: 17-7-9.
 */
@Service
public class PermissionServiceImpl implements PermissionService {

    @Autowired
    private PermissionMapper permissionMapper;
    
    @Override
    public Permission getPermissionById(Long permissionId) {
        return permissionMapper.get(permissionId);
    }

    @Override
    public List<Permission> listPermissions(RowBounds rowBounds) {
        return permissionMapper.list(null, rowBounds);
    }

    @Override
    public void savePermission(Permission permission) {
        permissionMapper.save(permission);

    }

    @Override
    public void updatePermission(Permission permission) {
        permissionMapper.update(permission);
    }

    @Override
    public void removePermission(Permission permission) {
        permissionMapper.remove(permission.getId());
    }

}
