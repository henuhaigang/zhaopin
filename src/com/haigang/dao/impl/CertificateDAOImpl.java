package com.haigang.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.haigang.base.BaseDAOImpl;
import com.haigang.dao.CertificateDAO;
import com.haigang.domain.Certificate;
@Repository
@Transactional
public class CertificateDAOImpl extends BaseDAOImpl<Certificate> implements CertificateDAO {

	@Override
	public void save(Certificate entity) {
		getSession().save(entity);
		
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Certificate entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Certificate getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Certificate> findAll() {
		// TODO Auto-generated method stub
		return null;
	}



}
