package com.virtusa.cmadv.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.virtusa.cmadv.entity.Courses;
import com.virtusa.cmadv.entity.SelectCourses;





public interface CourseServiceIface {

	String insertCourse(Courses courses);
	List<Courses>showCourse();
	String updateCourse(Courses courses);
	String deleteCourse(Courses courses);
	String regCourse(Courses courses);
	Courses showDetail(String courseId);
	String insertMyCourses(SelectCourses selectcourses);
	List<SelectCourses> showMyCourse();
}
