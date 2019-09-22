package com.virtusa.cma.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.virtusa.cma.entity.Feedback;

@Repository
public class FeedbackDaoImpl implements FeedbackDaoIface{
	 @Autowired
		SessionFactory sessionFactory;
	 @Transactional
	 public String addFeedbackDao(Feedback feedback) {
		 Session session=sessionFactory.openSession();
			String string=(String) session.save(feedback);
			Transaction transaction=session.beginTransaction();
			transaction.commit();
			return string;
	
	}
	 @Transactional
		public List<Feedback> showAllFeedbackDao() {
		 	
			 Query q= (Query) sessionFactory.openSession().createQuery("from Feedback");
				List<Feedback> an= q.list();
				return an;
			}
	
}
