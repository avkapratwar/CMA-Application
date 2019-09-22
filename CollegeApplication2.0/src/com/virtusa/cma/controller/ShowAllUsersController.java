package com.virtusa.cma.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.virtusa.cma.entity.Users;
import com.virtusa.cma.service.UserServiceIface;
import com.virtusa.cma.service.UserServiceImpl;

/**
 * Servlet implementation class ShowAllUsersController
 */
public class ShowAllUsersController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowAllUsersController() {
        super();
      
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 UserServiceIface userServiceIface= new UserServiceImpl();
		 List<Users> users=userServiceIface.showAllUsers();
		 request.setAttribute("users",users);
			RequestDispatcher rs = request.getRequestDispatcher("ShowAllUsers.jsp");
			rs.forward(request, response);
	}

}
