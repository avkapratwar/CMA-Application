package com.virtusa.cma.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.virtusa.cma.entity.Alumni;
import com.virtusa.cma.util.DaoConnection;

public class AlumniDAOImpl implements AlumniDAOIface {
	Connection con;
	public AlumniDAOImpl() {
		 con = DaoConnection.getConnection();
	}
	static Logger logger = Logger.getLogger(Alumni.class);
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<Alumni> showAllAlumni() {
		
		List<Alumni> alumniAr = null;
			
			PreparedStatement pst = null;
			ResultSet rs = null;
			PreparedStatement pst1 = null;
			ResultSet rs1 = null;
			try {
				
				pst = con.prepareStatement("select count(*) cnt from student where type=?");
				pst.setString(1, "Alumni");
				rs = pst.executeQuery();
				rs.next();
				int cnt = 0;
				cnt = rs.getInt("cnt");
				alumniAr = new ArrayList(cnt);
				logger.info("Count is  " + cnt);
				pst1 = con.prepareStatement(
						"select studentid,firstName,gender,mobileno,email from student where type='Alumni'");
				rs1 = pst1.executeQuery();
				Alumni newAlumni = null;
				

				while (rs1.next()) {
					
					newAlumni = new Alumni();
					newAlumni.setStudentId(rs1.getString("studentid"));
					newAlumni.setFirstName(rs1.getString("firstName"));
					newAlumni.setGender(rs1.getString("gender"));
					newAlumni.setMobileNo(rs1.getString("mobileno"));
					newAlumni.setEmail(rs1.getString("email"));
					alumniAr.add(newAlumni);
					
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
				try {
					if (pst1 != null) {
						pst1.close();
					}
				} catch (SQLException e) {
					logger.error(e);
				}
				try {
					if (rs1 != null) {
						rs1.close();
					}
				} catch (SQLException e) {
					logger.error(e);
				}
			}
			return alumniAr;
	
	}

}
