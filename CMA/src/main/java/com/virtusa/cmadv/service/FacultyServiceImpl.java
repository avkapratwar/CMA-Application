package com.virtusa.cmadv.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.virtusa.cmadv.dao.FacultyDaoIface;
import com.virtusa.cmadv.entity.Faculty;

@Service
public class FacultyServiceImpl implements FacultyServiceIface {

	@Autowired
	FacultyDaoIface facultyDaoIface;

	public String insertFaculty(Faculty faculty) {

		return facultyDaoIface.insertFaculty(faculty);
	}

	public List<Faculty> showFaculty(Faculty faculty) {

		return facultyDaoIface.showFaculty(faculty);
	}

	public String updateFaculty(Faculty faculty) {

		return facultyDaoIface.updateFaculty(faculty);
	}

	public Faculty showDetailService(String empno) {

		return facultyDaoIface.showDetail(empno);
	}

}
