package com.cg.beans;

import java.util.Comparator;

public class SalComparator implements Comparator<Emp>{
	
	@Override
	public int compare(Emp emp1,Emp emp2) {
		Double sal1=emp1.getEmpSal();
		Double sal2=emp2.getEmpSal();
		return sal1.compareTo(sal2);
		
		
	}
	
	

}
