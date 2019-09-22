package com.virtusa.cma.service;

import com.virtusa.cma.dao.FacultyDAOIface;
import com.virtusa.cma.dao.FacultyDAOImpl;
import com.virtusa.cma.entity.Faculty;

public class FacultyServiceImpl implements FacultyServiceIface {

	FacultyDAOIface facultyDAOIface;
	public FacultyServiceImpl() {

		facultyDAOIface=new FacultyDAOImpl();
	}
	@Override
	public String insertFaculty(Faculty faculty) {

		return facultyDAOIface.insertFaculty(faculty);
	}

	@Override
	public Faculty showFaculty(Faculty faculty) {

		return facultyDAOIface.showFaculty(faculty);
	}

	@Override
	public String updateFaculty(Faculty faculty) {
		return facultyDAOIface.updateFaculty(faculty);
	}

	
}
