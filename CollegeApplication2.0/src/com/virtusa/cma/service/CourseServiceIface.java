package com.virtusa.cma.service;



import com.virtusa.cma.entity.Courses;

public interface CourseServiceIface {
	int addService(Courses c);
	int updateService(Courses c);
	int deleteService(String courseId);
	Courses showService(String courseId);
	Courses[] showAllService();
	

}
