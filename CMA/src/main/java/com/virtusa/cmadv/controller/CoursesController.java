package com.virtusa.cmadv.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.virtusa.cmadv.entity.Courses;
import com.virtusa.cmadv.entity.SelectCourses;
import com.virtusa.cmadv.service.CourseServiceIface;


@Controller
public class CoursesController {
	@Autowired
	CourseServiceIface courseServiceIface;
//	@Autowired
//	Faculty faculty;
	
	@RequestMapping("/Courses")
	public String show() {
		return "Courses";
	}
	
	@RequestMapping("/vcourse")
	public String showpar() {
		return "ViewCourseStud";
	}
	
	
	@RequestMapping("/insertcourses")
	public String insert()
	{
		return "CourseInsertForm";
	}
	
	@RequestMapping("/addcourses1")
	public ModelAndView InsertInfo(Courses course)
	{
		System.out.println("hiii");
		if(courseServiceIface.insertCourse(course)!=null)
		{
			return new ModelAndView("insertsucess","name","success");
		}
		return null;
		
	}
	@RequestMapping("/Showallcourses")
	public ModelAndView Showallevent() {
		List<Courses> l=courseServiceIface.showCourse();
		System.out.println(l);
		String msg=null;
		if(l.isEmpty()) {
			msg="No records found";
			return new ModelAndView("insertsucess","msg",msg);
		}
		return new ModelAndView("ShowCourses","list",l);
	
	}
	@RequestMapping("/CourseUpdate")
	//@ResponseBody
	public ModelAndView updateCourse(Courses courses)
	{
		
		System.out.println(courses.getCourseId());
		System.out.println(courses.getStartDate());
		Courses courses1=courseServiceIface.showDetail(courses.getCourseId());
		System.out.println(courses1);
		
		return new ModelAndView("UpdateCourses","course",courses1);
	}
	@RequestMapping("/updcourses")
	public ModelAndView updatetable(@ModelAttribute("cour")Courses courses,Model m)
	{System.out.println(courses.getCourseName());
		
		String result=courseServiceIface.updateCourse(courses);
		if(result!=null)
		{
			return new ModelAndView("insertsucess","name","course update success");
		}
		else
		{
			return new ModelAndView("insertsucess","name","course update failure");
		}
	}
	@RequestMapping("/CourseDelete")
	public ModelAndView deleteTable(Courses courses)
	{
		String result=courseServiceIface.deleteCourse(courses);
		if(result!=null)
		{
			return new ModelAndView("insertsucess","name","course deleted");
		}
		else
		{
			return new ModelAndView("insertsucess","name","course failure");
		}
	}
	@RequestMapping("/addMyCourses")
	public ModelAndView addCourses(Courses courses)
	{
		
		List<Courses> l=courseServiceIface.showCourse();
		String msg=null;
		if(l.isEmpty()) {
			msg="No records found";
			return new ModelAndView("Viewpage","msg",msg);
		}
		return new ModelAndView("ShowFa","list",l);
	}
	
	@RequestMapping("/login")
	public ModelAndView login(Courses courses)
	{
		
		/*m.addAttribute("courseId",courseId);
		m.addAttribute("courseName",courseName);*/
		return new ModelAndView("Login","courses",courses);
	}
	@RequestMapping("/selectyy")
	public ModelAndView selectCourse(@RequestParam("username") String username,@RequestParam("courseId") String courseId,@RequestParam("courseName") String courseName) {
		SelectCourses selectcourses=new SelectCourses();
		selectcourses.setUsername(username);
		selectcourses.setCourseId(courseId);
		selectcourses.setCourseName(courseName);
		if(courseServiceIface.insertMyCourses(selectcourses)!=null)
		{
			return new ModelAndView("Viewpage","name","success");
		}
		else
		{
			return new ModelAndView("Viewpage","name","failure");
		}
	}
	@RequestMapping("/Showmycourses")
	public ModelAndView Showmycourses() {
		List<SelectCourses> l=courseServiceIface.showMyCourse();
		String msg=null;
		if(l.isEmpty()) {
			msg="No records found";
			return new ModelAndView("Viewpage","msg",msg);
		}
		return new ModelAndView("ShowFaCourses","list",l);
	
	}
	
	/*
	@RequestMapping("/registerCourses")
	public ModelAndView regCourse(@RequestParam("username") String userName,Courses courses) {
		System.out.println(userName+"Username");
		System.out.println("course"+courses.getCourseId()+"  "+courses.getCourseName());
		Faculty faculty= new Faculty();
		List<Faculty> listOfFaculty =
		faculty.setEmpno(userName);
		
		courses.setFaculty(faculty);
		String msg;
		String id=courseServiceIface.regCourse(courses);
		if(id!=null) {
			msg="Registered";
			return new ModelAndView("Viewpage","msg",msg);
		}
		msg="Invalid";
		return new ModelAndView("Viewpage","msg",msg);
	}
	*/
	
	

}
