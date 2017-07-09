package com.gelvt.oneshop.common.shiro;


import org.apache.commons.codec.digest.DigestUtils;

/**
 * 密码加密工具
 * 系统的密码加密算法在这个类实现
 * @author: Elvin Zeng
 * @date: 17-7-9.
 */
public class PasswordEncoder {
    /**
     * 对密码进行加密
     * @param password 密码明文
     * @param salt 盐
     * @return 密码秘文
     */
    public static String encodePassword(String password, String salt){
        return DigestUtils.sha1Hex(DigestUtils.sha256Hex(
                DigestUtils.sha512(password)
                + DigestUtils.sha256Hex(salt)));
    }
}
