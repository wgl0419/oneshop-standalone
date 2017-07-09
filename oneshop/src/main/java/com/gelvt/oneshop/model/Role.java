/**
 * 
 */
package com.gelvt.oneshop.model;

import java.util.ArrayList;
import java.util.List;

/**
 * 角色
 * @author: Elvin Zeng
 * @date: 17-7-9.
 */
public class Role implements Entity {

    private static final long serialVersionUID = 7625433600311762510L;

    private Long id;
    
    /**
     * 角色名
     */
    private String name;
    
    /**
     * 备注
     */
    private String remark;
    
    /**
     * 该角色拥有的权限
     */
    private List<Permission> permissions = new ArrayList<Permission>();
    
    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the remark
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @param remark the remark to set
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * @return the permissions
     */
    public List<Permission> getPermissions() {
        return permissions;
    }

    /**
     * @param permissions the permissions to set
     */
    public void setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }


}
