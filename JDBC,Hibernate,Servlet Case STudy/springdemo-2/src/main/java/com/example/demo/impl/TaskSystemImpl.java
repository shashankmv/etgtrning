package com.example.demo.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

import com.example.demo.MySQLConnection;
import com.example.demo.Tasksystemdao;
import com.sonata.taskbean.Task;

@Component
public class TaskSystemImpl implements Tasksystemdao {
	@Autowired
	MySQLConnection mySQLConnectionimpl;
	public boolean addTask(Task task) throws SQLException{
		boolean flag = false;
		Connection c=mySQLConnectionimpl.getConnection();
		
		String sql = "insert into tsk (tname,description) values(?,?)";
		PreparedStatement st = c.prepareStatement(sql);
		st.setString(1, task.getName());
		st.setString(2, task.getDescription());
		int r = st.executeUpdate();
		if (r >0)
			return true;
		else 
			return false;
	}
	
	
}
