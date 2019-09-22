package com.virtusa.cmadv.service;

import java.util.List;

import com.virtusa.cmadv.entity.Feedback;


public interface FeedbackServiceIface {
	String insertFeedbackService(Feedback feedback);
	List<Feedback> showAllService();

}
