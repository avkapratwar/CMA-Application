package com.virtusa.cma.service;

import com.virtusa.cma.dao.LoginDaoImpl;
import com.virtusa.cma.entity.Logins;
import com.virtusa.cma.entity.Users;

public class LoginServiceImpl implements LoginServiceIface{

	
	LoginDaoImpl loginDaoImpl;
	public LoginServiceImpl() {
		super();
		loginDaoImpl = new LoginDaoImpl();
	}

	@Override
	public int loginValidateService(Logins logins) {
		return loginDaoImpl.loginValidate(logins);
	}

	@Override
	public String getLoginStatusService(Users users) {
		return loginDaoImpl.loginStatus(users);
	}

}
