package com.haigang.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.haigang.dao.UserInfoDAO;
import com.haigang.domain.UserInfo;
import com.haigang.service.UserInfoService;

@Service 
public class UserInfoServiceImpl implements UserInfoService {

	@Resource
	UserInfoDAO userInfoDAO;
	
	@Override
	public void save(UserInfo entity) {
		userInfoDAO.save(entity);

	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(UserInfo entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public UserInfo getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserInfo> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
