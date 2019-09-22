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

import com.virtusa.cma.entity.Faculty;
import com.virtusa.cma.service.FacultyServiceIface;
import com.virtusa.cma.service.FacultyServiceImpl;

/**
 * Servlet implementation class FacultyInfoServlet
 */
public class FacultyInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FacultyInfoServlet() {
		super();

	}

	static Logger logger = Logger.getLogger(FacultyInfoServlet.class);

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			if (request.getParameter("empno") != null) {

				Date date = new SimpleDateFormat("MM/dd/yyyy").parse(request.getParameter("dob"));
				java.sql.Date dt = new java.sql.Date(date.getTime());
				String qual = request.getParameter("qualification");
				String ex = request.getParameter("ee");

				Faculty f1 = new Faculty();
				f1.setEmpno(request.getParameter("empno"));
				f1.setFirstname(request.getParameter("firstname"));
				f1.setLastname(request.getParameter("lastname"));
				f1.setDob(dt);
				f1.setEmail(request.getParameter("email"));
				f1.setPhoneNumber(request.getParameter("PhoneNumber"));
				f1.setQq(qual);
				f1.setEe(ex);
				f1.setDepartment(request.getParameter("department"));
				f1.setGender(request.getParameter("gender"));
				f1.setCity(request.getParameter("city"));
				f1.setState(request.getParameter("state"));

				FacultyServiceIface facultyServiceIface = new FacultyServiceImpl();
				String f = facultyServiceIface.insertFaculty(f1);
				if (f != null) {

					RequestDispatcher rs = request.getRequestDispatcher("ShowFaculty.jsp");
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