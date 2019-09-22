package com.virtusa.cma.dao;

import java.util.List;

import com.virtusa.cma.entity.Users;

public interface UserDAOIface {
	List<Users> showAllUsers();
	String updateUser(Users user);
	String deleteUser(Users user);
	String addUser(Users user);
}
