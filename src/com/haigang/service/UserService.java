package com.haigang.service;

import com.haigang.base.BaseDAO;
import com.haigang.domain.User;

/**
 * 用户业务逻辑
 * @author haigang
 *
 */

public interface UserService extends BaseDAO<User>{
	public void userValidate(String  userName);
	public User getUserByName(String userName);
}
