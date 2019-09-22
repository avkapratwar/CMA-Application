package com.virtusa.cma.dao;



import com.virtusa.cma.entity.Courses;


public interface CourseDaoIface {
	
	int addCourse(Courses c);
	
	 
	 int updateCourse(Courses c);
	 
	 
	 int deleteCourse(String courseId);
	 
	 
	 Courses showCourse(String courseId);
	 
	 
	 Courses[] showAllCourses();
	 

	 
	 
	
}
