package com.example.demo.impl;

import org.springframework.stereotype.Component;

import com.example.demo.CalculatorInterface;
@Component
public class Single implements CalculatorInterface {

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public int sub(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

}
