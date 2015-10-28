package com.haigang.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.haigang.dao.ResumeDAO;
import com.haigang.domain.Resume;
import com.haigang.service.ResumeService;

@Service
public class ResumeServiceImpl implements ResumeService {

	@Resource
	ResumeDAO resumeDAO;
	@Override
	public void save(Resume entity) {
		
		resumeDAO.save(entity);

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
