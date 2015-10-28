package com.haigang.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
/**
 * 用户信息
 * @author haigang
 *
 */
public class User {
//TODO 当用户分别是管理员和企业用户时的映射关系还没有搞好

	private long id;
	
	private String userName;       //用户名
	
	private String password;      //密码
	
	private String type;//用户类型（1、个人用户   2、企业用 户   3、管理员）
	
	private String validateUser;
	
	public String getValidateUser() {
		return validateUser;
	}

	public void setValidateUser(String validateUser) {
		this.validateUser = validateUser;
	}

	private Date registerDate;      //注册日期
	
	private Set resumes=new HashSet();   //简历（一对多的关系）
	
	private  Set empInfos=new HashSet();   //招聘信息表（一对多的关系）
	
	

	private EnterpriseInfo enterpriseInfo;       //企业用户基本信息（一对一的关系）
	
	private UserInfo userInfo;  //基本用户信息   （一对一的关系）
	
	
	
	
	//private Set deliverInfos=new HashSet();  // TODO 简历投递信息
	
	public Set getEmpInfos() {
		return empInfos;
	}

	public void setEmpInfos(Set empInfos) {
		this.empInfos = empInfos;
	}
	

	public EnterpriseInfo getEnterpriseInfo() {
		return enterpriseInfo;
	}

	public void setEnterpriseInfo(EnterpriseInfo enterpriseInfo) {
		this.enterpriseInfo = enterpriseInfo;
	}

	public UserInfo getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

	public Set getResumes() {
		return resumes;
	}

	public void setResumes(Set resumes) {
		this.resumes = resumes;
	}

	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}
	
	
	
}
