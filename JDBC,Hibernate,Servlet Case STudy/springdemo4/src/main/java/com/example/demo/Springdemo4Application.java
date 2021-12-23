package com.example.demo;

import java.sql.SQLException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Springdemo4Application {

	public static void main(String[] args) throws SQLException {
		ApplicationContext ctx = SpringApplication.run(Springdemo4Application.class, args);
		LoginInterface l=(LoginInterface) ctx.getBean("loginImpl");
		User u =new User();
		u.setName("ravishankar");
		u.setPassword("dhoni");
		l.ValidateUser(u) ;
		if(l.ValidateUser(u)==true) {
			System.out.println("Valid user");
		}
		else {
			System.out.println(" Not a Valid user");
		}
	}

}
