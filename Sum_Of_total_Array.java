package com.sonata;

public class Sum_Of_total_Array 
{
	public static void main(String arg[])
	{
	    int a[]= {1,2,3,5,5}; int sum=0; 
		for(int i=0;i<a.length;i++)
		{
		  sum=sum+a[i];    /*"sum=0+index of array value" gets added until the iteration
		                       gets false  */
		}
		System.out.println("sum of total array elements is: "+sum); 
		                               // prints the total sum value of array
	}
}
