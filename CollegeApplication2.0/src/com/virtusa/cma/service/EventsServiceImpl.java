package com.virtusa.cma.service;

import java.util.List;

import com.virtusa.cma.dao.EventsDaoImpl;
import com.virtusa.cma.entity.Events;

public class EventsServiceImpl implements EventsServiceIface{
	EventsDaoImpl eventsDaoImpl;
	public EventsServiceImpl() {
		eventsDaoImpl=new EventsDaoImpl();
	}

	@Override
	public String addEventService(Events events) {
		return eventsDaoImpl.addEvents(events);
	}

	@Override
	public List<Events> showAllEventsService() {
		return eventsDaoImpl.showAllEvents();
	}
}
