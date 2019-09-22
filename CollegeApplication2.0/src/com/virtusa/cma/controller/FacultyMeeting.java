package com.virtusa.cma.controller;

import java.io.IOException;
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
 * Servlet implementation class FacultyMeeting
 */
public class FacultyMeeting extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static Logger logger = Logger.getLogger(FacultyMeeting.class);
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FacultyMeeting() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			StaffMeetings p=new StaffMeetings();
		    StaffMeetingsServiceIface psi;
			p.setMeetingType(request.getParameter("meetingtype"));
			psi=new StaffMeetingsServiceIfaceImpl();
			request.setAttribute("ck",psi.showMeeting(p));
			RequestDispatcher rs =   request.getRequestDispatcher("/showstaff.jsp");
			rs.forward(request, response);
					
		
		}
			
	       
		catch (NumberFormatException e) {
			logger.error(e);
			} 
	}
}
