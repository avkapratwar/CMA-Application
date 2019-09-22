package com.virtusa.cma.service;

import com.virtusa.cma.entity.Faculty;

public interface FacultyServiceIface {

	String insertFaculty(Faculty faculty);
	Faculty showFaculty(Faculty faculty);
	String updateFaculty(Faculty faculty);
}
