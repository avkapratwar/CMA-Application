package com.virtusa.cma.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.virtusa.cma.service.ApplicationServiceImpl;
import com.virtusa.cma.service.ApplicationServiceInterFace;

/**
 * Servlet implementation class UpdateAppStatusController
 */
public class UpdateAppStatusController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateAppStatusController() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ApplicationServiceInterFace applicationServiceInterFace=new ApplicationServiceImpl();
		int appNo=Integer.parseInt(request.getParameter("appNo"));
		String st=applicationServiceInterFace.updateApplicantStatusService(appNo,request.getParameter("status"));
		
		request.setAttribute("st",st);
		RequestDispatcher rs = request.getRequestDispatcher("UpdateAppStatus.jsp");
		rs.forward(request, response);
	}

	

}
