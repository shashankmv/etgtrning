package com.springmvc.demo.impl;



import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



import com.springmvc.demo.MySQLConnection;
import com.springmvc.demo.UserInterface;
import com.springmvc.demo.taskbean.UserBean;

@Component
public class UserImpl implements UserInterface {
	@Autowired
	MySQLConnection mySQLConnectionImpl;
	
	
	public boolean addUser(UserBean user) throws SQLException {
		boolean flag = false;
		
		Connection con =mySQLConnectionImpl.getConnection();
		String sql = "insert into usedetails (name,description,ownerid) values(?,?,?)";
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, user.getName());
		
		st.setInt(3, user.getOwnerId());
		st.setString(2, user.getDescription());
		
		
		
		int r = st.executeUpdate();
		if (r >0)
			return true;
		else 
			return false;
		
		
	}

	
}
