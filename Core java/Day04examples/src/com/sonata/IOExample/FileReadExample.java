package com.sonata.IOExample;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class FileReadExample {
	public static void main(String[] args) throws IOException {
		 //Enter data using BufferReader 
       BufferedReader reader =  
                  new BufferedReader(new InputStreamReader(System.in)); 
        
       // Reading data using readLine 
       String name = reader.readLine(); 
 
       // Printing the read line 
       System.out.println(name);   
       /* through console 
       String name = System.console().readLine(); 
       
       System.out.println(name);*/ 

	}
}
