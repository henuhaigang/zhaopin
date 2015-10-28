package com.haigang.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.haigang.base.BaseDAOImpl;
import com.haigang.dao.CityDAO;
import com.haigang.domain.City;
import com.haigang.domain.Province;
import com.haigang.service.CityService;
@Service
public class CityServiceImp extends BaseDAOImpl<City> implements CityService {

	@Resource
	CityDAO cityDAO;
	
	@Override
	public void save(City entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(City entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public City getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<City> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	/*public List<City> findByProvince(Province province) {
		
		return cityDAO.findByProvince(province);
	}*/
    public List<City> findByProvince(Long id) {
		
		return cityDAO.findByProvince(id);
	}

}
