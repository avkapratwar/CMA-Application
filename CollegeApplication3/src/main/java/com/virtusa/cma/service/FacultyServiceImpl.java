package com.virtusa.cma.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.virtusa.cma.dao.FacultyDaoIface;
import com.virtusa.cma.entity.Faculty;





@Service
public class FacultyServiceImpl implements FacultyServiceIface{

	@Autowired
	FacultyDaoIface facultyDaoIface;
	public String insertFaculty(Faculty faculty) {
		// TODO Auto-generated method stub
		return facultyDaoIface.insertFaculty(faculty);
	}

	public List<Faculty>showFaculty(Faculty faculty) {
		// TODO Auto-generated method stub
		return facultyDaoIface.showFaculty(faculty);
	}

	public String updateFaculty(Faculty faculty) {
		// TODO Auto-generated method stub
		return facultyDaoIface.updateFaculty(faculty);
	}

	
}
