package com.formfield.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name = "applicants")

public class Applicants {
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int applicationNumber;
	
	
	@Column
	//@Pattern(regexp = "^[A-Za-z\\s]{1,}[\\.]{0,1}[A-Za-z\\s]{0,}$",message = "enter only letters")
	private String firstName;
	
	
	@Column
	//@Pattern(regexp = "^[A-Za-z\\s]{1,}[\\.]{0,1}[A-Za-z\\s]{0,}$",message = "enter only letters")
	private String lastName;
	
	@Column
	//@Size(max = 10, message = "mobile no. should be 10 digits")
	private long contactNumber;
	

	@Column
	//@Pattern(regexp = "^[A-Za-z\\s]{1,}[\\.]{0,1}[A-Za-z\\s]{0,}$",message = "enter only letters")
	private String gender;
	
	@Column
	@Temporal(TemporalType.DATE)
	private Date dateOfBirth;
	
	
	@Column
	//@Pattern(regexp = "^[A-Za-z\\s]{1,}[\\.]{0,1}[A-Za-z\\s]{0,}$",message = "enter only letters")
	private String fatherName;
	
	//@Email(regexp = "[a-z0-9._%+-]+@gmail.[a-z]{2,}$", message = "enter valid email address")
	@Column
	private String email;
	
	//@Min(value = 18, message = "age must be greater than 18 or equal to 18")
	@Column
	private int xPercent;
	//@Min(value = 18, message = "age must be greater than 18 or equal to 18")
	@Column
	private int xiiPercent;
	//@Min(value = 18, message = "age must be greater than 18 or equal to 18")
	@Column
	private int ugPercent;
	
	@Column
	//@Pattern(regexp = "^[A-Za-z\\s]{1,}[\\.]{0,1}[A-Za-z\\s]{0,}$",message = "enter only letters")
	private String state;
	@Column
	//@Pattern(regexp = "^[A-Za-z\\s]{1,}[\\.]{0,1}[A-Za-z\\s]{0,}$",message = "enter only letters")
	private String country;
	@Column
	//@Pattern(regexp = "^[A-Za-z\\s]{1,}[\\.]{0,1}[A-Za-z\\s]{0,}$",message = "enter only letters")
	private String status="pending";
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
	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long contactNumber) {
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
