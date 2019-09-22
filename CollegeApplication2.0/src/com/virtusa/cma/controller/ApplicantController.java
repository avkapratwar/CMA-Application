package com.virtusa.cma.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.virtusa.cma.entity.Applicants;
import com.virtusa.cma.service.ApplicationServiceImpl;

/**
 * Servlet implementation class ApplicantController
 */
public class ApplicantController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static Logger logger = Logger.getLogger(ApplicantController.class);
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ApplicantController() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Applicants applicants=new Applicants();
		PrintWriter out=null;
		Date date;
		try {
		out = response.getWriter();
		date = new SimpleDateFormat("MM/dd/yyyy").parse(request.getParameter("dob"));
		java.sql.Date dt=new java.sql.Date(date.getTime());
		applicants.setFirstName(request.getParameter("firstName"));
		applicants.setLastName(request.getParameter("lastName"));
		applicants.setContactNumber(request.getParameter("contact"));
		applicants.setGender(request.getParameter("gender"));
		applicants.setDateOfBirth(dt);
		applicants.setFatherName(request.getParameter("FatherName"));
		applicants.setEmail(request.getParameter("email"));
		applicants.setxPercent(Integer.parseInt(request.getParameter("xprecentage")));
		applicants.setXiiPercent(Integer.parseInt(request.getParameter("xiiprecentage")));
		applicants.setUgPercent(Integer.parseInt(request.getParameter("ugprecentage")));
		applicants.setState(request.getParameter("state"));
		applicants.setCountry(request.getParameter("country"));
		ApplicationServiceImpl applicationServiceImpl = new ApplicationServiceImpl();
		int result = applicationServiceImpl.addApplicantService(applicants);
		if(result>0) {
			out.println("Sucessfully Submitted");
			out.println("Your Application Number is: "+result);
		}
		} catch (ParseException | NumberFormatException e) {
			logger.info(e);
		}
		
	}

	

}
