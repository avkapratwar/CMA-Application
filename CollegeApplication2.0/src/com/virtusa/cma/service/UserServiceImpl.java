package com.virtusa.cma.service;

import java.util.List;


import com.virtusa.cma.dao.UserDAOIface;
import com.virtusa.cma.dao.UserDAOImpl;
import com.virtusa.cma.entity.Users;

public class UserServiceImpl implements UserServiceIface {
	UserDAOIface userDAOIface;

	public UserServiceImpl() {
		userDAOIface = new UserDAOImpl();
	}

	@Override
	public List<Users> showAllUsers() {

		return userDAOIface.showAllUsers();
	}

	@Override
	public String updateUser(Users user) {

		return userDAOIface.updateUser(user);
	}

	@Override
	public String deleteUser(Users user) {

		return userDAOIface.deleteUser(user);
	}

	@Override
	public String addUser(Users user) {
		
		return userDAOIface.addUser(user);
	}

}
