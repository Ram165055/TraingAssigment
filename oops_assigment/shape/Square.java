package com.assigment.oops.shape;

public class Square implements Polygon {
float side=5.0f;
	@Override
	public void calcArea() {
		System.out.println("Area of Square:"+(side*side));
		
	}

	@Override
	public void calcPeri() {
		System.out.println("Perimeter of Square="+(4*side));
		
	}

}
