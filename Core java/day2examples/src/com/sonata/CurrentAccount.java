package com.sonata;

public class CurrentAccount extends studentdeatils {
	
	CurrentAccount(int a,String b,double c){
		super(a,b,c);
		
	}
     CurrentAccount(){}
     
     public double markscal(double unittest,double finaltest) {
    	 double total=super.markscal(unittest,finaltest)+600;
    	 return total;
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		CurrentAccount c2=new CurrentAccount(466,"xyz",234);
		System.out.println(c2.markscal(200, 300));
		c2.display();
	}

}
