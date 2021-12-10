package com.sonata.employee;

public class Employee {
public int empid;
public String empname;
public double empsal;

public Employee() {};

public Employee(int id,String name,double sal) {
	this.empid=id;
	this.empname=name;
	this.empsal=sal;

}

void display() {
	System.out.println(this.empid);
	System.out.println(this.empname);
	System.out.println(this.empsal);
	
}


}
