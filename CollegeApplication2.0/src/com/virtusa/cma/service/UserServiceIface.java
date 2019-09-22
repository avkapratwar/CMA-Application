package com.virtusa.cma.service;

import java.util.List;

import com.virtusa.cma.entity.Users;

public interface UserServiceIface {
	List<Users> showAllUsers();
	String updateUser(Users user);
	String deleteUser(Users user);
	String addUser(Users user);
}
