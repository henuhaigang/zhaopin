package com.haigang.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.haigang.dao.UserDAO;
import com.haigang.domain.User;
import com.haigang.service.UserService;

/**
 * 用户业务逻辑实现
 * @author haigang
 *
 */
@Service 
public class UserServiceImpl implements UserService{

	@Resource
	UserDAO userDAO;
	
	@Override
	public void save(User entity) {
		// TODO Auto-generated method stub
		userDAO.save(entity);
	}
	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void update(User entity) {
		userDAO.update(entity);
		
	}
	@Override
	public User getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void userValidate(String userName) {
		userDAO.userValidate(userName);
		
	}
	@Override
	public User getUserByName(String userName) {
		
		return userDAO.getUserByName(userName);
	}

}
