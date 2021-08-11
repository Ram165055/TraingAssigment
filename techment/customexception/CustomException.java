package com.techment.customexception;

public class CustomException {

	public static void main(String[] args) {
		
Account account=new Account();
try {
	System.out.println(account.withdraw(20000));
}catch(InsufficianFundException e) {
	System.out.println(e.getMessage());
}



	}

}
