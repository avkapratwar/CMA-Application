package com.virtusa.cma.service;

import com.virtusa.cma.entity.Logins;
import com.virtusa.cma.entity.Users;

public interface LoginServiceIface {
	int loginValidateService(Logins logins);
	String getLoginStatusService(Users users);
}
