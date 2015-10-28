package com.haigang.dao;

import com.haigang.base.BaseDAO;
import com.haigang.domain.User;

/**
 * 用户数据交互
 * @author haigang
 *
 */

public interface UserDAO extends BaseDAO<User> {

	//public void saveUser(User user);  
	public User userLogin(String name,String password,String type);
	public void userValidate(String userName);
	public User getUserByName(String userName);
	//public void saveUserInfo(UserInfo userInfo);
	//public void saveEnterpriseInfo(EnterpriseInfo enterpriseInfo);
}
