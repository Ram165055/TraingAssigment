package com.assigment.one;

import java.util.Scanner;

public class HeronsFormula {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Input 3 sides of trangle");
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		int c=scanner.nextInt();
		
		float s=(a+b+c)/2;
		float area=s*(s-a)*(s-b)*(s-c);
		
		System.out.println("The area of Triangle is "+Math.sqrt(area));

	}

}
