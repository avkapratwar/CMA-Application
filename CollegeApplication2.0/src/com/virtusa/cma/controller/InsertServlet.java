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

import com.virtusa.cma.entity.StaffMeetings;
import com.virtusa.cma.service.StaffMeetingsServiceIface;
import com.virtusa.cma.service.StaffMeetingsServiceIfaceImpl;

/**
 * Servlet implementation class InsertServlet
 */
public class InsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static Logger logger = Logger.getLogger(InsertServlet.class);
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		try {
 			StaffMeetings s=new StaffMeetings();
 			StaffMeetingsServiceIface psi;
 		    Date date = new SimpleDateFormat("MM/dd/yyyy").parse(request.getParameter("meetingdate"));
			java.sql.Date dt=new java.sql.Date(date.getTime());
			s.setMeetingType(request.getParameter("meetingtype"));
			s.setMeetingDate(dt);
			psi=new StaffMeetingsServiceIfaceImpl();
			psi.insertMeeting(s);
			response.getWriter().println(s);
			RequestDispatcher rs =   request.getRequestDispatcher("responseMeet.jsp");
			rs.forward(request, response);
		
			}
		catch(NumberFormatException | ParseException e) {
			logger.error(e);
			} 
	}

}
