package com.virtusa.cma.service;



import com.virtusa.cma.dao.CourseDaoIface;
import com.virtusa.cma.dao.CourseDaoImpl;
import com.virtusa.cma.entity.Courses;

public class CourseServiceImpl implements CourseServiceIface {
	CourseDaoIface coursedaoiface;
	public CourseServiceImpl() {
		coursedaoiface=new CourseDaoImpl();
	}

	@Override
	public int addService(Courses c) {
		
		return coursedaoiface.addCourse(c);
	}

	 @Override 
	 public int updateService(Courses c) { 
		
	 return coursedaoiface.updateCourse(c); }

	@Override
	public int deleteService(String courseId) {
	
		return coursedaoiface.deleteCourse(courseId);
	}

	@Override
	public Courses showService(String courseId) {
	
		return coursedaoiface.showCourse(courseId);
	}

	@Override
	public Courses[] showAllService() {
		
		return coursedaoiface.showAllCourses();
	}

	
	 
}
