package com.virtusa.cma.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.virtusa.cma.entity.RegisterCourses;
import com.virtusa.cma.service.RegisterCoursesIface;
import com.virtusa.cma.service.RegisterCoursesImpl;

/**
 * Servlet implementation class AddRegisterCourses
 */
public class AddRegisterCourses extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddRegisterCourses() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String courseId=request.getParameter("courseid");
	String userName=request.getParameter("UserName");
	String courseName=request.getParameter("courseName");
	RegisterCourses registerCourses=new RegisterCourses();
	registerCourses.setCourseId(courseId);
	registerCourses.setCourseName(courseName);
	
		RegisterCoursesIface registercoursesiface=new RegisterCoursesImpl();
		int result=registercoursesiface.enrollService(registerCourses,userName);
		if(result>0)
			{
			
			RequestDispatcher rs = request.getRequestDispatcher("Course1.jsp");
			
		rs.forward(request, response);
			}
	}
}
