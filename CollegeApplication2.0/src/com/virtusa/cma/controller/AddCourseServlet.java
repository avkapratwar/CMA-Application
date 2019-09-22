package com.virtusa.cma.controller;

import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.virtusa.cma.entity.Courses;
import com.virtusa.cma.service.CourseServiceImpl;

/**
 * Servlet implementation class AddCourseServlet
 */
public class AddCourseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static Logger logger = Logger.getLogger(AddCourseServlet.class);
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddCourseServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Date startDate=null;
		Date endDate=null;
		String courseId=request.getParameter("cid");
		String courseName=request.getParameter("cname");
	
			java.util.Date dt;
			try {
				dt = new SimpleDateFormat("MM/dd/yyyy").parse(request.getParameter("sdate"));
				startDate=new Date(dt.getTime());
			} catch (ParseException e) {
				logger.info(e);
			}
			 
			 java.util.Date dt1;
			try {
				 dt1 = new SimpleDateFormat("MM/dd/yyyy").parse(request.getParameter("edate"));
				 endDate=new Date(dt1.getTime());
			} catch (ParseException e) {
				logger.info(e);
			}
			
		
		Courses c=new Courses();
		c.setCourseId(courseId);
		c.setCourseName(courseName);
		c.setStartDate(startDate);
		c.setEndDate(endDate);
		CourseServiceImpl courseServiceImpl= new CourseServiceImpl();
		int result=courseServiceImpl.addService(c);
		if(result>0) {
			
				RequestDispatcher rs = request.getRequestDispatcher("Courses.html");
				rs.forward(request, response);
			
			
		}
		
		
		
		
		
		
	}


	}