package com.demo.cc.ccd;

public class Sample2 {

	public static void main(String[] args) {
		
		try
		{
			System.out.println("Hello world ");
			int sum=9/0;
			System.out.println("1");
		}
		catch(Exception e)
		{
			System.out.println("3");
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("3");
		}
		finally
		{
			System.out.println("4");
		}

	}

}
