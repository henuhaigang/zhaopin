package com.haigang.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.haigang.dao.LanguageDAO;
import com.haigang.domain.Language;
import com.haigang.service.LanguageService;
@Service
public class LanguageServiceImpl implements LanguageService {

	@Resource
	LanguageDAO languageDAO;
	@Override
	public void save(Language entity) {

		languageDAO.save(entity);

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
