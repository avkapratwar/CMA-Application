package com.virtusa.cma.controller;


import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.virtusa.cma.entity.Events;
import com.virtusa.cma.service.EventsServiceImpl;

/**
 * Servlet implementation class EventServlet
 */
public class EventServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static Logger logger = Logger.getLogger(EventServlet.class);
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EventServlet() {
        super();
    }
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	Date date;
		Events events = new Events();
		try {
			
			date = new SimpleDateFormat("MM/dd/yyyy").parse(request.getParameter("edate"));
			java.sql.Date dt=new java.sql.Date(date.getTime());
			events.setEventDate(dt);
			events.setEventId(request.getParameter("eid"));
			events.setEventName(request.getParameter("ename"));
			events.setVenue(request.getParameter("venue"));
			EventsServiceImpl eventsServiceImpl = new EventsServiceImpl();
			String result=eventsServiceImpl.addEventService(events);
			request.setAttribute("message", result);
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("Events.jsp");
			requestDispatcher.forward(request, response);
		} catch (ParseException | ServletException e) {
			logger.info(e);
		}
	}

}
