package com.service;

import java.sql.ResultSet;

import com.model.User;

public interface UserService {
	void signUpUser(User u);
	ResultSet loginUser(String email, String password);

}
