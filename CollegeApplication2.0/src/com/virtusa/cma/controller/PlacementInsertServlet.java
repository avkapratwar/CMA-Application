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

import com.virtusa.cma.entity.Placement;
import com.virtusa.cma.service.PlacementServiceIfaceImpl;
import com.virtusa.cma.service.PlacementServiceIface;

/**
 * Servlet implementation class PlacementInsertServlet
 */
public class PlacementInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static Logger logger = Logger.getLogger(PlacementInsertServlet.class);
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PlacementInsertServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
 			Placement p=new Placement();
			PlacementServiceIface psi;
			Date date = new SimpleDateFormat("MM/dd/yyyy").parse(request.getParameter("driveDate"));
			java.sql.Date dt=new java.sql.Date(date.getTime());
			p.setCompanyName(request.getParameter("companyName"));
			p.setDriveDate(dt);
			psi=new PlacementServiceIfaceImpl();
			String s=psi.insertPlacement(p);
			
			response.getWriter().println(s);
			request.setAttribute("ck", p);
	        RequestDispatcher rs = request.getRequestDispatcher("InsertAdmin.html");
			rs.forward(request, response);
		
			}
		catch(NumberFormatException | ParseException e) {
			logger.error(e);
			} 
		
	}
}
