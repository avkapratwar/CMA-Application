package com.virtusa.cma.service;

import com.virtusa.cma.dao.ApplicationDaoImpl;
import com.virtusa.cma.entity.Applicants;

public class ApplicationServiceImpl implements ApplicationServiceInterFace {

	ApplicationDaoImpl applicationDaoImpl;
	public ApplicationServiceImpl() {
		applicationDaoImpl=new ApplicationDaoImpl();
	}

	@Override
	public int addApplicantService(Applicants applicants) {
		return applicationDaoImpl.addApplicant(applicants);
	}

	@Override
	public Applicants[] showAllApplicantsService() {
		return applicationDaoImpl.showAllApplicants();
	}

	@Override
	public Applicants showDetailInfoService(int appNo) {
		return applicationDaoImpl.showDetailInfo(appNo);
	}

	@Override
	public String updateApplicantStatusService(int appNo, String st) {
		return applicationDaoImpl.updateApplicantStatus(appNo, st);
	}

	@Override
	public String checkApplicationStatusService(Applicants applicants) {
		return applicationDaoImpl.checkApplicationStatus(applicants);
	}

}
