package com.cg.beans;

import java.util.ArrayList;
import java.util.List;

public class cgUtil {
	
	public static List<Emp> getEmployee(){
		List<Emp> lst = new ArrayList<Emp>();
		lst.add(new Emp(1007,"ram",34000));
		lst.add(new Emp(1001,"anand",24000));
		lst.add(new Emp(1003,"Vikas Singh",37000));
		lst.add(new Emp(1002,"peter",44000));
		lst.add(new Emp(1005,"arshad",33000));
		lst.add(new Emp(1006,"tom",33000));
		return lst;
	}
	
	public static void display(Emp emp) {
		System.out.println("EmpId "+emp.getEmpId());
		System.out.println("EmpName "+ emp.getEmpName());
		System.out.println("EmpSalary "+emp.getEmpSal());
		System.out.println("---------------------------------------------");
		
	}

}
