package com.formfield.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.formfield.model.Users;

@Repository
public class UsersDaoImpl implements UserDaoIface{
	@Autowired
	SessionFactory sessionFactory;
	
	public String loginValidation(Users users) {
		Session session = sessionFactory.openSession();
		Query query=session.createQuery("select status from Users where userName=:uname and passWord=:pwd and userType=:utype");
		query.setParameter("uname", users.getUserName());
		query.setParameter("pwd", users.getPassWord());
		query.setParameter("utype", users.getUserType());
		query.setMaxResults(1);
		System.out.println((String) query.uniqueResult());
		return (String) query.uniqueResult();
	}
	
}
