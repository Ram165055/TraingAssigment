package com.techment.d8.String;

public class StringDemo {

	public static void main(String[] args) {
		String s1="hello";//by literal
		String s2="hello";
		
		String s3=new String("hello");//by new keyword
		String s4=new String("hello");
		System.out.println(s1==s2);//true because address same
		System.out.println(s1.equals(s2));//because content same
		System.out.println(s1==s4);//false because address different
		System.out.println(s3.equals(s4));//true because content same
	}

}
