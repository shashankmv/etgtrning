package com.sonata;

public class BankDetails {
	int acntNo;
	String acntname;
	double acntBalance;
	
	  
	public void deposit() {
		System.out.println("This is Deposit");
	}
	
	public void withdraw() {
		System.out.println("This is Withdraw");
	}
	
	public void display() {
		System.out.println(acntNo);
		System.out.println(acntname);
		System.out.println(acntBalance);
	}

	public static void main(String[] args) {
BankDetails u1 = new BankDetails();
		
		u1.acntNo=643;
		u1.acntname="savings";
		u1.acntBalance=8500;
		u1.display();
		BankDetails u2 = new BankDetails();
		u2=u1;
		u2.display();
		// TODO Auto-generated method stub

	}

}
