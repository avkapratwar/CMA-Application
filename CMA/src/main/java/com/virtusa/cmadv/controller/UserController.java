package com.virtusa.cmadv.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.virtusa.cmadv.entity.Users;
import com.virtusa.cmadv.service.UserServiceIface;

 
@Controller
public class UserController {
	@Autowired
	private UserServiceIface userServiceImpl;
	
	
	HttpServletRequest request;
	HttpSession session;
	@RequestMapping("/addUser")
	public String addUserDisp() {
		return "AddUser";
		
	}
	@RequestMapping(value="/AddUserController",method = RequestMethod.POST)
	public ModelAndView addUser(Users users) {

		if(userServiceImpl.addUser(users)!=null) {
			return new ModelAndView("AddUser","msg","Inserted");
		} 
		return new ModelAndView("AddUser","msg","invalid");
		
	}
	@RequestMapping(value="/ShowAllUsersController")
	public ModelAndView showAllUsers() {
		List<Users> listOfUsers= userServiceImpl.showAllUsers();
		if(listOfUsers.isEmpty()) {
			return new ModelAndView("AddUser","msg","No Records Found");
		}
		
		return new  ModelAndView("ShowAllUsers","list",listOfUsers);
	}
	@RequestMapping(value="/DeleteUsersController")
	public String deleteUser(Users user) {
		userServiceImpl.deleteUser(user);
		return "redirect:ShowAllUsersController";	
	}
	@RequestMapping("/updateUser")
	public ModelAndView updateUserDisp(Users user) {
		return new ModelAndView("UpdateUsers","user",user);
		
	}
	@RequestMapping(value="/UpdateUsersController",method = RequestMethod.POST)
	public ModelAndView updateUser(Users users) {

		if(userServiceImpl.updateUser(users)!=null) {
			return new ModelAndView("redirect:ShowAllUsersController");
		}
		return new ModelAndView("AddUser","msg","invalid");
		
	}
	@RequestMapping("/loginvalid")
	public ModelAndView loginValid(@ModelAttribute("login") Users users) {
		System.out.println(users.getUserName()+users.getPassword()+users.getType());
		//System.out.println(users.getPassword());
		String result=userServiceImpl.loginValidationService(users);
		//System.out.println(users.getPassword());
		//System.out.println(result);
		if(result==null) {
			return new ModelAndView("loginfail","msg","no account contact admin");
		}
		if(result.equals("active")) {
			if(users.getType().equals("Student")) {
				//session.setAttribute("id", users.getUserName());
				return new ModelAndView("Student");
			}
			if(users.getType().equals("Faculty")) {
				//session.setAttribute("id", users.getUserName());
				return new ModelAndView("Faculty");
			}
			if(users.getType().equals("Admin")) {
				//session.setAttribute("id", users.getUserName());
				return new ModelAndView("Admin");
			}
			if(users.getType().equals("Alumni")) {
				//session.setAttribute("id", users.getUserName());
				return new ModelAndView("almhome");
			}
		}
		return new ModelAndView("loginfail","msg","invalid username or password");
	}
	
	@RequestMapping("/Logout")
	public String logout() {
		//request.setAttribute("abc", "12345");
		return "Logout";
	}
	@RequestMapping("/Logoutuser")
	public String logoutUser() {
		
		//session.invalidate();
		return "cvgs";
		
		
	}
	@RequestMapping("/searchstatus")
	public ModelAndView status(@RequestParam("rollnumber") String userName) {
		Users users = new Users();
		users.setUserName(userName);
		List<Users> users2 = userServiceImpl.loginStatusService(users);
		if(users2.equals(null)) {
			String res = "Username not found or Contact Admin";
			return new ModelAndView("resstatus","result",res);
		} else {
			return new ModelAndView("resultstatus","users",users2);
		}
	}
	
}
