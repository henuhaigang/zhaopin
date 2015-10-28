package com.haigang.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.haigang.dao.ProjectExperienceDAO;
import com.haigang.domain.ProjectExperience;
import com.haigang.service.ProjectExperienceService;

@Service
public class ProjectExperienceServiceImpl implements ProjectExperienceService {

	@Resource
	ProjectExperienceDAO projectExperienceDAO;
	@Override
	public void save(ProjectExperience entity) {
		projectExperienceDAO.save(entity);

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
