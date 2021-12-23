package com.example.demo.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.CalculatorInterface;
import com.example.demo.UseInterface;


public class Both implements UseInterface {
	
	CalculatorInterface Single;

	@Override
	public int useexpression() {
		// TODO Auto-generated method stub
		return (Single.add(30, 40) + Single.sub(60, 20));

	}

	public void setSingle(CalculatorInterface single) {
		Single = single;
	}
	
}
