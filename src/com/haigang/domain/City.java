package com.haigang.domain;

import com.google.gson.annotations.Expose;



/**
 * 城市表
 * 
 * @author haigang
 */

public class City{

	

	private long id;
	
	private String cityName;
	
	private long Province_ID;
	/*private Province province;  //与省份的关系*/

	/*public Province getProvince() {
		return province;
	}

	public void setProvince(Province province) {
		this.province = province;
	}*/

	

	public long getProvince_ID() {
		return Province_ID;
	}

	public void setProvince_ID(long province_ID) {
		Province_ID = province_ID;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	
	
}