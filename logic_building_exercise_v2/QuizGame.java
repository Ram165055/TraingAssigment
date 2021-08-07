package com.assigment.one;
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
		 Question question=new Question("this is","a","b","c","d","a");
		
	}

}
