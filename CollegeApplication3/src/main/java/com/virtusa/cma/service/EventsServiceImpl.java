package com.virtusa.cma.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.virtusa.cma.dao.EventsDaoIface;
import com.virtusa.cma.entity.Events;
import com.virtusa.cma.entity.Faculty;

@Service
public class EventsServiceImpl implements EventsServiceIface{
 
	@Autowired
	EventsDaoIface eventsDaoIface;
	

	public String addEventsService(Events events) {
		
		return eventsDaoIface.addEventsDao(events);
	}


	public List<Events> showAllService() {
		
		return eventsDaoIface.showAllEventsDao();
	}


	public String insertFaculty(Faculty faculty) {
		// TODO Auto-generated method stub
		return eventsDaoIface.addFac(faculty);
	}


	public List<Faculty> showFaculty() {
		// TODO Auto-generated method stub
		return eventsDaoIface.showFac();
	}

	
}
