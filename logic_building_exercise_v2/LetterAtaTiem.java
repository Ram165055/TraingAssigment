package com.assigment.one;

import java.util.Scanner;

public class LetterAtaTiem {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String message=scanner.next();
		int length=message.length();
		System.out.println("Numer of character in message:"+length);
		System.out.println("character at position 0:"+message.charAt(0));
		System.out.println("Character at"+ length +" postion:"+message.charAt(length-1));
		int counta=0;
		for (char ch : message.toCharArray()) {
			if(ch=='a') {
				counta++;
			}
			System.out.println(ch);
			
		}
		System.out.println(counta+" times a present");
		

	}

}
