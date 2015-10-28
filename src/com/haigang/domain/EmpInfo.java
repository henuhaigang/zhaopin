package com.haigang.domain;

/**
 * 企业招聘信息表
 * @author haigang
 *
 */
public class EmpInfo {
	
	private long positionID;
	
    private String positionName;    //职位名
	
	private String positionMark;   //职位类别
	
	private String positionIntroduce;  //职位介绍
	
	private String workPlace;    //工作地点
	
	private String experienceRequire; //经验要求
	
	private String degreeRequire;  //学历要求
	
	private String workProperty;   //工作性质
	
	private String EmpNumber;    //招聘人数
	
	private String salary;    //薪资
	
	private  User user;
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public long getPositionID() {
		return positionID;
	}

	public void setPositionID(long positionID) {
		this.positionID = positionID;
	}

	public String getPositionName() {
		return positionName;
	}

	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}

	public String getPositionMark() {
		return positionMark;
	}

	public void setPositionMark(String positionMark) {
		this.positionMark = positionMark;
	}

	public String getPositionIntroduce() {
		return positionIntroduce;
	}

	public void setPositionIntroduce(String positionIntroduce) {
		this.positionIntroduce = positionIntroduce;
	}

	public String getWorkPlace() {
		return workPlace;
	}

	public void setWorkPlace(String workPlace) {
		this.workPlace = workPlace;
	}

	public String getExperienceRequire() {
		return experienceRequire;
	}

	public void setExperienceRequire(String experienceRequire) {
		this.experienceRequire = experienceRequire;
	}

	public String getDegreeRequire() {
		return degreeRequire;
	}

	public void setDegreeRequire(String degreeRequire) {
		this.degreeRequire = degreeRequire;
	}

	public String getWorkProperty() {
		return workProperty;
	}

	public void setWorkProperty(String workProperty) {
		this.workProperty = workProperty;
	}

	

	public String getEmpNumber() {
		return EmpNumber;
	}

	public void setEmpNumber(String empNumber) {
		EmpNumber = empNumber;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	
}
