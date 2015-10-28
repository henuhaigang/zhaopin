package com.haigang.domain;

import java.util.Date;
/**
 * 投递信息表(用户投递后将投递者、接受者、和简历的Id都存到此处)
 * @author haigang
 *
 */
public class DeliverInfo {
	//可以考虑将投递信息表和企业用户接受信息表和起来   但是一旦出现两个表关联一个表就会出现麻烦的问题	
    private long id;
	
	private long fromUserID;             //发送用户
	
	private long toUserID;      //接收用户--企业用户
	
    private Date deliverDate;      //发送日期
	
    private  long resumeID;   //简历

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getFromUserID() {
		return fromUserID;
	}

	public void setFromUserID(long fromUserID) {
		this.fromUserID = fromUserID;
	}

	public long getToUserID() {
		return toUserID;
	}

	public void setToUserID(long toUserID) {
		this.toUserID = toUserID;
	}

	public Date getDeliverDate() {
		return deliverDate;
	}

	public void setDeliverDate(Date deliverDate) {
		this.deliverDate = deliverDate;
	}

	public long getResumeID() {
		return resumeID;
	}

	public void setResumeID(long resumeID) {
		this.resumeID = resumeID;
	}

}
