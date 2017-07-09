/**
 * 
 */
package com.gelvt.oneshop.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 用户
 * @author: Elvin Zeng
 * @date: 17-7-9.
 */
public class User implements Entity{

	private static final long serialVersionUID = -6950618974746719495L;
	/**
	 * 用户Id
	 */
	private Long Id;
	/**
	 * 用户名
	 */
	private String username;
	/**
	 * 帐号绑定的电子邮箱
	 */
	private String email;
	/**
	 * 帐号绑定的手机号
	 */
	private String mobileNo;
	/**
	 * 密码
	 */
	private String password;
	/**
	 * 密码的盐值（用于加强密码破解的难度） 本应用中约定盐值为创建用户时新生成一个GUID字符串
	 */
	private String salt;
	/**
	 * 用户帐号是否已经被禁用
	 */
	private Boolean isDisabled;
	/**
	 * 用户绑定的邮箱是否验证通过
	 */
	private Boolean isEmailVerified;
	/**
     * 用户绑定的手机号是否验证通过
     */
    private Boolean isMobileNoVerified;
	/**
	 * 用户注册时间
	 */
	private Date createTime;
	/**
	 * 用户帐号信息更新时间
	 */
	private Date updateTime;
    
    /**
     * 用户注册时的ip地址
     */
    private String regIp;
    
    /**
     * 用户的角色
     */
    private List<Role> roles = new ArrayList<Role>();

	/**
	 * @return the id
	 */
	public Long getId() {
		return Id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		Id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public Boolean getDisabled() {
		return isDisabled;
	}

	public void setDisabled(Boolean disabled) {
		isDisabled = disabled;
	}

	public Boolean getEmailVerified() {
		return isEmailVerified;
	}

	public void setEmailVerified(Boolean emailVerified) {
		isEmailVerified = emailVerified;
	}

	public Boolean getMobileNoVerified() {
		return isMobileNoVerified;
	}

	public void setMobileNoVerified(Boolean mobileNoVerified) {
		isMobileNoVerified = mobileNoVerified;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getRegIp() {
		return regIp;
	}

	public void setRegIp(String regIp) {
		this.regIp = regIp;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
}
