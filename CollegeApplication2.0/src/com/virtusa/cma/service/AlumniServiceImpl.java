package com.virtusa.cma.service;

import java.util.List;

import com.virtusa.cma.dao.AlumniDAOIface;
import com.virtusa.cma.dao.AlumniDAOImpl;
import com.virtusa.cma.entity.Alumni;

public class AlumniServiceImpl implements AlumniServiceIface{
	AlumniDAOIface alumniDAOIface;
	public AlumniServiceImpl() {
		alumniDAOIface = new AlumniDAOImpl();
	}
	@Override
	public List<Alumni> showAllAlumni() {
		
		return alumniDAOIface.showAllAlumni();
	}
	
}
