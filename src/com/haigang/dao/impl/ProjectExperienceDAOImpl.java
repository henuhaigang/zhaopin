package com.haigang.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.haigang.base.BaseDAOImpl;
import com.haigang.dao.ProjectExperienceDAO;
import com.haigang.domain.ProjectExperience;

@Repository
@Transactional
public class ProjectExperienceDAOImpl extends BaseDAOImpl<ProjectExperience> implements ProjectExperienceDAO {

	@Override
	public void save(ProjectExperience entity) {
		
		getSession().save(entity);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(ProjectExperience entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ProjectExperience getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProjectExperience> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
