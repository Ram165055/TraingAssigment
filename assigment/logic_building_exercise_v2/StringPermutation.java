package com.assigment.one;

import java.util.Scanner;

public class StringPermutation {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String string=scanner.next();
		permutation(string, "");

	}
	public static void permutation(String string,String answer) {
		if(string.length()==0) {
			System.out.print(answer+" ");
			return;
		}
		boolean alpha[]=new boolean[26];
		for(int i=0;i<string.length();i++) {
			char ch=string.charAt(i);
			String str=string.substring(0, i)+string.substring(i+1);
			if(alpha[ch-'a']==false)
				permutation(str, answer+ch);
			alpha[ch-'a']=true;
		}
	}

}
