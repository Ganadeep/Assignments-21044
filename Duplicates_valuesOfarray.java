package com.sonata;

public class Duplicates_valuesOfarray 
{
	public static void main(String arg[])
	{
	  int a[]= {7,9,8,9,7,5,2,5}; 
	     for(int i=0;i<a.length;i++) // 'for' loop for i index=0
	     {
	    	 for(int j=i+1;j<a.length;j++) 
	    		                     //'for' loop for j index=0+1 
	    	 {
	    		 if(a[i]==a[j])    /*  'j' index will compares with 
                                           'i' index value*/
	    			 
	    		 System.out.print(a[j]+" ");  //prints the duplicate values
	    	 }
	     }
	 }  
}
