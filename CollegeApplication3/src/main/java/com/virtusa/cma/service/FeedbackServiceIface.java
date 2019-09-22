package com.virtusa.cma.service;

import java.util.List;


import com.virtusa.cma.entity.Feedback;

public interface FeedbackServiceIface {
	String insertFeedbackService(Feedback feedback);
	List<Feedback> showAllService();

}
