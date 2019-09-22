package com.virtusa.cmadv.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.virtusa.cmadv.entity.Events;
import com.virtusa.cmadv.entity.Faculty;



@Repository
public class EventsDaoImpl implements EventsDaoIface {

	@Autowired
	SessionFactory sessionFactory;
	 @Transactional
	 public String addEventsDao(Events events) {
		 Session session=sessionFactory.openSession();
		 Transaction transaction=session.beginTransaction();
			String string=(String) session.save(events);
			transaction.commit();
			return string;
	
	}
	 @Transactional
	public List<Events> showAllEventsDao() {
	 	
		 Query q= (Query) sessionFactory.openSession().createQuery("from Events");
			List<Events> an= q.list();
			return an;
		}
	 @Transactional
	public String addFac(Faculty faculty) {
		 Session session=sessionFactory.openSession();
		 Transaction transaction=session.beginTransaction();
			String string=(String) session.save(faculty);
			transaction.commit();
			return string;
	}
	@Transactional
	public List<Faculty> showFac() {
		 Query q1= (Query) sessionFactory.openSession().createQuery("from Faculty where empno='1000'");
			List<Faculty> an1= q1.list();
			return an1;
	}	

	 
	}


