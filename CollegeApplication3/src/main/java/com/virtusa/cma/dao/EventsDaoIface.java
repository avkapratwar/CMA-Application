package com.virtusa.cma.dao;

import java.util.List;

import com.virtusa.cma.entity.Events;
import com.virtusa.cma.entity.Faculty;

public interface EventsDaoIface {

	String addEventsDao(Events events);
	List<Events> showAllEventsDao();
	String addFac(Faculty faculty);
	List<Faculty> showFac();
}
