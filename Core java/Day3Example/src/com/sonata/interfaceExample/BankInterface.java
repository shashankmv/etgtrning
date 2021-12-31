package com.sonata.interfaceExample;

public interface BankInterface {
	public double withdraw(double amount);
	public double deposit(double amount);
	
	default void newmethod() {
		System.out.println("newly added default method");
		gen();
	}
	
	default void mymethod() {
		System.out.println("newly added default method");
		gen();
	}
	
	private void gen() {
		System.out.println("Private method");
	
	}
	
	static void anotherNewmethod() {
		System.out.println("newly added static method");
	}
}
