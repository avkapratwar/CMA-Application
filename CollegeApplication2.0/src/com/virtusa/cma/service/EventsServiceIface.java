package com.virtusa.cma.service;

import java.util.List;

import com.virtusa.cma.entity.Events;

public interface EventsServiceIface {
	String addEventService(Events events);
	List<Events> showAllEventsService();
}
