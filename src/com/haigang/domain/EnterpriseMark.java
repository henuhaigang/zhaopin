package com.haigang.domain;
/**
 * 企业类别表如：是互联网公司还是日化公司证券公司
 * @author haigang
 *
 */
public class EnterpriseMark {

	private long id;
	
	private String name;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
