package com.virtusa.cma.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.virtusa.cma.entity.Users;
import com.virtusa.cma.util.DaoConnection;

public class UserDAOImpl implements UserDAOIface {
	static Logger logger = Logger.getLogger(Users.class);
	Connection con;
	PreparedStatement pst = null;
	ResultSet rs = null;

	public UserDAOImpl() {
		con = DaoConnection.getConnection();
	}

	@Override
	public List<Users> showAllUsers() {
		List<Users> user = null;
		
		try {
			pst = con.prepareStatement("select count(*) cnt from usersCollege");
			rs = pst.executeQuery();
			rs.next();
			int cnt = rs.getInt("cnt");
			logger.info("Count " + cnt);
			user = new ArrayList<>(cnt);
			pst = con.prepareStatement("select * from usersCollege");
			rs = pst.executeQuery();
			Users newUser = null;
			

			while (rs.next()) {
				newUser = new Users();

				newUser.setUserName(rs.getString("userId"));
				newUser.setPassword(rs.getString("password"));
				newUser.setType(rs.getString("usertype"));
				newUser.setStatus(rs.getString("status"));
				user.add(newUser);
				}

		} catch (SQLException e) {

			logger.error(e);
		} finally {
			try {
				if (pst != null) {
					pst.close();
				}
			} catch (SQLException e) {
				logger.error(e);

			}

			try {
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
				logger.error(e);

			}
		}

		return user;
	}

	@Override
	public String updateUser(Users user) {
		String cmd = "update  usersCollege set usertype=?,status=? where userId=?";
		try {
			pst = con.prepareStatement(cmd);
			pst.setString(3, user.getUserName());
			pst.setString(1, user.getType());
			pst.setString(2, user.getStatus());
			pst.executeQuery();

		} catch (SQLException e) {
			logger.error(e);
		}

		return "Record Updated Successfully";

	}

	@Override
	public String deleteUser(Users user) {
		String cmd = "delete from usersCollege where userId=?";
		try {
			pst = con.prepareStatement(cmd);
			pst.setString(1, user.getUserName());
			pst.executeQuery();

		} catch (SQLException e) {
			logger.error(e);
		}
		return "Record deleted successfully";
	}

	@Override
	public String addUser(Users user) {
		String res=null;
		try {
			user.setPassword(AutoPwdGen.geekPassword(8));
			String cmd = "Insert into usersCollege values(?,?,?,?) ";
			pst = con.prepareStatement(cmd);
			pst.setString(1, user.getUserName());
			pst.setString(2, user.getPassword());
			pst.setString(3, user.getType());
			pst.setString(4, "active");
			pst.executeUpdate();
			res="Inserted";
		} catch (Exception e) {
			logger.error(e);

		} finally {
			try {
				if (pst != null) {
					pst.close();
				}
			} catch (SQLException e2) {
				logger.error(e2);
			}
		}

		return res;
	}

}
