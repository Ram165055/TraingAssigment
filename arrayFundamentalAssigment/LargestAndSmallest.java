package com.assigment.array;

import java.util.Scanner;

import com.practice_4_aug.array1marks;

public class LargestAndSmallest {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int arraySize=scanner.nextInt();
		int array[]=new int[arraySize];
		for(int i=0;i<array.length;i++) {
			array[i]=scanner.nextInt();
		}
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		//logic max and min 
		for(int j=0;j<array.length;j++) {
			//min
			if(array[j]<min) {
				min=array[j];
			}
			//max
			if(array[j]>max) {
				max=array[j];
			}
		}int secondMax=Integer.MIN_VALUE;
		int secondMin=Integer.MAX_VALUE;
		for(int k=0;k<array.length;k++) {
			//second larject
			if(array[k]>secondMax&&array[k]<max) {
				secondMax=array[k];
			}
			//second lowest
			if(array[k]<secondMin&&array[k]>min) {
				secondMin=array[k];
			}
		}
		System.out.println("min="+min);
		System.out.println("secondMin="+secondMin);
		System.out.println("max="+max);
		System.out.println("secondMax="+secondMax);

	}

}
