package com.demo.cc.ccd;

public class Teststring {
	
	public static void main(String[] args) {
		
		String str="123sadszc@#cbe54654";
		
		StringBuffer s1=new StringBuffer();
		StringBuffer s2=new StringBuffer();
		StringBuffer s3=new StringBuffer();
		
		for(int i=0;i<str.length();i++) 
		{
			if(Character.isDigit(str.charAt(i)))
			{
				s1.append(str.charAt(i));
			}
			else if(Character.isAlphabetic(str.charAt(i)))
			{
				s2.append(str.charAt(i));
			}
			
			else 
			{
				s3.append(str.charAt(i));
				
			}
		}
		
		System.out.println("string s1 =" +s1);
		System.out.println("string s2 =" +s2);
		System.out.println("string s3 =" +s3);
	}
	


}
