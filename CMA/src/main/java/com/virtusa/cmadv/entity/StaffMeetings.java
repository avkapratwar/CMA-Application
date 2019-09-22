package com.virtusa.cmadv.entity;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="staffmeetings")
public class StaffMeetings{
	@Id
	@NotEmpty(message="enter the meetingtype")

	@Column
	private String meetingtype;
	
	
	@Column
	@DateTimeFormat(pattern = "MM/dd/yyyy")
	@Temporal(TemporalType.DATE)
	private Date meetingdate;

	public String getMeetingtype() {
		return meetingtype;
	}

	public void setMeetingtype(String meetingtype) {
		this.meetingtype = meetingtype;
	}

	public Date getMeetingdate() {
		return  meetingdate;
	}

	public void setMeetingdate(Date meetingdate) {
		
			this.meetingdate = meetingdate;
	
	}

	
}



