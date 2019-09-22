package com.virtusa.cma.service;

import java.util.ArrayList;

import com.virtusa.cma.dao.StaffMeetingsIface;
import com.virtusa.cma.dao.StaffMeetingsIfaceImpl;
import com.virtusa.cma.entity.StaffMeetings;

public class StaffMeetingsServiceIfaceImpl implements StaffMeetingsServiceIface {

	StaffMeetingsIface sm;
	public   StaffMeetingsServiceIfaceImpl() {
	
		sm=new StaffMeetingsIfaceImpl();
	}
	@Override
	public String insertMeeting(StaffMeetings s) {
		return sm.insertMeeting(s);
	}

	@Override
	public ArrayList<StaffMeetings> showMeeting(StaffMeetings p) {
		return sm.showMeeting(p);
	}

}
