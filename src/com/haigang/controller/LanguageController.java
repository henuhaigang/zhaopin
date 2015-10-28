package com.haigang.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Resource;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.haigang.domain.Language;
import com.haigang.domain.Resume;
import com.haigang.service.LanguageService;

@Controller
@RequestMapping("language")
@SessionAttributes({"user","resume"})
public class LanguageController {
	
	
	@Resource
	LanguageService languageService;
	
	@RequestMapping("addLanguage")
	public String addLanguage(){
		return "language/addLanguage";
	}
	@RequestMapping("saveLanguage")
	public String saveLanguage(@ModelAttribute Resume resume,Language language){
		
		language.setResume(resume);
		
		languageService.save(language);
		
		
		return "redirect:/certificate/addCertificate.action";
	}
	
		@InitBinder
		public void initBinder(ServletRequestDataBinder binder) {
			binder.registerCustomEditor(Date.class, new CustomDateEditor(
					new SimpleDateFormat("yyyy-MM-dd"), true));
		}
}
