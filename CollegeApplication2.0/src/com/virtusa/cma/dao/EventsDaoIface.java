package com.virtusa.cma.dao;

import java.util.List;

import com.virtusa.cma.entity.Events;

public interface EventsDaoIface {
	String addEvents(Events events);
	List<Events> showAllEvents();
}
