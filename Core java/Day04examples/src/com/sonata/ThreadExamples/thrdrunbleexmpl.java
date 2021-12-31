package com.sonata.ThreadExamples;

public class thrdrunbleexmpl {
	public static void main(String[] args) {
		 int n = 10; // Number of threads 
	        for (int i=0; i<n; i++) 
	        { 
	            Thread object = new Thread(new RunnableExample()); 
	            object.start(); 
	        } 

	}
}
