package com.haigang.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.haigang.dao.EnterpriseInfoDAO;
import com.haigang.domain.EnterpriseInfo;
import com.haigang.service.EnterpriseInfoService;

@Service
public class EnterpriseInfoServiceImpl implements EnterpriseInfoService {

	@Resource
	EnterpriseInfoDAO enterpriseInfoDAO;
	@Override
	public void save(EnterpriseInfo entity) {
		
		enterpriseInfoDAO.save(entity);

	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(EnterpriseInfo entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public EnterpriseInfo getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EnterpriseInfo> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
