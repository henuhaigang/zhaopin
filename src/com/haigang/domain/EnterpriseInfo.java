package com.haigang.domain;

import java.util.Date;

/**
 * 企业基本信息
 * @author haigang
 *
 */
public class EnterpriseInfo {
	
	private long id;
	
    private String enterpriseName;//企业名称
	
	private String property;      //企业性质（如国企还是私营）
	
	private String classification;// 企业类别（如IT或教育）
	
	private String email;       //公司邮箱
	
	private String linkman;     //公司联系人
	
	private Date registerDate;  //注册日期
	
	private String phoneNumber;  //联系电话
	
	private int number;          //公司规模
	
	private String introduce;      //公司介绍
	
	private String Address;       //公司地址
	
	private String licensePhptoAddress;  //执照照片上传地址
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	private User user;    /*与用户时一对一的关系*/
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEnterpriseName() {
		return enterpriseName;
	}

	public void setEnterpriseName(String enterpriseName) {
		this.enterpriseName = enterpriseName;
	}

	public String getProperty() {
		return property;
	}

	public void setProperty(String property) {
		this.property = property;
	}

	public String getClassification() {
		return classification;
	}

	public void setClassification(String classification) {
		this.classification = classification;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLinkman() {
		return linkman;
	}

	public void setLinkman(String linkman) {
		this.linkman = linkman;
	}

	public Date getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getIntroduce() {
		return introduce;
	}

	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getLicensePhptoAddress() {
		return licensePhptoAddress;
	}

	public void setLicensePhptoAddress(String licensePhptoAddress) {
		this.licensePhptoAddress = licensePhptoAddress;
	}
	
}
