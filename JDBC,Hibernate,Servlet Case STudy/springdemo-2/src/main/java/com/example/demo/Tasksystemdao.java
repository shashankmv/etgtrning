package com.example.demo;

import java.sql.SQLException;

import com.sonata.taskbean.Task;



public interface Tasksystemdao {
	public boolean addTask(Task task) throws SQLException;
}
