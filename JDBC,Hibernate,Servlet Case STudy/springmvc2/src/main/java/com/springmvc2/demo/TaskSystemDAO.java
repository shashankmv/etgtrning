package com.springmvc2.demo;

import java.sql.SQLException;

import org.springframework.stereotype.Component;

import com.springmvc2.demo.model.Task;

@Component
public interface TaskSystemDAO {
	public boolean addTask(Task task) throws SQLException;
}
