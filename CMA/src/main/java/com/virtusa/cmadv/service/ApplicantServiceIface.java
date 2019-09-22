package com.virtusa.cmadv.service;

import java.util.List;

import com.virtusa.cmadv.entity.Applicants;

public interface ApplicantServiceIface {
	int addApplicantService(Applicants applicants);
	List<Applicants> showAllService();
	Applicants showParticularService(Applicants applicants);
	String updateStatusService(Applicants applicants);
	String showStatusService(int ano);
} 