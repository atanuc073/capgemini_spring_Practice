package com.cg.client;

import com.cg.beans.Account;
import com.cg.beans.Admin;
import com.cg.beans.Atm;
import com.cg.beans.Cdm;

public class Client {
	
	public static void main(String[] args) {
		Account objAccount = new Account();
		Admin objAccount1=new Account();
		System.out.println(objAccount.balance);
		objAccount.withdraw();
		objAccount.getBalance();
		objAccount.deposite();
		objAccount.clearPdc();
	}

}
