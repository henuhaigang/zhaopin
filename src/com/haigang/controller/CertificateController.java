package com.haigang.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.haigang.domain.Certificate;
import com.haigang.domain.Resume;
import com.haigang.service.CertificateService;



@Controller
@RequestMapping("certificate")
@SessionAttributes({"user","resume"})
public class CertificateController {

	@Resource
	CertificateService certificateService;
	@RequestMapping("addCertificate")
	public String addCertificate(){
		return "certificate/addCertificate";
	}
	@RequestMapping("saveCertificate")
	public String saveCertificate(@ModelAttribute("resume") Resume resume,Certificate certificate){
		certificate.setResume(resume);
		certificateService.save(certificate);
		return "userview/success";
	}
}
