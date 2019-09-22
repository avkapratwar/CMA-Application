package com.virtusa.student.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="student")
public class Student {	
	@Id
	@Column
	private String studentid;
	
	@Column
	private String firstname;
	@Column
	private String lastname;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern="MM/dd/yyyy")
	@Column
	private Date dateofbirth;
	@Column
	private String gender;
	@Column
	private String email;
	@Column
	private String mobileNo;
	@Column
	private String parentsMobileNo;
	@Column
	private String address;
	@Column
	private String city;
	@Column
	private String state;
	@Column
	private String department;
	public String getStudentid() {
		return studentid;
	}
	public void setStudentid(String studentid) {
		this.studentid = studentid;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public Date getDateofbirth() {
		return dateofbirth;
	}
	public void setDateofbirth(Date dateofbirth) {
		this.dateofbirth = dateofbirth;
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
	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", dateofbirth=" + dateofbirth + ", gender=" + gender + ", email=" + email + ", mobileNo=" + mobileNo
				+ ", parentsMobileNo=" + parentsMobileNo + ", address=" + address + ", city=" + city + ", state="
				+ state + ", department=" + department + "]";
	}
	
	
}