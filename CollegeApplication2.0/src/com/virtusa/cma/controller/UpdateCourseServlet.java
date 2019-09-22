package com.virtusa.cma.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.virtusa.cma.entity.Courses;
import com.virtusa.cma.service.CourseServiceImpl;

/**
 * Servlet implementation class UpdateCourseServlet
 */
public class UpdateCourseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static Logger logger = Logger.getLogger(UpdateCourseServlet.class);
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateCourseServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Date startDate=null;
		Date endDate=null;
		String courseId=request.getParameter("cid");
		String courseName=request.getParameter("cname");
		String str=(request.getParameter("sdate"));
		
			java.util.Date dt;
			java.util.Date dt1;
			try {
				dt = new SimpleDateFormat("MM-dd-yyyy").parse(str);
				startDate=new Date(dt.getTime());
				dt1 = new SimpleDateFormat("MM-dd-yyyy").parse(request.getParameter("edate"));
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
		int result=courseServiceImpl.updateService(c);
		if(result>0) {
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("ShowAllCoursesServlet");
			requestDispatcher.forward(request, response);
		}
		
		}

}
