package com.haigang.dao;

import java.util.List;

import com.haigang.base.BaseDAO;
import com.haigang.domain.City;
import com.haigang.domain.Province;

public interface CityDAO extends BaseDAO<City> {

	//public List<City> findByProvince(Province province);
	public List<City> findByProvince(Long id);
}
