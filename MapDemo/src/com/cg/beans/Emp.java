package com.cg.beans;

public class Emp {
	private int empId;
	private String empName;
	private double empSal;
	
	
	public Emp(int empId,String empName,double empSal) {
		super();
	this.empId=empId;
	this.empName=empName;
	this.empSal=empSal;
	
	}

	public int getEmpid() {
		return empId;
	}

	public void setEmpid(int empid) {
		this.empId = empid;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}
	
	@Override
	public String toString() {
		return empId+ " "+empName+" "+empSal;
	}
	
	
}
