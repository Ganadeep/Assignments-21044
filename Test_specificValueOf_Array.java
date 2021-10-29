package com.sonata;

public class Test_specificValueOf_Array 
{
	public static void main(String arg[])
	{
	    int a[]= {1,2,3,5,8,10};  
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==12)  //check for the condition.Example:a[0]==12 i.e 1==12;
		   {
			   System.out.println("Specific value is FOUND: "+a[i]);
		   }
		 }
	System.out.println("Value is NOT FOUND in Array");	//default statement
	}		
}
