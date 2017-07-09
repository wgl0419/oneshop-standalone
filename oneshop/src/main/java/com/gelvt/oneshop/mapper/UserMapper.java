/**
 * 
 */
package com.gelvt.oneshop.mapper;


import com.gelvt.oneshop.model.User;
import org.apache.ibatis.annotations.Param;


/**
 * 用户账户信息数据映射器
 * @author: Elvin Zeng
 * @date: 17-7-9.
 */
public interface UserMapper extends PageHelperBasedListableMapper<User>{
    /**
     * 根据登录名加载用户信息
     * 登录名可以为用户名/邮箱/手机号
     * @param loginName 登录名
     * @return 用户数据
     */
    User getByLoginName(String loginName);
    
    /**
     * 给指定的用户增加指定角色
     * @param userId 用户id
     * @param roleId 角色id
     */
    void addRole(@Param("userId") Long userId
            , @Param("roleId") Long roleId);
    
    /**
     * 移除指定用户的指定角色
     * @param userId 用户id
     * @param roleId 角色id
     */
    void removeRole(@Param("userId") Long userId
            , @Param("roleId") Long roleId);
}
