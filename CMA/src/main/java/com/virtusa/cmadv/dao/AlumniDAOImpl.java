package com.virtusa.cmadv.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.virtusa.cmadv.entity.Alumni;
import com.virtusa.cmadv.entity.Users;
@Repository
public class AlumniDAOImpl implements AlumniDAOIface {
	
	@Autowired
	SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	static Logger logger = Logger.getLogger(Alumni.class);
	@Transactional
	public List<Alumni> showAllAlumni() {
		System.out.println("Alumni DAO");
		Query q=this.getSessionFactory().getCurrentSession().createQuery("from Alumni");
		List<Alumni> list=q.list();
		System.out.println("Alumni DAO query");
		return list;
	}
	
	
}
