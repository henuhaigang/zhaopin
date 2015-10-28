package com.haigang.mail;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.UnknownHostException;
import java.util.Enumeration;


public class Test {
	public static void main(String[] args){
        //这个类主要是设置邮件
		String ip="";
		 try {
			ip=InetAddress.getLocalHost().getHostAddress();
		} catch (UnknownHostException e) {
			
			e.printStackTrace();
		}
	  MailSenderInfo mailInfo = new MailSenderInfo(); 
	  mailInfo.setMailServerHost("smtp.126.com"); 
	  mailInfo.setMailServerPort("25"); 
	  mailInfo.setValidate(true); 
	  mailInfo.setUserName("gaogang1231818@126.com"); 
	  mailInfo.setPassword("13271037908");//您的邮箱密码 
	  mailInfo.setFromAddress("gaogang1231818@126.com"); 
	  mailInfo.setToAddress("1196696384@qq.com"); 
	  mailInfo.setSubject("河大招聘欢迎您！"); 
	  mailInfo.setContent("你好，欢迎注册河大招聘，点击http://"+ip+":8080/zhaopin/userInfo/addUserInfo.action"+" 即可激活您的账户，如果账户无法此链接无法点击请将地址复制到浏览器的地址栏！"); 
        //这个类主要来发送邮件
	  SimpleMailSender sms = new SimpleMailSender();
         sms.sendTextMail(mailInfo);//发送文体格式 
         SimpleMailSender.sendHtmlMail(mailInfo);//发送html格式
         
         
         System.out.println("===============================");
         try {
             Enumeration<NetworkInterface> netInterfaces = NetworkInterface
                     .getNetworkInterfaces();
             while (netInterfaces.hasMoreElements()) {
                 NetworkInterface nif = netInterfaces.nextElement();
                 Enumeration<InetAddress> iparray = nif.getInetAddresses();
                 while (iparray.hasMoreElements()) {
                     System.out.println("IP:"
                             + iparray.nextElement().getHostAddress());
                 }
             }
         } catch (Exception e) {
             System.out.println(e.getMessage());
         }
	}

}
