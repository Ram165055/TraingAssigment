package com.assigment.one;

import java.util.Scanner;

public class ValidatePin {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int pin=12345;
		
		while(1>0) {
			int inputpin=scanner.nextInt();
			if(pin==inputpin) {
				System.out.println("Pin Accepted");
				break;
			}
			else {
				System.out.println("Please enter correct pin");
			}
		}

	}

}
