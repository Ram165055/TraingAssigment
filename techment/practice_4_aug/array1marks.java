package com.techment.practice_4_aug;

import java.util.Scanner;

public class array1marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many marks do you want to enter");
		int size = scanner.nextInt();
		System.out.println("takes " + size + " marks as input");
		int marks[] = new int[size];
		for (int i = 0; i < marks.length; i++) {
			marks[i] = scanner.nextInt();
		}
		System.out.println("shows all the marks");
		int sumofMarks = 0;
		int lowestmarks = marks[0];
		int maxmarks = marks[0];
		int secondhigest = 0;
		int flag = 0;
		for (int j = 0; j < marks.length; j++) {
			if (lowestmarks > marks[j]) {
				lowestmarks = marks[j];
			}
			if (maxmarks < marks[j]) {
				maxmarks = marks[j];
			}

			if (marks[j] > 40) {
				flag++;
			}

			sumofMarks += marks[j];
			System.out.println(j + 1 + "marks" + marks[j]);
		}
		System.out.println("sum of marks" + sumofMarks);
		System.out.println("lowest" + lowestmarks + " " + "Higest" + maxmarks);
		for (int k = 0; k < marks.length; k++) {
			if (secondhigest < marks[k] && marks[k] < maxmarks) {
				secondhigest = marks[k];
			}
		}
		System.out.println("secondHigest" + secondhigest);
		if (flag == marks.length) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}

	}

}
