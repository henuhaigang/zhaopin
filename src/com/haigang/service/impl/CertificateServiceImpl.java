package com.haigang.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.haigang.dao.CertificateDAO;
import com.haigang.domain.Certificate;
import com.haigang.service.CertificateService;
@Service
public class CertificateServiceImpl implements CertificateService {

	@Resource
	CertificateDAO certificateDAO;
	@Override
	public void save(Certificate entity) {

		certificateDAO.save(entity);
		

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
