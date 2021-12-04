package com.sonta;

public class car {
	int speed;
	double  regularPrice;
	String color;
	public car(int s, double prc, String col) {
		this.color=col;
		this.regularPrice=prc;
		this.speed=s;
	}
	public double getsalePrice() {
		double price = regularPrice;
		return price;
	}
}

