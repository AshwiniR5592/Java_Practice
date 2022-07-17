package com.demo.cc.ccd;

public class Testing {
	
	public static void main(String[] args) {
		
		
		testFlow();
		
	}
	
public static void testFlow()
{
	try
	{
		System.out.println("In try block");
		System.exit(0);
	}
	catch(Exception e)
	{
		
       System.out.println("In catch block ");
	}
	finally
	{
	 System.out.println("In finally bnlock ");	
	
	}



}

}
