package com.haigang.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.haigang.domain.Resume;
import com.haigang.domain.User;
import com.haigang.service.ResumeService;


@Controller
@RequestMapping("resume")
@SessionAttributes({"user","resume"})
public class ResumeController {	
//	@Resource
//	UserService userService;

	@Resource
	ResumeService resumeService;

	//User user;
	@RequestMapping("/addResume")
	/*
	 * 保存简历基本信息，另外还学要把简历放到session中去， 从而保证添加其他信息时可以插入外键
	 */
	public String addResume() {
		// TODO 要添加权限认证
		return "resume/addResume";
	}

	
	/**
	 * 保存简历信息
	 * 
	 * @param user
	 * @param resume
	 * @return
	 */
	@RequestMapping("/saveResume")
	/*
	 * 保存简历基本信息，另外还学要把简历放到session中去， 从而保证添加其他信息时可以插入外键
	 */
	public String saveResume(@ModelAttribute("user")User user, Resume resume,Model model) {
		// TODO 要添加权限认证
		resume.setUser(user); // 保存用户信息
		model.addAttribute(resume);
		resumeService.save(resume);
		return "redirect:/userExperience/addUserExperience.action";

	}




}
