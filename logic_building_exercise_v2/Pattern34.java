package com.assigment.one;

import java.util.Scanner;

public class Pattern34 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int LineNumber=scanner.nextInt();
		int row=1;
		for(int i=1;i<=LineNumber;i++) {
			for(int j=LineNumber;j>=row;j--) {
				System.out.print(j);
			}
			row++;
			System.out.println();
		}

	}

}
