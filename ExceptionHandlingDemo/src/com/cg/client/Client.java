package com.cg.client;

import com.cg.beans.Ageexception;
import com.cg.beans.IncomeException;

public class Client {
	
	public static void main(String[] args) {
		String res=checkEligible(17,300000.0);
		System.out.println(res);
		System.out.println("hello");
	}
	
	public static String checkEligible(int age,double income) {
		try {
			return processLoan(age,income);
		}catch(Ageexception | IncomeException e){
			return e.getMessage();
		}finally {
			System.out.println("I am in Finally Block");
			
		}
	
	}
	public static String processLoan(int age,double income) throws Ageexception,IncomeException {
		if(age<20 || age>50)
			throw new Ageexception("age must be between 20 and 50");
		if(income<400000) 
			throw new IncomeException("Income must be minimum Rs 4 Lakh");
		return "eligible";
	}
	

}
