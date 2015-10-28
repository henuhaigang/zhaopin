package com.haigang.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.haigang.base.BaseDAOImpl;
import com.haigang.dao.UserInfoDAO;
import com.haigang.domain.UserInfo;

@Repository
@Transactional
public class UserInfoDAOImpl extends BaseDAOImpl<UserInfo> implements UserInfoDAO {

	@Override
	public void save(UserInfo entity) {
		  //保存用户基本信息
		     getSession().save(entity);
			

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
