package com.virtusa.cma.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import org.apache.log4j.Logger;

import com.virtusa.cma.entity.Applicants;
import com.virtusa.cma.util.DaoConnection;

public class ApplicationDaoImpl implements ApplicationDaoInterFace {

	Applicants applicants;
	Connection connection = null;
	PreparedStatement preparedStatement = null;
	static Logger logger = Logger.getLogger(DaoConnection.class);

	public ApplicationDaoImpl() {
		connection = DaoConnection.getConnection();
	}

	@Override
	public int addApplicant(Applicants applicants) {
		CallableStatement callableStatement = null;
		int result = 0;
		try {

			callableStatement = connection.prepareCall("{call prcApplicant(?,?,?,?,?,?,?,?,?,?,?,?,?)}");

			callableStatement.setString(1, applicants.getFirstName());
			callableStatement.setString(2, applicants.getLastName());
			callableStatement.setString(3, applicants.getContactNumber());
			callableStatement.setString(4, applicants.getGender());
			callableStatement.setDate(5, applicants.getDateOfBirth());
			callableStatement.setString(6, applicants.getFatherName());
			callableStatement.setString(7, applicants.getEmail());
			callableStatement.setInt(8, applicants.getxPercent());
			callableStatement.setInt(9, applicants.getXiiPercent());
			callableStatement.setInt(10, applicants.getUgPercent());
			callableStatement.setString(11, applicants.getState());
			callableStatement.setString(12, applicants.getCountry());
			callableStatement.registerOutParameter(13, Types.INTEGER);

			callableStatement.execute();
			result = callableStatement.getInt(13);

			return result;
		} catch (SQLException e) {
			logger.info(e);
		} finally {
			try {
				if (callableStatement != null) {
					callableStatement.close();
				}
			} catch (SQLException e) {

				logger.info(e);
			}
		}
		return 0;
	}

	@Override
	public Applicants[] showAllApplicants() {
		Applicants[] app = null;
		ResultSet resultSet = null;
		ResultSet resultSet2 = null;
		PreparedStatement preparedStatement2 = null;
		try {
			preparedStatement = connection.prepareStatement("select count(*) cnt from application");
			resultSet = preparedStatement.executeQuery();
			resultSet.next();
			int cnt = resultSet.getInt("cnt");
			app = new Applicants[cnt];
			preparedStatement2 = connection
					.prepareStatement("select applicationNumber,firstName,lastName,contactNumber from application");
			resultSet2 = preparedStatement2.executeQuery();
			int i = 0;
			while (resultSet2.next()) {
				applicants = new Applicants();
				applicants.setApplicationNumber(resultSet2.getInt("applicationNumber"));
				applicants.setFirstName(resultSet2.getString("firstname"));
				applicants.setLastName(resultSet2.getString("lastname"));
				applicants.setContactNumber(resultSet2.getString("contactnumber"));
				app[i] = applicants;
				i++;
			}

		} catch (SQLException e) {

			logger.error(e);
		}

		finally {
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
			} catch (SQLException e) {
				logger.error(e);
			}
			try {
				if (resultSet != null) {
					resultSet.close();
				}
			} catch (SQLException e) {
				logger.error(e);
			}
			try {
				if (preparedStatement2 != null) {
					preparedStatement2.close();
				}
			} catch (SQLException e) {
				logger.error(e);
			}
			try {
				if (resultSet2 != null) {
					resultSet2.close();
				}
			} catch (SQLException e) {
				logger.error(e);
			}
		}

		return app;
	}

	@Override
	public Applicants showDetailInfo(int appNo) {
		ResultSet resultSet = null;
		try {
			preparedStatement = connection.prepareStatement("select *  from application where applicationNumber=?");
			preparedStatement.setInt(1, appNo);
			resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				applicants = new Applicants();
				applicants.setApplicationNumber(resultSet.getInt("applicationNumber"));
				applicants.setFirstName(resultSet.getString("firstname"));
				applicants.setLastName(resultSet.getString("lastname"));
				applicants.setContactNumber(resultSet.getString("contactnumber"));
				applicants.setGender(resultSet.getString("gender"));
				applicants.setDateOfBirth((resultSet.getDate("dateOfBirth")));
				applicants.setFatherName(resultSet.getString("fathername"));
				applicants.setEmail(resultSet.getString("email"));
				applicants.setxPercent(resultSet.getInt("xPercent"));
				applicants.setXiiPercent(resultSet.getInt("xiiPercent"));
				applicants.setUgPercent(resultSet.getInt("ugPercent"));
				applicants.setState(resultSet.getString("state"));
				applicants.setCountry(resultSet.getString("country"));
				applicants.setStatus(resultSet.getString("status"));
			}

		} catch (SQLException e) {

			logger.error(e);
		} finally {
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
			} catch (SQLException e) {
				logger.error(e);
			}
			try {
				if (resultSet != null) {
					resultSet.close();
				}
			} catch (SQLException e) {
				logger.error(e);
			}
		}

		return applicants;
	}

	@Override
	public String updateApplicantStatus(int appNo, String st) {
		String cmd = ("update Application set status=? where applicationnumber=? ");
		try {
			preparedStatement = connection.prepareStatement(cmd);

			preparedStatement.setString(1, st);
			preparedStatement.setInt(2, appNo);
			preparedStatement.executeUpdate();

		} catch (SQLException e) {

			logger.error(e);
		} finally {
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
			} catch (SQLException e) {
				logger.error(e);
			}
		}

		return "Application Number " + appNo + " is updated to " + st;

	}

	@Override
	public String checkApplicationStatus(Applicants applicants) {
		ResultSet resultSet = null;
		String status = null;
		try {
			preparedStatement = connection
					.prepareStatement("select status stat from application where applicationnumber=?");
			preparedStatement.setInt(1, applicants.getApplicationNumber());
			resultSet = preparedStatement.executeQuery();
			
			if (resultSet.next()) {
				status = resultSet.getString("stat");
				return status;
			} else {
				status="Not Available";
				return status;
			}
		} catch (SQLException e) {
			logger.info(e);
		} finally {
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				
				
			} catch (SQLException e) {
				logger.info(e);
			}
			try {
				if (resultSet != null) {
					resultSet.close();
				}
				
				
			} catch (SQLException e) {
				logger.info(e);
			}

		}
		return null;

	}
}
