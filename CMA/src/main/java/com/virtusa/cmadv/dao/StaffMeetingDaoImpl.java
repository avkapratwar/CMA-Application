package com.virtusa.cmadv.dao;
    
import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.virtusa.cmadv.entity.StaffMeetings;

@Repository

public class StaffMeetingDaoImpl implements StaffMeetingDao{
	@Autowired
	private SessionFactory sessionfactory;
	@Transactional
	public String addMeeting(StaffMeetings s) {
		String a=null;
		a=(String)sessionfactory.getCurrentSession().save(s);
		String msg=null;
		if(a!=null) {
			msg="Saved meeting succesfully !";
		}else {
			msg="Some problem Occured !";
		}
		return msg;
	}
	@Transactional
	public String updMeeting(StaffMeetings s) {
		// TODO Auto-generated method stub
		sessionfactory.getCurrentSession().saveOrUpdate(s);
		return "meeting updated";	
		}
	@Transactional
	public String delMeeting(String meetingtype) {
		String res = null;
	Session	session = sessionfactory.getCurrentSession();
    StaffMeetings t1 = (StaffMeetings) session.get(StaffMeetings.class,meetingtype);
	System.out.println(t1);
			if (t1 != null) {
				session.delete(t1);
				System.out.println("deleted");
				res = "success";
			} else {
				res = "fail";
			}
			return res;
		}
	public List<StaffMeetings> showAllmeetings() {
		Query q= (Query) sessionfactory.openSession().createQuery("from StaffMeetings");
		List<StaffMeetings> allmeetings= q.list();
		return allmeetings;
	}	
	
	}
	
	
	

	    


