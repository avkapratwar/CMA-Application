package com.virtusa.cmadv.service;

import java.util.List;

import com.virtusa.cmadv.entity.Events;
import com.virtusa.cmadv.entity.Faculty;



public interface EventsServiceIface {

	String addEventsService(Events events);
	List<Events> showAllService();
	String insertFaculty(Faculty faculty);
	List<Faculty> showFaculty();
}
