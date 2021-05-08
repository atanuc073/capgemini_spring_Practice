package com.cg.beans;

public class Emp implements Comparable<Emp>{
	
	private int empId;
	private String empName;
	private double empSal;
	
	public Emp(int empId,String empName,double empSal) {
		super();
		this.empId=empId;
		this.empName=empName;
		this.empSal=empSal;
	}
	

	public int getEmpId() {
		return empId;
	}



	public String getEmpName() {
		return empName;
	}



	public double getEmpSal() {
		return empSal;
	}

	@Override
	public String toString() {
		return empId + " "+ empName + " " + empSal;
	}

	@Override
	public int compareTo(Emp emp) {
		// TODO Auto-generated method stub
		Integer id1 = this.empId;
		Integer id2 = emp.empId;
		return id1.compareTo(id2);
	}

}
