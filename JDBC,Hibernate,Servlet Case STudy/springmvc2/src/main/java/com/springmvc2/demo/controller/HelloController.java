package com.springmvc2.demo.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.springmvc2.demo.TaskSystemDAO;
import com.springmvc2.demo.model.Task;
@Component
public class HelloController {
	@Autowired
	TaskSystemDAO taskSystemDAOImpl;
	@RequestMapping("/")
	public String sayHello(Model model) {
		
		return "insert";
	}
	
	@RequestMapping("/insert")
	public String sayHello1(Model model,@RequestParam("taskname") String taskname ) throws SQLException  {
		Task t=new Task();
		t.setName(taskname);
		boolean r=taskSystemDAOImpl.addTask(t);
		if(r==true) {
			return "success";
			}
		else {
		model.addAttribute("name","Insertion unsuccessful");
		return "insert";
		}
	}
}
