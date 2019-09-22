package com.virtusa.cma.entity;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.virtusa.cma.util.DaoConnection;

public class Student {
	private String studentid;
	private String firstname;
	private String lastname;
	private Date dob;
	private String gender;
	private String email;
	private String mobileNumber;
	private String parentsMobileNumber;
	private String address;
	private String city;
	private String state;
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

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
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

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getParentsMobileNumber() {
		return parentsMobileNumber;
	}

	public void setParentsMobileNumber(String parentsMobileNumber) {
		this.parentsMobileNumber = parentsMobileNumber;
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

	static Logger logger = Logger.getLogger(Student.class);

	Connection con;
	PreparedStatement pst = null;
	ResultSet rs = null;

	public Student showStudent(String studentid) {
		con = DaoConnection.getConnection();
		Student stu = new Student();
		try {
			String cmd = "SELECT * FROM Student where studentid=?";
			pst = con.prepareStatement(cmd);
			pst.setString(1, studentid);
			rs = pst.executeQuery();

			if (rs.next()) {
				stu = new Student();
				stu.setStudentid(rs.getString("Studentid"));
				stu.setFirstname(rs.getString("firstName"));
				stu.setLastname(rs.getString("lastName"));
				stu.setDob(rs.getDate("dateofbirth"));
				stu.setGender(rs.getString("GENDER"));
				stu.setEmail(rs.getString("email"));
				stu.setMobileNumber(rs.getString("MOBILENO"));
				stu.setParentsMobileNumber(rs.getString("PARENTSMOBILENO"));
				stu.setAddress(rs.getString("address"));
				stu.setCity(rs.getString("city"));
				stu.setState(rs.getString("state"));
				stu.setDepartment(rs.getString("DEPARTMENT"));

			}
		} catch (SQLException e) {
			logger.error(e);
		} finally {
			try {
				rs.close();
			} catch (SQLException e) {
				logger.error(e);
			}
		}

		return stu;
	}

	public String insertStudent(Student s) {
		if (getStudentid() != null) {
			
			Connection con1;
			con1 = DaoConnection.getConnection();
			PreparedStatement pst1 = null;
			String cmd = "insert into Student(studentId,firstname,lastname,dateofbirth,gender,email,mobileno,parentsmobileno,address,city,state,department) values(?,?,?,?,?,?,?,?,?,?,?,?)";
			try {
				pst1 = con1.prepareStatement(cmd);

				pst1.setString(1, s.getStudentid());
				pst1.setString(2, s.getFirstname());
				pst1.setString(3, s.getLastname());
				pst1.setDate(4, s.getDob());
				pst1.setString(5, s.getGender());
				pst1.setString(6, s.getEmail());
				pst1.setString(7, s.getMobileNumber());
				pst1.setString(8, s.getParentsMobileNumber());
				pst1.setString(9, s.getAddress());
				pst1.setString(10, s.getCity());
				pst1.setString(11, s.getState());
				pst1.setString(12, s.getDepartment());
				pst1.executeUpdate();
				return "Record Inserted...";
			} catch (SQLException e) {

				logger.error(e);
				return e.getMessage();
			} finally {
				try {
					if (pst1 != null) {
						pst1.close();
					}
				} catch (SQLException e2) {
					logger.error(e2);
				}
			}
		}

		return "Not Inserted";
	}

	public String updateStudent(Student s) {
		Student obj = new Student().showStudent(s.getStudentid());
		if (obj != null) {

			con = DaoConnection.getConnection();

			String cmd = "update Student set firstname=?,lastname=?,dateofbirth=?,gender=?,email=?,mobileno=?,parentsmobileno=?,address=?,city=?,state=?,department=? where studentid=?";
			try {
				pst = con.prepareStatement(cmd);
				pst.setString(1, s.getFirstname());
				pst.setString(2, s.getLastname());
				pst.setDate(3, s.getDob());
				pst.setString(4, s.getGender());
				pst.setString(5, s.getEmail());
				pst.setString(6, s.getMobileNumber());
				pst.setString(7, s.getParentsMobileNumber());
				pst.setString(8, s.getAddress());
				pst.setString(9, s.getCity());
				pst.setString(10, s.getState());
				pst.setString(11, s.getDepartment());
				pst.setString(12, s.getStudentid());
				pst.executeUpdate();
				return "Student details Updated...";

			}

			catch (SQLException e) {
				logger.error(e);
				return e.getMessage();
			}
		}
		return "Student not found";

	}

}
