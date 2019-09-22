package com.virtusa.cma.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

import org.apache.log4j.Logger;

import com.virtusa.cma.entity.Logins;
import com.virtusa.cma.entity.Users;
import com.virtusa.cma.util.DaoConnection;

public class LoginDaoImpl implements LoginDaoIface{
	 static Logger logger = Logger.getLogger(LoginDaoImpl.class);


	Connection connection=null;
	public LoginDaoImpl() {
		connection = DaoConnection.getConnection();
	}

	@Override
	public int loginValidate(Logins logins) {
		CallableStatement callableStatement=null;
		try {
		callableStatement = connection.prepareCall("call prcStudentLogin(?,?,?,?)");
		callableStatement.setString(1, logins.getUserId());
		callableStatement.setString(2, logins.getUserPassword());
		callableStatement.setString(3, logins.getUserType());
		callableStatement.registerOutParameter(4, Types.INTEGER);
		callableStatement.execute();
		return callableStatement.getInt(4);
		} catch (SQLException e) {
			logger.error(e);
		}
		finally
		{
			try {
				if(callableStatement!=null) {
				callableStatement.close();
				}
			} catch (SQLException e) {
				logger.error(e);
			}
		}
		return -1;
	}

	@Override
	public String loginStatus(Users users) {
		CallableStatement callableStatement=null;
		try {
			callableStatement = connection.prepareCall("call prcsearch(?,?,?)");
			callableStatement.setString(1, users.getUserName());
			callableStatement.registerOutParameter(2, Types.INTEGER);
			callableStatement.registerOutParameter(3, Types.VARCHAR);
			callableStatement.execute();
			if(callableStatement.getInt(2)==0) {
				return "your pasword is : "+callableStatement.getString(3);
			}
			} catch (SQLException e) {
				logger.error(e);
			}
			finally
			{
				try {
					if(callableStatement!=null) {
					callableStatement.close();
					}
				} catch (SQLException e) {
					logger.error(e);
				}
			}
			return "Login not created please contact admin";
	}

}
