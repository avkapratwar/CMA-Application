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
 * Servlet implementation class ShowCoursesServlet
 */
public class ShowCoursesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowCoursesServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    String courseId=request.getParameter("cid");
	    String type=request.getParameter("type");
	    
		CourseServiceIface courseserviceiface=new CourseServiceImpl();
		Courses courses=courseserviceiface.showService(courseId);
		if(type.equals("update")) {
			request.setAttribute("courses", courses);
			RequestDispatcher rs= request.getRequestDispatcher("CourseUpdate.jsp");
			rs.forward(request, response);
		}
		else {
		request.setAttribute("courses", courses);
		RequestDispatcher rs= request.getRequestDispatcher("ShowAllCourses.jsp");
		rs.forward(request, response);
		}
	
	}

}