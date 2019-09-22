package com.virtusa.cmadv.service;

import java.util.List;

import com.virtusa.cmadv.entity.Faculty;

public interface FacultyServiceIface {
	String insertFaculty(Faculty faculty);
	List<Faculty> showFaculty(Faculty faculty);
	Faculty showDetailService(String empno);
	String updateFaculty(Faculty faculty);
}
