package com.assigment.array;

import java.util.Scanner;

public class ArraySort {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int size=scanner.nextInt();
		int[] array=new int[size];
		//input
		for(int i=0;i<array.length;i++) {
			array[i]=scanner.nextInt();
		}
		//sorting logic
		for(int i=0;i<array.length;i++) {
			int temp=array[i];
			for(int j=i+1;j<array.length;j++) {
				if(array[i]>array[j]) {
					int flag=array[i];
					array[i]=array[j];
					array[j]=flag;
				}
				
			}
			
		}
		//print the array
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}

	}

}
