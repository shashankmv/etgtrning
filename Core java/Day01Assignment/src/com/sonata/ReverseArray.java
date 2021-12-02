package com.sonata;

public class ReverseArray {
	public static void main(String args[]) {
	int[] age= new int[6];
	age[0]=1;
	age[1]=2;
	age[2]=3;
	age[3]=4;
	age[4]=5;
	age[5]=6;
	System.out.println("The array element before reverse:");
	for(int i=0;i<age.length;i++) {
		System.out.println(age[i]);
	}
	
	System.out.println("The array element after reverse:");
	for(int j=age.length-1;j>=0;j--) {
		System.out.println(age[j]);
	}
		
		
	}
	
}
