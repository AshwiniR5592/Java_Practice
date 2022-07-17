package com.demo.cc.ccd;

public class Reversd_String {
	
	public static String reverseString(String str){  
	    char ch[]=str.toCharArray();  
	    String rev="";  
	    for(int i=ch.length-1;i>=0;i--){  
	        rev+=ch[i];  
	       
	    }  
	    return rev;  
	    
	}  

	public static void main(String[] args) {
	
		reverseString("Ashwini Rathod");	
		System.out.println(Reversd_String.reverseString("my name is khan"));  
	

}
}