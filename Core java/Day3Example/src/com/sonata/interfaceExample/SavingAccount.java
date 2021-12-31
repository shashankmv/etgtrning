package com.sonata.interfaceExample;

public class SavingAccount extends Bank implements BankInterface {
public double withdraw(double amount) {
	double x= super.Balance-amount;
	return x;
}
public double deposit(double amount) {
	double y= super.Balance+amount;
	return y;
}
public static void main(String[] args) {
	SavingAccount s1=new SavingAccount();
	s1.Acntid=123;
	s1.Accname="xyz";
	s1.Balance=1000;
	s1.display();
	s1.newmethod();
	s1.mymethod();
	
	System.out.println(s1.deposit(5000));
	
}
}
