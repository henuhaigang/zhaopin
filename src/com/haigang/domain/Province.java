package com.haigang.domain;

import java.util.HashSet;
import java.util.Set;

import com.google.gson.annotations.Expose;

/**
 * Province entity.
 * 
 * @author haigang
 */

public class Province  {

	

	private long id;
	
	private String provinceName;
	
	
	/*private Set cities = new HashSet();  //与城市的基本关系
	

	public Set getCities() {
		return cities;
	}

	public void setCities(Set cities) {
		this.cities = cities;
	}*/

	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getProvinceName() {
		return provinceName;
	}

	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}
	
}