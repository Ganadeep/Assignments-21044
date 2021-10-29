package com.sonata;

public class Reverse_of_arrayValues 
{
	public static void main(String arg[])
	{
	  int a[]= {7,9,8,1,5,2};  
		
	  for(int i=a.length-1;i>=0;i--)  
		    /*initializing condition is (total length of array-1).so it gets executed
		     until the condition false */
		{ 
			System.out.println(a[i]); //prints the reverse Array
		}
	}
}
