package com.virtusa.cmadv.dao;

import java.util.List;

import com.virtusa.cmadv.entity.StaffMeetings;


public interface StaffMeetingDao {
String addMeeting(StaffMeetings s);
String updMeeting(StaffMeetings s);
String delMeeting(String meetingtype);
List<StaffMeetings> showAllmeetings();

}
