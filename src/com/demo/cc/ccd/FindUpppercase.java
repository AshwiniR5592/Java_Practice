package com.demo.cc.ccd;

public class FindUpppercase {

	public static void main(String[] args) {
	String str="How To Print Upper chracaters in Java";

	for(int i=0;i<str.length();i++)
	{
		if(Character.isUpperCase(str.charAt(i)))
{
         System.out.println(str.charAt(i));

}
		
	}	
	
	}

}
