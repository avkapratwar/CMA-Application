package com.virtusa.cma.controller;

import java.io.IOException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.virtusa.cma.entity.Student;
import com.virtusa.cma.service.StudentServiceIface;
import com.virtusa.cma.service.StudentServiceImpl;

/**
 * Servlet implementation class StudentInfoServlet
 */
public class StudentInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public StudentInfoServlet() {
		super();

	}

	static Logger logger = Logger.getLogger(StudentInfoServlet.class);

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String msg=null;
		String studentId=request.getParameter("studentid");
		try {
			if (studentId != null) {
			
				Date date = new SimpleDateFormat("MM/dd/yyyy").parse(request.getParameter("dateofbirth"));
				java.sql.Date dt = new java.sql.Date(date.getTime());
				Student s = new Student();
				s.setStudentid(studentId);
				s.setFirstname(request.getParameter("firstname"));
				s.setLastname(request.getParameter("lastname"));
				s.setDob(dt);
				s.setGender(request.getParameter("gender"));
				s.setEmail(request.getParameter("email"));
				s.setMobileNumber(request.getParameter("mobileno"));
				s.setParentsMobileNumber(request.getParameter("parentsmobileno"));
				s.setAddress(request.getParameter("address"));
				s.setCity(request.getParameter("city"));
				s.setState(request.getParameter("state"));
				s.setDepartment(request.getParameter("department"));
                
				StudentServiceIface studentServiceIface=new StudentServiceImpl();
				String s1 = studentServiceIface.insertStudent(s);
				if(s1!=null) {
					msg="Inserted";
					RequestDispatcher rs = request.getRequestDispatcher("StudentInfoSuccess.jsp?msg="+msg);
					rs.forward(request, response);
				}
			}
		} catch (NumberFormatException | ParseException e) {
			logger.error(e);

		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			doGet(request, response);
		} catch (Exception e) {
			logger.error(e);
		}
	}

}