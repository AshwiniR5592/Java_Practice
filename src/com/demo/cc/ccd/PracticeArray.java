package com.demo.cc.ccd;

public class PracticeArray {

	public static void main(String[] args) {
		
	int a[]= {0,2,1,0,4,3,0,5,0};	
	int temp;

for(int i=0;i<a.length;i++)
{
 for(int j=i+1;j<a.length;j++)
 {
	 if(a[i]==0)
	 {
	          temp=a[i];

	           a[i]=a[j];
	           a[j]=temp;
	 
	 
 }
		

}

}
System.out.println("sorted array is:"+a);
}
}