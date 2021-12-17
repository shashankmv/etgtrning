package com.sonata.service;

import java.sql.SQLException;

public interface LoginInterface {
	public boolean  validateUser(String uname, String pword) throws SQLException;
}
