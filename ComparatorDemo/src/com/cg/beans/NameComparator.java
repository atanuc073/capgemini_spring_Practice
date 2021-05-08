package com.cg.beans;

import java.util.Comparator;

public class NameComparator implements Comparator<Emp>{
	@Override
	public int compare(Emp emp1,Emp emp2) {
		String str1=emp1.getEmpName();
		String str2= emp2.getEmpName();
		return str1.compareTo(str2);
	}

}
