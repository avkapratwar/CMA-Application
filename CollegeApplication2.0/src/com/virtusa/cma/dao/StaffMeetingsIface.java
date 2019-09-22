package com.virtusa.cma.dao;

import java.util.ArrayList;

import com.virtusa.cma.entity.StaffMeetings;

public interface StaffMeetingsIface {
	
	String insertMeeting(StaffMeetings s);
	
	ArrayList<StaffMeetings> showMeeting(StaffMeetings p);
}
