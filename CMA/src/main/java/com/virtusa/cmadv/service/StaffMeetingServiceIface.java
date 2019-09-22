package com.virtusa.cmadv.service;

import java.util.List;
import com.virtusa.cmadv.entity.StaffMeetings;

public interface StaffMeetingServiceIface {
	String addMeeting(StaffMeetings s);
	String updMeeting(StaffMeetings s);
	String delMeeting(String meetingtype);
	List<StaffMeetings> showAllmeetings();

}
