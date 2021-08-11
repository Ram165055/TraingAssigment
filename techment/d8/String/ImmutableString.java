package com.techment.d8.String;

public class ImmutableString {

	public static void main(String[] args) {
		String courseName="java";
		System.out.println("courseName"+courseName);
		courseName.concat("programming");
		System.out.println(courseName);
		courseName=courseName.concat("pro");//we can assign
		System.out.println(courseName);

	}

}
