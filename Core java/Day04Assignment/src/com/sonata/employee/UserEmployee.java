package com.sonata.employee;
import java.util.ArrayList;
public class UserEmployee {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeImpl emp=new EmployeeImpl();
		
		//Adding new employee
		Employee e=new Employee();
		e.setEmpId(101);
		e.setEmpName("Shyam");
		e.setEmpSalary(45000);
		emp.addEmployee(e);
		
		//Adding new employee
		Employee e1=new Employee();
		e1.setEmpId(102);
		e1.setEmpName("kesava");
		e1.setEmpSalary(4500);
		emp.addEmployee(e1);
		
		
		emp.displayEmployees();
		
		//Removing employee
		emp.deleteEmployee(e);
		
		System.out.println("101 employee is removed");
		emp.displayEmployees();
		
		//Employee year salary
		System.out.println(e1.getEmpName()+" year salary is: "+emp.yearSalary(e1));
	}
}
