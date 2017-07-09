package com.gelvt.oneshop.common.shiro;

import org.apache.shiro.spring.LifecycleBeanPostProcessor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.CookieRememberMeManager;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.apache.shiro.web.servlet.SimpleCookie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.core.env.Environment;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Shiro configuration
 * @author: Elvin Zeng
 * @date: 17-7-9.
 */
//@Configuration
//@DependsOn("environment")
public class ShiroConfig {

    /*public static final String CONFIG_KEY_REMEMBER_ME_COOKIE_NAME
            = "security.rememberMe.cookieName";
    public static final String CONFIG_KEY_REMEMBER_ME_CIPHER_KEY
            = "security.rememberMe.cipherKey";
    public static final String CONFIG_KEY_REMEMBER_ME_MAX_AGE
            = "security.rememberMe.maxAge";
    public static final String CONFIG_KEY_LOGIN_URL
            = "security.loginUrl";

    @Autowired
    private Environment env;

    @Bean
    public ShiroFilterFactoryBean shirFilter(
            org.apache.shiro.mgt.SecurityManager securityManager) {

        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        shiroFilterFactoryBean.setSecurityManager(securityManager);
        shiroFilterFactoryBean.setLoginUrl(env.getProperty(
                ShiroConfig.CONFIG_KEY_LOGIN_URL));

        Map<String, String> filterChainDefinitionMap = new LinkedHashMap<>();
        filterChainDefinitionMap.put("/test", "perms[权限添加]");
        filterChainDefinitionMap.put("*//**", "anon");

        shiroFilterFactoryBean.setFilterChainDefinitionMap(filterChainDefinitionMap);
        return shiroFilterFactoryBean;
    }

    @Bean
    public org.apache.shiro.mgt.SecurityManager securityManager() {
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        securityManager.setRealm(authorizingRealm());
        securityManager.setRememberMeManager(rememberMeManager());
        return securityManager;
    }

    @Bean
    public CookieRememberMeManager rememberMeManager(){
        CookieRememberMeManager cookieRememberMeManager = new CookieRememberMeManager();
        cookieRememberMeManager.setCipherKey(env.getProperty(
                ShiroConfig.CONFIG_KEY_REMEMBER_ME_CIPHER_KEY).getBytes());
        cookieRememberMeManager.setCookie(rememberMeCookie());
        return cookieRememberMeManager;
    }

    @Bean
    public LifecycleBeanPostProcessor lifecycleBeanPostProcessor(){
        return new LifecycleBeanPostProcessor();
    }

    @Bean
    public SimpleCookie rememberMeCookie(){
        SimpleCookie cookie = new SimpleCookie(env.getProperty(
                ShiroConfig.CONFIG_KEY_REMEMBER_ME_COOKIE_NAME));
        cookie.setHttpOnly(true);
        cookie.setMaxAge(Integer.valueOf(env.getProperty(
                ShiroConfig.CONFIG_KEY_REMEMBER_ME_MAX_AGE)));
        return cookie;
    }

    @Bean
    public CustomRealm authorizingRealm() {
        CustomRealm authorizingRealm = new CustomRealm();
        return authorizingRealm;
    }*/
}
