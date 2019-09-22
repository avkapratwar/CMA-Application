package com.formfield.dao;

import java.util.List;

import com.formfield.model.Courses;

public interface CoursesDaoIface {
	String addCourse(Courses courses);
	List<Courses> showAll();
}
