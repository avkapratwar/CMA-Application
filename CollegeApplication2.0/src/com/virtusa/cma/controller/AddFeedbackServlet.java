package com.virtusa.cma.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.virtusa.cma.entity.Feedback;
import com.virtusa.cma.service.FeedbackServiceIface;
import com.virtusa.cma.service.FeedbackServiceImpl;

/**
 * Servlet implementation class AddFeedbackServlet
 */
public class AddFeedbackServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddFeedbackServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName=request.getParameter("username");
		String userType=request.getParameter("userType");
		String rating=request.getParameter("rating");
		String  comments=  request.getParameter("comments");
		Feedback feedback=new Feedback();
		feedback.setUserId(userName);
		feedback.setUserType(userType);
		feedback.setRating(rating);
		feedback.setFeedBack(comments);
		FeedbackServiceIface feedbackServiceIface=new FeedbackServiceImpl();
		String f=feedbackServiceIface.addFeedback(feedback);
		if(f!=null)
		{
		
			RequestDispatcher rs = request.getRequestDispatcher("AllFeedbacks.jsp");
			
			rs.forward(request, response);

		}
	}

}
