package com.sonata.service.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.sonata.service.MySQLConnection;

public class MySQLConnectionImpl implements MySQLConnection {

	public Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","admin@123");

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


