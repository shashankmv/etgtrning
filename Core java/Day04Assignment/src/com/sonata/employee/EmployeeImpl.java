package com.sonata.employee;



public class EmployeeImpl extends Employee implements EmployeeInt {
	public void addEmployee(Employee e) {}
	public void deleteEmployee(Employee e) {}
	public double yearSalary(double amnt) {
		double x=super.empsal*12;
		return x;
	}
	
	public double appSalary(double amnt) {
		double y=super.empsal-1000;
		return y;
	}
	public static void main(String[] args) {
		EmployeeImpl s1=new EmployeeImpl();
		s1.empid=123;
		s1.empname="xyz";
		s1.empsal=5000;
		s1.display();
		s1.addEmployee(s1);
		s1.deleteEmployee(s1);
		
		System.out.println(s1.yearSalary(5000));
		System.out.println(s1.appSalary(5000));
	}
}