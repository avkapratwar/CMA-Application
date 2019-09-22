package com.virtusa.cma.dao;

import java.util.List;


import com.virtusa.cma.entity.Feedback;

public interface FeedbackDaoIface {
	String addFeedbackDao(Feedback feedback);
	List<Feedback> showAllFeedbackDao();

}
