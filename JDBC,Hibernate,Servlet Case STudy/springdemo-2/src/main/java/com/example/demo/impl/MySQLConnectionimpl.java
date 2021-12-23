package com.example.demo.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.MySQLConnection;


@Component
public class MySQLConnectionimpl implements MySQLConnection {
@Autowired
MySQLConnection mySQLConnection;
	public Connection getConnection() {
		c
	}

}
