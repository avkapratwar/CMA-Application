package com.virtusa.cma.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.virtusa.cma.entity.Users;
import com.virtusa.cma.service.LoginServiceImpl;

/**
 * Servlet implementation class SearchServlet
 */
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static Logger logger = Logger.getLogger(SearchServlet.class);
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchServlet() {
        super();
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Users users = new Users();
		LoginServiceImpl loginServiceImpl = new LoginServiceImpl();
		users.setUserName(request.getParameter("rollnumber"));
		users.setType(request.getParameter("type"));
		String result = loginServiceImpl.getLoginStatusService(users);
		PrintWriter out = response.getWriter();
		out.println(result);
	}

}
