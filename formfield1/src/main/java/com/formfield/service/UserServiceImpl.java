package com.formfield.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formfield.dao.UserDaoIface;
import com.formfield.model.Users;

@Service
public class UserServiceImpl implements UserServiceIface{
	@Autowired
	UserDaoIface userDaoIface;
	
	public String loginValidationSerice(Users users) {
		return userDaoIface.loginValidation(users);
	}

}
