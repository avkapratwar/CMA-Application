package com.virtusa.cma.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.virtusa.cma.service.CourseServiceImpl;

/**
 * Servlet implementation class DeleteCourseServle
 */
public class DeleteCourseServle extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteCourseServle() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	String courseId=request.getParameter("cid");
		
		CourseServiceImpl courseServiceImpl= new CourseServiceImpl();
		int result=courseServiceImpl.deleteService(courseId);
		if(result>0) {
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("ShowAllCoursesServlet");
		requestDispatcher.forward(request, response);
		}
	}

}