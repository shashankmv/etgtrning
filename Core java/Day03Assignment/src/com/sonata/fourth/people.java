package com.sonata.fourth;

public class people {
	public static void main(String[] args) {
		Employee em = new Employee() {
			
			@Override
			double calSal() {
				
				return 0;
			}
		};
		em.setBasicPay(2000);
	technical t = new technical();
		System.out.println(t);
		staff stf = new staff();
		System.out.println(stf);
	}
}
