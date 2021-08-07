package com.assigment.one;

import java.util.Scanner;

public class Pattern36 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int row=scanner.nextInt();
		int col=row;
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=col;j++) {
				System.out.print(j);
			}
			if(i>1) {
				System.out.print(" ");
			}
			for(int k=col;k>=1;k--) {
				System.out.print(k);
			}
			col--;
			System.out.println();
		}

	}

}
