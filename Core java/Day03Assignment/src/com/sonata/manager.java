package com.sonata;

public class manager extends employee {
	public manager() {
		
	}
	public manager(int i, String j, double k) {
		super(i,j,k);
	}
	
	public double calSal(double HRA,double DA) {
		double total = super.calsal(HRA, DA) + 8000;
		return total;
	}
	public static void main(String[] args) {
		manager m1 = new manager(102, "Manager", 90000);
		m1.display();
		System.out.println("Calculated Salary with Bonus: " + m1.calsal(200, 500));
	}
}
