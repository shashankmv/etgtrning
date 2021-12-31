package com.sonata.CollectionExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class CompareExample {
	public static void main(String[] args) {
		ArrayList<Student> n1 = new ArrayList<Student>();
		n1.add(new Student(102,"shailaja",15));
		n1.add(new Student(106,"Jayashree",25));
		n1.add(new Student(104,"Roja",18));
	
    
 Collections.sort(n1);
 for(Student s : n1) {
	 System.out.println(s.stdId +  " " + s.stdName + " "+ s.stdAge); }
	}
}
