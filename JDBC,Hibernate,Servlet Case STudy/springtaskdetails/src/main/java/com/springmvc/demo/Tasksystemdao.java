package com.springmvc.demo;

import java.sql.SQLException;

import com.springmvc.demo.taskbean.Task;


public interface Tasksystemdao {
	public boolean addTask(Task task) throws SQLException;
}
