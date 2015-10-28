package com.haigang.domain;
/**
 * 职位表
 * @author haigang
 *
 */
public class Position {
	
	private long positionID;
	
	private String positionName;  //职位名
	
	private PositionMark positionMark;

	public PositionMark getPositionMark() {
		return positionMark;
	}

	public void setPositionMark(PositionMark positionMark) {
		this.positionMark = positionMark;
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
	
	

}
