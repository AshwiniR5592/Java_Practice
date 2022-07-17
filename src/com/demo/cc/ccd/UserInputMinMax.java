package com.demo.cc.ccd;

import java.util.Scanner;

public class UserInputMinMax {

	public static void main(String[] args) {
		int temp;
		int min;
		int max;
		
		
		Scanner scan=new Scanner(System.in);
		  int n=scan.nextInt();
		  
		  System.out.print("Provide how many users are  :"+n);
		  
		  
		   int[] a=new int[n];
		  // System.out.print(a[n]);;
		
		 int length=a.length;
		 
		   for(int i=0;i<length;i++)
		   {
			   
			  for(int j=i+1;j<length;j++)
			  {
				  if(a[i]>a[j])
				  {
					  temp=a[i];
					  a[i]=a[j];
					  a[j]=temp;
					  
				  }
				  
			
				
			  }
			  System.out.println(a[i]);
		   }
		
		  
		  
		  float avg=min/max(2.0);
		  System.out.println(float);
		  
		  
		
		

	}

}
