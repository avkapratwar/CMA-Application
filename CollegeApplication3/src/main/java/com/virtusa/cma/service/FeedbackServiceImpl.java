package com.virtusa.cma.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.virtusa.cma.dao.FeedbackDaoIface;
import com.virtusa.cma.entity.Events;
import com.virtusa.cma.entity.Feedback;

@Service
public class FeedbackServiceImpl implements FeedbackServiceIface{

	@Autowired
	FeedbackDaoIface feedbackDaoIface;
	public String insertFeedbackService(Feedback feedback) {
	   return feedbackDaoIface.addFeedbackDao(feedback);
	}

	public List<Feedback> showAllService() {
		
		return feedbackDaoIface.showAllFeedbackDao();
	}

}
