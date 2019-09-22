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
 * Servlet implementation class AddUserServlet
 */
public class AddUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddUserServlet() {
        super();
       
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName;
		String userType;
		String msg=null;
		userName=request.getParameter("userName");
		userType=request.getParameter("type");
		
		Users users= new Users();
		users.setUserName(userName);
		users.setType(userType);
		
		UserServiceIface userServiceIface = new UserServiceImpl();
		String st=userServiceIface.addUser(users);
		
		if(st!=null) {
			msg="Inserted";
			RequestDispatcher rs = request.getRequestDispatcher("AddUser.jsp?msg="+msg);
			rs.forward(request, response);
		}
		
	}

}
