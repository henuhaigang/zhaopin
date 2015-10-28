package com.haigang.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.haigang.domain.Province;
import com.haigang.domain.User;
import com.haigang.domain.UserInfo;
import com.haigang.service.ProvinceService;
import com.haigang.service.UserInfoService;

/**
 * 用户基本信息控制
 * @author haigang
 *
 */
@Controller// 用来标注当前类是springmvc的控制层的类
@RequestMapping("userInfo")
@SessionAttributes("user")
public class UserInfoController {

	@Resource
	UserInfoService userInfoService;
	@Resource
	ProvinceService provinceService;

	@RequestMapping("/addUserInfo")/* 个人用户基本信息添加 */
	
	public String addUserInfo(Model model) { //在此添加用戶的省份列表
		
		
		List<Province> provinceList=provinceService.findAll();
		model.addAttribute(provinceList);
		
		
		return "userInfo/addUserInfo";
	}
	@RequestMapping("/saveUserInfo")
	// 保存个人基本信息, 
	public String saveUserInfo(@ModelAttribute("user") User user,
			UserInfo userInfo) {
		// TODO 要添加权限认证
		userInfo.setUser(user);// ((User)req.getSession().getAttribute("user")));
		userInfoService.save(userInfo);
		return "userview/success";

	}
	@InitBinder
	public void initBinder(ServletRequestDataBinder binder) {
		binder.registerCustomEditor(Date.class, new CustomDateEditor(
				new SimpleDateFormat("yyyy-MM-dd"), true));
	}

}
