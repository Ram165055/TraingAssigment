package com.test1;

import java.util.Scanner;

public class PersonAge {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter arraySize");
		int arraySize=scanner.nextInt();
		int[] age=new int[arraySize];
		System.out.println("enter age");
		for(int i=0;i<age.length;i++) {
			age[i]=scanner.nextInt();
		}
		int children=0;
		int adult=0;
		int seniorCitizen=0;
		for(int j=0;j<age.length;j++) {
			if(age[j]<18) {
				children++;
			}
			else if(age[j]>=18&&age[j]<55) {
				adult++;
			}
			else {
				seniorCitizen++;
			}
		}
		System.out.println("Children :"+children);
		System.out.println("Adult :"+adult);
		System.out.println("Senior Citizen:"+seniorCitizen);

	}

}
