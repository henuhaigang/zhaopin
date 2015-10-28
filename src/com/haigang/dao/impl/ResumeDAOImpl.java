package com.haigang.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.haigang.base.BaseDAOImpl;
import com.haigang.dao.ResumeDAO;
import com.haigang.domain.Resume;


@Repository
@Transactional
public class ResumeDAOImpl extends BaseDAOImpl<Resume> implements ResumeDAO {

	@Override
	public void save(Resume entity) {
		  //保存用户基本信息
		     getSession().save(entity);
	}
	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Resume entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public Resume getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Resume> findAll() {
		// TODO Auto-generated method stub
		return null;
	}


}
