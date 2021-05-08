package com.cg.clients;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.cg.beans.Emp;

public class MapDemo1 {
	static Map<Integer,Emp> emap= new HashMap<>();
	
	static {
		emap.put(1003,new Emp(1003,"ram",56000));
		emap.put(1003,new Emp(1002,"tom",46000));
		emap.put(1003,new Emp(1004,"sam",76000));
		emap.put(1002, new Emp(1002,"george",46000));
	}
	
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the Employee Id");
		int empid = scan.nextInt();
		
		if(emap.containsKey(empid))
			System.out.println(emap.get(empid));
		else
			System.out.println("not Found");
	}

}
