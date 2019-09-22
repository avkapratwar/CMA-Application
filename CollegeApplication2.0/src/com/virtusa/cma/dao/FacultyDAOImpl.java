package com.virtusa.cma.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import org.apache.log4j.Logger;


import com.virtusa.cma.entity.Faculty;
import com.virtusa.cma.util.DaoConnection;

public class FacultyDAOImpl implements FacultyDAOIface {

	Connection con;
	public FacultyDAOImpl() {
		
		con = DaoConnection.getConnection();
	}
	
	static Logger logger = Logger.getLogger(Faculty.class);
	
	@Override
	public String insertFaculty(Faculty f) {
		
		if (f.getEmpno() != null) {

			PreparedStatement pst1 = null;
			String cmd = "insert into FacultyInfo values(?,?,?,?,?,?,?,?,?,?,?,?)";
			try {
				pst1 = con.prepareStatement(cmd);
				pst1.setString(1, f.getEmpno());
				pst1.setString(2, f.getFirstname());
				pst1.setString(3, f.getLastname());
				pst1.setDate(4, f.getDob());
				pst1.setString(5, f.getEmail());
				pst1.setString(6, f.getPhoneNumber());
				pst1.setString(7, f.getQq());
				pst1.setString(8, f.getEe());
				pst1.setString(9, f.getDepartment());
				pst1.setString(10, f.getGender());
				pst1.setString(11, f.getCity());
				pst1.setString(12, f.getState());
				pst1.executeUpdate();
				return "Record Inserted...";
			} catch (SQLException e) {

				logger.error(e);
				return e.getMessage();
			} finally {
				try {
					if (pst1 != null)
						pst1.close();
				} catch (SQLException e) {
					logger.error(e);

				}
			}

		}
		return "Not Inserted";

	}

	@Override
	public Faculty showFaculty(Faculty faculty) {
		
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {

			String cmd = "SELECT * FROM FacultyInfo where empno=?";
			preparedStatement = con.prepareStatement(cmd);
			preparedStatement.setString(1, faculty.getEmpno());
			resultSet = preparedStatement.executeQuery();
			

			if (resultSet.next()) {
			
				faculty.setEmpno(resultSet.getString("empno"));
				faculty.setFirstname(resultSet.getString("firstName"));
				faculty.setLastname(resultSet.getString("lastName"));
				faculty.setDob(resultSet.getDate("dateofbirth"));
				faculty.setEmail(resultSet.getString("email"));
				faculty.setPhoneNumber(resultSet.getString("MOBILENUMBER"));
				faculty.setQq(resultSet.getString("QUALIFICATION"));
				faculty.setEe(resultSet.getString("EXPERIENCE"));
				faculty.setDepartment(resultSet.getString("DEPARTMENT"));
				faculty.setGender(resultSet.getString("GENDER"));
				faculty.setCity(resultSet.getString("city"));
				faculty.setState(resultSet.getString("state"));
				
			}
		} catch (SQLException e) {

			logger.error(e);
		}
		finally {
			try {
				if(preparedStatement!=null) {
				preparedStatement.close();
				}
			} catch (SQLException e) {
				logger.error(e);
			}
			try {
				if(resultSet!=null) {
				resultSet.close();
				}
			} catch (SQLException e) {
				logger.error(e);
			}
		}
		return faculty;
	}

	@Override
	public String updateFaculty(Faculty faculty) {

		PreparedStatement preparedStatement = null;
		
		
		if (faculty!= null) {

			con = DaoConnection.getConnection();
			String cmd = "update Facultyinfo set firstname=?,lastname=?,dateofbirth=?,email=?,mobilenumber=?,experience=?,department=?,city=?,state=? Where Empno=?";
			try {
				preparedStatement = con.prepareStatement(cmd);
				preparedStatement.setString(1, faculty.getFirstname());
				preparedStatement.setString(2, faculty.getLastname());
				preparedStatement.setDate(3, faculty.getDob());
				preparedStatement.setString(4, faculty.getEmail());
				preparedStatement.setString(5, faculty.getPhoneNumber());
				preparedStatement.setString(6, faculty.getEe());
				preparedStatement.setString(7, faculty.getDepartment());
				preparedStatement.setString(8, faculty.getCity());
				preparedStatement.setString(9, faculty.getState());
				preparedStatement.setString(10, faculty.getEmpno());
				preparedStatement.executeUpdate();
				con.commit();
				return "Employee details Updated...";
				
			}

			catch (SQLException e) {

				logger.error(e);
				return e.getMessage();
			}
			finally {
				try {
					if(preparedStatement!=null) {
					preparedStatement.close();
					}
				} catch (SQLException e) {
					logger.error(e);
				}
			}
		}
		return "Faculty not found";

	}

	}

	
