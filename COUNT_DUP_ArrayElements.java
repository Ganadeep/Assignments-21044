package com.sonata;

public class COUNT_DUP_ArrayElements 
{
	public static void main(String arg[])
	{
	  int a[]= {7,9,8,9,7,7,7,5,2,5}; 
	  int max=0; int element =0;
	     for(int i=0;i<a.length;i++) // 'for' loop for i index=0
	     { int count=1;
	    	 for(int j=i+1;j<a.length;j++) 
	    		                     //'for' loop for j index=0+1 
	    	 {
	    		 if(a[i]==a[j])      /* 'j' index will compares with 
                                           'i' index value*/
	    		 {	 
	    			 count++;
	    		 }
	    	 }
	    	 if(max<count) 
	    	 {
	    	     max=count;
	    	     element=a[i];
	    	 }
	     }
	       System.out.println("max duplicate element of array is: "+element);
           System.out.println("Highest count of duplicate in array is: "+ max);	
	 }  

}
