package com.assigment.one;

import java.util.Scanner;

public class MirrorMatrix {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int[][] matrix=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				matrix[i][j]=scanner.nextInt();
			}
		}
		for(int k=0;k<n;k++) {
			for(int l=n-1;l>=0;l--) {
				System.out.print(matrix[k][l]+" ");
			}
			System.out.println();
		}

	}

}
