package com.virtusa.cma.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import com.virtusa.cma.entity.Applicants;
import com.virtusa.cma.service.ApplicationServiceImpl;

/**
 * Servlet implementation class ApplicationStatusServlet
 */
public class ApplicationStatusServlett extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	static Logger logger = Logger.getLogger(ApplicationStatusServlett.class);
    public ApplicationStatusServlett() {
        super();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
		Applicants applicants=new Applicants();
		applicants.setApplicationNumber(Integer.parseInt(request.getParameter("ApplicationNumber")));
		ApplicationServiceImpl applicationServiceImpl = new ApplicationServiceImpl();
		String status=applicationServiceImpl.checkApplicationStatusService(applicants);
		request.setAttribute("status", status);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("ApplicationStatus.jsp");
		requestDispatcher.forward(request, response);
		} catch (NumberFormatException | ServletException e) {
			logger.info(e);
		}
	}

}
