package com.virtusa.cma.dao;

import com.virtusa.cma.entity.Logins;
import com.virtusa.cma.entity.Users;

public interface LoginDaoIface {
	int loginValidate(Logins logins);
	String loginStatus(Users users);
}
