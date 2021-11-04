package com.sonata.Assignment;

public class Rectangle extends Shapes implements ShapesInterface {
    Rectangle(){};
	
	public float area(float len,float wid,float hei) {
		return len*wid;
	}

	public static void main(String args[]) {
		Rectangle r1=new Rectangle();
		System.out.println( "Area of Rectangle is: "+ r1.area(1, 2, 0));
	}
}
