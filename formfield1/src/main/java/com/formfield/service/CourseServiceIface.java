package com.formfield.service;

import java.util.List;

import com.formfield.model.Courses;

public interface CourseServiceIface {
	String addCourseService(Courses courses);
	List<Courses> showAllService();
}
