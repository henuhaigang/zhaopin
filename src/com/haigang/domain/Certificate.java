package com.haigang.domain;
/**
 * 证书表
 * @author haigang
 *
 */
public class Certificate {
	
	private long id;
	
	private String certificateMark;  //证书类别
	
	private String certificateName;  //证书名称
	
	private String authority;//办法机构
	
	private String issueDate; //办法时间
	
	private Resume resume;

	

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

	public String getCertificateMark() {
		return certificateMark;
	}

	public void setCertificateMark(String certificateMark) {
		this.certificateMark = certificateMark;
	}

	public String getCertificateName() {
		return certificateName;
	}

	public void setCertificateName(String certificateName) {
		this.certificateName = certificateName;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	public String getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}
	
	

}
