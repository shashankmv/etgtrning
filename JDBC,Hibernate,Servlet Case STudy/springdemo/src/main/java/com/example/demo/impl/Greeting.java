package com.example.demo.impl;

import org.springframework.stereotype.Component;

import com.example.demo.GreetingInterface;
@Component
public class Greeting implements GreetingInterface {

	@Override
	public String sayGreeting(String name) {
		
		return "Good morning " +name;
	}

}
