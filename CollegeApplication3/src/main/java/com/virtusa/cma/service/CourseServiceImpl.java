package com.virtusa.cma.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.virtusa.cma.dao.CourseDaoIface;
import com.virtusa.cma.dao.CourseDaoImpl;
import com.virtusa.cma.entity.Courses;
import com.virtusa.cma.entity.SelectCourses;

@Service
public class CourseServiceImpl implements CourseServiceIface {

	@Autowired
	CourseDaoIface courseDaoIface;
	public String insertCourse(Courses courses) {
		// TODO Auto-generated method stub
		return courseDaoIface.insertCourse(courses);
	}
	public List<Courses> showCourse() {
		// TODO Auto-generated method stub
		return courseDaoIface.showCourse();
	}
	public String updateCourse(Courses courses) {
		// TODO Auto-generated method stub
		return courseDaoIface.updateCourse(courses);
	}
	public String deleteCourse(Courses courses) {
		// TODO Auto-generated method stub
		return courseDaoIface.deleteCourse(courses);
	}
	// TODO Auto-generated method stub
	public String regCourse(Courses courses) {
		
		return courseDaoIface.regCourse(courses);
	}
	@Override
	public Courses showDetail(String courseId) {
		// TODO Auto-generated method stub
		return courseDaoIface.showDetail(courseId);
	}
	@Override
	public String insertMyCourses(SelectCourses selectcourses) {
		// TODO Auto-generated method stub
		return courseDaoIface.insertMyCourses(selectcourses);
	}
	@Override
	public List<SelectCourses> showMyCourse() {
		// TODO Auto-generated method stub
		return courseDaoIface.showMyCourse();
	}
	

}
