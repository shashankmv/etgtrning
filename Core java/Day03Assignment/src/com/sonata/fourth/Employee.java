package com.sonata.fourth;

public class Employee {
	private int empid;
	private String empname;
	private double basicpay;
	private int noofleaves;
	address obj;
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
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", basicpay=" + basicpay + ", noofleaves="
				+ noofleaves + ", obj=" + obj + "]";
	}
	
}
