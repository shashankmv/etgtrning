package com.sonata.student;

public class Student {
	String name; 
	   
	   int marks; 
	   public String getName() {
	      return name; 
	   } 
	 int getMarks() { 
	      return marks; 
	   } 
	   Student(String n, int m){ 
	      name = n; 
	      marks=m; 
	   } 
	   @Override public String toString() {     
	      return ("Student[ "+"Name:"+this.getName()+             
	                                  
	              " marks: "+ this.getMarks()+"]"); 
	   }
}
