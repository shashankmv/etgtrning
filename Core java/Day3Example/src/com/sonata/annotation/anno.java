package com.sonata.annotation;

@FunctionalInterface
interface Xyz{
	void display();
}

class Emp1 implements Xyz{
	public void myData() {
		System.out.println("my data method");
	}
	@Override
	public void display() {
		System.out.println("Show this one");
	}
}

class EmpShow extends Emp1{
	@Override
	public void myData() {
		System.out.println("my data call method");
	}
}
public class anno {
public static void main(String[] args) {
	EmpShow obj= new EmpShow();
	obj.myData();
}
}
