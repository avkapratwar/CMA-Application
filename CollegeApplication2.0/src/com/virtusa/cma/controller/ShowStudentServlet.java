package com.virtusa.cma.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.virtusa.cma.entity.Student;
import com.virtusa.cma.service.StudentServiceIface;
import com.virtusa.cma.service.StudentServiceImpl;

/**
 * Servlet implementation class ShowStudentServlet
 */
public class ShowStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowStudentServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StudentServiceIface studentServiceIface=new StudentServiceImpl();
		
		Student student=new Student();
		student.setStudentid(request.getParameter("username"));
		student=studentServiceIface.showStudent(student);
		request.setAttribute("student", student);
		
		RequestDispatcher rs= request.getRequestDispatcher("ShowStudent.jsp");
		rs.forward(request, response);
	
	
	
	}

}
