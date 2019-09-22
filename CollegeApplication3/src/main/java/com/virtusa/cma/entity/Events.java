package com.virtusa.cma.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="event")
public class Events {
	@Id
	@Column(name="eventid")
	private String eventId;
	@Column(name="eventname")
	private String eventName;
	@Column(name="eventdate")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "MM/dd/yyyy")
	private Date eventDate;
	@Column(name="venue")
	private String venue;

	public String getEventId() {
		return eventId;
	}

	public void setEventId(String eventId) {
		this.eventId = eventId;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public Date getEventDate() {
		return eventDate;
	}

	public void setEventDate(Date eventDate) {
		this.eventDate = eventDate;
	}

	public String getVenue() {
		return venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}

	@Override
	public String toString() {
		return "Events [eventId=" + eventId + ", eventName=" + eventName + ", eventDate=" + eventDate + ", venue="
				+ venue + "]";
	}
	
	
	
	

}
