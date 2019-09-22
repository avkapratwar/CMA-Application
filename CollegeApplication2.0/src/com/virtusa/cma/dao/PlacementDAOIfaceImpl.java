package com.virtusa.cma.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.virtusa.cma.entity.Placement;
import com.virtusa.cma.util.DaoConnection;

public class PlacementDAOIfaceImpl implements PlacementDAOIface {

	static final String ADDPLAC="insert into Placementcalender values(?,?)";
	static final String UPDATE="update Placementcalender set drivedate=? where companyname=?";
	static final String DELPLAC="Delete From placementcalender where companyname=? ";
	static final String VIEWPAR="SELECT * FROM placementcalender where companyname=?";
	Connection con;
	PreparedStatement pst;
	int result;
	DaoConnection dbfactory;

	public PlacementDAOIfaceImpl() {
	con=DaoConnection.getConnection();
	}
	 static Logger logger = Logger.getLogger(PlacementDAOIfaceImpl.class);
	@Override
	public String insertPlacement(Placement p) {
			
						try {
			pst=con.prepareStatement(ADDPLAC);
			pst.setString(1, p.getCompanyName());
			pst.setDate(2, p.getDriveDate());
			if(pst.executeUpdate()>0) {
				con.commit();
			}
			return "Record Inserted...";
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
			}}
			
				
			

	

	@Override
	public String updatePlacement(Placement p) {
		
	    try {
		pst=con.prepareStatement(UPDATE);
		pst.setDate(1, p.getDriveDate());
		pst.setString(2,p.getCompanyName());
		int res=pst.executeUpdate();
		if(res>0){
			con.commit();
			return "Placement details Updated...";

		}

		}

		catch (SQLException e) {
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
		return "not updated";
	}
		


	

	@Override
	public String deletePlacement(String companyname) {
		PreparedStatement pst1=null;
		try {
			pst1 = con.prepareStatement(DELPLAC);
			pst1.setString(1,companyname);
			if(pst1.executeUpdate()>0) {
				con.commit();
				return "placement details deleted";

			}
		} catch (SQLException e) {
			logger.error(e);
			return e.getMessage();
		}
		finally {
			try {
				if(pst1!=null)
				   pst1.close();
			} catch (SQLException e) {
				logger.error(e);
			
			}
		}
		return "cannot delete";
		
			}
	

	@Override
	public Placement showParticularPlacement(String companyname) {
		PreparedStatement pst3=null;
	     ResultSet rs2=null;
		Placement p=new Placement();
		try {
	    
		
		pst3=con.prepareStatement(VIEWPAR);
		pst3.setString(1, companyname);
		 rs2=pst3.executeQuery(); 
	
		while(rs2.next()) {
		p=new Placement();
		p.setCompanyName(companyname);
		p.setDriveDate(rs2.getDate("drivedate"));
	
		}
		} catch (SQLException e) {

			logger.error(e);
		}
		finally {
			try {
				if(pst3!=null)
				   pst3.close();
			} catch (SQLException e) {
				logger.error(e);
			
			}
			try {
				if(rs2!=null)
				   rs2.close();
			} catch (SQLException e) {
				logger.error(e);
			
			}
		}
		
		return p;
		}
	

	@Override
	public Placement[] showPlacement() {
			Placement[] place=null;
			PreparedStatement pst2=null;
			PreparedStatement pst1=null;
			ResultSet rs=null;
			ResultSet rs1=null;
			String cmd="SELECT COUNT(*) cnt FROM placementcalender";
			try {
			pst2=con.prepareStatement(cmd);
		    rs=pst2.executeQuery();
			rs.next();
			int cnt=rs.getInt("cnt");
			place=new Placement[cnt];
			cmd="SELECT * FROM placementcalender";
			pst1=con.prepareStatement(cmd);
			rs1=pst1.executeQuery();
			Placement p=null;
			int i=0;
			while(rs1.next()) {
			p=new Placement();
			p.setCompanyName(rs1.getString("companyname"));
			p.setDriveDate(rs1.getDate("drivedate"));
			place[i]=p;
			i++;
			}
			} catch (SQLException e) {
		      logger.error(e);
			
			}
			finally
			{
				try {
					if(pst2!=null) {
					pst2.close();
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
			return place;
	}
}
