package com.sonata.Assignment;

public class Triangle extends Shapes implements ShapesInterface {
    Triangle(){};
	
	
	public float area(float len,float wid,float hei) {
		return ((len*hei)/2);
	}

	public static void main(String args[]) {
		Triangle t1=new Triangle();
		System.out.println( "Area of Triangle  is: "+ t1.area(2, 0, 20));
	}
}
