package com.assigment.one;

import java.util.Scanner;

public class FascinatingNumer {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int number=scanner.nextInt();
		if(number<100) {
			System.out.println("Not");
		}
		else {
			if(check(number)) {
				System.out.println("Yes");
			}
			else {
				System.out.println("Not");
			}
		}
	}
	public static boolean check(int number) { 
		int[] freq=new int[10];
		String strnum=""+number+2*number+3*number;
		for(int i=0;i<strnum.length();i++) {
			int dig=strnum.charAt(i)-'0';
			if(freq[dig]>0&&dig!=0) {
				
				return false;
			}
			else {
				freq[dig]++;
			}
		}
		for(int i=1;i<freq.length;i++) {
			if(freq[i]==0) {
				return false;
			}
		}
		return true;
		
	}

}
