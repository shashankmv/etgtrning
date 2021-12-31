package com.sonata.JavaStreamArrayExample;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


public class JavaStreamArrayExample {
	public static void main(String args[]) throws Exception{
		 String names[]= {"Shailaja","Saoopa","Jayashree","Mary"};
		
		 Arrays.stream(names)
		 .filter(x->x.startsWith("S"))
		 .sorted()
		 .forEach(System.out::println);
		
		
		 Arrays.stream(new int[] {2,4,5,6,7,8})
		 .map(x->x*x)
		 .average()
		 .ifPresent(System.out::println);
		 
		 
		 
		
		 
		 
		 
	 }
}
