package com.springmvc2.demo.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

import com.springmvc2.demo.MySQLConnectionInterface;
import com.springmvc2.demo.TaskSystemDAO;
import com.springmvc2.demo.model.Task;
@Component
public class TaskSystemDAOImpl implements TaskSystemDAO {
	@Autowired
	MySQLConnectionInterface mySQLConnectionImpl;
	public boolean addTask(Task task) throws SQLException {
		boolean flag = false;

		Connection con =mySQLConnectionImpl.getConnection();
		String sql = "insert into taskdeatils (taskid,taskname,Ownerid) values(?,?,?)";
		PreparedStatement st =  con.prepareStatement(sql);
		st.setInt(1, task.getTaskId());
		st.setString(2, task.getName());
		st.setInt(3, task.getOwnerId());
		
		int r = st.executeUpdate();
		if (r >0)
			return true;
		else 
			return false;
}
	}

