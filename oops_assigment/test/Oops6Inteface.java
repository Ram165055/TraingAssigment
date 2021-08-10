package com.assigment.oops.test;
import com.assigment.oops.shape.*;

public class Oops6Inteface {

	public static void main(String[] args) {
		Polygon polygon=new Square();
		
		
		Polygon polygon2=new Rectangle();
	
		
		polygon.calcPeri();
		polygon.calcArea();
		polygon2.calcPeri();
		polygon2.calcArea();
	}

}
