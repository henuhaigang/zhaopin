package com.haigang.dao.impl;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.haigang.base.BaseDAOImpl;
import com.haigang.dao.UserDAO;
import com.haigang.domain.User;


/**
 * 用户数据交互实现类
 * @author haigang
 *
 */
@Repository
@Transactional
public class UserDAOImpl extends BaseDAOImpl<User> implements UserDAO {

	
	@Override
	public void update(User entity) {
		
		getSession().update(entity);
	}
	
	@Override
	public void save(User user) {   //保存用户	
		
		getSession().save(user);
		
	}
	public User userLogin(String userName,String password,String type){  //用户登录
		
		User  user=(User)getSession().createQuery("from User u where u.userName=:userName and u.password=:password")
				.setParameter("userName", userName).setParameter("password", password)
				.uniqueResult();
		return user;
		
	}
	
	@Override
	public void userValidate(String userName) {
		 Query query = getSession().createQuery("update User u set u.validateUser='2' where userName = ?").setParameter(0, userName);  
	        query.executeUpdate();  
		
	}
	@Override
	public User getUserByName(String userName) {
		User user=(User)getSession().createQuery("from User u where u.userName=?").setParameter(0, userName).uniqueResult();
		return user;
	}
	
	
}
