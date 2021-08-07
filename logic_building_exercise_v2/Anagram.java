package com.assigment.one;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String string1="who";
		String string2="how"; 
		char[] ch1=string1.toUpperCase().toCharArray();
		Arrays.sort(ch1);
		char[] ch2=string2.toUpperCase().toCharArray();
		Arrays.sort(ch2);
		for(char ch:ch2) {
			System.out.println("ch2"+ch);
		}
		for(char c:ch1) {
			System.out.println("ch1"+c);
		}
//		System.out.println(ch1[0]);
		if(ch1.equals(ch2)) {
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not");
		}
	}

}
