package com.cg.beans;

public class Account implements Admin,Cdm,Atm{
	public double balance=500000000;

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("WithDraw");
		
	}

	@Override
	public void getBalance() {
		// TODO Auto-generated method stub
		System.out.println("get Balance");
	}

	@Override
	public void clearPdc() {
		// TODO Auto-generated method stub
		System.out.println("clear pdc");
		
	}

	@Override
	public void deposite() {
		// TODO Auto-generated method stub
		System.out.println("deposite");
	}
	

}
