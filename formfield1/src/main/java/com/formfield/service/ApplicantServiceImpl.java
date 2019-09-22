package com.formfield.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formfield.dao.ApplicantDaoIface;
import com.formfield.model.Applicants;
@Service
public class ApplicantServiceImpl implements ApplicantServiceIface {

	@Autowired
	ApplicantDaoIface applicantDaoImpl;
	
	public ApplicantDaoIface getApplicantDaoImpl() {
		return applicantDaoImpl;
	}

	public void setApplicantDaoImpl(ApplicantDaoIface applicantDaoImpl) {
		this.applicantDaoImpl = applicantDaoImpl;
	}

	public int addApplicantService(Applicants applicants){
		return applicantDaoImpl.addApplicant(applicants);
	}

	public List<Applicants> showAllService() {
		return applicantDaoImpl.showAll();
	}

	public Applicants showParticularService(Applicants applicants) {
		return applicantDaoImpl.showParticular(applicants);
	}

	public String updateStatusService(Applicants applicants) {
		return applicantDaoImpl.updateStatus(applicants);
	}

	public String showStatusService(int ano) {
		return applicantDaoImpl.showStatus(ano);
	}

}
