package com.formfield.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.formfield.model.Courses;
@Repository
public class CoursesDaoImpl implements CoursesDaoIface {
	@Autowired
	SessionFactory sessionFactory;
	
	@Transactional
	public String addCourse(Courses courses) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		String result=(String) session.save(courses);
		transaction.commit();
		return result;
	}

	public List<Courses> showAll() {
		Session session = sessionFactory.openSession();
		Query query=session.createQuery("from Courses");
        @SuppressWarnings("unchecked")
		List<Courses> list=query.list();
		return list;
	}
	
}
