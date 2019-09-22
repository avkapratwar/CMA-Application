package com.virtusa.cma.dao;

import com.virtusa.cma.entity.Applicants;

public interface ApplicationDaoInterFace {
	int addApplicant(Applicants applicants);
	Applicants[] showAllApplicants();
	Applicants showDetailInfo(int appNo);
	String updateApplicantStatus(int appNo, String st);
	String checkApplicationStatus(Applicants applicants);
}
