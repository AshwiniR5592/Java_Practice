package com.demo.cc.ccd;

public class Searchwordinstring {

	public static void main(String[] args) {
		 
		      String strOrig = "Hello readers";
		      int intIndex = strOrig.indexOf("readers");
		      
		      if(intIndex == - 1) {
		         System.out.println("Hello not found");
		      } else {
		         System.out.println("Found Hello at index " + intIndex);
		      }

	}

}
