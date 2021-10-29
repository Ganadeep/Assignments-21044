package com.sonata;

public class String_replaceOvals 
{
	public static void main(String[] args) 
	{
		String str = "pineapple";
		char c[]=str.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			if(c[i]=='a' || c[i]=='e' || c[i]=='i' || c[i]=='o' || c[i]=='u' )
			{
				c[i]='$';
			}
		}
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]);
		}

	}
}
