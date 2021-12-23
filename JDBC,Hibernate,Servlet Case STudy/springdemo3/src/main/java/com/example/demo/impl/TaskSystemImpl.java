package com.example.demo.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.config.Task;
import org.springframework.stereotype.Component;

import com.example.demo.Tasksystemdao;
@Component
public class TaskSystemImpl implements Tasksystemdao {
@Autowired
MySQLConnectionImpl mySQLConnectionImpl;
@Override
public boolean addTask(Task task) throws SQLException{
	boolean flag = false;
	Connection c=mySQLConnectionImpl.getConnection();
	
	String sql = "insert into tsk (taskId,tname) values(?,?)";
	PreparedStatement st = c.prepareStatement(sql);
	st.setInt(1, task.getTaskId());
	st.setString(2, task.getName());
	int r = st.executeUpdate();
	if (r >0)
		return true;
	else 
		return false;
}
}
