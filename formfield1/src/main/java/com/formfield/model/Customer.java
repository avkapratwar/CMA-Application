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
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.jboss.logging.Message;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "cust231")
public class Customer {
	@Id
	@Column
	private String custId;
	@Pattern(regexp = "^[A-Za-z\\s]{1,}[\\.]{0,1}[A-Za-z\\s]{0,}$",message = "enter only letters")
	@Column
	private String fname;
	@Pattern(regexp = "^[A-Za-z\\s]{1,}[\\.]{0,1}[A-Za-z\\s]{0,}$",message = "enter only letters")
	@Column
	private String lname;
	@Column
	private String gender;
	@Min(value = 18, message = "age must be greater than 18 or equal to 18")
	@Column
	private int age;
	@Email(regexp = "[a-z0-9._%+-]+@gmail.[a-z]{2,}$", message = "enter valid email address")
	@Column
	private String email;
	@Pattern(regexp = "^[A-Za-z\\s]{1,}[\\.]{0,1}[A-Za-z\\s]{0,}$",message = "enter only letters")
	@Column
	private String address;
	@Column
	private String dob;
	@Column
	@Size(max = 10, message = "mobile no. should be 10 digits")
	private String mobile;
	@Column
	@Size(min = 3, message = "password must be atleast 3 digit")
	private String pass;

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

}
