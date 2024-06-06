package com.service;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.db.UserDatabase;
import com.model.User;

public class UserServiceImpl implements UserService{

	@Override
	public void signUpUser(User u) {
		String sql = "insert into User(Name,Email,Phone,Password) values('"+u.getName()+"','"+u.getEmail()+"','"+u.getPhone()+"','"+u.getPassword()+"')";
		
		try {
			Statement stm = UserDatabase.getConnection().createStatement();
			stm.execute(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public ResultSet loginUser(String em, String pass) {
		String sql = "select * from user where email = '"+ em +"' and password = '"+ pass +"'";
		try {
			Statement stm = UserDatabase.getConnection().createStatement();
			ResultSet rs = stm.executeQuery(sql);
			return rs;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
		
	}

}