package com.haigang.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * 职位类别表
 * @author haigang
 *
 */
public class PositionMark {
	
	private long id;
	
	private String  psitionMarkName;  //职位类别名
	
	private Set positions=new HashSet();
	
	

	public Set getPositions() {
		return positions;
	}

	public void setPositions(Set positions) {
		this.positions = positions;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPsitionMarkName() {
		return psitionMarkName;
	}

	public void setPsitionMarkName(String psitionMarkName) {
		this.psitionMarkName = psitionMarkName;
	}

}
