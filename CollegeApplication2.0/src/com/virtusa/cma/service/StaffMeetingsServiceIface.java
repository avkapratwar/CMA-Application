package com.virtusa.cma.service;

import java.util.ArrayList;

import com.virtusa.cma.entity.StaffMeetings;

public interface StaffMeetingsServiceIface {
	String insertMeeting(StaffMeetings s);
	ArrayList<StaffMeetings> showMeeting(StaffMeetings p);
}
