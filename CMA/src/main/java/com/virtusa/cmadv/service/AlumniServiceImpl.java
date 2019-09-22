package com.virtusa.cmadv.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.virtusa.cmadv.dao.AlumniDAOIface;
import com.virtusa.cmadv.entity.Alumni;
@Service
public class AlumniServiceImpl implements AlumniServiceIface{
	@Autowired
	AlumniDAOIface alumniDAOIface;

	public List<Alumni> showAllAlumni() {
		
				return alumniDAOIface.showAllAlumni();

	}
	
	
	
}
