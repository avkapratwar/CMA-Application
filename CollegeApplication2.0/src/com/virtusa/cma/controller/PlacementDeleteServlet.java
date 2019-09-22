package com.virtusa.cma.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.virtusa.cma.entity.Placement;
import com.virtusa.cma.service.PlacementServiceIface;
import com.virtusa.cma.service.PlacementServiceIfaceImpl;

/**
 * Servlet implementation class PlacementDeleteServlet
 */
public class PlacementDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PlacementDeleteServlet() {
        super();
    }
	static Logger logger = Logger.getLogger(PlacementInsertServlet.class);


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
 			Placement p=new Placement();
			PlacementServiceIface psi;
			p.setCompanyName(request.getParameter("companyName"));
			psi=new PlacementServiceIfaceImpl();
			String s=psi.deletePlacement(request.getParameter("companyName"));

			response.getWriter().println(s);
			
			}
		catch(NumberFormatException e) {
			
			logger.error(e);
			} 
		
		 }

}
