package com.assigment.array;

import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int[][] matrix1=new int[3][3];
		int matrix2[][]=new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				matrix1[i][j]=scanner.nextInt();
			}
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				matrix2[i][j]=scanner.nextInt();
			}
		}
		int matrix3[][]=new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				matrix3[i][j]=matrix1[i][j]+matrix2[i][j];
			}
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(matrix3[i][j]+" ");
			}
			System.out.println();
		}
	}

}
