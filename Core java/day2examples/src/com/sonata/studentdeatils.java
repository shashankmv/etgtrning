package com.sonata;

public class studentdeatils {
	int stdntid;
	String stdntname;
	double stdntmarks;
	public studentdeatils(){}
	public studentdeatils(int n,String name, double b){
		this.stdntid=n;
		this.stdntname=name;
		this.stdntmarks=b;
	}
	public double markscal(double unittest,double finaltest) {
		double total=this.stdntmarks+unittest+finaltest;
		return total;
	}
	
	public void display() {
		System.out.println(stdntid);
		System.out.println(stdntname);
		System.out.println(stdntmarks);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		studentdeatils u1 = new studentdeatils(36,"name1",233);
		studentdeatils u2 = new studentdeatils();
		
		u2.stdntid=643;
		u2.stdntname="shashank";
		u2.stdntmarks=8500;
		
		u1.display();
		u2.display();

	}

}
