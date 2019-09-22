
package com.virtusa.cmadv.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.virtusa.cmadv.entity.Faculty;

@Repository
public class FacultyDaoImpl implements FacultyDaoIface {

	@Autowired
	SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	@Transactional
	public String insertFaculty(Faculty faculty) {
		Session session=sessionFactory.openSession();
		String s = (String) session.save(faculty);
		return s;

	}

	@Transactional
	public List<Faculty> showFaculty(Faculty faculty) {
		
		System.out.println(faculty.getEmpno());
		Session session=sessionFactory.openSession();
		Query query = session.createQuery("from Faculty where empno=:empno");
		query.setParameter("empno", faculty.getEmpno());
		List<Faculty> liblist = query.list();
		return liblist;
	}

	@Transactional
	public String updateFaculty(Faculty faculty) {
		Session session=sessionFactory.openSession();
		session.update(faculty);
		return "details updated";
		
	}

	public Faculty showDetail(String empno) {
		Session session=sessionFactory.openSession();
		Query query = session.createQuery("from Faculty where empno=:empno");
		query.setParameter("empno", empno);
		Faculty faculty = (Faculty) query.uniqueResult();
		return faculty;
	}

}
