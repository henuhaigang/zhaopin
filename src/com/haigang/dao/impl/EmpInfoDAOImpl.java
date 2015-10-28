package com.haigang.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.haigang.base.BaseDAOImpl;
import com.haigang.dao.EmpInfoDAO;
import com.haigang.domain.EmpInfo;
@Repository
@Transactional
public class EmpInfoDAOImpl extends BaseDAOImpl<EmpInfo> implements EmpInfoDAO {

	@Override
	public void save(EmpInfo entity) {
	getSession().save(entity);
		
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(EmpInfo entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public EmpInfo getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EmpInfo> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
