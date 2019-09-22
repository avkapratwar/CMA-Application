package com.virtusa.cmadv.service;

import java.util.List;

import com.virtusa.cmadv.entity.Student;



public interface StudentServiceIface {

		String insertStudent(Student student);
		List<Student> showStudent(Student student);
		String updateStudent(Student student);
		Student showDetail(String studentid);
		
	}


