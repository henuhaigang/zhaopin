package com.haigang.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.haigang.domain.Resume;
import com.haigang.domain.UserExperience;
import com.haigang.service.UserExperienceService;

@Controller
@RequestMapping("userExperience")
@SessionAttributes({"user","resume"})
public class UserExperienceController {
	
	
	@Resource
	UserExperienceService userExperienceService;
	
	@RequestMapping("/addUserExperience")
	/*
	 * 添加简历工作经验页面
	 */
	public String addUserExperience() {
		// TODO 要添加权限认证
		return "experience/addUserExperience";  //页面跳转

	}

	@RequestMapping("/saveUserExperience")
	/*
	 * 添加简历工作经验页面
	 */
	public String saveUserExperience(@ModelAttribute("resume") Resume resume,
			UserExperience userExperience) {
		// TODO 要添加权限认证
		userExperience.setResume(resume);   //保存外键
		userExperienceService.save(userExperience);

		return "redirect:/projectExperience/addProjectExperience.action";  //页面跳转到跳转

	}
	
}
