package com.assigment.one;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		Random random=new Random();
		System.out.println("input any number to guess ");
		int inputNumber=scanner.nextInt();
		int randomNumer=random.nextInt(1);
		if(randomNumer==inputNumber) {
			System.out.println("The Random numbers were the same");
		}
		else {
			System.out.println("The Random Numbers were different");
		}

	}

}
