package com.virtusa.cma.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


import org.apache.log4j.Logger;

import com.virtusa.cma.entity.RegisterCourses;

import com.virtusa.cma.util.DaoConnection;

public class RegisterCoursesDaoImpl implements RegisterCoursesDaoIface{
	static Logger logger = Logger.getLogger(RegisterCoursesDaoImpl.class);
	static final String ENROLL="insert into regcourses values(?,?,?)";
	Connection connection;
	PreparedStatement preparestatement;
	int result;
	public RegisterCoursesDaoImpl() {
		connection = DaoConnection.getConnection();

	}

	@Override
	public int enrollCourses(RegisterCourses c,String userName) {
		try {
			
			preparestatement = connection.prepareStatement(ENROLL);
			preparestatement.setString(1, c.getCourseId());
			preparestatement.setString(2, userName);
			preparestatement.setString(3, c.getCourseName());
			result = preparestatement.executeUpdate();
			if (result > 0) {
				connection.commit();
			}

		} catch (SQLException e) {
			
			logger.error(e);
		}
		return result;
		}

		

}


