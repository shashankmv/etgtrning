package com.sonata.ThreadExamples;

public class ThreadExampleOne extends Thread {
	ThreadExampleOne(String n){
		   super(n);
		 start();
	   }
	   
	   public void show() {
		   System.out.println("Show this");
	   }
	   	   
	   public void run()  {
		for(int i=1;i<5;i++) {
				System.out.println("Hi");				
			}
		System.out.println(Thread.currentThread());
	   }
	

	public static void main(String[] args) {
		ThreadExampleOne e1 = new ThreadExampleOne("one");
		
		e1.show();
		
		ThreadExampleOne e2 = new ThreadExampleOne("two");
		
		e2.show();
		
	}
}
