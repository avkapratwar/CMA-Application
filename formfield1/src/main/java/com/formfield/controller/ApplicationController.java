package com.formfield.controller;

import java.util.List;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.formfield.model.Applicants;
import com.formfield.service.ApplicantServiceIface;

@Controller

public class ApplicationController {
	@Autowired
	ApplicantServiceIface applicantServiceImpl;
	
	Applicants applicants =new Applicants();
	public ApplicantServiceIface getApplicantServiceImpl() {
		return applicantServiceImpl;
	}
	public void setApplicantServiceImpl(ApplicantServiceIface applicantServiceImpl) {
		this.applicantServiceImpl = applicantServiceImpl;
	}
	
	
	
	
	
	@RequestMapping("/applicantregister")
	public String regPage(Model m) {
		m.addAttribute("applicants",new Applicants());
		return "Applicantregister";
	}
	
	
	@RequestMapping("/addapplicant")
	public ModelAndView regSucess(@ModelAttribute("applicants") Applicants applicants) throws SecurityException, IllegalStateException, RollbackException, HeuristicMixedException, HeuristicRollbackException, SystemException {
		int id=applicantServiceImpl.addApplicantService(applicants);
		if(id>0) {
			return new ModelAndView("final","id",id);
		}
		String str="Unable to register";
		return new ModelAndView("viewpage","str",str);
	}
	
	
	@RequestMapping("/showallregister")
	public ModelAndView showAllApplicants() {
		List<Applicants> list=applicantServiceImpl.showAllService();
		//System.out.println(list);
		if(list.isEmpty()) {
			String str="No Data Found";
			return new ModelAndView("noappdata","message",str);
		}
		return new ModelAndView("appdata","list",list);
	}
	
	
	
	@RequestMapping(value = "/showdetailed/{id}")
	public ModelAndView showDetailedInfo(@PathVariable("id")int id) {
		Applicants applicants=new Applicants();
		applicants.setApplicationNumber(id);
		Applicants applicants2 = applicantServiceImpl.showParticularService(applicants);
		return new ModelAndView("detailedinfo","applicants",applicants2);
	}
	
	@RequestMapping("/applicationstatus")
	public String appStat() {
		return "status";
	}
	
	@RequestMapping("/appstatus")
	public ModelAndView showStatus(@RequestParam("applicationNumber") int ano) {
		String str=applicantServiceImpl.showStatusService(ano);
		if(str==null) {
			String res="Application Number"+ano+" not found or invalid";
			return new ModelAndView("statusresult","msg",res);
		} else {
			return new ModelAndView("statusresultpage","list",str);
		}
	}
	
	@RequestMapping("showdetailed/update")//,method = RequestMethod.GET)
	public ModelAndView updStatus(@RequestParam("status") String stat,@RequestParam("appNo") int ano) {//@RequestParam("submit") int ano) {
		System.out.println(stat);
		applicants.setStatus(stat);
		System.out.println(ano);
		applicants.setApplicationNumber(ano);
		applicants.setStatus(stat);
		String st=applicantServiceImpl.updateStatusService(applicants);
		if(st=="Successfully Updated") {
			return new ModelAndView("redirect:/showallregister");
		}
		return new ModelAndView("redirect:/showallregister");
		
	}
	
	
	
}
