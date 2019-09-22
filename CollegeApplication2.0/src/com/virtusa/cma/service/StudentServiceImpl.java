package com.virtusa.cma.service;

import com.virtusa.cma.dao.StudentDAOIface;
import com.virtusa.cma.dao.StudentDAOImpl;
import com.virtusa.cma.entity.Student;

public class StudentServiceImpl implements StudentServiceIface {

	StudentDAOIface studentDAOIface;
	public StudentServiceImpl() {
		studentDAOIface= new StudentDAOImpl();
	}

	@Override
	public String insertStudent(Student student) {
	
		return studentDAOIface.insertStudent(student);
	}

	@Override
	public Student showStudent(Student student) {
		
		return studentDAOIface.showStudent(student);
	}

	@Override
	public String updateStudent(Student student) {
		
		return studentDAOIface.updateStudent(student);
	}
	
}
