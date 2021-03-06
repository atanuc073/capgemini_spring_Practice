package com.cg.dto;

import java.time.LocalDate;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Pattern;

import org.springframework.lang.NonNull;

public class EmpDto {

	private Integer empId;
	@NotBlank(message = "Employee Name Must Not Be Blank")
	@Pattern(regexp = "([a-zA-Z]+)|([a-zA-Z]+[\\s][a-zA-Z]+)",message = "Name Must Contains Alphabets")
	private String empName;
	@Min(value = 60000,message ="Salary Must be Minimum 60000" )
	private Double empSal;
	@PastOrPresent(message = "Date must be present or past")
	private LocalDate doj;
	@NotBlank(message="Department name Can not be blank")
	@Pattern(regexp = "(hr|production)",message = "department Must be hr or production")
	private String deptName;
	
	public EmpDto() {
		
	}
	
	public EmpDto(int empId, String empName, double empSal, LocalDate doj, String deptName) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.doj = doj;
		deptName = deptName;
	}
	public EmpDto(String empName, double empSal, LocalDate doj, String deptName) {
		super();
		
		this.empName = empName;
		this.empSal = empSal;
		this.doj = doj;
		deptName = deptName;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
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
	public LocalDate getDoj() {
		return doj;
	}
	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	
	
}
