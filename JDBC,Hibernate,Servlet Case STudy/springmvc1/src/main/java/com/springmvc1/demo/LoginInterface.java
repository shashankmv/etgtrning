package com.springmvc1.demo;

import java.sql.SQLException;

import org.springframework.stereotype.Component;

import com.springmvc1.demo.model.User;


@Component
public interface LoginInterface {
	public boolean  ValidateUser( String pword) throws SQLException;
}
