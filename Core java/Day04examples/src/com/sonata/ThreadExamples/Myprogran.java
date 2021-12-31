package com.sonata.ThreadExamples;
class My extends Thread{
	public void show(){
		System.out.println("show");
	}
}

class MyOne{
	public void show() {
	 System.out.println("show myOne");	
	}
}

public class Myprogran {
	public static void main(String[] args) {
		My we = new My();
		we.show();
		
		MyOne you=new MyOne();
		you.show();
	}
}
