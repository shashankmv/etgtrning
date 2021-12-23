package com.example.demo;

import java.sql.SQLException;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;



public interface LoginInterface {
	public boolean  ValidateUser(User u) throws SQLException;
	
}
