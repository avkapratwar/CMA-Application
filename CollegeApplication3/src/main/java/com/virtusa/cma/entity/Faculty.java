package com.virtusa.cma.entity;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="facultyinfo")
public class Faculty {
	@Id
	@Column
	private String empno;
	@Column
	private String firstname;
	@Column
	private String lastname;
	@Column
	private Date dateOfBirth;
	@Column
	private String email;
	@Column
	private String mobileNumber;
	@Column
	private String qualification;
	@Column
	private String experience;
	@Column
	private String department;
	@Column
	private String gender;
	@Column
	private String city;
	@Column
	private String state;
//	@ManyToMany(mappedBy = "faculty")
	//private List<Courses> courses;
	public String getEmpno() {
		return empno;
	}
	public void setEmpno(String empno) {
		this.empno = empno;
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
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
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
	@Override
	public String toString() {
		return "Faculty [empno=" + empno + ", firstname=" + firstname + ", lastname=" + lastname + ", dateOfBirth="
				+ dateOfBirth + ", email=" + email + ", mobileNumber=" + mobileNumber + ", qualification="
				+ qualification + ", experience=" + experience + ", department=" + department + ", gender=" + gender
				+ ", city=" + city + ", state=" + state + "]";
	}

	
}