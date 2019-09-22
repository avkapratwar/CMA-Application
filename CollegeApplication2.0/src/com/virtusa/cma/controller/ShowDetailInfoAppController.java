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
 * Servlet implementation class ShowDetailInfoAppController
 */
public class ShowDetailInfoAppController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowDetailInfoAppController() {
        super();
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ApplicationServiceInterFace applicationServiceInterFace= new ApplicationServiceImpl();
		int appno=Integer.parseInt(request.getParameter("applicationNumber"));
	
		request.setAttribute("applicants",applicationServiceInterFace.showDetailInfoService(appno));
		RequestDispatcher rs = request.getRequestDispatcher("ShowDetailInfo.jsp");
		rs.forward(request, response);
	}

	
}
