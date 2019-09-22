package com.virtusa.cmadv.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.virtusa.cmadv.dao.StaffMeetingDao;
import com.virtusa.cmadv.dao.StaffMeetingDaoImpl;
import com.virtusa.cmadv.entity.StaffMeetings;

@Service
public class Staffmeetingserviceimpl implements StaffMeetingServiceIface {
	@Autowired
	StaffMeetingDao staffMeetingDao;
	public String addMeeting(StaffMeetings s) {
		return staffMeetingDao.addMeeting(s);
	}
	public String updMeeting(StaffMeetings s) {
		// TODO Auto-generated method stub
		return staffMeetingDao.updMeeting(s);
	}
	public String delMeeting(String meetingtype) {
		// TODO Auto-generated method stub
		return staffMeetingDao.delMeeting(meetingtype);
	}
	public List<StaffMeetings> showAllmeetings() {
		// TODO Auto-generated method stub
		return staffMeetingDao.showAllmeetings();
	}


}
