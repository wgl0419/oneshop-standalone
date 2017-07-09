/**
 * 
 */
package com.gelvt.oneshop.model;

/**
 * 权限
 * @author: Elvin Zeng
 * @date: 17-7-9.
 */
public class Permission implements Entity {

    private static final long serialVersionUID = 5732760418990310324L;

    private Long id;
    
    /**
     * 权限名
     */
    private String name;
    
    /**
     * 备注
     */
    private String remark;
    
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

}
