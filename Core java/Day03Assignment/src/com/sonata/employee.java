package com.sonata;

public class employee {
	int empId;
	String empName;
	double empSal;
	public employee() {
		// TODO Auto-generated constructor stub
	}
	public employee(int id,String name,double sal) {
		this.empId = id;
		this.empName = name;
		this.empSal = sal;
	}
	public void display() {
		System.out.println("ID :" + empId);
		System.out.println("Name :" + empName);
		System.out.println("Salary :" + empSal);
	}
	public double calsal(double HRA,double DA) {
		double total = this.empSal + HRA + DA;
		return total;
	}
}
