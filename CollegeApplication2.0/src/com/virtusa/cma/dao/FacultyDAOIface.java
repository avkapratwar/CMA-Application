package com.virtusa.cma.dao;




import com.virtusa.cma.entity.Faculty;

public interface FacultyDAOIface {

	String insertFaculty(Faculty faculty);
	Faculty showFaculty(Faculty faculty);
	String updateFaculty(Faculty faculty);
}
