package com.virtusa.cma.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.virtusa.cma.entity.RegisterCourses;
import com.virtusa.cma.service.RegisterCoursesImpl;

/**
 * Servlet implementation class RegisterCoursesServlet
 */
public class RegisterCoursesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterCoursesServlet() {
        super();
       
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String courseId=request.getParameter("cid");
		String courseName=request.getParameter("cname");
		String userName=request.getParameter("username");
		RegisterCourses r=new RegisterCourses();
		r.setCourseId(courseId);
		r.setCourseName(courseName);
		
		RegisterCoursesImpl registerCoursesImpl=new RegisterCoursesImpl();
		int result=registerCoursesImpl.enrollService(r,userName);
		
		if(result>0) {
			RequestDispatcher rs = request.getRequestDispatcher("ViewCoursesStud.jsp");
			rs.forward(request, response);
			
			
		}
		doGet(request, response);
	}

}
