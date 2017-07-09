/**
 * 
 */
package com.gelvt.oneshop.service.impl;

import com.gelvt.oneshop.common.constant.RoleName;
import com.gelvt.oneshop.common.shiro.PasswordEncoder;
import com.gelvt.oneshop.mapper.UserMapper;
import com.gelvt.oneshop.model.Role;
import com.gelvt.oneshop.model.User;
import com.gelvt.oneshop.service.RoleService;
import com.gelvt.oneshop.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.UUID;



/**
 * 用户服务实现类
 * @author: Elvin Zeng
 * @date: 17-7-9.
 */
@Service
public class UserServiceImpl implements UserService {
    
    @Autowired
    private UserMapper userMapper;
    
    @Resource(name = "roleServiceImpl")
    private RoleService roleService;

    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class); 
    
    @Override
    public boolean isUsernameExists(String username){
        User user = userMapper.getByLoginName(username);
        return user != null ? true : false;
    }

    @Override
    public boolean isEmailExists(String email){
        User user = userMapper.getByLoginName(email);
        return user != null ? true : false;
    }

    @Override
    public boolean isMobileNoExists(String mobileNo){
        User user = userMapper.getByLoginName(mobileNo);
        return user != null ? true : false;
    }

    @Transactional
    @Override
    public User saveUser(User userInfo) {
        userInfo.setDisabled(false);
        userInfo.setEmailVerified(false);
        userInfo.setMobileNoVerified(false);
        userInfo.setSalt(generateSalt());
        String passwd = encodePassword(userInfo.getPassword()
                , userInfo.getSalt());
        userInfo.setPassword(passwd);
        userMapper.save(userInfo);
        if (userInfo.getRoles().size() == 0){
            logger.debug("未指定用户角色，将使用默认角色[" + RoleName.COMSUMER.getValue() + "]。");
            Role userRole = roleService.getRoleByName(RoleName.COMSUMER.getValue());
            userMapper.saveRoleRelation(userInfo.getId(), userRole.getId());
        }
        logger.debug("成功创建一个用户");
        return userInfo;
    }
    
    private String encodePassword(String password, String salt){
        return PasswordEncoder.encodePassword(password, salt);
    }
    
    /**
     * 生成新的盐值
     * @return 新的盐值
     */
    private String generateSalt(){
        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }

    @Override
    public void activateEmail(Long userId, String email) {
        // TODO 验证用户邮件地址所有权功能待实现
        throw new UnsupportedOperationException("还没有实现的方法");
    }

    @Override
    public void changeEmail(Long userId, String newEmail) {
        // TODO 修改用户邮件地址功能待实现
        throw new UnsupportedOperationException("还没有实现的方法");

    }

    @Override
    public void changeUsername(Long userId, String newUsername) {
        // TODO 修改用户名功能待实现
        throw new UnsupportedOperationException("还没有实现的方法");

    }

    @Override
    public void deleteUser(Long userId) {
        userMapper.remove(userId);
    }

    @Override
    public void freeze(User user) {
        User u = new User();
        u.setId(user.getId());
        u.setDisabled(true);
        userMapper.update(u);
    }

    @Override
    public void activate(User user) {
        User u = new User();
        u.setId(user.getId());
        u.setDisabled(false);
        userMapper.update(u);
    }

    @Override
    public User loadUserByUserId(Long userId) {
        User user = userMapper.get(userId);
        return user;
    }

    @Override
    public User loadUserByLoginName(String loginName) {
        User user = userMapper.getByLoginName(loginName);
        return user;
    }

    @Override
    public void asignRoleToUser(User user, Role role) {
        this.userMapper.saveRoleRelation(user.getId(), role.getId());
        
    }

    @Override
    public void revokeRoleFromUser(User user, Role role) {
        this.userMapper.removeRoleRelation(user.getId(), role.getId());
    }

}
