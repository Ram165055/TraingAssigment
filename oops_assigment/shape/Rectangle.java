package com.assigment.oops.shape;

public class Rectangle implements Polygon {
float length=10.0f;
float breadth=20.0f;
	@Override
	public void calcArea() {
System.out.println("Area of Rectangle="+(length*breadth));
		
	}

	@Override
	public void calcPeri() {
		System.out.println("Perimeter of Rectangle="+(2*(length+breadth)));
		
	}

}
