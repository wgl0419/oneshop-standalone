package com.gelvt.oneshop.web.controller;


import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;


/**
 * 控制器的公共基类，提供一些常用的公共方法。
 * @author zenghui
 */
public class BaseController {

    //@Autowired
    //private Environment env;

    /**
     * 获取当前登录的用户
     * @return 当前登录的用户。如果尚未登录则返回null。
     */
    /*public SystemUser getCurrentUser(){
        if (!isAuthenticated()){
            return null;
        }
        SystemUser user = (SystemUser) SecurityUtils.getSubject().getPrincipal();
        return user;
    }*/

    /**
     * 判断当前用户是否已经登录
     * @return 是否已经登录
     */
    public boolean isAuthenticated(){
        return SecurityUtils.getSubject().isAuthenticated();
    }

    /**
     * 判断当前登录的用户是否拥有指定的角色
     * @param roleName 角色名
     * @return 指示用户是否拥有指定的角色
     */
    public boolean hasRole(String roleName){
        return SecurityUtils.getSubject().hasRole(roleName);
    }

    /**
     * 判断当前登录的用户是否有指定的权限
     * @param permission 代表权限的字符串
     * @return 指示用户是否有权限做某事
     */
    public boolean isPermitted(String permission){
        return SecurityUtils.getSubject().isPermitted(permission);
    }

    /**
     * 退出登录
     */
    public void logout(){
        if (isAuthenticated()){
            SecurityUtils.getSubject().logout();
        }
    }

    /**
     * 登录
     * @param loginName 登录名
     * @param password 密码
     * @throws CommonException 登录失败时抛出
     */
    /*public void login(String loginName, String password) throws CommonException {
        login(loginName, password, false);
    }*/

    /**
     * 登录
     * @param loginName 登录名
     * @param password 密码
     * @param rememberMe 是否记住登录
     * @throws CommonException 登录失败时抛出
     */
    /*public void login(String loginName, String password
            , boolean rememberMe)
            throws CommonException {
        if (!isAuthenticated()) {
            UsernamePasswordToken token = new UsernamePasswordToken(loginName, password);
            token.setRememberMe(rememberMe);
            try {
                SecurityUtils.getSubject().login(token);
            } catch (UnknownAccountException uae) {
                throw new CommonException("登录操作失败", uae);
            } catch (IncorrectCredentialsException ice) {
                throw new CommonException("登录操作失败", ice);
            } catch (LockedAccountException lae) {
                throw new CommonException("登录操作失败", lae);
            } catch (AuthenticationException ae) {
                throw new CommonException("登录操作失败", ae);
            }
        }
    }*/

}
