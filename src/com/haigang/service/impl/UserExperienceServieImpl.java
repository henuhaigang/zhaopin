package com.haigang.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.haigang.dao.UserExperienceDAO;
import com.haigang.domain.UserExperience;
import com.haigang.service.UserExperienceService;

@Service
public class UserExperienceServieImpl implements UserExperienceService {

	@Resource
	UserExperienceDAO userExperienceDAO;
	@Override
	public void save(UserExperience entity) {
		

		userExperienceDAO.save(entity);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(UserExperience entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public UserExperience getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserExperience> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
