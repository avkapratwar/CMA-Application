package com.virtusa.cma.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.virtusa.cma.entity.Faculty;
import com.virtusa.cma.service.FacultyServiceIface;
import com.virtusa.cma.service.FacultyServiceImpl;

/**
 * Servlet implementation class ShowFacultyServlet
 */
public class ShowFacultyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowFacultyServlet() {
        super();
       
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		FacultyServiceIface facultyServiceIface= new FacultyServiceImpl();
		Faculty faculty= new Faculty();
		faculty.setEmpno(request.getParameter("username"));
		faculty=facultyServiceIface.showFaculty(faculty);
		request.setAttribute("faculty",faculty);
		RequestDispatcher rs = request.getRequestDispatcher("ShowFaculty.jsp");
		rs.forward(request, response);
	
	}


}
