package com.sonata;

public class MyOwnAutoShop 
{
	
	public static void main(String args[]) 
	{
		Car C = new Car (130, 700000.0, "Red");
		Sedan S = new Sedan(120, 4000000.0, "Black",19);
		Ford Ford1 = new Ford (160,5000000.0,"Blue",2008, 500);
		Ford Ford2 = new Ford (140,4000000.0,"Pink",2009, 1000);
		
	    System.out.println("Sedan Price of Car:"+ S.getSalePrice());
		System.out.println("Ford1 Price of Car:"+ Ford1.getSalePrice());
		
		System.out.println("Ford2 Price of Car:"+ Ford2.getSalePrice());
		System.out.println("Car");
		System.out.println("MyCar Price of Car:"+ C.getSalePrice());
	}

}
