package com.demo.cc.ccd;

import java.util.ArrayList;

public class FindoddIndexString {

	public static void main(String[] args) {
		
	
		String s = "ash aksh aai nikhil nana nani bba";
		s=occurenceofOddIndex(s);
		System.out.println(s);
	}

	private static String occurenceofOddIndex(String str) {
		
		 String new_string = "";
		  
	        for (int i = 0; i < str.length(); i++) {
	  
	           
	            if (i % 2 == 0)
	  
	            {
	                continue;
	  
	            }
	            else 
	            {
	            new_string += str.charAt(i);
	            }
	        }
	  
	       
	        return new_string;

		
		
		
		
		
		        }
	
		 
}