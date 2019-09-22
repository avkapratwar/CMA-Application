package com.virtusa.cma.dao;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.apache.log4j.Logger;

import com.virtusa.cma.entity.StaffMeetings;
import com.virtusa.cma.util.DaoConnection;

public class StaffMeetingsIfaceImpl implements StaffMeetingsIface {
	Connection con;
	PreparedStatement pst;
	int result;
	DaoConnection dbfactory;
	ResultSet rs;
	PrintWriter out;
	static final String ADDM="insert into staffmeetings values(?,?)";
	static final String SHOWM="select * from staffmeetings where meetingtype=?";
	 public StaffMeetingsIfaceImpl() {
		 con=DaoConnection.getConnection();
	}
	 static Logger logger = Logger.getLogger(StaffMeetingsIfaceImpl.class);

	@Override
	public String insertMeeting(StaffMeetings s) {
		try {
			
			pst=con.prepareStatement(ADDM);
			pst.setString(1, s.getMeetingType());
			pst.setDate(2, s.getMeetingDate());
			if(pst.executeUpdate()>0) {
				con.commit();
				return "Record Inserted...";
}
			} catch (Exception e) {
                  logger.error(e);
			return e.getMessage();
			}
			finally {
				try {
					if(pst!=null)
					   pst.close();
				} catch (SQLException e) {
					logger.error(e);
				}
			}
		return "record not inserted";
		}

	@Override
	public ArrayList<StaffMeetings> showMeeting(StaffMeetings p) {
		PreparedStatement pst1=null;
		ResultSet rs1=null;
		
		ArrayList<StaffMeetings> l=new ArrayList<>();
		String cmd="SELECT COUNT(*) cnt FROM staffmeetings";
		try {
		pst=con.prepareStatement(cmd);
	    rs=pst.executeQuery();
		rs.next();
		
		} catch (SQLException e) {
		      logger.error(e);	
				}
		try {
		pst1=con.prepareStatement(SHOWM);
		pst1.setString(1, p.getMeetingType());
		rs1=pst1.executeQuery();
		while(rs1.next()) {
		p.setMeetingType(rs1.getString("meetingtype"));
		p.setMeetingDate(rs1.getDate("meetingdate"));
		l.add(p);		
		}
		return l;
		} catch (SQLException e) {
	      logger.error(e);
		
		}
		finally
		{
			try {
				if(pst!=null) {
				pst.close();
				}
			} catch (SQLException e) {
				logger.error(e);
			}
			try {
				if(rs!=null) {
				rs.close();
				}
			} catch (SQLException e) {
				logger.error(e);
			}
			try {
				if(pst1!=null) {
				pst1.close();
				}
			} catch (SQLException e) {
				logger.error(e);
			}
			try {
				if(rs1!=null) {
			    rs1.close();
				}
			} catch (SQLException e) {
				logger.error(e);
			}
		}
		return l;
				
				
		
}
}
