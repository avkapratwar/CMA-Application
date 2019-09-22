package com.virtusa.cma.entity;

import java.sql.Date;

public class StaffMeetings {
	private String meetingType;
	private Date meetingDate;
	public String getMeetingType() {
		return meetingType;
	}
	public void setMeetingType(String meetingType) {
		this.meetingType = meetingType;
	}
	public Date getMeetingDate() {
		return meetingDate;
	}
	public void setMeetingDate(Date meetingDate) {
		this.meetingDate = meetingDate;
	}
}
