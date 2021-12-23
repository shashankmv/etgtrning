package com.example.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Springdemo1Application {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(Springdemo1Application.class, args);
		BeanFactory factory=new ClassPathXmlApplicationContext("beans.xml");
		UseInterface cal=(UseInterface) factory.getBean("both");
		System.out.println(cal.useexpression());
	}

}
