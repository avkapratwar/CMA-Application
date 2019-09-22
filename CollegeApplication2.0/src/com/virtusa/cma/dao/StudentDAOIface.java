package com.virtusa.cma.dao;

import com.virtusa.cma.entity.Student;

public interface StudentDAOIface {
	
String insertStudent(Student student);
Student showStudent(Student student);
String updateStudent(Student student);

}
