package com.virtusa.cma.service;

import java.util.List;

import com.virtusa.cma.entity.Events;
import com.virtusa.cma.entity.Faculty;

public interface EventsServiceIface {

	String addEventsService(Events events);
	List<Events> showAllService();
	String insertFaculty(Faculty faculty);
	List<Faculty> showFaculty();
}
