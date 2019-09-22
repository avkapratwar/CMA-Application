package com.formfield.dao;

import java.util.List;

import com.formfield.model.Applicants;

public interface ApplicantDaoIface {
	int addApplicant(Applicants applicants);
	List<Applicants> showAll();
	Applicants showParticular(Applicants applicants);
	String updateStatus(Applicants applicants);
	String showStatus(int ano);
}
