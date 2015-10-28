package com.haigang.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Resource;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.haigang.dao.UserDAO;
import com.haigang.domain.User;
import com.haigang.mail.MailSenderInfo;
import com.haigang.mail.SimpleMailSender;
import com.haigang.service.UserService;

/**
 * 用户控制类---有关用户操作的控制类
 * 
 * @author haigang
 * 
 */
@Controller
// 用来标注当前类是springmvc的控制层的类
@RequestMapping("user")
@SessionAttributes("user")
public class UserController {

	@Resource
	UserService userService;

	@Resource
	UserDAO userDAO;

	User user;

	@RequestMapping("/login")
	public String login() { // 转向登录页面
		return "userview/userLogin";
	}

	/**
	 * 个人用户注册页面转向
	 * 
	 * @return
	 */
	@RequestMapping("/personalRegister")
	public String personalRegister() {
		return "userview/personalRegister";
	}

	/**
	 * 企业用户注册页面转向
	 * 
	 * @return
	 */
	@RequestMapping("/enterPrisRregister")
	public String enterPrisRregister() {
		return "userview/enterPrisRregister";
	}

	@RequestMapping("/addEnterpriseInfo")
	/* 添加企业基本信息 */
	public String addEnterpriseInfo() {
		return "userview/addEnterpriseInfo";
	}

	/**
	 * 用户注册，数据提交
	 * 
	 * @return
	 */
	@RequestMapping("/register")
	public String register(User user) { // 注册包括求职者注册和企业用户注册

		user.setRegisterDate(new Date());
		user.setValidateUser("1");
		userService.save(user);
		
		
		
		String ip = "";
		try {
			ip = InetAddress.getLocalHost().getHostAddress();
		} catch (UnknownHostException e) {

			e.printStackTrace();
		}
		// 发送邮件
		MailSenderInfo mailInfo = new MailSenderInfo();
		mailInfo.setMailServerHost("smtp.126.com");
		mailInfo.setMailServerPort("25");
		mailInfo.setValidate(true);
		mailInfo.setUserName("gaogang1231818@126.com");
		mailInfo.setPassword("13271037908");// 您的邮箱密码
		mailInfo.setFromAddress("gaogang1231818@126.com");
		mailInfo.setToAddress(user.getUserName());
		mailInfo.setSubject("河大招聘欢迎您！");
		mailInfo.setContent("你好，欢迎注册河大招聘，点击http://" + ip
				+ ":8080/zhaopin/user/userValidate.action?userName="+user.getUserName()
				+ " 即可激活您的账户，如果账户无法此链接无法点击请将地址复制到浏览器的地址栏！");
		// 这个类主要来发送邮件
		SimpleMailSender sms = new SimpleMailSender();
		sms.sendTextMail(mailInfo);// 发送文体格式
		SimpleMailSender.sendHtmlMail(mailInfo);// 发送html格式
		return "redirect:login.action";

	}

	/**
	 * 用户登录
	 * 
	 * @param name
	 * @param password
	 * @param type
	 * @return
	 */
	@RequestMapping("/userLogin")
	public String userLogin(String userName, String password, String type,
			Model model) { // ,HttpServletRequest req){

		user = userDAO.userLogin(userName, password, type);

		model.addAttribute(user);

		// req.getSession().setAttribute("user", user);
		if (user == null)
			return "userview/personalRegister";
		return "userview/success";

	}

	@RequestMapping("/userValidate")
	public String userValidate(String userName) { 
		
		userService.userValidate(userName);
	
		return "userview/success";

	}

	/**
	 * 注册时间类型的属性编辑器,因为springMVC中没有定义时间格式的自动识别方式
	 * 
	 * @param binder
	 */
	@InitBinder
	public void initBinder(ServletRequestDataBinder binder) {
		binder.registerCustomEditor(Date.class, new CustomDateEditor(
				new SimpleDateFormat("yyyy-MM-dd"), true));
	}

}
