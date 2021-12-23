package com.example.demo;

import java.sql.SQLException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


import com.example.demo.impl.MySQLConnectionimpl;
import com.sonata.taskbean.Task;


@SpringBootApplication
public class Springdemo2Application {

	public static void main(String[] args) throws SQLException {
		ApplicationContext ctx = SpringApplication.run(Springdemo2Application.class, args);
		 Tasksystemdao t = (Tasksystemdao) ctx.getBean("taskSystemImpl");
		Task task=new Task();
		task.setName("task insertion");
		task.setDescription("Spring boot");
		t.addTask(task);
	}

}
