package com.virtusa.cma.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.virtusa.cma.entity.Courses;
import com.virtusa.cma.service.CourseServiceIface;
import com.virtusa.cma.service.CourseServiceImpl;

/**
 * Servlet implementation class ShowAllCoursesServlet
 */
public class ShowAllCoursesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowAllCoursesServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		CourseServiceIface courseserviceiface=new CourseServiceImpl();
		 Courses[] courses=courseserviceiface.showAllService();
		 request.setAttribute("courses",courses);
			RequestDispatcher rs = request.getRequestDispatcher("CourseShow.jsp");
			rs.forward(request, response);
	
	}

}