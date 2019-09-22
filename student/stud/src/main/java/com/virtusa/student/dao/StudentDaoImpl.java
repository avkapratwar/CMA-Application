package com.virtusa.student.dao;

import java.sql.BatchUpdateException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.virtusa.student.models.Student;

@Repository
public class StudentDaoImpl implements StudentDaoIface {

	@Autowired
	SessionFactory sessionFactory;
	
	@Transactional
	public String insertStudent(Student student) {
		Session session=sessionFactory.openSession();
		String s;
			session.saveOrUpdate(student);
		
		Transaction transaction=session.beginTransaction();
		transaction.commit();
		return "success";
		
	}

	public List<Student> showStudent(Student student) {
		// TODO Auto-generated method stub
		System.out.println(student.getStudentid());
		Session session = sessionFactory.openSession();
		Query query= session.createQuery("from Student where id=:studentid");
		query.setParameter("studentid", student.getStudentid());
		List<Student> liblist=query.list();
		return liblist;
	}

	public String updateStudent(Student student) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		session.update(student);
		Transaction transaction=session.beginTransaction();
		transaction.commit();
		return "details updated";
	}
	public Student showDetail(String studentid) {
		Session session = sessionFactory.openSession();
		Query query= session.createQuery("from Student where studentid=:studentid");
		query.setParameter("studentid", studentid);
		//List<Faculty> liblist=query.list();
		Student student=(Student) query.uniqueResult();
		return student;
		}

	
}
