
package com.virtusa.cma.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.virtusa.cma.entity.Faculty;


@Repository
public class FacultyDaoImpl implements FacultyDaoIface {

	@Autowired
	SessionFactory sessionFactory;
	
	
	
	
	/*
	 * public void setSessionFactory(SessionFactory sessionFactory) {
	 * this.sessionFactory = sessionFactory; } public SessionFactory
	 * getSessionFactory() { // TODO Auto-generated method stub return
	 * sessionFactory; }
	 */

	@Transactional
	public String insertFaculty(Faculty faculty) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		String s=(String) session.save(faculty);
		Transaction transaction=session.beginTransaction();
		transaction.commit();
		return s;
		
	}

	@Transactional
	public List<Faculty> showFaculty(Faculty faculty) {
		//Session session=sessionFactory.openSession();
		//Query query= this.getSessionFactory().getCurrentSession().createQuery("from faculty where id=:'1000'");
		System.out.println(faculty.getEmpno());
		Session session = sessionFactory.openSession();
		Query query= session.createQuery("from Faculty where empno=:empno");
		query.setParameter("empno", faculty.getEmpno());
		List<Faculty> liblist=query.list();
		//Transaction transaction=session.beginTransaction();
		//transaction.commit();
		return liblist;
	}
	
	@Transactional
	public String updateFaculty(Faculty faculty) {
		// TODO Auto-generated method stub
		//sessionFactory.getCurrentSession().saveOrUpdate(faculty);
		Session session=sessionFactory.openSession();
		session.update(faculty);
		Transaction transaction=session.beginTransaction();
		transaction.commit();
		return "details updated";
	}

	
}
