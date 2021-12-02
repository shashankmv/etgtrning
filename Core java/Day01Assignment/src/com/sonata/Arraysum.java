package com.sonata;

public class Arraysum {
	public static void main(String args[]) {
		
		

		int[] age= new int[6];
		age[0]=1;
		age[1]=2;
		age[2]=3;
		age[3]=4;
		age[4]=5;
		age[5]=6;
		int sum=0;
		
		for(int i=0;i<age.length;i++) {
			sum=sum+age[i];
			
		}
		System.out.println("The sum of array is:"+sum);
	}
}
