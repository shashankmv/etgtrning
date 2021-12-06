package com.sonta.exception;

public class callmyexception {
	public static void main(String[] args) throws MyException {
		double empSal =89769;
		if(empSal<100000) {
			throw new MyException("Your Salary is less");
		}
		else {
			System.out.println("salry is more.");
		}
	}
}
