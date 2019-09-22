package com.virtusa.cma.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.virtusa.cma.entity.Alumni;
import com.virtusa.cma.service.AlumniServiceIface;
import com.virtusa.cma.service.AlumniServiceImpl;

/**
 * Servlet implementation class ShowAllAlumniController
 */
public class ShowAllAlumniController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowAllAlumniController() {
        super();
       
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		AlumniServiceIface alumniServiceIface= new AlumniServiceImpl();
		List<Alumni> alumni=alumniServiceIface.showAllAlumni();
		request.setAttribute("alumni",alumni);
		RequestDispatcher rs = request.getRequestDispatcher("ShowAllAlumni.jsp");
		rs.forward(request, response);

	}

	

}
