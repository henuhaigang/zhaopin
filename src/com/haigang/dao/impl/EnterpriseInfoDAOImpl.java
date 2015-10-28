package com.haigang.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.haigang.base.BaseDAOImpl;
import com.haigang.dao.EnterpriseInfoDAO;
import com.haigang.domain.EnterpriseInfo;
import com.haigang.domain.UserInfo;

@Repository
@Transactional
public class EnterpriseInfoDAOImpl extends BaseDAOImpl<EnterpriseInfo> implements EnterpriseInfoDAO {

	@Override
	public void save(EnterpriseInfo entity) {
		getSession().save(entity);

	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(EnterpriseInfo entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public EnterpriseInfo getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EnterpriseInfo> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
