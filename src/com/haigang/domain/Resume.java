package com.haigang.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * 用户简历表
 * @author haigang
 *
 */
public class Resume {
	
    private long id;
    
    private String workMakRequire; //期望工作性质 ，如实习或者是全职
    
    private String careerRequire;   //职业要求
    
    private String workPlaceRequire;  //期望工作地点
    
    private String salaryRequire;   //期望薪资
    
    private String state;    //目前状况，如：现在正在找工作
    
    private String selfIntrduce;   //自我介绍
    
    //private String workExperience;  //工作经验
    
    //private String projectExperience;  //项目经验
    
    private String degree;   //学历  为了简单起见将学历写死，直接以下拉框的形式显示然后选择
    
   // private String languageLevel;  //TODO 语言水平----多余
    
    private String interest;    //  兴趣爱好
    
    private String attachmentAddr; //附件地址
    
    private User user;    //用户
    
    
    private Set userExperience=new HashSet(0); //工作经验
    
    private Set projectExperience=new HashSet(0);//项目经验
    
    private Set language=new HashSet(0);       //语言  ------- 一对多
    
    private Set certificate=new HashSet(0);   //证书  ------- 一对多
    

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Set getUserExperience() {
		return userExperience;
	}

	public void setUserExperience(Set userExperience) {
		this.userExperience = userExperience;
	}

	public Set getProjectExperience() {
		return projectExperience;
	}

	public void setProjectExperience(Set projectExperience) {
		this.projectExperience = projectExperience;
	}

	public Set getLanguage() {
		return language;
	}

	public void setLanguage(Set language) {
		this.language = language;
	}

	public Set getCertificate() {
		return certificate;
	}

	public void setCertificate(Set certificate) {
		this.certificate = certificate;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getWorkMakRequire() {
		return workMakRequire;
	}

	public void setWorkMakRequire(String workMakRequire) {
		this.workMakRequire = workMakRequire;
	}

	public String getCareerRequire() {
		return careerRequire;
	}

	public void setCareerRequire(String careerRequire) {
		this.careerRequire = careerRequire;
	}

	public String getWorkPlaceRequire() {
		return workPlaceRequire;
	}

	public void setWorkPlaceRequire(String workPlaceRequire) {
		this.workPlaceRequire = workPlaceRequire;
	}

	public String getSalaryRequire() {
		return salaryRequire;
	}

	public void setSalaryRequire(String salaryRequire) {
		this.salaryRequire = salaryRequire;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getSelfIntrduce() {
		return selfIntrduce;
	}

	public void setSelfIntrduce(String selfIntrduce) {
		this.selfIntrduce = selfIntrduce;
	}

	


	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

//	public String getLanguageLevel() {
//		return languageLevel;
//	}
//
//	public void setLanguageLevel(String languageLevel) {
//		this.languageLevel = languageLevel;
//	}

	public String getInterest() {
		return interest;
	}

	public void setInterest(String interest) {
		this.interest = interest;
	}

	public String getAttachmentAddr() {
		return attachmentAddr;
	}

	public void setAttachmentAddr(String attachmentAddr) {
		this.attachmentAddr = attachmentAddr;
	}
  
}
