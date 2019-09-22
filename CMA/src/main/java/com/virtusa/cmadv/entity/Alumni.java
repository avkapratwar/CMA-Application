package com.virtusa.cmadv.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Alumni {
	@Id
	@Column(name="STUDENTID")
	private String studentId;
	@Column(name = "FIRSTNAME")
	private String firstName;
	@Column(name="LASTNAME")
	private String lastName;
	@Column(name="DATEOFBIRTH")
	private String dateOfBirth;
	@Column(name = "GENDER")
	private String gender;
	@Column(name = "EMAIL")
	private String email;
	@Column(name = "MOBILENO")
	private String mobileNo;
	@Column(name = "PARENTSMOBILENO")
	private String parentsMobileNo;
	@Column(name = "ADDRESS")
	private String address;
	@Column(name = "CITY")
	private String city;
	@Column(name = "STATE")
	private String state;
	@Column(name = "DEPARTMENT")
	private String department;
	@Column(name = "TYPE")
	private String type;
	 public Alumni() {
		
	}
	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
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

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getParentsMobileNo() {
		return parentsMobileNo;
	}

	public void setParentsMobileNo(String parentsMobileNo) {
		this.parentsMobileNo = parentsMobileNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}