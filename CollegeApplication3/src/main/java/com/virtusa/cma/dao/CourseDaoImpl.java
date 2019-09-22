package com.virtusa.cma.dao;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.virtusa.cma.entity.Courses;
import com.virtusa.cma.entity.SelectCourses;




@Repository
public class CourseDaoImpl implements CourseDaoIface{

	@Autowired
	SessionFactory sessionFactory;
	
	String id=null;
	
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	public SessionFactory getSessionFactory() {
		// TODO Auto-generated method stub
		return sessionFactory;
	}

	@Transactional
	public String insertCourse(Courses courses) {
		System.out.println(courses.getCourseId()+"---->ID");
		Session session=sessionFactory.openSession();
	
		Transaction transaction=session.beginTransaction();
		String s=(String) session.save(courses);
		transaction.commit();
		return s;
	}
	@Transactional
	public List<Courses> showCourse() {
		// TODO Auto-generated method stub
		 Query query= (Query) sessionFactory.openSession().createQuery("from Courses");
		List<Courses> lists=query.list();
		return lists;
	}
	@Transactional
	public String updateCourse(Courses courses) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		session.update(courses);
		Transaction transaction=session.beginTransaction();
		transaction.commit();
		return "details updated";
	}
	@Transactional
	public String deleteCourse(Courses courses) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		Courses courses1=(Courses) session.get(Courses.class, courses.getCourseId());
		String result;
		if(courses1!=null)
		{
			session.delete(courses1);
			result="success";
			
		}
		else
		{
			result="failure";
		}
		Transaction transaction=session.beginTransaction();
		transaction.commit();
		return result;
	}
/*	@Transactional
	public String regCourse(Courses courses) {
		Session session=sessionFactory.openSession();
		session.update(courses);
		System.out.println("Faculty Id"+courses.getFaculty().getEmpno());
		Transaction transaction=session.beginTransaction();
		transaction.commit();
		return "Update";
	}*/
	@Override
	public String regCourse(Courses courses) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Courses showDetail(String courseId) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Query query= session.createQuery("from Courses where courseId=:courseId");
		query.setParameter("courseId", courseId);
		//List<Faculty> liblist=query.list();
		Courses courses=(Courses) query.uniqueResult();
		return courses;
	}
	@Override
	public String insertMyCourses(SelectCourses selectcourses) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		String s=(String) session.save(selectcourses);
		Transaction transaction=session.beginTransaction();
		transaction.commit();
		return s;
	}
	@Override
	public List<SelectCourses> showMyCourse() {
		// TODO Auto-generated method stub
		Query query= (Query) sessionFactory.openSession().createQuery(" from SelectCourses");
		List<SelectCourses> lists=query.list();
		return lists;
	}
	

}
