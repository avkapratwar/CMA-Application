package com.virtusa.cma.service;

import java.util.List;

import com.virtusa.cma.dao.FeedbackDAOIface;
import com.virtusa.cma.dao.FeedbackDAOImpl;
import com.virtusa.cma.entity.Feedback;

public class FeedbackServiceImpl implements FeedbackServiceIface {

FeedbackDAOIface feedbackDAOIface;
	
	public FeedbackServiceImpl() {
		feedbackDAOIface=new FeedbackDAOImpl();
	}
	@Override
	public String addFeedback(Feedback feedBack) {
		return feedbackDAOIface.addFeedback(feedBack);
	}

	@Override
	public List<Feedback> showAllFeedback() {
		return feedbackDAOIface.showAllFeedback();
	}

}
