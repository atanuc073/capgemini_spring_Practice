package com.cg.demos;

import java.util.List;

import com.cg.beans.Emp;
import com.cg.beans.cgUtil;

public class FilterDemo {
	
	public static void main(String[] args) {
		List<Emp> lst = cgUtil.getEmployee();
		System.out.println("Querying the employee who earns minimum 35000");
		lst.stream().filter(e->e.getEmpSal()>=35000.0).forEach(cgUtil :: display);
		System.out.println("Querying the Employee whose Id is 1001");
		lst.stream().filter(e->e.getEmpId()==1001).forEach(cgUtil :: display);
		System.out.println("Querying the employee whose name contains 3 chars");
		lst.stream().filter(e->e.getEmpName().length()==3).forEach(cgUtil :: display);
		System.out.println("Querying the employee whose name ends with singh");
		lst.stream().filter(e->e.getEmpName().endsWith("Singh")).forEach(cgUtil :: display);
	
	}

}
