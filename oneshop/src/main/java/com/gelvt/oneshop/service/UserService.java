/**
 * 
 */
package com.gelvt.oneshop.service;


import com.gelvt.oneshop.model.Role;
import com.gelvt.oneshop.model.User;

/**
 * 用户账户服务
 * @author: Elvin Zeng
 * @date: 17-7-9.
 */
public interface UserService {
    /**
     * 检查用户名是否存在
     * @param username 用户名
     * @return 该用户名是否存在
     */
    boolean isUsernameExists(String username);
    /**
     * 检查电子邮箱地址是否已经被存在的帐号绑定过
     * @param email 电子邮件地址
     * @return 该邮箱地址是否存在
     */
    boolean isEmailExists(String email);
    /**
     * 检查手机号是否已经被存在的帐号绑定过
     * @param mobileNo 手机号
     * @return 该手机号是否已经绑定过
     */
    boolean isMobileNoExists(String mobileNo);
    /**
     * 创建用户
     * @param userInfo 待注册用户的信息
     * @return 注册后用户的信息
     */
    User saveUser(User userInfo);
    /**
     * 将指定的邮箱标记为已经激活（通过了邮件验证之后才能标记为“邮箱已验证”）
     * @param userId 用户Id
     * @param email 待激活的邮箱
     */
    void activateEmail(Long userId, String email);
    /** 修改邮箱。
     *  调用该方法将会修改用户的邮箱地址，然后发送验证邮件，并将邮箱地址标记为未验证。
     *  当用户通过了邮件验证之后，调用activateEmail将新地址标记为已验证。
     * @param userId 用户id
     * @param newEmail 新邮箱
     */
    void changeEmail(Long userId, String newEmail);
    /** 修改用户名
     * @param userId 用户id
     * @param newUsername 新用户名
     */
    void changeUsername(Long userId, String newUsername);
    /**
     * 删除用户。该操作将会执行一个逻辑删除的操作，将该用户标记为已删除（isDeleted字段标记为true）。
     * @param userId 用户id
     */
    void deleteUser(Long userId);
    /**
     * 冻结用户。
     * @param user 要冻结的用户
     */
    void freeze(User user);
    /**
     * 激活用户的帐号
     * @param user 待激活用户
     */
    void activate(User user);
    /**
     * 根据用户ID加载用户信息
     * @param userId 用户ID
     * @return 用户信息
     */
    User loadUserByUserId(Long userId);
    /**
     * 根据用户登录名加载用户信息
     * @param loginName 登录名
     * @return 用户信息
     */
    User loadUserByLoginName(String loginName);
    
    /**
     * 给指定用户增加指定角色
     * @param user 用户
     * @param role 角色
     */
    void asignRoleToUser(User user, Role role);
    
    /**
     * 移除指定用户的指定角色
     * @param user 用户
     * @param role 角色
     */
    void revokeRoleFromUser(User user, Role role);
}
