package com.virtusa.cmadv.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.virtusa.cmadv.dao.UserDAOIface;
import com.virtusa.cmadv.entity.Users;


@Service
public class UserServiceImpl implements UserServiceIface {
	@Autowired
	UserDAOIface userDAOIface;

	public List<Users> showAllUsers() {

		return userDAOIface.showAllUsers();
	}

	public String updateUser(Users user) {

		return userDAOIface.updateUser(user);
	}

	public String deleteUser(Users user) {

		return userDAOIface.deleteUser(user);
	}

	public String addUser(Users user) {

		return userDAOIface.addUser(user);
	}

	public String loginValidationService(Users users) {
		System.out.println(userDAOIface.loginValidation(users));
		return userDAOIface.loginValidation(users);
	}

	public List<Users> loginStatusService(Users users) {
		return userDAOIface.loginStatus(users);
	}


}
