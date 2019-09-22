package com.virtusa.cmadv.service;

import java.util.List;

import com.virtusa.cmadv.entity.Users;

public interface UserServiceIface {
	List<Users> showAllUsers();
	String updateUser(Users user);
	String deleteUser(Users user);
	String addUser(Users user);
	String loginValidationService(Users users);
	List<Users> loginStatusService(Users users);
}
