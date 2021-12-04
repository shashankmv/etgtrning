package com.sonta;

public class MyOwnAutoshop {
public static void main(String[] args) {
		
		sedan s = new sedan(100, 28000, "Violet");
		s.length = 12;
		ford f1 = new ford(120, 40000, "Indigo");
		f1.year = 2007;
		f1.manufacturerDiscount=10;
		ford f2 = new ford(140, 36000, "Blue");
		f2.year = 2009;
		f2.manufacturerDiscount=8;
		truck t = new truck(80, 60000, "Green");
		t.weight = 2300;
		
		s.display();
		f1.display();
		f2.display();
		t.display();
		
	}
}
