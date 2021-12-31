package com.sonata.javabean;

public class teststudent {
public static void main(String [] args) throws Myownexception  {
	adress a1= new adress();
	a1.setCity("chikkaballapur");
	a1.setState("karnataka");
	a1.setPin(563123);
	
	student s1=new student();
	s1.setStdid(90);
	s1.setStdname("shashank");
	s1.setStdmarks(600);
	s1.setObj(a1);
	System.out.println(s1);
	
	int stdmarks=600;
	if(stdmarks < 500) {
		System.out.println("marks is less");
	}
	else {
		System.out.println("marks is more");
	}
	
}
}
