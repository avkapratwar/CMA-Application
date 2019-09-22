package com.virtusa.cma.dao;

import java.util.List;

import com.virtusa.cma.entity.Faculty;



public interface FacultyDaoIface {

	String insertFaculty(Faculty faculty);
	List<Faculty> showFaculty(Faculty faculty);
	String updateFaculty(Faculty faculty);

}
