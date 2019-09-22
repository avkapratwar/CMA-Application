package com.virtusa.cma.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import org.apache.log4j.Logger;

import com.virtusa.cma.util.DaoConnection;
import com.virtusa.cma.entity.Student;

public class StudentDAOImpl implements StudentDAOIface{

	Connection con;
	PreparedStatement preparedStatement;
	ResultSet rs;
	public StudentDAOImpl() {
		preparedStatement = null;
		con = DaoConnection.getConnection();
		rs = null;
	}
	
	static Logger logger = Logger.getLogger(Student.class);

	public String insertStudent(Student s) {
		
		if (s.getStudentid() != null) {
			String cmd = "insert into Student(studentId,firstname,lastname,dateofbirth,gender,email,mobileno,parentsmobileno,address,city,state,department) values(?,?,?,?,?,?,?,?,?,?,?,?)";
			try {
				preparedStatement = con.prepareStatement(cmd);

				preparedStatement.setString(1, s.getStudentid());
				preparedStatement.setString(2, s.getFirstname());
				preparedStatement.setString(3, s.getLastname());
				preparedStatement.setDate(4, s.getDob());
				preparedStatement.setString(5, s.getGender());
				preparedStatement.setString(6, s.getEmail());
				preparedStatement.setString(7, s.getMobileNumber());
				preparedStatement.setString(8, s.getParentsMobileNumber());
				preparedStatement.setString(9, s.getAddress());
				preparedStatement.setString(10, s.getCity());
				preparedStatement.setString(11, s.getState());
				preparedStatement.setString(12, s.getDepartment());
				preparedStatement.executeUpdate();
				return "Record Inserted...";
			} catch (SQLException e) {

				logger.error(e);
				return e.getMessage();
			} finally {
				try {
					if (preparedStatement != null) {
						preparedStatement.close();
					}
				} catch (SQLException e2) {
					logger.error(e2);
				}
			}
		}

		return "Not Inserted";
	} 
	@Override
	public Student showStudent(Student student) {
		

		
		Student stu = null;
		stu=new Student();
		try {
			String cmd = "SELECT * FROM Student where studentid=?";
			preparedStatement = con.prepareStatement(cmd);
			preparedStatement.setString(1, student.getStudentid());
		    rs = preparedStatement.executeQuery();

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
				return stu;
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

	@Override
	public String updateStudent(Student s) {
		PreparedStatement preparedstatement = null;
	

		Student obj = new Student().showStudent(s.getStudentid());
		if (obj != null) {

			con = DaoConnection.getConnection();

			String cmd = "update Student set firstname=?,lastname=?,dateofbirth=?,gender=?,email=?,mobileno=?,parentsmobileno=?,address=?,city=?,state=?,department=? where studentid=?";
			try {
				preparedstatement = con.prepareStatement(cmd);
				preparedstatement.setString(1, s.getFirstname());
				preparedstatement.setString(2, s.getLastname());
				preparedstatement.setDate(3, s.getDob());
				preparedstatement.setString(4, s.getGender());
				preparedstatement.setString(5, s.getEmail());
				preparedstatement.setString(6, s.getMobileNumber());
				preparedstatement.setString(7, s.getParentsMobileNumber());
				preparedstatement.setString(8, s.getAddress());
				preparedstatement.setString(9, s.getCity());
				preparedstatement.setString(10, s.getState());
				preparedstatement.setString(11, s.getDepartment());
				preparedstatement.setString(12, s.getStudentid());
				preparedstatement.executeUpdate();
				return "Student details Updated...";

			}

			catch (SQLException e) {
				logger.error(e);
				return e.getMessage();
			}
			finally
			{
				try {
					if(preparedstatement!=null) {
					preparedstatement.close();
				}
				} catch (SQLException e) {
					
					logger.error(e);
				}
			}
		}
		return "Student not found";

	}


}
