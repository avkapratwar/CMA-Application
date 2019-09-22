package com.virtusa.cma.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;



/**
 * Servlet implementation class ApplicationStatusServlet
 */
public class ApplicationStatusServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ApplicationStatusServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    static Logger logger = Logger.getLogger(ApplicationStatusServlet.class);
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = 0;
		 

		Connection cp;
		PrintWriter out;
		CallableStatement stmt = null;
		try {
			out=response.getWriter();
			id = Integer.parseInt(request.getParameter("ApplicationNumber"));
			
			cp = com.virtusa.cma.util.DaoConnection.getConnection();
			stmt = cp.prepareCall("{call prcAppSearch(?,?)}");
			stmt.setInt(1, id);
			stmt.registerOutParameter(2, Types.INTEGER);

			stmt.execute();
			int res = stmt.getInt(2);
			
			if (res == 0) {
				out.println(id);
				out.println("your application was accepted");

			} else {
				
				out.println("sorry!.....your Apllication is under processing.<br/>");
			}
		}catch (NumberFormatException e1) {
			logger.error(e1);
		} 
		catch (SQLException se) {
			logger.error(se);
		} catch (Exception e)

		{
			logger.error(e);
		} finally {
			try {
				if (stmt != null) {
					stmt.close();
				}
			} catch (SQLException e) {
				logger.error(e);
			}
		}
		try {
			doGet(request, response);
		} catch (Exception e1) {
			logger.error(e1);
		}
	}
}


