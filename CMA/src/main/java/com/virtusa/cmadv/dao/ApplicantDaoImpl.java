package com.virtusa.cmadv.dao;

import java.util.List;


import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.virtusa.cmadv.entity.Applicants;

@Repository
public class ApplicantDaoImpl implements ApplicantDaoIface {

	@Autowired
	SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public int addApplicant(Applicants applicants) {
		Session session = sessionFactory.openSession();
		int id=(Integer) session.save(applicants);
		org.hibernate.Transaction transaction = session.beginTransaction();
		transaction.commit();
		return id;
	}

	@Transactional
	public List<Applicants> showAll() {
		Session session = sessionFactory.getCurrentSession();
        Query q=session.createQuery("from Applicants");
        @SuppressWarnings("unchecked")
		List<Applicants> list=q.list();
		return list;
	}

	public Applicants showParticular(Applicants applicants) {
		int id = applicants.getApplicationNumber();
		Session session = sessionFactory.openSession();
		Applicants applicants2= (Applicants) session.get(Applicants.class,id);
		return applicants2;
	}

	@Transactional
	public String updateStatus(Applicants applicants) {
		Session session = sessionFactory.openSession();
		SQLQuery sqlQuery = session.createSQLQuery("update applicants set status=:sts where applicationnumber=:appno");
		sqlQuery.addEntity(Applicants.class);
		sqlQuery.setParameter("sts",applicants.getStatus());
		sqlQuery.setParameter("appno",applicants.getApplicationNumber());
		int res=sqlQuery.executeUpdate();
		if(res>0) {
			return "Successfully Updated";
		}
		return "Unable to Updated Status";
	}

	public String showStatus(int ano) {
		Session session = sessionFactory.openSession();
		Query query=session.createQuery("select status from Applicants where APPLICATIONNUMBER=:appno");
		query.setParameter("appno", ano);
		query.setMaxResults(1);
		return (String) query.uniqueResult();
		
//		SQLQuery sqlQuery = session.createSQLQuery("select status from applicants where APPLICATIONNUMBER=:appno");
//		sqlQuery.addEntity(Applicants.class);
//		System.out.println("vcdvs");
//		sqlQuery.setParameter("appno",ano);
//		System.out.println("ccds");
//		//List str=sqlQuery.list();
//		//System.out.println(str);
//		String str=(String) sqlQuery.uniqueResult();
//		System.out.println(str);
	}
	
}
