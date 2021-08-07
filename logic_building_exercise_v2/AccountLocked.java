package com.assigment.one;

import java.util.Scanner;

public class AccountLocked {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int realpin=12345;
		int temp=0;
		for(int i=0;i<3;i++) {
			int inputpin=scanner.nextInt();
			if(inputpin==realpin) {
				temp=1;
				
				break;
			}
			
		}
		if(temp==1) {
			System.out.println("PIN ACCEPTED. YOU NOW\r\n"
					+ "HAVE ACCESS TO YOUR ACCOUNT");
		}
		else {
			System.out.println("YOU HAVE RUN OUT OF TRIES.\r\n"
					+ "ACCOUNT LOCKED");
		}

	}

}
