package com.sonata.javabean;

import com.sonata.interfaceExample.BankInterface;
import com.sonata.javabean.*;

public class currentacnt extends com.sonata.javabean.Bank implements BankInterface {
public double withdraw(double amount) {
	double d1=super.getBalance()-amount;
	return d1;
}
public double deposit(double amount) {
	double d2=super.getBalance()+amount;
	return d2;
}
public static void main(String[] args) {
	currentacnt c1= new currentacnt();
	c1.setAcntid(678);
	c1.setAccname("show this");
	c1.setBalance(1000);
	 double depo=c1.deposit(5000);
     System.out.println(depo);
	
}
}
