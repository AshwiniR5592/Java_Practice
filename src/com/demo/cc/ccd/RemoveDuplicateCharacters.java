package com.demo.cc.ccd;

import java.util.LinkedHashSet;

public class RemoveDuplicateCharacters {

	public static void main(String[] args) {
		
      String str="asadgeasga";
      removeDuplicates(str);
	}

	private static void removeDuplicates(String str) {
		
		
		LinkedHashSet<Character> set=new LinkedHashSet<>();
		
		for(int i=0;i<str.length();i++)
		    set.add(str.charAt(i));
		
		for(Character ch :set)
			System.out.print(ch);
		
		
		
	}

}
