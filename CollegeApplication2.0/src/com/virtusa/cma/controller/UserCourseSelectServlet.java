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
 * Servlet implementation class UserCourseSelectServlet
 */
public class UserCourseSelectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserCourseSelectServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String courseId=request.getParameter("courseid");
		
		CourseServiceIface courseserviceiface=new CourseServiceImpl();
		 Courses course=courseserviceiface.showService(courseId);
		 
		request.setAttribute("courseid",courseId);
		request.setAttribute("UserName",request.getParameter("UserName"));
		request.setAttribute("courses",course);
		RequestDispatcher rs = request.getRequestDispatcher("Course1.jsp");
		rs.forward(request, response);
	}

	

}
