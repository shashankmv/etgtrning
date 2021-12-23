package com.springmvc.demo;

import java.sql.SQLException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.springmvc.demo.taskbean.Task;
import com.springmvc.demo.taskbean.UserBean;


@SpringBootApplication
public class SpringtaskdetailsApplication {

	public static void main(String[] args) throws SQLException {
		ApplicationContext ctx = SpringApplication.run(SpringtaskdetailsApplication.class, args);
		
		 Tasksystemdao t = (Tasksystemdao) ctx.getBean("taskSystemDAOImpl");
		Task task=new Task();
		task.setName("task insertion");
		task.setDescription("Spring boot");
		t.addTask(task);
		UserInterface user=(UserInterface) ctx.getBean("userImpl");
		UserBean u1=new UserBean();
		u1.setName("Shashank");
		u1.setDescription("shashankmv");
		
		user.addUser(u1);
	}

}
