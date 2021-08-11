package com.assigment.one;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SortWordOfSentences {

	public static void main(String[] args) throws IOException {
		InputStreamReader r=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(r);
		String line=br.readLine();
		String[] words=line.split("\\s");
		Arrays.sort(words);
		for(int i=0;i<words.length;i++) {
			System.out.println(words[i]);
		}

	}

}
