package com.assigment.array;

import java.util.Scanner;

public class SearchElementInArray {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int arraySize=scanner.nextInt();
		int[] array=new int[arraySize];
		for (int i = 0; i < array.length; i++) {
			array[i]=scanner.nextInt();
		}
		int element=scanner.nextInt();
		int temp=-1;
		for(int j=0;j<array.length;j++) {
			if(element==array[j]) {
				temp=j+1;
				
				break;
			}
		}
		System.out.println(temp);
		
		

	}

}
