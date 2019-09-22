package com.formfield.dao;



import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.formfield.model.Applicants;

@Repository
public class CustomerDao {
	
	@Autowired
	SessionFactory sessionFactory;
	
	
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}



	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}



    @Transactional
	public void save(Applicants applicants) {
		Session session=this.getSessionFactory().getCurrentSession();
		session.save(applicants);
		
	}
    
    @Transactional
    public List<Applicants> show() {
    	Query query = this.getSessionFactory().getCurrentSession().createQuery("from Applicants");
		List<Applicants> customers = query.list();
		return customers;
    	
    }
	
	

}
