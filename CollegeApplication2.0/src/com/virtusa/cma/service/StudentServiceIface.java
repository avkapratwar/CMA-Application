package com.virtusa.cma.service;

import com.virtusa.cma.entity.Student;

public interface StudentServiceIface {

	String insertStudent(Student student);
	Student showStudent(Student student);
	String updateStudent(Student student);
}
