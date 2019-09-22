package com.virtusa.cma.service;

import com.virtusa.cma.entity.Applicants;

public interface ApplicationServiceInterFace {
	int addApplicantService(Applicants applicants);
	Applicants[] showAllApplicantsService();
	Applicants showDetailInfoService(int appNo);
	String updateApplicantStatusService(int appNo, String st);
	String checkApplicationStatusService(Applicants applicants);
}
