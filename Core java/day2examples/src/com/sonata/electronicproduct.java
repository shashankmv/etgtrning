package com.sonata;

public class electronicproduct extends product {
	int epid;
	String epname;
	double eprice;
	//public electronicproduct(int n,String name, double b){
		//this.epid=n;//
		//this.epname=name;//
		//this.eprice=b;//
	//}//
	public double eptotal(double epcost,double toyscost) {
		double total=(super.ptotal(epcost,toyscost))*0.02+(super.ptotal(epcost,toyscost));
		return total;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		electronicproduct c2 =new electronicproduct();
		System.out.println(c2.ptotal(200, 300));
	
	}
}
