package com.example.demo;

import java.sql.SQLException;

import org.springframework.scheduling.config.Task;
import org.springframework.stereotype.Component;
@Component
public interface Tasksystemdao {
	public boolean addTask(Task task) throws SQLException;
}
