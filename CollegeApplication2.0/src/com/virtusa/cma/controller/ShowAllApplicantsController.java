package com.virtusa.cma.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.virtusa.cma.entity.Applicants;
import com.virtusa.cma.service.ApplicationServiceImpl;
import com.virtusa.cma.service.ApplicationServiceInterFace;

/**
 * Servlet implementation class ShowAllApplicants
 */
public class ShowAllApplicantsController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowAllApplicantsController() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ApplicationServiceInterFace applicationServiceInterFace= new ApplicationServiceImpl();
		Applicants[] applicants=applicationServiceInterFace.showAllApplicantsService();
		request.setAttribute("applicants",applicants);
		RequestDispatcher rs = request.getRequestDispatcher("ShowAllApplicants.jsp");
		rs.forward(request, response);
	}

	

}
