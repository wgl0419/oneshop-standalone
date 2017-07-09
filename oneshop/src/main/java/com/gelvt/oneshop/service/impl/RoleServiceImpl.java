/**
 * 
 */
package com.gelvt.oneshop.service.impl;

import com.gelvt.oneshop.mapper.RoleMapper;
import com.gelvt.oneshop.model.Permission;
import com.gelvt.oneshop.model.Role;
import com.gelvt.oneshop.service.RoleService;
import org.apache.ibatis.session.RowBounds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * 角色服务默认实现类
 * @author: Elvin Zeng
 * @date: 17-7-9.
 */
@Service
public class RoleServiceImpl implements RoleService {

    private static final Logger logger = LoggerFactory.getLogger(RoleServiceImpl.class);

    @Autowired
    private RoleMapper roleMapper;


    @Override
    public Role getRoleById(Long roleId) {
        return roleMapper.get(roleId);
    }

    @Override
    public Role getRoleByName(String roleName) {
        return roleMapper.getByName(roleName);
    }

    @Override
    public List<Role> listRoles(RowBounds rowBounds) {
        return roleMapper.list(null, rowBounds);
    }

    @Override
    public void saveRole(Role role) {
        roleMapper.save(role);
    }

    @Override
    public void updateRole(Role role) {
        roleMapper.update(role);
    }

    @Override
    public void removeRole(Role role) {
        roleMapper.remove(role.getId());
    }

    @Override
    public void asignPermissionToRole(Role role, Permission permission) {
        roleMapper.savePermissionRelation(role.getId(), permission.getId());
    }

    @Override
    public void revokePermissionFromRole(Role role, Permission permission) {
        roleMapper.removePermissionRelation(role.getId(), permission.getId());
    }
}
