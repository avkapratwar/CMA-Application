package com.formfield.controller;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.formfield.model.Users;
import com.formfield.service.UserServiceIface;

@Controller
public class UserController {
	@Autowired
	UserServiceIface userServiceIface;
	
	@RequestMapping("/login")
	public String login() {
		return "loginpage";
	}
	
	@RequestMapping("/loginvalid")
	public ModelAndView loginValid(@ModelAttribute("login") Users users) {
		//System.out.println(users.getUserName()+users.getPassWord()+users.getUserType());
		String result=userServiceIface.loginValidationSerice(users);
		System.out.println(result);
		if(result==null) {
			return new ModelAndView("loginfail","msg","no account contact admin");
		}
		if(result.equals("active")) {
			if(users.getUserType().equals("Student")) {
				return new ModelAndView("stuhome");
			}
			if(users.getUserType().equals("Faculty")) {
				return new ModelAndView("fachome");
			}
			if(users.getUserType().equals("Admin")) {
				return new ModelAndView("admhome");
			}
			if(users.getUserType().equals("Alumni")) {
				return new ModelAndView("almhome");
			}
		}
		return new ModelAndView("loginfail","msg","invalid username or password");
	}
}
