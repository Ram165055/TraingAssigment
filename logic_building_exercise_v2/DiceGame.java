package com.assigment.one;

import java.util.Random;
import java.util.Scanner;

public class DiceGame {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Random random=new Random();
		int a=random.nextInt(100);
		int b=random.nextInt(100);
		if(a%2==0&&b%2==0) {
			System.out.println("a+b="+(a+b));
		}
		else {
			System.out.println("a-b="+Math.abs(a-b));
		}

	}

}
