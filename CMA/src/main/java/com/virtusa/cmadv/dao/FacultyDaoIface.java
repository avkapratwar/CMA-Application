package com.virtusa.cmadv.dao;

import java.util.List;

import com.virtusa.cmadv.entity.Faculty;

public interface FacultyDaoIface {

	String insertFaculty(Faculty faculty);

	List<Faculty> showFaculty(Faculty faculty);

	String updateFaculty(Faculty faculty);

	Faculty showDetail(String empno);

}
