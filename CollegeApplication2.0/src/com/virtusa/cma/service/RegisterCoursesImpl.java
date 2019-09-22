package com.virtusa.cma.service;



import com.virtusa.cma.dao.RegisterCoursesDaoIface;
import com.virtusa.cma.dao.RegisterCoursesDaoImpl;
import com.virtusa.cma.entity.RegisterCourses;

public class RegisterCoursesImpl implements RegisterCoursesIface {

	RegisterCoursesDaoIface registerCoursesDaoIface;
	 public RegisterCoursesImpl() {
		registerCoursesDaoIface=new RegisterCoursesDaoImpl();
	}
	@Override
	public int enrollService(RegisterCourses c,String userName) {
		
		return registerCoursesDaoIface.enrollCourses(c,userName);
	}
	

}
