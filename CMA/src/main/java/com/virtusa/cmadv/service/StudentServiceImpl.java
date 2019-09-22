package com.virtusa.cmadv.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.virtusa.cmadv.dao.StudentDaoIface;
import com.virtusa.cmadv.entity.Student;



@Service
public class StudentServiceImpl implements StudentServiceIface{

	@Autowired
	StudentDaoIface studentDaoIface;

	public String insertStudent(Student student) {
		// TODO Auto-generated method stub
		return studentDaoIface.insertStudent(student);
	}

	public List<Student> showStudent(Student student) {
		// TODO Auto-generated method stub
		return studentDaoIface.showStudent(student);
	}

	public String updateStudent(Student student) {
		// TODO Auto-generated method stub
		return studentDaoIface.updateStudent(student);
	}

	public Student showDetail(String studentid) {
		// TODO Auto-generated method stub
		return studentDaoIface.showDetail(studentid);
	}
	
	

	
}
