package com.virtusa.cma.dao;
import java.util.List;

import com.virtusa.cma.entity.Courses;
import com.virtusa.cma.entity.SelectCourses;



public interface CourseDaoIface {

	String insertCourse(Courses courses);
	List<Courses>showCourse();
	String updateCourse(Courses courses);
	String deleteCourse(Courses courses);
	String regCourse(Courses courses);
	Courses showDetail(String courseId);
	String insertMyCourses(SelectCourses selectcourses);
	List<SelectCourses> showMyCourse();
	
	
}
