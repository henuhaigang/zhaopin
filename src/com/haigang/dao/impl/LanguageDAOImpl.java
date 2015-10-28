package com.haigang.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.haigang.base.BaseDAOImpl;
import com.haigang.dao.LanguageDAO;
import com.haigang.domain.Language;

@Repository
@Transactional
public class LanguageDAOImpl extends BaseDAOImpl<Language> implements LanguageDAO {

	@Override
	public void save(Language entity) {
		getSession().save(entity);
		
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Language entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Language getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Language> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
