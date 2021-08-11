package com.assigment.one;

import java.util.Scanner;

public class TriangleCanBeFormed {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int AB=scanner.nextInt();
		int BC=scanner.nextInt();
		int CA=scanner.nextInt();
		String s=((AB+BC>CA)&&(AB+CA>BC)&&(CA+BC>AB))?"Valid":"Not Valid";
		System.out.println(s);

	}

}
