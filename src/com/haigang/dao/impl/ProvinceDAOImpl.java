package com.haigang.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.haigang.base.BaseDAOImpl;
import com.haigang.dao.ProvinceDAO;
import com.haigang.domain.Province;

@Repository
@Transactional
public class ProvinceDAOImpl extends BaseDAOImpl<Province> implements ProvinceDAO {

	@Override
	public void save(Province entity) {
		getSession().save(entity);

	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Province entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public Province getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Province> findAll() {
	
		return getSession().createQuery("FROM Province").list();
	}

}
