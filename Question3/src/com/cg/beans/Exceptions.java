package com.cg.beans;

import java.security.DomainCombiner;

public class Exceptions {
	public static double checkException(int v1,int v2,char op) {
		try {
			return calculate(v1,v2,op);
		}catch(MultiplyException | DivideException ex) {
			System.out.println(ex.getMessage());
			return (-1.0);
		}finally {
			System.out.println("Im in final block");
		}


			
		}


	public static double calculate(int v1,int v2,char op) throws MultiplyException,DivideException {
		switch(op) {
		case('+'):
			return v1+v2;
		case('-'):
			return v1-v2;
		case('*'):
			if(v1==0 || v2==0)
				throw new MultiplyException("This is a Multiply Exception");
			else
				return v1*v2;
		case('/'):
			if(v2==0)
				throw new DivideException("This is a division Exception");
			else 
				return v1/v2;
		
		default:
			System.out.println("Invalid operator");
		}
		return 0.0;
		
		
			
	}
	
	public static void main(String[] args) throws MultiplyException, DivideException {
		int a=10;
		int b=0;
		System.out.println(checkException(a, b, '*'));
//		System.out.println(calculate(a,b,'*'));
		System.out.println("THis is it");
		
		
	}

}
