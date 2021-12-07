package com.sonata.fourth;

public class staff extends Employee {
	public double calSal() {
		double total = Employee.BasicPay + Employee.BasicPay * .10;
		return total;
	}

	@Override
	public String toString() {
		return "Staff [" + calSal() + "]";
	}
}
