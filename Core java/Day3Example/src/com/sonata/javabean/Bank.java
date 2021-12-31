package com.sonata.javabean;

public class Bank {
	private int Acntid;
	private String Accname;
	private double Balance;
	Bank(){}
	public int getAcntid() {
		return Acntid;
	}
	public void setAcntid(int acntid) {
		Acntid = acntid;
	}
	public String getAccname() {
		return Accname;
	}
	public void setAccname(String accname) {
		Accname = accname;
	}
	public double getBalance() {
		return Balance;
	}
	public void setBalance(double balance) {
		Balance = balance;
	}
	@Override
	public String toString() {
		return "Bank [Acntid=" + Acntid + ", Accname=" + Accname + ", Balance=" + Balance + "]";
	}
	
	
}
