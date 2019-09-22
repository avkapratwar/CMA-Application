package com.virtusa.cmadv.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.virtusa.cmadv.entity.Events;
import com.virtusa.cmadv.service.EventsServiceIface;



@Controller
public class AddEventsController {
	
	@Autowired
	EventsServiceIface eventsServiceIface;

	
	@RequestMapping("/insertevents")
	public String taketoInsert(Model m) {
		m.addAttribute("event1",new Events());
		return "Events";
	}
	
	
	@RequestMapping(value="/Add" , method= RequestMethod.POST)

	public String InsertInfo(Events events,Model m,HttpServletRequest request)
	{
		m.addAttribute("name","successfully inserted");
	    // request.getSession().setAttribute("name",events.getEventName());
		if(eventsServiceIface.addEventsService(events)!=null)
		{
	
			return "insertsucess";
		}
		return null;
		
	}
	@RequestMapping("/showAllEvents")
	public ModelAndView Showallevent() {
		List<Events> l=eventsServiceIface.showAllService();
		String msg=null;
		if(l.isEmpty()) {
			msg="No records found";
			return new ModelAndView("insertsucess","msg",msg);
		}
		return new ModelAndView("ShowAllEvents","list",l);
	
	}
////////////////////////////////////////////////////////////////
	
}
