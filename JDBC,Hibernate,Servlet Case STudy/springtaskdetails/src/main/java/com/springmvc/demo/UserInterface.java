package com.springmvc.demo;



import java.sql.SQLException;

import com.springmvc.demo.taskbean.UserBean;



public interface UserInterface {
	public boolean addUser(UserBean user) throws SQLException;

}
