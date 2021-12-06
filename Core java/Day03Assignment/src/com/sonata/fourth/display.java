package com.sonata.fourth;



public class display {
	public static void main(String [] args)  {
		address a1= new address();
		a1.setDoorno(89);
		a1.setStreet("karnataka");
		a1.setCity("chintamani");
		a1.setPincode(563123);
		
	Employee s1=new Employee();
		s1.setEmpid(90);
		s1.setEmpname("shashank");
		s1.setBasicpay(600);
		s1.setNoofleaves(34);
		s1.setObj(a1);
		System.out.println(s1);
}
}
