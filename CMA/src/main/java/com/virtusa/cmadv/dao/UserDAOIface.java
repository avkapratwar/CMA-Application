package com.virtusa.cmadv.dao;

import java.util.List;


import com.virtusa.cmadv.entity.Users;

public interface UserDAOIface {
	List<Users> showAllUsers();

	String updateUser(Users user);

	String deleteUser(Users user);

	String addUser(Users user);
	
	String loginValidation(Users users);
	
	List<Users> loginStatus(Users users);
}
