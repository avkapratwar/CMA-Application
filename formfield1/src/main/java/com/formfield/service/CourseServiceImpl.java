package com.formfield.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formfield.dao.CoursesDaoIface;
import com.formfield.model.Courses;

@Service
public class CourseServiceImpl implements CourseServiceIface {
	@Autowired
	CoursesDaoIface coursesDaoIface;
	
	public String addCourseService(Courses courses) {
		return coursesDaoIface.addCourse(courses);
	}

	public List<Courses> showAllService() {
		return coursesDaoIface.showAll();
	}
	
}
