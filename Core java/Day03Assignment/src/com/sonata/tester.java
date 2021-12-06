package com.sonata;

public class tester extends employee {
	public tester() {
		
	}
	public tester(int i, String j, double k) {
		super(i,j,k);
	}
	
	public double calsal(double HRA,double DA) {
		double total = super.calsal(HRA, DA) + 500;
		return total;
	}
	public static void main(String[] args) {
		tester m1 = new tester(22, "Tester", 89000);
		m1.display();
		System.out.println("Calculated Salary with Salary : " + m1.calsal(200, 500));
	}
}
