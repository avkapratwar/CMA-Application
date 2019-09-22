package com.virtusa.cmadv.dao;

import java.util.List;

import com.virtusa.cmadv.entity.Feedback;


public interface FeedbackDaoIface {
	String addFeedbackDao(Feedback feedback);
	List<Feedback> showAllFeedbackDao();

}
