package com.haigang.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.haigang.dao.EmpInfoDAO;
import com.haigang.domain.EmpInfo;
import com.haigang.service.EmpInfoService;

@Service
public class EmpInfoServiceImpl implements EmpInfoService {

	@Resource
	EmpInfoDAO empInfoDAO;
	@Override
	public void save(EmpInfo entity) {
		empInfoDAO.save(entity);

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
