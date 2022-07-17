package com.demo.cc.ccd;

public class RemoveSpaces {

	public static void main(String[] args) {
	

   String str ="I am working for softeare trsting ";
   str=str.replaceAll("\\s+","");
		System.out.print("String is "+str);

	}

}
