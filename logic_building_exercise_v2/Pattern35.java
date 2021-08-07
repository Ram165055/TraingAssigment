package com.assigment.one;

import java.util.Scanner;

public class Pattern35 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int collNumber=scanner.nextInt();
		int row=collNumber;
		for(int i=1;i<=2*collNumber-1;i++) {
			if(i<=collNumber) {
				for(int j=1;j<=i;j++) {
					System.out.print(j);
				}
				System.out.println();
			}
			else {
				for(int k=1;k<row;k++) {
					System.out.print(k);
				}
				row--;
				System.out.println();
			}
		}
	}

}
