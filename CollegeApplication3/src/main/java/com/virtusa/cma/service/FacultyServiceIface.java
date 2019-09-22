package com.virtusa.cma.service;

import java.util.List;

import com.virtusa.cma.entity.Faculty;;

public interface FacultyServiceIface {
	String insertFaculty(Faculty faculty);
	List<Faculty> showFaculty(Faculty faculty);
	String updateFaculty(Faculty faculty);
}
