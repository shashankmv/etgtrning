package com.sonata;

public class developer extends employee {
	
		public developer() {}
		public developer(int i, String j, double k) {
			super(i,j,k);
		}
		
		public double calsal(double HRA,double DA) {
			double total = super.calsal(HRA, DA) + 10000;
			return total;
		}
		public static void main(String[] args) {
			developer m1 = new developer(567, "Developer", 45000);
			m1.display();
			System.out.println("Calculated Salary with Bonus: " + m1.calsal(890, 678));
		}
	}

