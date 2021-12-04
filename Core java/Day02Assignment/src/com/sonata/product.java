package com.sonata;

public class product {
	int prdId;
	String prdName;
	double prdPrice;
	double totalPrice;
	
public product() {
		
	}
	public product(int id,String name,double price) {
		this.prdId = id;
		this.prdName = name;
		this.prdPrice = price;
	}
	
	public void display() {
		System.out.println("Product ID is:" + prdId);
		System.out.println("Product Name is :" + prdName);
		System.out.println("Product Price is:" + prdPrice);
		System.out.println("Product Price with GST is : " + totalPrice);
	}
	
	public double totalPrice() {
		totalPrice = prdPrice + (prdPrice*0.1);
		return totalPrice;
	}
	public static void main(String[] args) {
		product p1 = new product(789, "bat", 2000);
		p1.totalPrice();
		p1.display();
	}

}

