package com.cg.demos;

import java.util.List;

import com.cg.beans.Emp;
import com.cg.beans.cgUtil;

public class SortDemo {
	public static void main(String[] args) {
		List<Emp> lst = cgUtil.getEmployee();
		System.out.println("----------------------Sort By Id----------------------------");
		lst.stream().sorted().forEach(cgUtil :: display);
		System.out.println("----------------------Sort By Name-------------------------");
		lst.stream().sorted((e1,e2)->e1.getEmpName().compareTo(e2.getEmpName())).forEach(cgUtil :: display);
		System.out.println("----------------------Sort by Salary-------------------------");
		lst.stream().sorted((e1,e2)->Double.valueOf(e1.getEmpSal()).compareTo(e2.getEmpSal())).forEach(cgUtil :: display);
	}

}
