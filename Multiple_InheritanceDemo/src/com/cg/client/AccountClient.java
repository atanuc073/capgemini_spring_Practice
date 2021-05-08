package com.cg.client;

import java.util.Scanner;

import com.cg.beans.AccContainer;
import com.cg.beans.Admin;
import com.cg.beans.Atm;
import com.cg.beans.Cdm;

enum Menu {
	ATM,CDM,ADMIN
}

public class AccountClient {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the Menu\n 1--ATM\n 2--CDM\n 3--Admin");
		String str=scan.next();
		try {
			Menu menu = Menu.valueOf(str.toUpperCase());
			switch(menu) {
			case ATM:
				Atm atm=AccContainer.getAtm();
				atm.getBalance();
				atm.withdraw();
				break;
			case ADMIN:
				Admin admin =AccContainer.getAdmin();
				admin.clearPdc();
				break;
			case CDM:
			Cdm cdm =AccContainer.getCdm();
			cdm.deposite();	
			break;
			}
		}catch(IllegalArgumentException ex) {
			System.out.println(ex.getMessage());
		}
	}

}
