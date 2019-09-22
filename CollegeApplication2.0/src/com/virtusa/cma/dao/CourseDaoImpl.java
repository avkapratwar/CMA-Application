package com.virtusa.cma.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.virtusa.cma.entity.Courses;

import com.virtusa.cma.util.DaoConnection;

public class CourseDaoImpl implements CourseDaoIface {
	static final String ADDCOURSE="insert into course values(?,?,?,?)";
	static final String UPDATECOURSES="update Course set coursename=?,startdate=?,enddate=? Where courseid=?"; 
	static final String DELETECOURSES="DELETE COURSE WHERE COURSEID=?";
	static final String SHOWCOURSES="SELECT * FROM COURSE WHERE COURSEID=?";
	static final String SHOWALLCOURSES="SELECT * FROM  COURSE";
	
	static Logger logger = Logger.getLogger(CourseDaoImpl.class);
	Connection connection;
	PreparedStatement preparestatement;
	int result;
	
	

	public CourseDaoImpl() {
		
		connection = DaoConnection.getConnection();

	}

	@Override
	public int addCourse(Courses c) {

		try {
			java.sql.Date st=new java.sql.Date(c.getStartDate().getTime());
			   java.sql.Date et=new java.sql.Date(c.getEndDate().getTime());
			preparestatement = connection.prepareStatement(ADDCOURSE);
			preparestatement.setString(1, c.getCourseId());
			preparestatement.setString(2, c.getCourseName());
			preparestatement.setDate(3, st);
			preparestatement.setDate(4, et);

			result = preparestatement.executeUpdate();
			if (result > 0) {
				connection.commit();
			}

		} catch (SQLException e) {
			
			logger.error(e);
		}
		return result;
	}

	@Override
	public int updateCourse(Courses c) {
		
		
		try {
			preparestatement = connection.prepareStatement(UPDATECOURSES);
			preparestatement.setString(1, c.getCourseName());
			preparestatement.setDate(2, c.getStartDate());
			preparestatement.setDate(3,c.getEndDate());
			preparestatement.setString(4, c.getCourseId());
			result = preparestatement.executeUpdate();
			if (result > 0) {
				connection.commit();
			}

		} catch (SQLException e) {
			
			logger.error(e);
		}
		return result;
	}

	@Override
	public int deleteCourse(String courseId) {
		
		try {
			preparestatement = connection.prepareStatement(DELETECOURSES);
			preparestatement.setString(1, courseId);
			result = preparestatement.executeUpdate();
			if (result > 0) {
				connection.commit();
			}
		} catch (SQLException e) {
			
			logger.error(e);
		}
		

		return result;
	}

	@Override
	public Courses showCourse(String courseId) {
		
		ResultSet resultset = null;
		Courses courses = new Courses();
		try {

			preparestatement = connection.prepareStatement(SHOWCOURSES);
			preparestatement.setString(1, courseId);
			resultset = preparestatement.executeQuery();
			if (resultset.next()) {

				courses.setCourseId(resultset.getString("courseId"));
				courses.setCourseName(resultset.getString("courseName"));
				courses.setStartDate(resultset.getDate("startDate"));
				courses.setEndDate(resultset.getDate("endDate"));

			}
		} catch (SQLException e) {
			
			logger.error(e);
		}
		finally
		{
			try {
				if(resultset!=null) {
				resultset.close();
				}
			} catch (SQLException e) {
				logger.error(e);
			}
		}

		return courses;
	}

	@Override
	public Courses[] showAllCourses() {
		Courses[] course = null;
		
		ResultSet resultset = null;
		ResultSet resultset1 = null;
		try {
			preparestatement = connection.prepareStatement("select count(*) count from course ");
			resultset = preparestatement.executeQuery();
			resultset.next();
			int count = resultset.getInt("count");

			course = new Courses[count];
			preparestatement = connection.prepareStatement(SHOWALLCOURSES);
			resultset1 = preparestatement.executeQuery();
			Courses newCourse = null;
			int i = 0;

			while (resultset1.next()) {
				newCourse = new Courses();
				newCourse.setCourseId(resultset1.getString("courseid"));
				newCourse.setCourseName(resultset1.getString("coursename"));
				newCourse.setStartDate(resultset1.getDate("startdate"));
				newCourse.setEndDate(resultset1.getDate("enddate"));

				course[i] = newCourse;
				i++;
			}

		} catch (SQLException e) {

			logger.error(e);
		}
		finally
		{
			try {
				if(resultset!=null) {
				resultset.close();
				}
			} catch (SQLException e) {
				logger.error(e);
			}
			try {
				if(resultset1!=null) {
				resultset1.close();
				}
			} catch (SQLException e) {
				logger.error(e);
			}
		}

		return course;

	}
}
	