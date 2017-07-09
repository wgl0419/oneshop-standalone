package com.gelvt.oneshop.common.shiro;

import org.apache.shiro.authc.*;
import org.apache.shiro.authc.credential.SimpleCredentialsMatcher;
import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.SimpleByteSource;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Default Realm for application.
 * use UserService to authentication.
 * @author: Elvin Zeng
 * @date: 17-7-9.
 */
@Component("defaultRealm")
public class CustomRealm extends AuthorizingRealm {

    //@Resource(name = "userService")
    private AuthorizingService authorizingService;

    {
        this.setCredentialsMatcher(new SimpleCredentialsMatcher() {
            @Override
            public boolean doCredentialsMatch(AuthenticationToken authToken, AuthenticationInfo info) {
                UsernamePasswordToken token = (UsernamePasswordToken) authToken;
                SimpleAuthenticationInfo authcInfo = (SimpleAuthenticationInfo) info;
                String tokenCredentials = String.valueOf(token.getPassword());
                SimpleByteSource sbs = (SimpleByteSource) authcInfo
                        .getCredentialsSalt();
                String salt = new String(sbs.getBytes());
                String password = PasswordEncoder.encodePassword(tokenCredentials, salt);
                Object accountCredentials = getCredentials(info);
                return equals(password, accountCredentials);
            }

        });
    }

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(
            PrincipalCollection principals) {
        ShiroUser user = (ShiroUser)principals.getPrimaryPrincipal();
        List<String> roleList = new ArrayList<String>();
        List<String> permissionList = new ArrayList<String>();
        if (null != user) {
            if (null != user.getRoles() && user.getRoles().size() > 0) {
                for (ShiroRole role : user.getRoles()) {
                    roleList.add(role.getName());
                    if (null != role.getPermissions()
                            && role.getPermissions().size() > 0) {
                        permissionList.addAll(role.getPermissions().stream()
                                .map(ShiroPermission::getName).collect(Collectors.toList()));
                    }
                }
            } else {
                throw new AuthorizationException();
            }
        }
        SimpleAuthorizationInfo simpleAuthorInfo = new SimpleAuthorizationInfo();
        simpleAuthorInfo.addRoles(roleList);
        simpleAuthorInfo.addStringPermissions(permissionList);
        return simpleAuthorInfo;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(
            AuthenticationToken authcToken) throws AuthenticationException {
        SimpleAuthenticationInfo authcInfo = null;
        UsernamePasswordToken token = (UsernamePasswordToken) authcToken;
        ShiroUser user = authorizingService.loadUserByLoginName(token.getUsername());
        if (user == null) {
            throw new UnknownAccountException();
        }
        if (null != user) {
            authcInfo = new SimpleAuthenticationInfo(user, user.getPassword(),
                    getName());
            SimpleByteSource sbs = new SimpleByteSource(user.getSalt()
                    .getBytes());
            authcInfo.setCredentialsSalt(sbs);
        }
        return authcInfo;
    }

    public AuthorizingService getAuthorizingService() {
        return authorizingService;
    }

    public void setAuthorizingService(AuthorizingService authorizingService) {
        this.authorizingService = authorizingService;
    }
}