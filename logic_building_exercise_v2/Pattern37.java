package com.assigment.one;

import java.util.Scanner;

public class Pattern37 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int col=scanner.nextInt();
		int temp1=col;
		int temp2=col;
		int temp3=1;
		for(int i=1;i<=2*col-1;i++) {
			if(i<=col) {
				for(int j=1;j<temp1;j++) {
					System.out.print(" ");
				}
				temp1--;
				for(int k=i;k>=1;k--) {
					System.out.print(k);
				}
				if(i>1) {
					for(int l=2;l<=i;l++) {
						System.out.print(l);
					}
				}
				System.out.println();
				
			}
			else {
				for(int m=1;m<=temp3;m++) {
					System.out.print(" ");
				} temp3++;
				for(int n=temp2-1;n>=1;n--) {
					System.out.print(n);
				}
				for(int p=2;p<temp2;p++) {
					System.out.print(p);
				}temp2--;
				System.out.println();
				
			}
			
		}

	}

}
