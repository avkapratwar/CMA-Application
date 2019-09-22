package com.virtusa.cma.service;

import java.util.List;

import com.virtusa.cma.entity.Feedback;

public interface FeedbackServiceIface {
	String addFeedback(Feedback feedBack);
	List<Feedback> showAllFeedback();
}
