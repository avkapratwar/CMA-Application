package com.virtusa.cmadv.dao;


import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.virtusa.cmadv.entity.Users;


@Repository
public class UserDAOImpl implements UserDAOIface {
	@Autowired
	SessionFactory sessionFactory;
	
	

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	static Logger logger = Logger.getLogger(Users.class);
	@Transactional
	public List<Users> showAllUsers() {
		Query q=this.getSessionFactory().getCurrentSession().createQuery("from Users");
		List<Users> l=q.list();
		
		return l;
	}
	@Transactional
	public String updateUser(Users user) {
		Session session=this.getSessionFactory().getCurrentSession();
		
		SQLQuery sqlQuery=session.createSQLQuery("update users set USERTYPE=:utype,STATUS=:stat where USERNAME=uId");
		sqlQuery.setParameter("uId",user.getUserName());
		sqlQuery.setParameter("utype",user.getType());
		sqlQuery.setParameter("stat",user.getStatus());
		sqlQuery.executeUpdate();
		return "Updated";
	}
	@Transactional
	public String deleteUser(Users user) {
		
		this.getSessionFactory().getCurrentSession().delete(user);
		return "deleted";
	}
	@Transactional
	public String addUser(Users user) {
		String res=null;
		user.setPassword(AutoPwdGen.geekPassword(8));
		String id=(String)this.getSessionFactory().getCurrentSession().save(user);
		
		if(id!=null) {
			System.out.println(user.getStatus());
		res="Inserted";
		}
		return res;
	}

	public String loginValidation(Users users) {
		Session session = sessionFactory.openSession();
		Query query=session.createQuery("select status from Users where userName=:uname and password=:pwd and type=:utype");
		query.setParameter("uname", users.getUserName());
		query.setParameter("pwd", users.getPassword());
		query.setParameter("utype", users.getType());
		//System.out.println(users.getUserName());
		//System.out.println(users.getPassword());
		query.setMaxResults(1);
		return (String) query.uniqueResult();
	}

	public List<Users> loginStatus(Users users) {
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("select status from Users where userName=:uname");
		query.setParameter("uname", users.getUserName());
		query.setMaxResults(1);
		String res = (String) query.uniqueResult();
		if(res.equals("active")) {
			query = session.createQuery("select userName,password from Users where userName=:uname");
			query.setParameter("uname", users.getUserName());
			List<Users> users2= (List<Users>) query.list();
			return users2;
		} else{
			return null;
		}
	}
}
