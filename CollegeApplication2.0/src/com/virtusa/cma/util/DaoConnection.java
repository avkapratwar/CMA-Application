package com.virtusa.cma.util;

import java.sql.Connection;
import org.apache.log4j.Logger;
import java.util.ResourceBundle;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DaoConnection {

	private DaoConnection() {
		super();

	}
	static Logger logger = Logger.getLogger(DaoConnection.class);

	public static Connection getConnection() {
		ResourceBundle resource = ResourceBundle.getBundle("ResourceBundle");
		String path = resource.getString("DB_DRIVER_CLASS");
		String url = resource.getString("DB_URL");
		String user = resource.getString("DB_USERNAME");
		String pwd = resource.getString("DB_PASSWORD");
		Connection con;
		try {
			Class.forName(path);
			con = DriverManager.getConnection(url, user, pwd);
			return con;
		} catch (ClassNotFoundException | SQLException e) {
			logger.error(e.getMessage());
			return null;
		}
		
	}
	

}
