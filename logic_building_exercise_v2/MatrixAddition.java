package com.assigment.one;

import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
//		int col=scanner.nextInt();
		int[][] matrix=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				matrix[i][j]=scanner.nextInt();
			}
		}
		int sum=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
			sum=sum+matrix[i][j];
			System.out.print(matrix[i][j]);
		}
			System.out.println();

	}
		System.out.println(sum);

}
}
