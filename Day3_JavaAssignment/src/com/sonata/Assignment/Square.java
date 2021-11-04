package com.sonata.Assignment;

public class Square extends Shapes implements ShapesInterface
{
   Square(){};
	

	public float area(float len,float wid,float hei) {
		return len*len;
	}

	public static void main(String args[]) {
		Square s1=new Square();
		System.out.println( "Area of Square is: "+ s1.area(10, 0, 0));
	}
}
