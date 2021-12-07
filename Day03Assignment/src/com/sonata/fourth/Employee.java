package com.sonata.fourth;

public class Employee {
	private int empid;
	private String empname;
	private double basicpay;
	private int noofleaves;
	address obj;
	public static int noOfLeaves;
	public static double BasicPay;
	double calSal() {
		return 0;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public double getBasicpay() {
		return basicpay;
	}
	public void setBasicpay(double basicpay) {
		this.basicpay = basicpay;
	}
	public int getNoofleaves() {
		return noofleaves;
	}
	public void setNoofleaves(int noofleaves) {
		this.noofleaves = noofleaves;
	}
	public address getObj() {
		return obj;
	}
	public void setObj(address obj) {
		this.obj = obj;
	}
	public static int getNoOfLeaves() {
		return noOfLeaves;
	}
	public static void setNoOfLeaves(int noOfLeaves) {
		Employee.noOfLeaves = noOfLeaves;
	}
	public static double getBasicPay() {
		return BasicPay;
	}
	public static void setBasicPay(double basicPay) {
		Employee.BasicPay = basicPay;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", basicpay=" + basicpay + ", noofleaves="
				+ noofleaves + ", obj=" + obj + "]";
	}
	
	
}
