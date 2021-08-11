package com.assigment.array;

import java.util.Scanner;

public class MergeArray {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int size1=scanner.nextInt();
		
		
		int[] array1=new int[size1];
		//array1 input
		for(int i=0;i<array1.length;i++) {
			array1[i]=scanner.nextInt();
		}
		int size2=scanner.nextInt();
		int[] array2=new int[size2];
		//array2 input
		for(int p=0;p<array2.length;p++) {
			array2[p]=scanner.nextInt();
		}
		int size3=size1+size2;
		int[] array3=new int[size3];
		//logic
		for(int j=0;j<array3.length;j++) {
			//array1 assign value
			if(j<size1) {
				array3[j]=array1[j];
			}
			//array2 assign valye after arrayy length value
			else {
				array3[j]=array2[j-size1];
			}
		}
		for(int k=0;k<array3.length;k++) {
			System.out.print(array3[k]);
		}
				
	}
    

}
