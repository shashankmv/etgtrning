package com.sonta;

public class sedan extends car{
	int length;
	public sedan(int s, double prc, String col) {
		super(s,prc,col);
	}
	public double getsalePrice() {
		double price ;
		if(length>20) {
			 price = regularPrice - (regularPrice*0.05);
		}
		else {
			 price = regularPrice - (regularPrice*0.1);
		}
		return price;
	}
	public void display() {
		System.out.println("Sedan Details ");
		System.out.println("Sedan length : " + length);
		System.out.println("Sedan speed : " + speed);
		System.out.println("Sedan color : " + color);
		System.out.println("Sedan original Price : " + regularPrice);
		System.out.println("Sedan SalePrice : " + getsalePrice());
		System.out.println();
	}
}
