package com.virtusa.cma.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.virtusa.cma.entity.Feedback;
import com.virtusa.cma.util.DaoConnection;

public class FeedbackDAOImpl implements FeedbackDAOIface {
	static Logger logger = Logger.getLogger(FeedbackDAOImpl.class);
	Connection con;
	PreparedStatement pst = null;
	ResultSet rs = null;
	
	public FeedbackDAOImpl() {
		con = DaoConnection.getConnection();
	}
	
	@Override
	public String addFeedback(Feedback feedBack) {
		CallableStatement cs=null;
		try {
			cs = con.prepareCall("call prcFeedBack(?,?,?,?,?)");
		
			
			cs.setString(1, feedBack.getUserId());
			cs.setString(2,feedBack.getUserType());
			cs.setString(3,feedBack.getRating());
			cs.setString(4,feedBack.getFeedBack());
			cs.registerOutParameter(5, Types.INTEGER);
			cs.execute();
			con.commit();
			int res = cs.getInt(5);
			
			if (res == 0) {
				return "inserted successfully";
		}
			
		} catch (SQLException e) {

			logger.error(e);
		}
		finally
		{
			try {
				if(cs!=null) {
				cs.close();
				}
			} catch (SQLException e) {
				logger.error(e);
			}
		}
		return null;
	}

	@Override
	public List<Feedback> showAllFeedback() {
		List<Feedback> feedback = null;

		try {
			pst = con.prepareStatement("select count(*) cnt from feedback");
			rs = pst.executeQuery();
			rs.next();
			int cnt = rs.getInt("cnt");
			logger.info("Count " + cnt);
			feedback = new ArrayList<>(cnt);
			pst = con.prepareStatement("select * from feedback");
			rs = pst.executeQuery();
			Feedback newfeed = null;
				while (rs.next()) {
				newfeed = new Feedback();

				newfeed.setUserId(rs.getString("userId"));
				newfeed.setUserType(rs.getString("usertype"));
				newfeed.setRating(rs.getString("rating"));
				newfeed.setFeedBack(rs.getString("feedback"));
				feedback.add(newfeed);
				
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

		return feedback;

	}
}
