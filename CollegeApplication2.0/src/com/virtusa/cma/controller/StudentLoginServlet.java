package com.virtusa.cma.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.virtusa.cma.entity.Logins;
import com.virtusa.cma.service.LoginServiceImpl;

/**
 * Servlet implementation class StudentLoginServlet
 */
public class StudentLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentLoginServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Logins logins = new Logins();
		RequestDispatcher requestDispatcher;
		logins.setUserId(request.getParameter("UserName"));
		logins.setUserPassword(request.getParameter("password"));
		logins.setUserType(request.getParameter("UserType"));
		LoginServiceImpl loginServiceImpl = new LoginServiceImpl();
		int result = loginServiceImpl.loginValidateService(logins);
		if(result==0) {
			if (logins.getUserType().equals("Student")) {
				requestDispatcher = request.getRequestDispatcher("/Student.jsp");
				requestDispatcher.forward(request, response);
			}
			if (logins.getUserType().equals("Faculty")) {
				requestDispatcher =  request.getRequestDispatcher("/Faculty.jsp");
				requestDispatcher.forward(request, response);
			}
			if (logins.getUserType().equals("Alumni")) {
				requestDispatcher = request.getRequestDispatcher("/Alumni.html");
				requestDispatcher.forward(request, response);
			}
			if (logins.getUserType().equals("Admin")) {
				requestDispatcher = request.getRequestDispatcher("/Admin.html");
				requestDispatcher.forward(request, response);
			}
		} else {
			requestDispatcher=request.getRequestDispatcher("/MainLogin.html");
			requestDispatcher.forward(request, response);
		}
	}

}
