package com.virtusa.cmadv.dao;

import java.util.List;

import com.virtusa.cmadv.entity.Events;
import com.virtusa.cmadv.entity.Faculty;



public interface EventsDaoIface {

	String addEventsDao(Events events);
	List<Events> showAllEventsDao();
	String addFac(Faculty faculty);
	List<Faculty> showFac();
}
