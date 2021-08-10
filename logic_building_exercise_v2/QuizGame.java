package com.assigment.one;

import java.util.HashMap;
import java.util.Scanner;

class Question{
	String question;
	String option1;
	String option2;
	String option3;
	String option4;
	String correctAnswer;
	public Question(String question, String option1, String option2, String option3, String option4,
			String correctAnswer) {
		super();
		this.question = question;
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.option4 = option4;
		this.correctAnswer = correctAnswer;
	}
	
}

public class QuizGame {
	 public static void main(String[] args) {
		 Question question=new Question("2+2","a)4","b)3","c)2","d)0","a");
		 Question question2=new Question("2*2 ","a)3","b)4","c)5","d)1","b");
		 HashMap<Integer, Question> m=new  HashMap<>();
		 m.put(1, question);
		 m.put(2, question2);
		 Scanner scanner=new Scanner(System.in);
		 System.out.println("enter question number from 1 to 2");
		 int id=scanner.nextInt();
		 
		 System.out.println(m.get(id).question);
		 System.out.println(m.get(id).option1+"    "+m.get(id).option2+"   "+m.get(id).option3+"  "+m.get(id).option4);
		 System.out.println("enter correct option like a or b or c or d");
		 String ans=scanner.next();
		 if(ans.equals(m.get(id).correctAnswer)) {
			 System.out.println("correct answer");
		 }
		 else {
			 System.out.println("wrong answer\n correct answer is"+m.get(id).correctAnswer);
		 }
	}

}
