package com.techment.exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		for(int i=0;i<100;i++) {
			int num1,num2;
		
		try {
			 num1=scanner.nextInt();
			 num2=scanner.nextInt();
			
		}
		
		catch(ArithmeticException a) {
			System.out.println("do not give zero only enter non zero number");
			continue;
		}
		catch(InputMismatchException I) {
			System.out.println("do not give character enter only number");
			continue;
		}
		catch(Exception e) {
			//always write parent catch exception after all child exception catchkaun k
		}
//		System.out.println(num1/num2);
		break;
		}
		
	}

}
