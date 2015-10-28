package com.haigang.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.haigang.base.BaseDAOImpl;
import com.haigang.dao.CityDAO;
import com.haigang.domain.City;
import com.haigang.domain.Province;
@Repository
@Transactional
public class CityDAOImpl extends BaseDAOImpl<City> implements CityDAO {

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
	public List<City> findByProvince(Long id) {
		// TODO Auto-generated method stub
		return getSession().createQuery("from City c where c.Province_ID=?").setParameter(0, id).list();
	}

//	@Override
//	public List<City> findByProvince(Province province) {
//		
//		return getSession().createQuery("from City c where c.province=?").setParameter(0, province).list();
//	}

}
