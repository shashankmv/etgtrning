package com.sonata.annotation;

class Showone{
	public void Show() {
		System.out.println("it is my showone");
	}
}

class Showtwo extends Showone{
	@Override
	public void Show() {
		super.Show();
		System.out.println("it is my showtwo");
	}
}
public class myannotation {
public static void main(String[] args) {
	Showtwo s1= new Showtwo();
	s1.Show();
}
}
