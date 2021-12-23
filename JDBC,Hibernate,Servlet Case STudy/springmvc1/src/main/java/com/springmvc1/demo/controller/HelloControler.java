package com.springmvc1.demo.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springmvc1.demo.LoginInterface;
import com.springmvc1.demo.MySQLConnectionInterface;
@Controller
public class HelloControler {
	@Autowired
	LoginInterface loginImpl;
	
	@RequestMapping("/")
	public String sayHello(Model model) {
		
		return "login";
	}
	
	
	@RequestMapping("/login")
	public String sayHello1(Model model,@RequestParam("username") String username,@RequestParam("password") String password ) throws SQLException  {
		
		boolean r=loginImpl.ValidateUser(password);
		if(r==true) 
			return "success";
		
		model.addAttribute("name","login unsuccessful");
		return "login";
		
	}

}
