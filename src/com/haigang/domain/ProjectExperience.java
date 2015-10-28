package com.haigang.domain;
/**
 * 项目经验表   
 * @author haigang
 *
 */
public class ProjectExperience {
	                     
	private long id;
	
	private String projectName;   //项目名称
	
	private String projecetPeriod;  //项目周期
	
	private String projectDescribe; //项目描述 
	
	private String duty;    //项目职责
	
	private User user;       //TODO 与用户多对一   ---------多余
	
	private Resume resume;

	public Resume getResume() {
		return resume;
	}

	public void setResume(Resume resume) {
		this.resume = resume;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjecetPeriod() {
		return projecetPeriod;
	}

	public void setProjecetPeriod(String projecetPeriod) {
		this.projecetPeriod = projecetPeriod;
	}

	public String getProjectDescribe() {
		return projectDescribe;
	}

	public void setProjectDescribe(String projectDescribe) {
		this.projectDescribe = projectDescribe;
	}

	public String getDuty() {
		return duty;
	}

	public void setDuty(String duty) {
		this.duty = duty;
	}

}
