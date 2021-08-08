package com.assigment.one;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int a=scanner.nextInt();
		int i=0;
		int sum=0;
		while(a>0) {
			int num=a%10;
			sum=(int) (sum+num*(Math.pow(2,i)));
			a=a/10;
			i++;
		}
		System.out.println(sum);
	}

}
