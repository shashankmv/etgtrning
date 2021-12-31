package com.sonata.JavaStreamArrayExample;

import java.util.stream.IntStream;
import java.util.stream.Stream;
public class JavaStreamsExample {
public static void main(String[] args) {
		
		//skip the range
		IntStream.range(1,10).skip(1).forEach(x -> System.out.println(x));
		
		//sum of the range 
		System.out.println(IntStream.range(1,10).sum());
		
		//stream with findFirst and sorted
		
		Stream.of("Ava","Apple","Alber")
		.sorted()
		.findFirst()
		.ifPresent(System.out :: println);
		
		

	}
}
