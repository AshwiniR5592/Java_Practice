package com.demo.cc.ccd;

import java.util.HashMap;

public class Remove_Duplicate {
	
	public static void OccuranceOfCharacter(String str )
	{
		HashMap<Character , Integer> hm=new HashMap<>();
		
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			
			if(hm.get(c)!=null)
			{
				hm.put(c, hm.get(c)+1);
				
			}
			else
			{
				hm.put(c, 1);
				
			}
			
		}
	System.out.println(hm);	
		
		
	}

	public static void main(String[] args) {
		
		OccuranceOfCharacter("KavitaRathod");

	}

}
