package com.sonata.JobTracker.Dao.Impl;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.MysqlConnection;
public class MyConnectionImpl implements MysqlConnection {
	public Connection connectToMySQL() {
		Connection con = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (SQLException e) {
		// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
}
