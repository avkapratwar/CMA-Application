package com.formfield.controller;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateUtil {
   static SessionFactory sess=null;
   static {
	   getSessionFactory();
   }
   public static void getSessionFactory() {
	   Configuration configuration=new Configuration();
	   sess=configuration.configure().buildSessionFactory();
   }
   
   public SessionFactory getOracleSession() {
	   return sess;
   }

}
