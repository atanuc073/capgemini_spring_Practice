package com.cg.client;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.cg.beans.Emp;
import com.cg.beans.NameComparator;
import com.cg.beans.SalComparator;

enum Menu{ID,NAME,SAL}

public class SortUDOInList {
	private static List<Emp> lst = new ArrayList<>(); 
	
	static {
		lst.add(new Emp(1007,"ram",34000));
		lst.add(new Emp(1001,"anand",24000));
		lst.add(new Emp(1003,"vikas",37000));
		lst.add(new Emp(1002,"peter",44000));
		lst.add(new Emp(1005,"arshad",33000));
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String opt = null;
		String menustr = null;
		do {
			System.out.println("ID\nNAME\nSAL");
			menustr=scan.next();
			processMenu(menustr);
			System.out.println("Press y to continue");
			opt = scan.next();
		}while(opt.equals("y"));
			scan.close();
	}
	
	public static void processMenu(String strmenu) {
		
		try {
			Menu menu = Menu.valueOf(strmenu.toUpperCase());
			switch(menu) {
			case ID:
				lst.sort(null);
				System.out.println("-----------sort By ID-----------------");
				display(lst);
				break;
				
			case NAME:
				lst.sort(new NameComparator());
				System.out.println("--------------sort by Name---------------------");
				display(lst);
				break;
				
			case SAL:
				lst.sort(new SalComparator());
				System.out.println("-----------------sort by Salary----------------");
				display(lst);
				break;
				
				
			
			}
		}catch(IllegalArgumentException ex) {
			System.out.println(ex.getMessage());
		}
		
	}

	private static void display(List<Emp> lst2) {
		// TODO Auto-generated method stub
		int i=lst2.size();
		for(int j=0;j<i;j++) {
			System.out.println(lst2.get(j).getEmpName());
			System.out.println(lst2.get(j).getEmpId());
			System.out.println(lst2.get(j).getEmpSal());
			System.out.println("-----------------------------------------------");
		}
		
	}

}
