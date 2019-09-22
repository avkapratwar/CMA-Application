package com.virtusa.cma.entity;

import java.sql.Date;

public class Placement {
	private String companyName;
	private Date driveDate;
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public Date getDriveDate() {
		return driveDate;
	}
	public void setDriveDate(Date driveDate) {
		this.driveDate = driveDate;
	}
}
