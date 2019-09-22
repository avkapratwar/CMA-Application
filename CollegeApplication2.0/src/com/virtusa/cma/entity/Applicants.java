package com.virtusa.cma.entity;

import java.sql.Date;

public class Applicants {
	private int applicationNumber;
	private String firstName;
	private String lastName;
	private String contactNumber;
	private String gender;
	private Date dateOfBirth;
	private String fatherName;
	private String email;
	private int xPercent;
	private int xiiPercent;
	private int ugPercent;
	private String state;
	private String country;
	private String status;
	
	public int getApplicationNumber() {
		return applicationNumber;
	}
	public void setApplicationNumber(int applicationNumber) {
		this.applicationNumber = applicationNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getxPercent() {
		return xPercent;
	}
	public void setxPercent(int xPercent) {
		this.xPercent = xPercent;
	}
	public int getXiiPercent() {
		return xiiPercent;
	}
	public void setXiiPercent(int xiiPercent) {
		this.xiiPercent = xiiPercent;
	}
	public int getUgPercent() {
		return ugPercent;
	}
	public void setUgPercent(int ugPercent) {
		this.ugPercent = ugPercent;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
