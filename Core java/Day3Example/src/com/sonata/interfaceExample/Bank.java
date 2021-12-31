package com.sonata.interfaceExample;

public class Bank {
int Acntid;
String Accname;
double Balance;

public Bank() {}
public Bank(int accid,String accname, double balance) {
	Acntid=accid;
	Accname=accname;
	Balance=balance;
}

void display() {
	System.out.println(this.Acntid);
	System.out.println(this.Accname);
	System.out.println(this.Balance);
	
}

}
