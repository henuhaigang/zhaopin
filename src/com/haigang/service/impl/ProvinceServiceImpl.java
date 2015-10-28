package com.haigang.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.haigang.dao.ProvinceDAO;
import com.haigang.domain.Province;
import com.haigang.service.ProvinceService;
@Service
public class ProvinceServiceImpl implements ProvinceService {

	@Resource
	ProvinceDAO provinceDAO;
	@Override
	public void save(Province entity) {
		// TODO Auto-generated method stub

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
		
		return provinceDAO.findAll();
	}

}
