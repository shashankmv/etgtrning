package com.sonata;

public class product {
	int pid;
	String pname;
	double pprice;
	//public product(){}//
	
	//public product(int n,String name, double b){//
		//this.pid=n;//
		//this.pname=name;//
		//this.pprice=b;//
	//}//
	public double ptotal(double elctnicpcost,double toyscost) {
		double total=elctnicpcost+toyscost;
		return total;
	}
	public void display() {
		System.out.println(pid);
		System.out.println(pname);
		System.out.println(pprice);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//product u1 = new product(36,"name1",233);//
		//product u2 = new product();//
		
		//u2.pid=643;//
		//u2.pname="shashank";//
		//u2.pprice=8500;//
		
		//u1.display();//
		//u2.display();//

}
}
