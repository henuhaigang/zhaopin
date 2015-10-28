package com.haigang.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.haigang.domain.ProjectExperience;
import com.haigang.domain.Resume;
import com.haigang.service.ProjectExperienceService;
@Controller
@RequestMapping("projectExperience")
@SessionAttributes({"user","resume"})
public class ProjectExperienceController {
	
	
	@Resource
	ProjectExperienceService projectExperienceService;
	
	@RequestMapping("addProjectExperience")
	public String addProjectExperience(){
		return "project/addProjectExperience";
	}
	
	
	@RequestMapping("saveProjectExperience")
	public String saveProjectExperience(@ModelAttribute("resume")Resume resume,ProjectExperience projectExperience){
		projectExperience.setResume(resume);
		projectExperienceService.save(projectExperience);
		
		return "redirect:/language/addLanguage.action";
	}

}
