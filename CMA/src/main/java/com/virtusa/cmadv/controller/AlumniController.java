package com.virtusa.cmadv.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.virtusa.cmadv.entity.Alumni;
import com.virtusa.cmadv.entity.Users;
import com.virtusa.cmadv.service.AlumniServiceIface;

@Controller
public class AlumniController {
	@Autowired
	private AlumniServiceIface alumniServiceIface;
	
	@RequestMapping("/ShowAllAlumni")
	public ModelAndView showAllUsers() {
		List<Alumni> listOfAlumni= alumniServiceIface.showAllAlumni() ;
		
		if(listOfAlumni.isEmpty()) {
			return new ModelAndView("ShowAllAlumni","msg","No Records Found");
		}
		
		return new  ModelAndView("ShowAllAlumni","list",listOfAlumni);
	}
//	@RequestMapping("/ShowAllAlumniStud")
//	public ModelAndView showAllUsersStud() {
//		List<Alumni> listOfAlumni= alumniServiceIface.showAllAlumni() ;
//		
//		if(listOfAlumni.isEmpty()) {
//			return new ModelAndView("ShowAllAlumni","msg","No Records Found");
//		}
//		
//		return new  ModelAndView("ShowAllAlumni","list",listOfAlumni);
//	}
	
}
