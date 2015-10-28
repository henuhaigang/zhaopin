package com.haigang.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.haigang.base.BaseDAOImpl;
import com.haigang.dao.UserExperienceDAO;
import com.haigang.domain.UserExperience;

@Repository
@Transactional
public class UserExperienceDAOImpl extends BaseDAOImpl<UserExperience> implements UserExperienceDAO{

	@Override
	public void save(UserExperience entity) {


		getSession().save(entity);
		
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
