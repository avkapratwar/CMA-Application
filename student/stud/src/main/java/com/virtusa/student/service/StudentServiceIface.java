package com.virtusa.student.service;

import java.util.List;

import com.virtusa.student.models.Student;


public interface StudentServiceIface {

		String insertStudent(Student student);
		List<Student> showStudent(Student student);
		String updateStudent(Student student);
		Student showDetail(String studentid);
		
	}


