package com.assigment.one;

import java.util.Scanner;

public class SumOfSeries {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the no. of terms in series");
		int N=scanner.nextInt();
		float sum=0;
		for(int i=1;i<=N;i++) {
			sum=sum+(float)i/fact(i);
			
		}
		System.out.println("sum of series "+sum);
	}
	public static int fact(int num) {
		int fact=1;
		for(int i=2;i<=num;i++) {
			fact=fact*i;
		}
		return fact;
		
	}

}
