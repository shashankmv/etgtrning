package com.sonata.fourth;

public class technical extends Employee {
	public double calSal() {
		double total = Employee.BasicPay + Employee.BasicPay * .12;
		return total;
	}

	@Override
	public String toString() {
		return "TechnicalEmployee [" + calSal() + "]";
	}
}
