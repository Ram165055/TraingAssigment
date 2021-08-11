package com.techment.customexception;

class LateException extends Exception{
	public LateException(String msg) {
		super(msg);
	}
}
class Student{
void login(int time) throws LateException {
	
	if(time>9) {
		throw new LateException("you are absent");
	}
	else {
		System.out.println("you are present");;
	}
}
}

	

public class CustomeCheckedDemo {

	public static void main(String[] args) {
		Student student=new Student();
		try {
			student.login(10);
		}
		catch(LateException e) {
			System.out.println(e.getMessage());
		}
	}

}
