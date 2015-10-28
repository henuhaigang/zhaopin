package com.haigang.domain;

/**
 * 用户工作经验表
 * @author haigang
 *
 */
public class UserExperience {
	
	private long id;
	
	private String enterpriseName;  //企业名称
	
	private String enterpriseMark;  //企业类别
	
	private String enterpriseNumber;   //企业规模
	
	private String department;      //部门
	
	private String position;     //职位
	
	private String workTime;     //工作时间
	
	private String salary;    //职位月薪
	
	private String workDescribe;   //工作描述i
	
	private Resume resume;      //简历   多对一的关系
	
  //   private Set ponsitionMarks=new HashSet();   //与职位类别多对多的关系

	public Resume getResume() {
		return resume;
	}

	public void setResume(Resume resume) {
		this.resume = resume;
	}

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

	public String getEnterpriseMark() {
		return enterpriseMark;
	}

	public void setEnterpriseMark(String enterpriseMark) {
		this.enterpriseMark = enterpriseMark;
	}

	public String getEnterpriseNumber() {
		return enterpriseNumber;
	}

	public void setEnterpriseNumber(String enterpriseNumber) {
		this.enterpriseNumber = enterpriseNumber;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getWorkTime() {
		return workTime;
	}

	public void setWorkTime(String workTime) {
		this.workTime = workTime;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getWorkDescribe() {
		return workDescribe;
	}

	public void setWorkDescribe(String workDescribe) {
		this.workDescribe = workDescribe;
	}
	
}
