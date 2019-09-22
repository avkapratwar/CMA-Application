package com.virtusa.cma.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.virtusa.cma.entity.Users;
import com.virtusa.cma.service.UserServiceIface;
import com.virtusa.cma.service.UserServiceImpl;

/**
 * Servlet implementation class DeleteUsersController
 */
public class DeleteUsersController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteUsersController() {
        super();
       
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userName;
		String userType;
		String userStatus;
		userName=request.getParameter("userName");
		userType=request.getParameter("userType");
		userStatus=request.getParameter("userStatus");
		
		Users users= new Users();
		users.setUserName(userName);
		users.setStatus(userStatus);
		users.setType(userType);
		
		UserServiceIface userServiceIface = new UserServiceImpl();
		userServiceIface.deleteUser(users);
		
		RequestDispatcher rs = request.getRequestDispatcher("ShowAllUsersController");
		rs.include(request, response);
		
	}

}
