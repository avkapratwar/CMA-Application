package com.formfield.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.formfield.model.Courses;
import com.formfield.service.CourseServiceIface;

@Controller
public class CoursesController {
	@Autowired
	CourseServiceIface courseServiceIface;
	
	@RequestMapping("/courses")
	public String display() {
		return "coursesmenu";
	}
	
	@RequestMapping("/addcourse")
	public String courseAdd() {
		return "addcourse";
	}
	
	@RequestMapping("/courseadd")
	public ModelAndView addCourse(@ModelAttribute("course") Courses courses) {
		System.out.println(courses.getStartDate());
		String result=courseServiceIface.addCourseService(courses);
		if(result.equals(courses.getCourseId())) {
			return new ModelAndView("coursesmenupage","msg","added Sucessfully");
		} else {
			return new ModelAndView("coursesmenuerrpage","msg","unable to add");
		}
	}
	@RequestMapping("/updatecourse")
	public ModelAndView update() {
		List<Courses> list = courseServiceIface.showAllService();
		return new ModelAndView("showcourses","list",list);
	}
}
