package com.virtusa.cma.dao;

import java.util.List;

import com.virtusa.cma.entity.Feedback;

public interface FeedbackDAOIface {
	String addFeedback(Feedback feedBack);
	List<Feedback> showAllFeedback();
}
