package com.demo.cc.ccd;

public class ReversewordinString {

	public static void main(String[] args) {
		
		System.out.println(ReversewordinString.reverseWord("my name is ashwini   "));  
		
	}
		
		public static String reverseWord(String str){  
		    String words[]=str.split("\\s");  
		    String reverseWord="";  
		    for(String w:words){  
		        StringBuilder sb=new StringBuilder(w);  
		        sb.reverse();  
		        reverseWord+=sb.toString()+" ";  
		    }  
		    return reverseWord.trim();  
		}  

	}


