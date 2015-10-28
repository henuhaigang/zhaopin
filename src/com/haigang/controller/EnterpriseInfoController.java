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

import com.haigang.domain.EnterpriseInfo;
import com.haigang.domain.User;
import com.haigang.service.EnterpriseInfoService;


@Controller
@RequestMapping("enterpriseInfo")
@SessionAttributes("user")
public class EnterpriseInfoController {
	
	@Resource
	EnterpriseInfoService enterpriseInfoService;
	
	@RequestMapping("/addEnterpriseInfo")
	public String addEnterpriseInfo(){   //页面跳转
		
		return "enterpriseInfo/addEnterpriseInfo";
		
	}
	@RequestMapping("saveEnterpriseInfo")
	public String saveEnterpriseInfo(@ModelAttribute("user")User user,EnterpriseInfo enterpriseInfo){
		
		enterpriseInfo.setUser(user);
		
		enterpriseInfoService.save(enterpriseInfo);
		return "userview/success";
		
	}
	@InitBinder
	public void initBinder(ServletRequestDataBinder binder) {
		binder.registerCustomEditor(Date.class, new CustomDateEditor(
				new SimpleDateFormat("yyyy-MM-dd"), true));
	}

}
