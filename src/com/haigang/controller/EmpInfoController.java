package com.haigang.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.haigang.domain.EmpInfo;
import com.haigang.domain.User;
import com.haigang.service.EmpInfoService;


@Controller
@RequestMapping("empInfo")
@SessionAttributes("user")
public class EmpInfoController {
	
	
	@Resource
	EmpInfoService empInfoService;
	
	@RequestMapping("/addEmpInfo")
	public String addEmpInfo(){
		return "empInfo/addEmpInfo";
	}
	
	@RequestMapping("/saveEmpInfo")
	public String saveEmpInfo(@ModelAttribute("user") User user,EmpInfo empInfo){
		//TODO 在此需要加权限认证 用户是否登录
		empInfo.setUser(user);
		empInfoService.save(empInfo);
		return "userview/success";
	}

}
